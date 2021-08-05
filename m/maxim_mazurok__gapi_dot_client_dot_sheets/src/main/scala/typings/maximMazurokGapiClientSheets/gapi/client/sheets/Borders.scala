package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borders extends StObject {
  
  /** The bottom border of the cell. */
  var bottom: js.UndefOr[Border] = js.undefined
  
  /** The left border of the cell. */
  var left: js.UndefOr[Border] = js.undefined
  
  /** The right border of the cell. */
  var right: js.UndefOr[Border] = js.undefined
  
  /** The top border of the cell. */
  var top: js.UndefOr[Border] = js.undefined
}
object Borders {
  
  inline def apply(): Borders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borders]
  }
  
  extension [Self <: Borders](x: Self) {
    
    inline def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
