package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubBlockType extends StObject
@JSImport("node-snap7", "SubBlockType")
@js.native
object SubBlockType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubBlockType with Double] = js.native
  
  @js.native
  sealed trait SubBlk_DB extends SubBlockType
  /* 0x0A */ val SubBlk_DB: typings.nodeSnap7.mod.SubBlockType.SubBlk_DB with Double = js.native
  
  @js.native
  sealed trait SubBlk_FB extends SubBlockType
  /* 0x0E */ val SubBlk_FB: typings.nodeSnap7.mod.SubBlockType.SubBlk_FB with Double = js.native
  
  @js.native
  sealed trait SubBlk_FC extends SubBlockType
  /* 0x0C */ val SubBlk_FC: typings.nodeSnap7.mod.SubBlockType.SubBlk_FC with Double = js.native
  
  @js.native
  sealed trait SubBlk_OB extends SubBlockType
  /* 0x08 */ val SubBlk_OB: typings.nodeSnap7.mod.SubBlockType.SubBlk_OB with Double = js.native
  
  @js.native
  sealed trait SubBlk_SDB extends SubBlockType
  /* 0x0B */ val SubBlk_SDB: typings.nodeSnap7.mod.SubBlockType.SubBlk_SDB with Double = js.native
  
  @js.native
  sealed trait SubBlk_SFB extends SubBlockType
  /* 0x0F */ val SubBlk_SFB: typings.nodeSnap7.mod.SubBlockType.SubBlk_SFB with Double = js.native
  
  @js.native
  sealed trait SubBlk_SFC extends SubBlockType
  /* 0x0D */ val SubBlk_SFC: typings.nodeSnap7.mod.SubBlockType.SubBlk_SFC with Double = js.native
}
