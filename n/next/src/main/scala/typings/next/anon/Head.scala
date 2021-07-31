package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Head extends StObject {
  
  var Head: js.UndefOr[Boolean] = js.undefined
  
  var Html: js.UndefOr[Boolean] = js.undefined
  
  var Main: js.UndefOr[Boolean] = js.undefined
  
  var NextScript: js.UndefOr[Boolean] = js.undefined
}
object Head {
  
  @scala.inline
  def apply(): Head = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Head]
  }
  
  @scala.inline
  implicit class HeadMutableBuilder[Self <: Head] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHead(value: Boolean): Self = StObject.set(x, "Head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "Head", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "Html", js.undefined)
    
    @scala.inline
    def setMain(value: Boolean): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUndefined: Self = StObject.set(x, "Main", js.undefined)
    
    @scala.inline
    def setNextScript(value: Boolean): Self = StObject.set(x, "NextScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextScriptUndefined: Self = StObject.set(x, "NextScript", js.undefined)
  }
}
