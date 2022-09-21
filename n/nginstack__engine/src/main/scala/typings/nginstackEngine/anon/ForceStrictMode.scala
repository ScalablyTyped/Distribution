package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceStrictMode extends StObject {
  
  var forceStrictMode: Boolean
  
  var ignoredFileKeys: js.Array[Double]
}
object ForceStrictMode {
  
  inline def apply(forceStrictMode: Boolean, ignoredFileKeys: js.Array[Double]): ForceStrictMode = {
    val __obj = js.Dynamic.literal(forceStrictMode = forceStrictMode.asInstanceOf[js.Any], ignoredFileKeys = ignoredFileKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceStrictMode]
  }
  
  extension [Self <: ForceStrictMode](x: Self) {
    
    inline def setForceStrictMode(value: Boolean): Self = StObject.set(x, "forceStrictMode", value.asInstanceOf[js.Any])
    
    inline def setIgnoredFileKeys(value: js.Array[Double]): Self = StObject.set(x, "ignoredFileKeys", value.asInstanceOf[js.Any])
    
    inline def setIgnoredFileKeysVarargs(value: Double*): Self = StObject.set(x, "ignoredFileKeys", js.Array(value*))
  }
}
