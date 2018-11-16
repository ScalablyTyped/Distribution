package typings
package pegjsLib.pegjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutputFormatGlobals extends BuildOptionsBase {
  /** name of a global variable into which the parser object is assigned to when no module loader is detected; valid only when `format` is set to `"globals"` or `"umd"` (default: `null`) */
  var exportVar: js.UndefOr[js.Any] = js.undefined
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: pegjsLib.pegjsLibStrings.globals
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: pegjsLib.pegjsLibStrings.source
}

