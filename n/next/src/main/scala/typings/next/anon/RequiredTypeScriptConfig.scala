package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<next.next/dist/server/config-shared.TypeScriptConfig> */
trait RequiredTypeScriptConfig extends StObject {
  
  var ignoreBuildErrors: Boolean
  
  var tsconfigPath: String
}
object RequiredTypeScriptConfig {
  
  inline def apply(ignoreBuildErrors: Boolean, tsconfigPath: String): RequiredTypeScriptConfig = {
    val __obj = js.Dynamic.literal(ignoreBuildErrors = ignoreBuildErrors.asInstanceOf[js.Any], tsconfigPath = tsconfigPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTypeScriptConfig]
  }
  
  extension [Self <: RequiredTypeScriptConfig](x: Self) {
    
    inline def setIgnoreBuildErrors(value: Boolean): Self = StObject.set(x, "ignoreBuildErrors", value.asInstanceOf[js.Any])
    
    inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
  }
}
