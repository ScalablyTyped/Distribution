package typings.officeUiFabricReact.facepileTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OverflowButtonType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
@js.native
object OverflowButtonType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowButtonType with Double] = js.native
  
  /** +1 overflow icon */
  @js.native
  sealed trait descriptive extends OverflowButtonType
  /* 1 */ @js.native
  object descriptive extends TopLevel[descriptive with Double]
  
  /** Chevron overflow icon */
  @js.native
  sealed trait downArrow extends OverflowButtonType
  /* 3 */ @js.native
  object downArrow extends TopLevel[downArrow with Double]
  
  /** More overflow icon */
  @js.native
  sealed trait more extends OverflowButtonType
  /* 2 */ @js.native
  object more extends TopLevel[more with Double]
  
  /** No overflow */
  @js.native
  sealed trait none extends OverflowButtonType
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
}
