package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononEventObject extends js.Object {
  var animationEnd: java.lang.String
  var transitionEnd: java.lang.String
}

object PhononEventObject {
  @scala.inline
  def apply(animationEnd: java.lang.String, transitionEnd: java.lang.String): PhononEventObject = {
    val __obj = js.Dynamic.literal(animationEnd = animationEnd, transitionEnd = transitionEnd)
  
    __obj.asInstanceOf[PhononEventObject]
  }
}

