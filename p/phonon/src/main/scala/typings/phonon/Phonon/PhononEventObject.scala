package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononEventObject extends js.Object {
  var animationEnd: String
  var transitionEnd: String
}

object PhononEventObject {
  @scala.inline
  def apply(animationEnd: String, transitionEnd: String): PhononEventObject = {
    val __obj = js.Dynamic.literal(animationEnd = animationEnd.asInstanceOf[js.Any], transitionEnd = transitionEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononEventObject]
  }
}

