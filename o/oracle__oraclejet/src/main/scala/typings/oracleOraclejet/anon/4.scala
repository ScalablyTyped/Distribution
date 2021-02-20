package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
    /* context */ DvtDiagramLayoutContext, 
    /* node */ DvtDiagramLayoutContextNode, 
    typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  ]) = js.native
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
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelLayout(
      value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout | (js.Function2[
          /* context */ DvtDiagramLayoutContext, 
          /* node */ DvtDiagramLayoutContextNode, 
          typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
        ])
    ): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLayoutFunction2(
      value: (/* context */ DvtDiagramLayoutContext, /* node */ DvtDiagramLayoutContextNode) => typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
    ): Self = StObject.set(x, "labelLayout", js.Any.fromFunction2(value))
  }
}
