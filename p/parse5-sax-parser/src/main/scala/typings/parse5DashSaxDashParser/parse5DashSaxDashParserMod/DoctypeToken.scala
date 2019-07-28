package typings.parse5DashSaxDashParser.parse5DashSaxDashParserMod

import typings.parse5.parse5Mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoctypeToken extends js.Object {
  /**
    * Document type name.
    */
  var name: String
  /**
    * Document type public identifier.
    */
  var publicId: String
  /**
    * Document type declaration source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.undefined
  /**
    * Document type system identifier.
    */
  var systemId: String
}

object DoctypeToken {
  @scala.inline
  def apply(name: String, publicId: String, systemId: String, sourceCodeLocation: Location = null): DoctypeToken = {
    val __obj = js.Dynamic.literal(name = name, publicId = publicId, systemId = systemId)
    if (sourceCodeLocation != null) __obj.updateDynamic("sourceCodeLocation")(sourceCodeLocation)
    __obj.asInstanceOf[DoctypeToken]
  }
}

