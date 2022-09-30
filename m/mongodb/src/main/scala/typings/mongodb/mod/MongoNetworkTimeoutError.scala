package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoNetworkTimeoutError")
@js.native
open class MongoNetworkTimeoutError protected () extends MongoNetworkError {
  def this(message: String) = this()
  def this(message: String, options: MongoNetworkErrorOptions) = this()
  
  @JSName("name")
  def name_MMongoNetworkTimeoutError: String = js.native
}
