package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDottypesMod.IScrollablePaneContext
import typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.IStickyProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStickyMod {
  
  @JSImport("office-ui-fabric-react/lib/Sticky", "Sticky")
  @js.native
  open class Sticky protected ()
    extends typings.officeUiFabricReact.libComponentsStickyMod.Sticky {
    def this(props: IStickyProps) = this()
  }
  /* static members */
  object Sticky {
    
    @JSImport("office-ui-fabric-react/lib/Sticky", "Sticky")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Sticky", "Sticky.contextType")
    @js.native
    def contextType: Context[IScrollablePaneContext] = js.native
    inline def contextType_=(x: Context[IScrollablePaneContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/Sticky", "Sticky.defaultProps")
    @js.native
    def defaultProps: IStickyProps = js.native
    inline def defaultProps_=(x: IStickyProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Sticky", "StickyPositionType")
  @js.native
  object StickyPositionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType & Double
      ] = js.native
    
    /* 0 */ val Both: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Both & Double = js.native
    
    /* 2 */ val Footer: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Footer & Double = js.native
    
    /* 1 */ val Header: typings.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType.Header & Double = js.native
  }
}
