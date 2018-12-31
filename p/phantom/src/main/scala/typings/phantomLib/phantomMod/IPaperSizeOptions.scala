package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaperSizeOptions extends js.Object {
  var footer: js.UndefOr[phantomLib.Anon_HeightContents] = js.undefined
  var format: js.UndefOr[
    phantomLib.phantomLibStrings.A3 | phantomLib.phantomLibStrings.A4 | phantomLib.phantomLibStrings.A5 | phantomLib.phantomLibStrings.Legal | phantomLib.phantomLibStrings.Letter | phantomLib.phantomLibStrings.Tabloid
  ] = js.undefined
  var header: js.UndefOr[phantomLib.Anon_HeightContents] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[java.lang.String | phantomLib.Anon_Bottom] = js.undefined
  var orientation: js.UndefOr[phantomLib.phantomLibStrings.portrait | phantomLib.phantomLibStrings.landscape] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

