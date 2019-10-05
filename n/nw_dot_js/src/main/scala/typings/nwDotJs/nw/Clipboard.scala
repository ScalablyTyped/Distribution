package typings.nwDotJs.nw

import org.scalablytyped.runtime.TopLevel
import typings.nwDotJs.NWJS_Helpers.clip
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

@JSGlobal("nw.Clipboard")
@js.native
object Clipboard extends TopLevel[Clipboard]

