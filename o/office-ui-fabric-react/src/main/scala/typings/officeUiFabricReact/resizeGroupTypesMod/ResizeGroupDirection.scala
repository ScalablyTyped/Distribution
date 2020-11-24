package typings.officeUiFabricReact.resizeGroupTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResizeGroupDirection extends js.Object
@JSImport("office-ui-fabric-react/lib/components/ResizeGroup/ResizeGroup.types", "ResizeGroupDirection")
@js.native
object ResizeGroupDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeGroupDirection with Double] = js.native
  
  @js.native
  sealed trait horizontal extends ResizeGroupDirection
  /* 0 */ @js.native
  object horizontal extends TopLevel[horizontal with Double]
  
  @js.native
  sealed trait vertical extends ResizeGroupDirection
  /* 1 */ @js.native
  object vertical extends TopLevel[vertical with Double]
}
