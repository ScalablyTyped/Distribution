package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataInput extends js.Object {
  var finish: java.lang.String
  var limit: scala.Double
  var start: java.lang.String
  var uuid: java.lang.String
}

object GetDataInput {
  @scala.inline
  def apply(finish: java.lang.String, limit: scala.Double, start: java.lang.String, uuid: java.lang.String): GetDataInput = {
    val __obj = js.Dynamic.literal(finish = finish, limit = limit, start = start, uuid = uuid)
  
    __obj.asInstanceOf[GetDataInput]
  }
}

