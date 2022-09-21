package typings.ngPackagr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGLOBALDEFSFORTER extends StObject {
  
  var ngDevMode: Boolean
  
  var ngI18nClosureMode: Boolean
}
object TypeofGLOBALDEFSFORTER {
  
  inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean): TypeofGLOBALDEFSFORTER = {
    val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGLOBALDEFSFORTER]
  }
  
  extension [Self <: TypeofGLOBALDEFSFORTER](x: Self) {
    
    inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
    
    inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
  }
}
