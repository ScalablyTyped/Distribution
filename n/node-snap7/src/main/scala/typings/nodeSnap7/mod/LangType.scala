package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LangType extends StObject
@JSImport("node-snap7", "LangType")
@js.native
object LangType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangType & Double] = js.native
  
  @js.native
  sealed trait BlockLangAWL
    extends StObject
       with LangType
  /* 0x01 */ val BlockLangAWL: typings.nodeSnap7.mod.LangType.BlockLangAWL & Double = js.native
  
  @js.native
  sealed trait BlockLangDB
    extends StObject
       with LangType
  /* 0x05 */ val BlockLangDB: typings.nodeSnap7.mod.LangType.BlockLangDB & Double = js.native
  
  @js.native
  sealed trait BlockLangFUP
    extends StObject
       with LangType
  /* 0x03 */ val BlockLangFUP: typings.nodeSnap7.mod.LangType.BlockLangFUP & Double = js.native
  
  @js.native
  sealed trait BlockLangGRAPH
    extends StObject
       with LangType
  /* 0x06 */ val BlockLangGRAPH: typings.nodeSnap7.mod.LangType.BlockLangGRAPH & Double = js.native
  
  @js.native
  sealed trait BlockLangKOP
    extends StObject
       with LangType
  /* 0x02 */ val BlockLangKOP: typings.nodeSnap7.mod.LangType.BlockLangKOP & Double = js.native
  
  @js.native
  sealed trait BlockLangSCL
    extends StObject
       with LangType
  /* 0x04 */ val BlockLangSCL: typings.nodeSnap7.mod.LangType.BlockLangSCL & Double = js.native
}
