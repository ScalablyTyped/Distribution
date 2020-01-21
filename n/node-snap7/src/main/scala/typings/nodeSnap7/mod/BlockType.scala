package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType with Double] = js.native
  /* 0x41 */ @js.native
  object Block_DB extends TopLevel[Block_DB with Double]
  
  /* 0x45 */ @js.native
  object Block_FB extends TopLevel[Block_FB with Double]
  
  /* 0x43 */ @js.native
  object Block_FC extends TopLevel[Block_FC with Double]
  
  /* 0x38 */ @js.native
  object Block_OB extends TopLevel[Block_OB with Double]
  
  /* 0x42 */ @js.native
  object Block_SDB extends TopLevel[Block_SDB with Double]
  
  /* 0x46 */ @js.native
  object Block_SFB extends TopLevel[Block_SFB with Double]
  
  /* 0x44 */ @js.native
  object Block_SFC extends TopLevel[Block_SFC with Double]
  
}

