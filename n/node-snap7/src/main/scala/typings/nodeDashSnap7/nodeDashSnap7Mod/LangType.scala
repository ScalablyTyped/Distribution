package typings.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LangType extends js.Object

@JSImport("node-snap7", "LangType")
@js.native
object LangType extends js.Object {
  @js.native
  sealed trait BlockLangAWL extends LangType
  
  @js.native
  sealed trait BlockLangDB extends LangType
  
  @js.native
  sealed trait BlockLangFUP extends LangType
  
  @js.native
  sealed trait BlockLangGRAPH extends LangType
  
  @js.native
  sealed trait BlockLangKOP extends LangType
  
  @js.native
  sealed trait BlockLangSCL extends LangType
  
  /* 0x01 */ val BlockLangAWL: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangAWL with Double = js.native
  /* 0x05 */ val BlockLangDB: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangDB with Double = js.native
  /* 0x03 */ val BlockLangFUP: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangFUP with Double = js.native
  /* 0x06 */ val BlockLangGRAPH: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangGRAPH with Double = js.native
  /* 0x02 */ val BlockLangKOP: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangKOP with Double = js.native
  /* 0x04 */ val BlockLangSCL: typings.nodeDashSnap7.nodeDashSnap7Mod.LangType.BlockLangSCL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangType with Double] = js.native
}

