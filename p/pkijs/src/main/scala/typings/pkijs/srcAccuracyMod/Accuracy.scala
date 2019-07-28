package typings.pkijs.srcAccuracyMod

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
    val __obj = js.Dynamic.literal(micros = micros, millis = millis, seconds = seconds)
  
    __obj.asInstanceOf[Accuracy]
  }
}

