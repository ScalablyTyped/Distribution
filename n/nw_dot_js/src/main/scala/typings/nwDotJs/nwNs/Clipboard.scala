package typings.nwDotJs.nwNs

import typings.nwDotJs.NWJSUnderscoreHelpersNs.clip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
    * Get the clipboard object.
    *
    * @returns {Clipboard} the clipboard object.
    */
  def get(): clip
}

object Clipboard {
  @scala.inline
  def apply(get: () => clip): Clipboard = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
  
    __obj.asInstanceOf[Clipboard]
  }
}

