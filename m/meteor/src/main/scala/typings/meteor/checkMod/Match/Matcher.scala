package typings.meteor.checkMod.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matcher[T] extends js.Object {
  var _meteorCheckMatcherBrand: Unit
}

object Matcher {
  @scala.inline
  def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
    val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matcher[T]]
  }
}

