package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amd extends StObject {
  
  var amd: Boolean
  
  var deps: js.Array[String]
  
  var exports: String | js.Array[String]
}
object Amd {
  
  inline def apply(amd: Boolean, deps: js.Array[String], exports: String | js.Array[String]): Amd = {
    val __obj = js.Dynamic.literal(amd = amd.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amd]
  }
  
  extension [Self <: Amd](x: Self) {
    
    inline def setAmd(value: Boolean): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setExports(value: String | js.Array[String]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: String*): Self = StObject.set(x, "exports", js.Array(value*))
  }
}
