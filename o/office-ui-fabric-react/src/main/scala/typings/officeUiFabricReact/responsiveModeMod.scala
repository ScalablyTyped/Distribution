package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable2
import typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveModeMod {
  
  @JSImport("office-ui-fabric-react/lib/ResponsiveMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/ResponsiveMode", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode & Double] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
  
  inline def getInitialResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialResponsiveMode")().asInstanceOf[ResponsiveMode]
  
  inline def getResponsiveMode(): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")().asInstanceOf[ResponsiveMode]
  inline def getResponsiveMode(currentWindow: Window): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getResponsiveMode")(currentWindow.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
  
  inline def initializeResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")().asInstanceOf[Unit]
  inline def initializeResponsiveMode(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeResponsiveMode")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setResponsiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")().asInstanceOf[Unit]
  inline def setResponsiveMode(responsiveMode: ResponsiveMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponsiveMode")(responsiveMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useResponsiveMode(elementRef: RefObject[HTMLElement | Null]): ResponsiveMode = ^.asInstanceOf[js.Dynamic].applyDynamic("useResponsiveMode")(elementRef.asInstanceOf[js.Any]).asInstanceOf[ResponsiveMode]
  
  inline def withResponsiveMode[TProps /* <: typings.officeUiFabricReact.anon.ResponsiveMode */, TState](
    ComposedComponent: Instantiable2[/* props */ TProps, /* args (repeated) */ Any, Component[TProps, TState, Any]]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withResponsiveMode")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[Any]
}
