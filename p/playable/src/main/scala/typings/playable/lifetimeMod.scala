package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifetimeMod {
  
  @JSImport("playable/dist/src/core/dependency-container/constants/Lifetime", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Lifetime with String] = js.native
    
    /* "scoped" */ val SCOPED: typings.playable.lifetimeMod.Lifetime.SCOPED with String = js.native
    
    /* "singleton" */ val SINGLETON: typings.playable.lifetimeMod.Lifetime.SINGLETON with String = js.native
    
    /* "transient" */ val TRANSIENT: typings.playable.lifetimeMod.Lifetime.TRANSIENT with String = js.native
  }
  
  @js.native
  sealed trait Lifetime extends StObject
  @JSImport("playable/dist/src/core/dependency-container/constants/Lifetime", "Lifetime")
  @js.native
  object Lifetime extends StObject {
    
    @js.native
    sealed trait SCOPED extends Lifetime
    
    @js.native
    sealed trait SINGLETON extends Lifetime
    
    @js.native
    sealed trait TRANSIENT extends Lifetime
  }
}
