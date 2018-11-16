package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlockType extends js.Object

@JSImport("node-snap7", "BlockType")
@js.native
object BlockType extends js.Object {
  @js.native
  sealed trait Block_DB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_FB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_FC
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_OB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_SDB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_SFB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  @js.native
  sealed trait Block_SFC
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType
  
  /* 0x41 */ val Block_DB: Block_DB with scala.Double = js.native
  /* 0x45 */ val Block_FB: Block_FB with scala.Double = js.native
  /* 0x43 */ val Block_FC: Block_FC with scala.Double = js.native
  /* 0x38 */ val Block_OB: Block_OB with scala.Double = js.native
  /* 0x42 */ val Block_SDB: Block_SDB with scala.Double = js.native
  /* 0x46 */ val Block_SFB: Block_SFB with scala.Double = js.native
  /* 0x44 */ val Block_SFC: Block_SFC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.BlockType with scala.Double] = js.native
}

