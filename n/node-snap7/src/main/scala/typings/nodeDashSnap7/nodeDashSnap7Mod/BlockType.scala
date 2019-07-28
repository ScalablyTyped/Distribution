package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlockType extends js.Object

@JSImport("node-snap7", "BlockType")
@js.native
object BlockType extends js.Object {
  @js.native
  sealed trait Block_DB extends BlockType
  
  @js.native
  sealed trait Block_FB extends BlockType
  
  @js.native
  sealed trait Block_FC extends BlockType
  
  @js.native
  sealed trait Block_OB extends BlockType
  
  @js.native
  sealed trait Block_SDB extends BlockType
  
  @js.native
  sealed trait Block_SFB extends BlockType
  
  @js.native
  sealed trait Block_SFC extends BlockType
  
  /* 0x41 */ val Block_DB: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_DB with Double = js.native
  /* 0x45 */ val Block_FB: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_FB with Double = js.native
  /* 0x43 */ val Block_FC: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_FC with Double = js.native
  /* 0x38 */ val Block_OB: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_OB with Double = js.native
  /* 0x42 */ val Block_SDB: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_SDB with Double = js.native
  /* 0x46 */ val Block_SFB: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_SFB with Double = js.native
  /* 0x44 */ val Block_SFC: typings.nodeDashSnap7.nodeDashSnap7Mod.BlockType.Block_SFC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType with Double] = js.native
}

