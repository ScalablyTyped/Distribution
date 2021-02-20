package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withResponsiveModeMod {
  
  @js.native
  sealed trait ResponsiveMode extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponsiveMode with Double] = js.native
    
    @js.native
    sealed trait large extends ResponsiveMode
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    
    @js.native
    sealed trait medium extends ResponsiveMode
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    
    @js.native
    sealed trait small extends ResponsiveMode
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    
    @js.native
    sealed trait unknown extends ResponsiveMode
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    
    @js.native
    sealed trait xLarge extends ResponsiveMode
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    
    @js.native
    sealed trait xxLarge extends ResponsiveMode
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    
    @js.native
    sealed trait xxxLarge extends ResponsiveMode
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "getInitialResponsiveMode")
  @js.native
  def getInitialResponsiveMode(): ResponsiveMode = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "getResponsiveMode")
  @js.native
  def getResponsiveMode(): ResponsiveMode = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "getResponsiveMode")
  @js.native
  def getResponsiveMode(currentWindow: Window): ResponsiveMode = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "initializeResponsiveMode")
  @js.native
  def initializeResponsiveMode(): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "initializeResponsiveMode")
  @js.native
  def initializeResponsiveMode(element: HTMLElement): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "setResponsiveMode")
  @js.native
  def setResponsiveMode(): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "setResponsiveMode")
  @js.native
  def setResponsiveMode(responsiveMode: ResponsiveMode): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withResponsiveMode", "withResponsiveMode")
  @js.native
  def withResponsiveMode[TProps /* <: typings.officeUiFabricReact.anon.ResponsiveMode */, TState](
    ComposedComponent: Instantiable2[/* props */ TProps, /* args (repeated) */ js.Any, Component[TProps, TState, js.Any]]
  ): js.Any = js.native
  
  @js.native
  trait IWithResponsiveModeState extends StObject {
    
    var responsiveMode: js.UndefOr[ResponsiveMode] = js.native
  }
  object IWithResponsiveModeState {
    
    @scala.inline
    def apply(): IWithResponsiveModeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithResponsiveModeState]
    }
    
    @scala.inline
    implicit class IWithResponsiveModeStateMutableBuilder[Self <: IWithResponsiveModeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponsiveMode(value: ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
    }
  }
}
