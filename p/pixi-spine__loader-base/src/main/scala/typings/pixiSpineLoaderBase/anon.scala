package typings.pixiSpineLoaderBase

import typings.pixiLoaders.mod.LoaderResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Use extends StObject {
    
    def use(resource: LoaderResource, next: js.Function0[Any]): Any
  }
  object Use {
    
    inline def apply(use: (LoaderResource, js.Function0[Any]) => Any): Use = {
      val __obj = js.Dynamic.literal(use = js.Any.fromFunction2(use))
      __obj.asInstanceOf[Use]
    }
    
    extension [Self <: Use](x: Self) {
      
      inline def setUse(value: (LoaderResource, js.Function0[Any]) => Any): Self = StObject.set(x, "use", js.Any.fromFunction2(value))
    }
  }
}
