package typings.officeUiFabricReact.facepileTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
@js.native
object OverflowButtonType extends js.Object {
  /** +1 overflow icon */
  @js.native
  sealed trait descriptive extends OverflowButtonType
  
  /** Chevron overflow icon */
  @js.native
  sealed trait downArrow extends OverflowButtonType
  
  /** More overflow icon */
  @js.native
  sealed trait more extends OverflowButtonType
  
  /** No overflow */
  @js.native
  sealed trait none extends OverflowButtonType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowButtonType with Double] = js.native
  /* 1 */ @js.native
  object descriptive extends TopLevel[descriptive with Double]
  
  /* 3 */ @js.native
  object downArrow extends TopLevel[downArrow with Double]
  
  /* 2 */ @js.native
  object more extends TopLevel[more with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

