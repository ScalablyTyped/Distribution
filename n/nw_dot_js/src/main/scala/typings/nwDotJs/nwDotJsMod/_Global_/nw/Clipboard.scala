package typings.nwDotJs.nwDotJsMod._Global_.nw

import org.scalablytyped.runtime.TopLevel
import typings.nwDotJs.nwDotJsMod._Global_.NWJS_Helpers.clip
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

