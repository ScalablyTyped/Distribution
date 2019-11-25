package typings.overlayscrollbars

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handle extends js.Object {
  var handle: HTMLElement
  var scrollbar: HTMLElement
  var track: HTMLElement
}

object Anon_Handle {
  @scala.inline
  def apply(handle: HTMLElement, scrollbar: HTMLElement, track: HTMLElement): Anon_Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Handle]
  }
}

