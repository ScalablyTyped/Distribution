package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventFullImport extends StObject {
  
  var preventFullImport: js.UndefOr[Boolean] = js.undefined
  
  var skipDefaultConversion: js.UndefOr[Boolean] = js.undefined
  
  var transform: String
}
object PreventFullImport {
  
  inline def apply(transform: String): PreventFullImport = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventFullImport]
  }
  
  extension [Self <: PreventFullImport](x: Self) {
    
    inline def setPreventFullImport(value: Boolean): Self = StObject.set(x, "preventFullImport", value.asInstanceOf[js.Any])
    
    inline def setPreventFullImportUndefined: Self = StObject.set(x, "preventFullImport", js.undefined)
    
    inline def setSkipDefaultConversion(value: Boolean): Self = StObject.set(x, "skipDefaultConversion", value.asInstanceOf[js.Any])
    
    inline def setSkipDefaultConversionUndefined: Self = StObject.set(x, "skipDefaultConversion", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
