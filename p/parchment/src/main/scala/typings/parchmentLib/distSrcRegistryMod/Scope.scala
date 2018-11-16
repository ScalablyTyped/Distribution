package typings
package parchmentLib.distSrcRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Scope extends js.Object

@JSImport("parchment/dist/src/registry", "Scope")
@js.native
object Scope extends js.Object {
  @js.native
  sealed trait ANY
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait ATTRIBUTE
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait BLOCK
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait BLOCK_ATTRIBUTE
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait BLOCK_BLOT
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait BLOT
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait INLINE
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait INLINE_ATTRIBUTE
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait INLINE_BLOT
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait LEVEL
    extends parchmentLib.distSrcRegistryMod.Scope
  
  @js.native
  sealed trait TYPE
    extends parchmentLib.distSrcRegistryMod.Scope
  
  /* 15 */ val ANY: ANY with scala.Double = js.native
  /* 13 */ val ATTRIBUTE: ATTRIBUTE with scala.Double = js.native
  /* 11 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 9 */ val BLOCK_ATTRIBUTE: BLOCK_ATTRIBUTE with scala.Double = js.native
  /* 10 */ val BLOCK_BLOT: BLOCK_BLOT with scala.Double = js.native
  /* 14 */ val BLOT: BLOT with scala.Double = js.native
  /* 7 */ val INLINE: INLINE with scala.Double = js.native
  /* 5 */ val INLINE_ATTRIBUTE: INLINE_ATTRIBUTE with scala.Double = js.native
  /* 6 */ val INLINE_BLOT: INLINE_BLOT with scala.Double = js.native
  /* 12 */ val LEVEL: LEVEL with scala.Double = js.native
  /* 3 */ val TYPE: TYPE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[parchmentLib.distSrcRegistryMod.Scope with scala.Double] = js.native
}

