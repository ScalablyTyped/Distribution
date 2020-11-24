package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubBlockType extends js.Object
@JSImport("node-snap7", "SubBlockType")
@js.native
object SubBlockType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubBlockType with Double] = js.native
  
  @js.native
  sealed trait SubBlk_DB extends SubBlockType
  /* 0x0A */ @js.native
  object SubBlk_DB extends TopLevel[SubBlk_DB with Double]
  
  @js.native
  sealed trait SubBlk_FB extends SubBlockType
  /* 0x0E */ @js.native
  object SubBlk_FB extends TopLevel[SubBlk_FB with Double]
  
  @js.native
  sealed trait SubBlk_FC extends SubBlockType
  /* 0x0C */ @js.native
  object SubBlk_FC extends TopLevel[SubBlk_FC with Double]
  
  @js.native
  sealed trait SubBlk_OB extends SubBlockType
  /* 0x08 */ @js.native
  object SubBlk_OB extends TopLevel[SubBlk_OB with Double]
  
  @js.native
  sealed trait SubBlk_SDB extends SubBlockType
  /* 0x0B */ @js.native
  object SubBlk_SDB extends TopLevel[SubBlk_SDB with Double]
  
  @js.native
  sealed trait SubBlk_SFB extends SubBlockType
  /* 0x0F */ @js.native
  object SubBlk_SFB extends TopLevel[SubBlk_SFB with Double]
  
  @js.native
  sealed trait SubBlk_SFC extends SubBlockType
  /* 0x0D */ @js.native
  object SubBlk_SFC extends TopLevel[SubBlk_SFC with Double]
}
