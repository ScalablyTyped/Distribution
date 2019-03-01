package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handle extends js.Object {
  var handle: stdLib.HTMLElement
  var scrollbar: stdLib.HTMLElement
  var track: stdLib.HTMLElement
}

object Anon_Handle {
  @scala.inline
  def apply(handle: stdLib.HTMLElement, scrollbar: stdLib.HTMLElement, track: stdLib.HTMLElement): Anon_Handle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(handle)
    __obj.updateDynamic("scrollbar")(scrollbar)
    __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[Anon_Handle]
  }
}

