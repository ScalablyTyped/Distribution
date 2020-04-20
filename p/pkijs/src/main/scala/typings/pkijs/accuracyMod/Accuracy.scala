package typings.pkijs.accuracyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accuracy extends js.Object {
  var micros: Double
  var millis: Double
  var seconds: Double
}

object Accuracy {
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): Accuracy = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
}

