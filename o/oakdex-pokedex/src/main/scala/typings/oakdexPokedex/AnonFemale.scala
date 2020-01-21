package typings.oakdexPokedex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFemale extends js.Object {
  var female: Double
  var male: Double
}

object AnonFemale {
  @scala.inline
  def apply(female: Double, male: Double): AnonFemale = {
    val __obj = js.Dynamic.literal(female = female.asInstanceOf[js.Any], male = male.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFemale]
  }
}

