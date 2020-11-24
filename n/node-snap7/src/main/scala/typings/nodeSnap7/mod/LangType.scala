package typings.nodeSnap7.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LangType extends js.Object
@JSImport("node-snap7", "LangType")
@js.native
object LangType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangType with Double] = js.native
  
  @js.native
  sealed trait BlockLangAWL extends LangType
  /* 0x01 */ @js.native
  object BlockLangAWL extends TopLevel[BlockLangAWL with Double]
  
  @js.native
  sealed trait BlockLangDB extends LangType
  /* 0x05 */ @js.native
  object BlockLangDB extends TopLevel[BlockLangDB with Double]
  
  @js.native
  sealed trait BlockLangFUP extends LangType
  /* 0x03 */ @js.native
  object BlockLangFUP extends TopLevel[BlockLangFUP with Double]
  
  @js.native
  sealed trait BlockLangGRAPH extends LangType
  /* 0x06 */ @js.native
  object BlockLangGRAPH extends TopLevel[BlockLangGRAPH with Double]
  
  @js.native
  sealed trait BlockLangKOP extends LangType
  /* 0x02 */ @js.native
  object BlockLangKOP extends TopLevel[BlockLangKOP with Double]
  
  @js.native
  sealed trait BlockLangSCL extends LangType
  /* 0x04 */ @js.native
  object BlockLangSCL extends TopLevel[BlockLangSCL with Double]
}
