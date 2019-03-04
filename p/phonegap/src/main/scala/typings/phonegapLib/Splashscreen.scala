package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Splashscreen extends js.Object {
  def hide(): scala.Unit
  def show(): scala.Unit
}

object Splashscreen {
  @scala.inline
  def apply(hide: js.Function0[scala.Unit], show: js.Function0[scala.Unit]): Splashscreen = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[Splashscreen]
  }
}

