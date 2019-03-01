package typings
package atOracleOraclejetLib.ojconveyorbeltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojConveyorBeltSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var contentParent: java.lang.String | scala.Null
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
}

object ojConveyorBeltSettableProperties {
  @scala.inline
  def apply(
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical,
    contentParent: java.lang.String = null,
    translations: js.Object = null
  ): ojConveyorBeltSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (contentParent != null) __obj.updateDynamic("contentParent")(contentParent)
    if (translations != null) __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[ojConveyorBeltSettableProperties]
  }
}

