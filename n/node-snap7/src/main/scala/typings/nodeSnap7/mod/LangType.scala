package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LangType extends StObject
@JSImport("node-snap7", "LangType")
@js.native
object LangType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangType with Double] = js.native
  
  @js.native
  sealed trait BlockLangAWL extends LangType
  /* 0x01 */ val BlockLangAWL: typings.nodeSnap7.mod.LangType.BlockLangAWL with Double = js.native
  
  @js.native
  sealed trait BlockLangDB extends LangType
  /* 0x05 */ val BlockLangDB: typings.nodeSnap7.mod.LangType.BlockLangDB with Double = js.native
  
  @js.native
  sealed trait BlockLangFUP extends LangType
  /* 0x03 */ val BlockLangFUP: typings.nodeSnap7.mod.LangType.BlockLangFUP with Double = js.native
  
  @js.native
  sealed trait BlockLangGRAPH extends LangType
  /* 0x06 */ val BlockLangGRAPH: typings.nodeSnap7.mod.LangType.BlockLangGRAPH with Double = js.native
  
  @js.native
  sealed trait BlockLangKOP extends LangType
  /* 0x02 */ val BlockLangKOP: typings.nodeSnap7.mod.LangType.BlockLangKOP with Double = js.native
  
  @js.native
  sealed trait BlockLangSCL extends LangType
  /* 0x04 */ val BlockLangSCL: typings.nodeSnap7.mod.LangType.BlockLangSCL with Double = js.native
}
