package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepileProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFacepileMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "Facepile")
  @js.native
  val Facepile: FunctionComponent[IFacepileProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
  @js.native
  open class FacepileBase protected ()
    extends typings.officeUiFabricReact.libComponentsFacepileFacepileDotbaseMod.FacepileBase {
    def this(props: IFacepileProps) = this()
  }
  /* static members */
  object FacepileBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Facepile", "FacepileBase.defaultProps")
    @js.native
    def defaultProps: IFacepileProps = js.native
    inline def defaultProps_=(x: IFacepileProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Facepile", "OverflowButtonType")
  @js.native
  object OverflowButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType & Double
      ] = js.native
    
    /* 1 */ val descriptive: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.descriptive & Double = js.native
    
    /* 3 */ val downArrow: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.downArrow & Double = js.native
    
    /* 2 */ val more: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.more & Double = js.native
    
    /* 0 */ val none: typings.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType.none & Double = js.native
  }
}
