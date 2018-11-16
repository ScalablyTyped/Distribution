package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubBlockType extends js.Object

@JSImport("node-snap7", "SubBlockType")
@js.native
object SubBlockType extends js.Object {
  @js.native
  sealed trait SubBlk_DB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_FB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_FC
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_OB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_SDB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_SFB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  @js.native
  sealed trait SubBlk_SFC
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType
  
  /* 0x0A */ val SubBlk_DB: SubBlk_DB with scala.Double = js.native
  /* 0x0E */ val SubBlk_FB: SubBlk_FB with scala.Double = js.native
  /* 0x0C */ val SubBlk_FC: SubBlk_FC with scala.Double = js.native
  /* 0x08 */ val SubBlk_OB: SubBlk_OB with scala.Double = js.native
  /* 0x0B */ val SubBlk_SDB: SubBlk_SDB with scala.Double = js.native
  /* 0x0F */ val SubBlk_SFB: SubBlk_SFB with scala.Double = js.native
  /* 0x0D */ val SubBlk_SFC: SubBlk_SFC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.SubBlockType with scala.Double] = js.native
}

