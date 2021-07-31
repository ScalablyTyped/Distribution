package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitterSideOptions extends StObject {
  
  /**
    * @description This function will be called after the menu has been opened.
    * @return {Function}
    */
  var callback: js.UndefOr[js.Function] = js.undefined
}
object SplitterSideOptions {
  
  @scala.inline
  def apply(): SplitterSideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitterSideOptions]
  }
  
  @scala.inline
  implicit class SplitterSideOptionsMutableBuilder[Self <: SplitterSideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
