package typings.officeUiFabricReact.anon

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsFocus extends StObject {
  
  var containsFocus: Boolean
  
  var documentContainsFocus: Boolean
  
  var originalElement: js.UndefOr[HTMLElement | Window] = js.undefined
}
object ContainsFocus {
  
  inline def apply(containsFocus: Boolean, documentContainsFocus: Boolean): ContainsFocus = {
    val __obj = js.Dynamic.literal(containsFocus = containsFocus.asInstanceOf[js.Any], documentContainsFocus = documentContainsFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsFocus]
  }
  
  extension [Self <: ContainsFocus](x: Self) {
    
    inline def setContainsFocus(value: Boolean): Self = StObject.set(x, "containsFocus", value.asInstanceOf[js.Any])
    
    inline def setDocumentContainsFocus(value: Boolean): Self = StObject.set(x, "documentContainsFocus", value.asInstanceOf[js.Any])
    
    inline def setOriginalElement(value: HTMLElement | Window): Self = StObject.set(x, "originalElement", value.asInstanceOf[js.Any])
    
    inline def setOriginalElementUndefined: Self = StObject.set(x, "originalElement", js.undefined)
  }
}
