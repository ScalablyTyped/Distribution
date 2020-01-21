package typings.officeUiFabricReact.resizeGroupTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeGroupDirection extends js.Object

@JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.types", "ResizeGroupDirection")
@js.native
object ResizeGroupDirection extends js.Object {
  @js.native
  sealed trait horizontal extends ResizeGroupDirection
  
  @js.native
  sealed trait vertical extends ResizeGroupDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeGroupDirection with Double] = js.native
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
  
}

