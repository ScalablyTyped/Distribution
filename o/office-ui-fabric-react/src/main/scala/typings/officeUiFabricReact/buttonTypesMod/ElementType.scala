package typings.officeUiFabricReact.buttonTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ElementType")
@js.native
object ElementType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
  
  /** <a> element. */
  @js.native
  sealed trait anchor extends ElementType
  /* 1 */ @js.native
  object anchor extends TopLevel[anchor with Double]
  
  /** <button> element. */
  @js.native
  sealed trait button extends ElementType
  /* 0 */ @js.native
  object button extends TopLevel[button with Double]
}
