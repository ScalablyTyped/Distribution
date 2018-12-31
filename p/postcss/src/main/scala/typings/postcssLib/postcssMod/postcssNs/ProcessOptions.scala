package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends Syntax {
  /**
    * The path of the CSS source file. You should always set from, because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[SourceMapOptions] = js.undefined
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Parse | Syntax] = js.undefined
  /**
    * Enable Safe Mode, in which PostCSS will try to fix CSS syntax errors.
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Stringify | Syntax] = js.undefined
  var syntax: js.UndefOr[Syntax] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always set it
    * to generate correct source maps.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

