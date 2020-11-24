package typings.mvdanSh.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LangVariant extends js.Object
@JSImport("mvdan-sh", "LangVariant")
@js.native
object LangVariant extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangVariant with Double] = js.native
  
  @js.native
  sealed trait LangBash extends LangVariant
  /* 0 */ @js.native
  object LangBash extends TopLevel[LangBash with Double]
  
  @js.native
  sealed trait LangMirBSDKorn extends LangVariant
  /* 2 */ @js.native
  object LangMirBSDKorn extends TopLevel[LangMirBSDKorn with Double]
  
  @js.native
  sealed trait LangPOSIX extends LangVariant
  /* 1 */ @js.native
  object LangPOSIX extends TopLevel[LangPOSIX with Double]
}
