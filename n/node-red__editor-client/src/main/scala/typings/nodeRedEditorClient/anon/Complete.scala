package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete extends StObject {
  
  def complete(value: String, cursor: Column): Unit = js.native
  
  var cursor: js.UndefOr[Column] = js.native
  
  var mode: js.UndefOr[String] = js.native
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var width: String = js.native
}
object Complete {
  
  @scala.inline
  def apply(complete: (String, Column) => Unit, width: String): Complete = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction2(complete), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Complete]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: (String, Column) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCursor(value: Column): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
