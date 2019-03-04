package typings
package pkijsLib.srcAccuracyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accuracy extends js.Object {
  var micros: scala.Double
  var millis: scala.Double
  var seconds: scala.Double
}

object Accuracy {
  @scala.inline
  def apply(micros: scala.Double, millis: scala.Double, seconds: scala.Double): Accuracy = {
    val __obj = js.Dynamic.literal(micros = micros, millis = millis, seconds = seconds)
  
    __obj.asInstanceOf[Accuracy]
  }
}

