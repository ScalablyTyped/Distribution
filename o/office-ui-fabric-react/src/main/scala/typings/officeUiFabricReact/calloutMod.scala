package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.BeakWidth
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.focusTrapCalloutTypesMod.IFocusTrapCalloutProps
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`10`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`11`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`13`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`4`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`5`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`8`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`9`
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calloutMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Callout", "Callout")
  @js.native
  open class Callout protected ()
    extends typings.officeUiFabricReact.calloutCalloutMod.Callout {
    def this(props: ICalloutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ICalloutProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Callout", "CalloutContent")
  @js.native
  val CalloutContent: FunctionComponent[ICalloutProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Callout", "CalloutContentBase")
  @js.native
  open class CalloutContentBase protected ()
    extends typings.officeUiFabricReact.calloutContentBaseMod.CalloutContentBase {
    def this(props: ICalloutProps) = this()
  }
  /* static members */
  object CalloutContentBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Callout", "CalloutContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Callout", "CalloutContentBase.defaultProps")
    @js.native
    def defaultProps: BeakWidth = js.native
    inline def defaultProps_=(x: BeakWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object DirectionalHint {
    
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.bottomAutoEdge")
    @js.native
    def bottomAutoEdge: `7` = js.native
    inline def bottomAutoEdge_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.bottomCenter")
    @js.native
    def bottomCenter: `5` = js.native
    inline def bottomCenter_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.bottomLeftEdge")
    @js.native
    def bottomLeftEdge: `4` = js.native
    inline def bottomLeftEdge_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.bottomRightEdge")
    @js.native
    def bottomRightEdge: `6` = js.native
    inline def bottomRightEdge_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRightEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.leftBottomEdge")
    @js.native
    def leftBottomEdge: `10` = js.native
    inline def leftBottomEdge_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.leftCenter")
    @js.native
    def leftCenter: `9` = js.native
    inline def leftCenter_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.leftTopEdge")
    @js.native
    def leftTopEdge: `8` = js.native
    inline def leftTopEdge_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.rightBottomEdge")
    @js.native
    def rightBottomEdge: `13` = js.native
    inline def rightBottomEdge_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.rightCenter")
    @js.native
    def rightCenter: `12` = js.native
    inline def rightCenter_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.rightTopEdge")
    @js.native
    def rightTopEdge: `11` = js.native
    inline def rightTopEdge_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.topAutoEdge")
    @js.native
    def topAutoEdge: `3` = js.native
    inline def topAutoEdge_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.topCenter")
    @js.native
    def topCenter: `1` = js.native
    inline def topCenter_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.topLeftEdge")
    @js.native
    def topLeftEdge: `0` = js.native
    inline def topLeftEdge_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/Callout", "DirectionalHint.topRightEdge")
    @js.native
    def topRightEdge: `2` = js.native
    inline def topRightEdge_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRightEdge")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Callout", "FocusTrapCallout")
  @js.native
  val FocusTrapCallout: FunctionComponent[IFocusTrapCalloutProps] = js.native
}
