package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDisable[K, D] extends js.Object {
  var height: atOracleOraclejetLib.atOracleOraclejetLibStrings.enable | atOracleOraclejetLib.atOracleOraclejetLibStrings.disable
  var width: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String | scala.Null
  ] = js.undefined
}

object Anon_ContextDisable {
  @scala.inline
  def apply[K, D](
    height: atOracleOraclejetLib.atOracleOraclejetLibStrings.enable | atOracleOraclejetLib.atOracleOraclejetLibStrings.disable,
    width: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String = null
  ): Anon_ContextDisable[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextDisable[K, D]]
  }
}

