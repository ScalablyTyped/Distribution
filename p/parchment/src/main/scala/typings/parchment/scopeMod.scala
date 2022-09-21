package typings.parchment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  @JSImport("parchment/dist/typings/scope", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Scope & Double] = js.native
    
    /* 15 */ val ANY: typings.parchment.scopeMod.Scope.ANY & Double = js.native
    
    /* 13 */ val ATTRIBUTE: typings.parchment.scopeMod.Scope.ATTRIBUTE & Double = js.native
    
    /* 11 */ val BLOCK: typings.parchment.scopeMod.Scope.BLOCK & Double = js.native
    
    /* 9 */ val BLOCK_ATTRIBUTE: typings.parchment.scopeMod.Scope.BLOCK_ATTRIBUTE & Double = js.native
    
    /* 10 */ val BLOCK_BLOT: typings.parchment.scopeMod.Scope.BLOCK_BLOT & Double = js.native
    
    /* 14 */ val BLOT: typings.parchment.scopeMod.Scope.BLOT & Double = js.native
    
    /* 7 */ val INLINE: typings.parchment.scopeMod.Scope.INLINE & Double = js.native
    
    /* 5 */ val INLINE_ATTRIBUTE: typings.parchment.scopeMod.Scope.INLINE_ATTRIBUTE & Double = js.native
    
    /* 6 */ val INLINE_BLOT: typings.parchment.scopeMod.Scope.INLINE_BLOT & Double = js.native
    
    /* 12 */ val LEVEL: typings.parchment.scopeMod.Scope.LEVEL & Double = js.native
    
    /* 3 */ val TYPE: typings.parchment.scopeMod.Scope.TYPE & Double = js.native
  }
  
  @js.native
  sealed trait Scope extends StObject
  @JSImport("parchment/dist/typings/scope", "Scope")
  @js.native
  object Scope extends StObject {
    
    @js.native
    sealed trait ANY
      extends StObject
         with Scope
    
    @js.native
    sealed trait ATTRIBUTE
      extends StObject
         with Scope
    
    @js.native
    sealed trait BLOCK
      extends StObject
         with Scope
    
    @js.native
    sealed trait BLOCK_ATTRIBUTE
      extends StObject
         with Scope
    
    @js.native
    sealed trait BLOCK_BLOT
      extends StObject
         with Scope
    
    @js.native
    sealed trait BLOT
      extends StObject
         with Scope
    
    @js.native
    sealed trait INLINE
      extends StObject
         with Scope
    
    @js.native
    sealed trait INLINE_ATTRIBUTE
      extends StObject
         with Scope
    
    @js.native
    sealed trait INLINE_BLOT
      extends StObject
         with Scope
    
    @js.native
    sealed trait LEVEL
      extends StObject
         with Scope
    
    @js.native
    sealed trait TYPE
      extends StObject
         with Scope
  }
}
