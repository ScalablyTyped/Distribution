package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoNetworkError")
@js.native
class MongoNetworkError protected () extends MongoError {
  def this(message: String) = this()
  
  var errorLabels: js.Array[String] = js.native
}
