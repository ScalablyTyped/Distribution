package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubBlockType extends js.Object

@JSImport("node-snap7", "SubBlockType")
@js.native
object SubBlockType extends js.Object {
  @js.native
  sealed trait SubBlk_DB extends SubBlockType
  
  @js.native
  sealed trait SubBlk_FB extends SubBlockType
  
  @js.native
  sealed trait SubBlk_FC extends SubBlockType
  
  @js.native
  sealed trait SubBlk_OB extends SubBlockType
  
  @js.native
  sealed trait SubBlk_SDB extends SubBlockType
  
  @js.native
  sealed trait SubBlk_SFB extends SubBlockType
  
  @js.native
  sealed trait SubBlk_SFC extends SubBlockType
  
  /* 0x0A */ val SubBlk_DB: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_DB with Double = js.native
  /* 0x0E */ val SubBlk_FB: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_FB with Double = js.native
  /* 0x0C */ val SubBlk_FC: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_FC with Double = js.native
  /* 0x08 */ val SubBlk_OB: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_OB with Double = js.native
  /* 0x0B */ val SubBlk_SDB: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SDB with Double = js.native
  /* 0x0F */ val SubBlk_SFB: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SFB with Double = js.native
  /* 0x0D */ val SubBlk_SFC: typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SFC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubBlockType with Double] = js.native
}

