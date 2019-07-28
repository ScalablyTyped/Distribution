package typings.parchment.distSrcRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Scope extends js.Object

@JSImport("parchment/dist/src/registry", "Scope")
@js.native
object Scope extends js.Object {
  @js.native
  sealed trait ANY extends Scope
  
  @js.native
  sealed trait ATTRIBUTE extends Scope
  
  @js.native
  sealed trait BLOCK extends Scope
  
  @js.native
  sealed trait BLOCK_ATTRIBUTE extends Scope
  
  @js.native
  sealed trait BLOCK_BLOT extends Scope
  
  @js.native
  sealed trait BLOT extends Scope
  
  @js.native
  sealed trait INLINE extends Scope
  
  @js.native
  sealed trait INLINE_ATTRIBUTE extends Scope
  
  @js.native
  sealed trait INLINE_BLOT extends Scope
  
  @js.native
  sealed trait LEVEL extends Scope
  
  @js.native
  sealed trait TYPE extends Scope
  
  /* 15 */ val ANY: typings.parchment.distSrcRegistryMod.Scope.ANY with Double = js.native
  /* 13 */ val ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.ATTRIBUTE with Double = js.native
  /* 11 */ val BLOCK: typings.parchment.distSrcRegistryMod.Scope.BLOCK with Double = js.native
  /* 9 */ val BLOCK_ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.BLOCK_ATTRIBUTE with Double = js.native
  /* 10 */ val BLOCK_BLOT: typings.parchment.distSrcRegistryMod.Scope.BLOCK_BLOT with Double = js.native
  /* 14 */ val BLOT: typings.parchment.distSrcRegistryMod.Scope.BLOT with Double = js.native
  /* 7 */ val INLINE: typings.parchment.distSrcRegistryMod.Scope.INLINE with Double = js.native
  /* 5 */ val INLINE_ATTRIBUTE: typings.parchment.distSrcRegistryMod.Scope.INLINE_ATTRIBUTE with Double = js.native
  /* 6 */ val INLINE_BLOT: typings.parchment.distSrcRegistryMod.Scope.INLINE_BLOT with Double = js.native
  /* 12 */ val LEVEL: typings.parchment.distSrcRegistryMod.Scope.LEVEL with Double = js.native
  /* 3 */ val TYPE: typings.parchment.distSrcRegistryMod.Scope.TYPE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Scope with Double] = js.native
}

