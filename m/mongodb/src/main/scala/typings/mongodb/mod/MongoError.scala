package typings.mongodb.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoError")
@js.native
class MongoError protected () extends Error {
  def this(message: String) = this()
  def this(message: js.Object) = this()
  def this(message: Error) = this()
  
  var code: js.UndefOr[scala.Double | String] = js.native
  
  /**
    * While not documented, the 'errmsg' prop is AFAIK the only way to find out
    * which unique index caused a duplicate key error. When you have multiple
    * unique indexes on a collection, knowing which index caused a duplicate
    * key error enables you to send better (more precise) error messages to the
    * client/user (eg. "Email address must be unique" instead of "Both email
    * address and username must be unique") - which caters for a better (app)
    * user experience.
    *
    * Details: https://github.com/Automattic/mongoose/issues/2129 (issue for
    * mongoose, but the same applies for the native mongodb driver)
    *
    * Note that in mongoose (the link above) the prop in question is called
    * 'message' while in mongodb it is called 'errmsg'. This can be seen in
    * multiple places in the source code, for example here:
    * https://github.com/mongodb/node-mongodb-native/blob/a12aa15ac3eaae3ad5c4166ea1423aec4560f155/test/functional/find_tests.js#L1111
    */
  var errmsg: js.UndefOr[String] = js.native
  
  /**
    * Checks the error to see if it has an error label
    */
  def hasErrorLabel(label: String): Boolean = js.native
}
/* static members */
object MongoError {
  
  /**
    * @deprecated
    */
  @JSImport("mongodb", "MongoError.create")
  @js.native
  def create(options: String): MongoError = js.native
  @JSImport("mongodb", "MongoError.create")
  @js.native
  def create(options: js.Object): MongoError = js.native
  @JSImport("mongodb", "MongoError.create")
  @js.native
  def create(options: Error): MongoError = js.native
}
