package typings.oracleOraclejet

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  var labelLayout: LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    LabelLayout
  ])
}

object Anon4 {
  @scala.inline
  def apply(
    labelLayout: LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      LabelLayout
    ])
  ): Anon4 = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon4]
  }
}

