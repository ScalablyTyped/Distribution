package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JoinOperator extends js.Object
@JSGlobal("Sdk.Query.JoinOperator")
@js.native
object JoinOperator extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoinOperator with Double] = js.native
  
  @js.native
  sealed trait Inner extends JoinOperator
  /* 0 */ @js.native
  object Inner extends TopLevel[Inner with Double]
  
  @js.native
  sealed trait LeftOuter extends JoinOperator
  /* 1 */ @js.native
  object LeftOuter extends TopLevel[LeftOuter with Double]
  
  @js.native
  sealed trait Natural extends JoinOperator
  /* 2 */ @js.native
  object Natural extends TopLevel[Natural with Double]
}
