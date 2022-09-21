package typings.mjmlReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameProps extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var mjClass: js.UndefOr[String] = js.undefined
}
object ClassNameProps {
  
  inline def apply(): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameProps]
  }
  
  extension [Self <: ClassNameProps](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setMjClass(value: String): Self = StObject.set(x, "mjClass", value.asInstanceOf[js.Any])
    
    inline def setMjClassUndefined: Self = StObject.set(x, "mjClass", js.undefined)
  }
}
