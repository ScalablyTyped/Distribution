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
  
  @scala.inline
  def apply(): Borders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Borders]
  }
  
  @scala.inline
  implicit class BordersMutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Border): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Border): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Border): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Border): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
