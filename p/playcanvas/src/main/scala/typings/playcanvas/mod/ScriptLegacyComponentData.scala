package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptLegacyComponentData extends StObject {
  
  var areScriptsLoaded: Boolean
  
  var enabled: Boolean
  
  var initialized: Boolean
  
  var postInitialized: Boolean
  
  var runInTools: Boolean
  
  var scripts: js.Array[Any]
}
object ScriptLegacyComponentData {
  
  inline def apply(
    areScriptsLoaded: Boolean,
    enabled: Boolean,
    initialized: Boolean,
    postInitialized: Boolean,
    runInTools: Boolean,
    scripts: js.Array[Any]
  ): ScriptLegacyComponentData = {
    val __obj = js.Dynamic.literal(areScriptsLoaded = areScriptsLoaded.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], postInitialized = postInitialized.asInstanceOf[js.Any], runInTools = runInTools.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptLegacyComponentData]
  }
  
  extension [Self <: ScriptLegacyComponentData](x: Self) {
    
    inline def setAreScriptsLoaded(value: Boolean): Self = StObject.set(x, "areScriptsLoaded", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setPostInitialized(value: Boolean): Self = StObject.set(x, "postInitialized", value.asInstanceOf[js.Any])
    
    inline def setRunInTools(value: Boolean): Self = StObject.set(x, "runInTools", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: js.Array[Any]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: Any*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
