package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreDependencyContainerConstantsLifetimeMod {
  
  @JSImport("playable/dist/src/core/dependency-container/constants/Lifetime", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Lifetime & String] = js.native
    
    /* "scoped" */ val SCOPED: typings.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime.SCOPED & String = js.native
    
    /* "singleton" */ val SINGLETON: typings.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime.SINGLETON & String = js.native
    
    /* "transient" */ val TRANSIENT: typings.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime.TRANSIENT & String = js.native
  }
  
  @js.native
  sealed trait Lifetime extends StObject
  @JSImport("playable/dist/src/core/dependency-container/constants/Lifetime", "Lifetime")
  @js.native
  object Lifetime extends StObject {
    
    @js.native
    sealed trait SCOPED
      extends StObject
         with Lifetime
    
    @js.native
    sealed trait SINGLETON
      extends StObject
         with Lifetime
    
    @js.native
    sealed trait TRANSIENT
      extends StObject
         with Lifetime
  }
}
