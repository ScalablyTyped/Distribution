package typings.nodeDashSnap7.nodeDashSnap7Mod

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_DB
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_FB
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_FC
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_OB
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SDB
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SFB
import typings.nodeDashSnap7.nodeDashSnap7Mod.SubBlockType.SubBlk_SFC
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubBlockType with Double] = js.native
  /* 0x0A */ @js.native
  object SubBlk_DB extends TopLevel[SubBlk_DB with Double]
  
  /* 0x0E */ @js.native
  object SubBlk_FB extends TopLevel[SubBlk_FB with Double]
  
  /* 0x0C */ @js.native
  object SubBlk_FC extends TopLevel[SubBlk_FC with Double]
  
  /* 0x08 */ @js.native
  object SubBlk_OB extends TopLevel[SubBlk_OB with Double]
  
  /* 0x0B */ @js.native
  object SubBlk_SDB extends TopLevel[SubBlk_SDB with Double]
  
  /* 0x0F */ @js.native
  object SubBlk_SFB extends TopLevel[SubBlk_SFB with Double]
  
  /* 0x0D */ @js.native
  object SubBlk_SFC extends TopLevel[SubBlk_SFC with Double]
  
}

