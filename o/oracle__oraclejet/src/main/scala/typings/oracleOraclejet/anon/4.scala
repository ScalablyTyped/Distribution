package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  ])
}

object `4` {
  @scala.inline
  def apply(
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
      /* context */ DvtDiagramLayoutContext, 
      /* node */ DvtDiagramLayoutContextNode, 
      typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ])
  ): `4` = {
    val __obj = js.Dynamic.literal(labelLayout = labelLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
}

