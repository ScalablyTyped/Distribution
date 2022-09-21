package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Alias for compatibility
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Dict<string> * / any */ trait ProcessEnv extends StObject {
  
  /**
    * Can be used to change the default timezone at runtime
    */
  var TZ: js.UndefOr[String] = js.undefined
}
object ProcessEnv {
  
  inline def apply(): ProcessEnv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessEnv]
  }
  
  extension [Self <: ProcessEnv](x: Self) {
    
    inline def setTZ(value: String): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
    
    inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
  }
}
