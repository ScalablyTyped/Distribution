package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoNetworkError")
@js.native
open class MongoNetworkError protected () extends MongoError {
  /* Excluded from this release type: [kBeforeHandshake] */
  def this(message: String) = this()
  def this(message: js.Error) = this()
  def this(message: String, options: MongoNetworkErrorOptions) = this()
  def this(message: js.Error, options: MongoNetworkErrorOptions) = this()
  
  @JSName("name")
  def name_MMongoNetworkError: String = js.native
}
