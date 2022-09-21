package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelLayout extends StObject {
  
  var id: Any
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  
  var x: Double
  
  var y: Double
}
object LabelLayout {
  
  inline def apply(id: Any, labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout, x: Double, y: Double): LabelLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  
  extension [Self <: LabelLayout](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
