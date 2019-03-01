package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextLabelLayout extends js.Object {
  var labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout | (js.Function2[
    /* context */ atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, 
    /* node */ atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextNode, 
    atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
  ])
}

object Anon_ContextLabelLayout {
  @scala.inline
  def apply(
    labelLayout: atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout | (js.Function2[
      /* context */ atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContext, 
      /* node */ atOracleOraclejetLib.ojdiagramMod.DvtDiagramLayoutContextNode, 
      atOracleOraclejetLib.ojdiagramDashUtilsMod.LabelLayout
    ])
  ): Anon_ContextLabelLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labelLayout")(labelLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextLabelLayout]
  }
}

