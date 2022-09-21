package typings.postcss.mod

import typings.postcss.cssSyntaxErrorMod.RangePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "CssSyntaxError")
@js.native
open class CssSyntaxError protected ()
  extends typings.postcss.cssSyntaxErrorMod.default {
  /**
    * Instantiates a CSS syntax error. Can be instantiated for a single position
    * or for a range.
    * @param message        Error message.
    * @param lineOrStartPos If for a single position, the line number, or if for
    *                       a range, the inclusive start position of the error.
    * @param columnOrEndPos If for a single position, the column number, or if for
    *                       a range, the exclusive end position of the error.
    * @param source         Source code of the broken file.
    * @param file           Absolute path to the broken file.
    * @param plugin         PostCSS plugin name, if error came from plugin.
    */
  def this(
    message: String,
    lineOrStartPos: js.UndefOr[Double | RangePosition],
    columnOrEndPos: js.UndefOr[Double | RangePosition],
    source: js.UndefOr[String],
    file: js.UndefOr[String],
    plugin: js.UndefOr[String]
  ) = this()
}
