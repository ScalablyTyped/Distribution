package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomHeadLabelRenderOptions
  extends StObject
     with MUIDataTableColumnState {
  
  var colPos: Double
  
  var index: Double
}
object CustomHeadLabelRenderOptions {
  
  inline def apply(colPos: Double, index: Double, name: String): CustomHeadLabelRenderOptions = {
    val __obj = js.Dynamic.literal(colPos = colPos.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeadLabelRenderOptions]
  }
  
  extension [Self <: CustomHeadLabelRenderOptions](x: Self) {
    
    inline def setColPos(value: Double): Self = StObject.set(x, "colPos", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
