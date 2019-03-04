package typings
package parse5DashSaxDashParserLib.parse5DashSaxDashParserMod.SAXParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctypeToken extends js.Object {
  /**
    * Document type name.
    */
  var name: java.lang.String
  /**
    * Document type public identifier.
    */
  var publicId: java.lang.String
  /**
    * Document type declaration source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[parse5Lib.parse5Mod.Location] = js.undefined
  /**
    * Document type system identifier.
    */
  var systemId: java.lang.String
}

object DoctypeToken {
  @scala.inline
  def apply(
    name: java.lang.String,
    publicId: java.lang.String,
    systemId: java.lang.String,
    sourceCodeLocation: parse5Lib.parse5Mod.Location = null
  ): DoctypeToken = {
    val __obj = js.Dynamic.literal(name = name, publicId = publicId, systemId = systemId)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DoctypeToken]
  }
}

