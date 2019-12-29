package typings.nodeDashSnap7.nodeDashSnap7Mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangType with Double] = js.native
  /* 0x01 */ @js.native
  object BlockLangAWL extends TopLevel[BlockLangAWL with Double]
  
  /* 0x05 */ @js.native
  object BlockLangDB extends TopLevel[BlockLangDB with Double]
  
  /* 0x03 */ @js.native
  object BlockLangFUP extends TopLevel[BlockLangFUP with Double]
  
  /* 0x06 */ @js.native
  object BlockLangGRAPH extends TopLevel[BlockLangGRAPH with Double]
  
  /* 0x02 */ @js.native
  object BlockLangKOP extends TopLevel[BlockLangKOP with Double]
  
  /* 0x04 */ @js.native
  object BlockLangSCL extends TopLevel[BlockLangSCL with Double]
  
}

