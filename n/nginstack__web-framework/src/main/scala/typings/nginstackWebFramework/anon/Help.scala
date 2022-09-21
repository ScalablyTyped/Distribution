package typings.nginstackWebFramework.anon

import typings.nginstackWebFramework.processMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Help extends StObject {
  
  var help: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var process: js.UndefOr[^] = js.undefined
  
  var showResetToDefaultsButton: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Help {
  
  inline def apply(): Help = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Help]
  }
  
  extension [Self <: Help](x: Self) {
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProcess(value: ^): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setShowResetToDefaultsButton(value: Boolean): Self = StObject.set(x, "showResetToDefaultsButton", value.asInstanceOf[js.Any])
    
    inline def setShowResetToDefaultsButtonUndefined: Self = StObject.set(x, "showResetToDefaultsButton", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
