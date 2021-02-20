package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelLayout extends StObject {
  
  var id: js.Any = js.native
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object LabelLayout {
  
  @scala.inline
  def apply(
    id: js.Any,
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  
  @scala.inline
  implicit class LabelLayoutMutableBuilder[Self <: LabelLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
