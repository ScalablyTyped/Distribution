package typings.ngPackagr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGLOBALDEFSFORTERNgDevMode extends StObject {
  
  var ngDevMode: Boolean
  
  var ngI18nClosureMode: Boolean
  
  var ngJitMode: Boolean
}
object TypeofGLOBALDEFSFORTERNgDevMode {
  
  inline def apply(ngDevMode: Boolean, ngI18nClosureMode: Boolean, ngJitMode: Boolean): TypeofGLOBALDEFSFORTERNgDevMode = {
    val __obj = js.Dynamic.literal(ngDevMode = ngDevMode.asInstanceOf[js.Any], ngI18nClosureMode = ngI18nClosureMode.asInstanceOf[js.Any], ngJitMode = ngJitMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofGLOBALDEFSFORTERNgDevMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofGLOBALDEFSFORTERNgDevMode] (val x: Self) extends AnyVal {
    
    inline def setNgDevMode(value: Boolean): Self = StObject.set(x, "ngDevMode", value.asInstanceOf[js.Any])
    
    inline def setNgI18nClosureMode(value: Boolean): Self = StObject.set(x, "ngI18nClosureMode", value.asInstanceOf[js.Any])
    
    inline def setNgJitMode(value: Boolean): Self = StObject.set(x, "ngJitMode", value.asInstanceOf[js.Any])
  }
}
