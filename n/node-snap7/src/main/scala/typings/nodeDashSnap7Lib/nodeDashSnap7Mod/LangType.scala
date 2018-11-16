package typings
package nodeDashSnap7Lib.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LangType extends js.Object

@JSImport("node-snap7", "LangType")
@js.native
object LangType extends js.Object {
  @js.native
  sealed trait BlockLangAWL
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  @js.native
  sealed trait BlockLangDB
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  @js.native
  sealed trait BlockLangFUP
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  @js.native
  sealed trait BlockLangGRAPH
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  @js.native
  sealed trait BlockLangKOP
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  @js.native
  sealed trait BlockLangSCL
    extends nodeDashSnap7Lib.nodeDashSnap7Mod.LangType
  
  /* 0x01 */ val BlockLangAWL: BlockLangAWL with scala.Double = js.native
  /* 0x05 */ val BlockLangDB: BlockLangDB with scala.Double = js.native
  /* 0x03 */ val BlockLangFUP: BlockLangFUP with scala.Double = js.native
  /* 0x06 */ val BlockLangGRAPH: BlockLangGRAPH with scala.Double = js.native
  /* 0x02 */ val BlockLangKOP: BlockLangKOP with scala.Double = js.native
  /* 0x04 */ val BlockLangSCL: BlockLangSCL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nodeDashSnap7Lib.nodeDashSnap7Mod.LangType with scala.Double] = js.native
}

