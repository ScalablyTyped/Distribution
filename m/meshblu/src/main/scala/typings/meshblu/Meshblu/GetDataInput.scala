package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataInput extends js.Object {
  var finish: String
  var limit: Double
  var start: String
  var uuid: String
}

object GetDataInput {
  @scala.inline
  def apply(finish: String, limit: Double, start: String, uuid: String): GetDataInput = {
    val __obj = js.Dynamic.literal(finish = finish, limit = limit, start = start, uuid = uuid)
  
    __obj.asInstanceOf[GetDataInput]
  }
}

