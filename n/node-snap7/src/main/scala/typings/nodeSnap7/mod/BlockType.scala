package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockType extends StObject
@JSImport("node-snap7", "BlockType")
@js.native
object BlockType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType & Double] = js.native
  
  @js.native
  sealed trait Block_DB
    extends StObject
       with BlockType
  /* 0x41 */ val Block_DB: typings.nodeSnap7.mod.BlockType.Block_DB & Double = js.native
  
  @js.native
  sealed trait Block_FB
    extends StObject
       with BlockType
  /* 0x45 */ val Block_FB: typings.nodeSnap7.mod.BlockType.Block_FB & Double = js.native
  
  @js.native
  sealed trait Block_FC
    extends StObject
       with BlockType
  /* 0x43 */ val Block_FC: typings.nodeSnap7.mod.BlockType.Block_FC & Double = js.native
  
  @js.native
  sealed trait Block_OB
    extends StObject
       with BlockType
  /* 0x38 */ val Block_OB: typings.nodeSnap7.mod.BlockType.Block_OB & Double = js.native
  
  @js.native
  sealed trait Block_SDB
    extends StObject
       with BlockType
  /* 0x42 */ val Block_SDB: typings.nodeSnap7.mod.BlockType.Block_SDB & Double = js.native
  
  @js.native
  sealed trait Block_SFB
    extends StObject
       with BlockType
  /* 0x46 */ val Block_SFB: typings.nodeSnap7.mod.BlockType.Block_SFB & Double = js.native
  
  @js.native
  sealed trait Block_SFC
    extends StObject
       with BlockType
  /* 0x44 */ val Block_SFC: typings.nodeSnap7.mod.BlockType.Block_SFC & Double = js.native
}
