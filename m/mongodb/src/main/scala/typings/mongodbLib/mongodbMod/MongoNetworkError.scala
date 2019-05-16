package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "MongoNetworkError")
@js.native
class MongoNetworkError protected () extends MongoError {
  def this(message: java.lang.String) = this()
  var errorLabels: js.Array[java.lang.String] = js.native
}

