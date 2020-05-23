package typings.mvdanSh.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LangVariant extends js.Object

@JSImport("mvdan-sh", "LangVariant")
@js.native
object LangVariant extends js.Object {
  @js.native
  sealed trait LangBash extends LangVariant
  
  @js.native
  sealed trait LangMirBSDKorn extends LangVariant
  
  @js.native
  sealed trait LangPOSIX extends LangVariant
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LangVariant with Double] = js.native
  /* 0 */ @js.native
  object LangBash extends TopLevel[LangBash with Double]
  
  /* 2 */ @js.native
  object LangMirBSDKorn extends TopLevel[LangMirBSDKorn with Double]
  
  /* 1 */ @js.native
  object LangPOSIX extends TopLevel[LangPOSIX with Double]
  
}

