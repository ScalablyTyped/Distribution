package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDisableEnable[K, D] extends js.Object {
  var height: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  var width: atOracleOraclejetLib.atOracleOraclejetLibStrings.enable | atOracleOraclejetLib.atOracleOraclejetLibStrings.disable
}

object Anon_ContextDisableEnable {
  @scala.inline
  def apply[K, D](
    width: atOracleOraclejetLib.atOracleOraclejetLibStrings.enable | atOracleOraclejetLib.atOracleOraclejetLibStrings.disable,
    height: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String = null
  ): Anon_ContextDisableEnable[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextDisableEnable[K, D]]
  }
}

