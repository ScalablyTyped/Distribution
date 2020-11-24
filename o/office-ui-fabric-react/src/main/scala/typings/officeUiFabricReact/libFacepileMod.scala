package typings.officeUiFabricReact

import typings.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Facepile", JSImport.Namespace)
@js.native
object libFacepileMod extends js.Object {
  
  val Facepile: FunctionComponent[IFacepileProps] = js.native
  
  @js.native
  class FacepileBase protected ()
    extends typings.officeUiFabricReact.facepileMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  /* static members */
  @js.native
  object FacepileBase extends js.Object {
    
    var defaultProps: IFacepileProps = js.native
  }
  
  @js.native
  object OverflowButtonType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType with Double] = js.native
    
    /* 1 */ val descriptive: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.descriptive with Double = js.native
    
    /* 3 */ val downArrow: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.downArrow with Double = js.native
    
    /* 2 */ val more: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.more with Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.facepileTypesMod.OverflowButtonType.none with Double = js.native
  }
}
