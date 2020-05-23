package typings.oakdexPokedex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Female extends js.Object {
  var female: Double
  var male: Double
}

object Female {
  @scala.inline
  def apply(female: Double, male: Double): Female = {
    val __obj = js.Dynamic.literal(female = female.asInstanceOf[js.Any], male = male.asInstanceOf[js.Any])
    __obj.asInstanceOf[Female]
  }
}

