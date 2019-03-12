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
  def apply(hide: () => scala.Unit, show: () => scala.Unit): Splashscreen = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Splashscreen]
  }
}

