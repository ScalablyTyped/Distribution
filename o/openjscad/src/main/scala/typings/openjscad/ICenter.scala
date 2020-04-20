package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICenter extends js.Object {
  def center(cAxes: js.Array[String]): CxG
}

object ICenter {
  @scala.inline
  def apply(center: js.Array[String] => CxG): ICenter = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction1(center))
    __obj.asInstanceOf[ICenter]
  }
}

