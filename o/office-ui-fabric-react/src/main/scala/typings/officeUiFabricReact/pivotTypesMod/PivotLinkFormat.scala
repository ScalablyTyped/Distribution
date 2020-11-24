package typings.officeUiFabricReact.pivotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotLinkFormat extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkFormat")
@js.native
object PivotLinkFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkFormat with Double] = js.native
  
  /**
    * Display Pivot Links as links
    */
  @js.native
  sealed trait links extends PivotLinkFormat
  /* 0 */ @js.native
  object links extends TopLevel[links with Double]
  
  /**
    * Display Pivot Links as Tabs
    */
  @js.native
  sealed trait tabs extends PivotLinkFormat
  /* 1 */ @js.native
  object tabs extends TopLevel[tabs with Double]
}
