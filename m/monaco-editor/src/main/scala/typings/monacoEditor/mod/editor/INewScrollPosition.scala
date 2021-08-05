package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INewScrollPosition extends StObject {
  
  var scrollLeft: js.UndefOr[Double] = js.undefined
  
  var scrollTop: js.UndefOr[Double] = js.undefined
}
object INewScrollPosition {
  
  inline def apply(): INewScrollPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INewScrollPosition]
  }
  
  extension [Self <: INewScrollPosition](x: Self) {
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
