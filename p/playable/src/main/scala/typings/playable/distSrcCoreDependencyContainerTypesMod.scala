package typings.playable

import typings.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreDependencyContainerTypesMod {
  
  trait IOptions extends StObject {
    
    var lifetime: js.UndefOr[Lifetime] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setLifetime(value: Lifetime): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    }
  }
}
