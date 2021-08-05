package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete extends StObject {
  
  def complete(value: String, cursor: Column): Unit
  
  var cursor: js.UndefOr[Column] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var width: String
}
object Complete {
  
  inline def apply(complete: (String, Column) => Unit, width: String): Complete = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  extension [Self <: Complete](x: Self) {
    
    inline def setComplete(value: (String, Column) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    inline def setCursor(value: Column): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
    
    inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
