package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubBlockType extends StObject
@JSImport("node-snap7", "SubBlockType")
@js.native
object SubBlockType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubBlockType & Double] = js.native
  
  @js.native
  sealed trait SubBlk_DB
    extends StObject
       with SubBlockType
  /* 0x0A */ val SubBlk_DB: typings.nodeSnap7.mod.SubBlockType.SubBlk_DB & Double = js.native
  
  @js.native
  sealed trait SubBlk_FB
    extends StObject
       with SubBlockType
  /* 0x0E */ val SubBlk_FB: typings.nodeSnap7.mod.SubBlockType.SubBlk_FB & Double = js.native
  
  @js.native
  sealed trait SubBlk_FC
    extends StObject
       with SubBlockType
  /* 0x0C */ val SubBlk_FC: typings.nodeSnap7.mod.SubBlockType.SubBlk_FC & Double = js.native
  
  @js.native
  sealed trait SubBlk_OB
    extends StObject
       with SubBlockType
  /* 0x08 */ val SubBlk_OB: typings.nodeSnap7.mod.SubBlockType.SubBlk_OB & Double = js.native
  
  @js.native
  sealed trait SubBlk_SDB
    extends StObject
       with SubBlockType
  /* 0x0B */ val SubBlk_SDB: typings.nodeSnap7.mod.SubBlockType.SubBlk_SDB & Double = js.native
  
  @js.native
  sealed trait SubBlk_SFB
    extends StObject
       with SubBlockType
  /* 0x0F */ val SubBlk_SFB: typings.nodeSnap7.mod.SubBlockType.SubBlk_SFB & Double = js.native
  
  @js.native
  sealed trait SubBlk_SFC
    extends StObject
       with SubBlockType
  /* 0x0D */ val SubBlk_SFC: typings.nodeSnap7.mod.SubBlockType.SubBlk_SFC & Double = js.native
}
