package typings.officeUiFabricReact.pivotTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PivotLinkSize extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkSize")
@js.native
object PivotLinkSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PivotLinkSize with Double] = js.native
  
  /**
    * Display links using large font size
    */
  @js.native
  sealed trait large extends PivotLinkSize
  /* 1 */ @js.native
  object large extends TopLevel[large with Double]
  
  /**
    * Display Link using normal font size
    */
  @js.native
  sealed trait normal extends PivotLinkSize
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
}
