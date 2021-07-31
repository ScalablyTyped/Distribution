package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterContentOptions extends StObject {
  
  /**
    * @description This function will be called after the menu has been opened.
    * @return {Function}
    */
  var callback: js.UndefOr[js.Function] = js.undefined
}
object SplitterContentOptions {
  
  @scala.inline
  def apply(): SplitterContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterContentOptions]
  }
  
  @scala.inline
  implicit class SplitterContentOptionsMutableBuilder[Self <: SplitterContentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
