package typings.mem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[ReturnType] extends js.Object {
  var data: ReturnType
  var maxAge: Double
}

object Anon_Data {
  @scala.inline
  def apply[ReturnType](data: ReturnType, maxAge: Double): Anon_Data[ReturnType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge)
  
    __obj.asInstanceOf[Anon_Data[ReturnType]]
  }
}

