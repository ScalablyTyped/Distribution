package typings
package objDashFileDashParserLib.objDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Class module */
trait ObjFileParser extends js.Object {
  def parse(): objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs.ObjFile
}

object ObjFileParser {
  @scala.inline
  def apply(parse: js.Function0[objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs.ObjFile]): ObjFileParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[ObjFileParser]
  }
}

