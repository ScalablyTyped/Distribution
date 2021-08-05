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
  
  inline def apply(): Head = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Head]
  }
  
  extension [Self <: Head](x: Self) {
    
    inline def setHead(value: Boolean): Self = StObject.set(x, "Head", value.asInstanceOf[js.Any])
    
    inline def setHeadUndefined: Self = StObject.set(x, "Head", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "Html", js.undefined)
    
    inline def setMain(value: Boolean): Self = StObject.set(x, "Main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "Main", js.undefined)
    
    inline def setNextScript(value: Boolean): Self = StObject.set(x, "NextScript", value.asInstanceOf[js.Any])
    
    inline def setNextScriptUndefined: Self = StObject.set(x, "NextScript", js.undefined)
  }
}
