package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "MongoError")
@js.native
class MongoError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
  var code: js.UndefOr[scala.Double] = js.native
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
  var errmsg: js.UndefOr[java.lang.String] = js.native
}

@JSImport("mongodb", "MongoError")
@js.native
object MongoError extends js.Object {
  def create(options: js.Object): mongodbLib.mongodbMod.MongoError = js.native
}

