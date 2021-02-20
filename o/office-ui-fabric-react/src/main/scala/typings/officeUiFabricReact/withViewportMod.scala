package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable2
import typings.officeUiFabricReact.anon.Viewport
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withViewportMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withViewport", "withViewport")
  @js.native
  def withViewport[TProps /* <: Viewport */, TState](
    ComposedComponent: Instantiable2[/* props */ TProps, /* args (repeated) */ js.Any, Component[TProps, TState, js.Any]]
  ): js.Any = js.native
  
  @js.native
  trait IViewport extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: Double = js.native
    
    /**
      * Width in pixels.
      */
    var width: Double = js.native
  }
  object IViewport {
    
    @scala.inline
    def apply(height: Double, width: Double): IViewport = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewport]
    }
    
    @scala.inline
    implicit class IViewportMutableBuilder[Self <: IViewport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWithViewportProps extends StObject {
    
    /**
      * Whether or not to explicitly disable usage of the `ResizeObserver` in favor of a `'resize'` event on `window`,
      * even if the browser supports `ResizeObserver`. This may be necessary if use of `ResizeObserver` results in too
      * many re-renders of the wrapped component due to the frequency at which events are fired.
      *
      * This has no impact if `skipViewportMeasures` is `true`, as no viewport measurement strategy is used.
      */
    var disableResizeObserver: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not `withViewport` should disable its viewport measurements, effectively making this decorator
      * pass-through with no impact on the rendered component.
      *
      * Since `withViewport` measures the `viewport` on mount, after each React update, and in response to events,
      * it may cause a component which does not currently need this information due to its configuration to re-render
      * too often. `skipViewportMeasures` may be toggled on and off based on current state, and will suspend and resume
      * measurement as-needed.
      *
      * For example, when this wraps `DetailsList`, set `skipViewportMeasures` to `true` when the `layoutMode` is
      * `fixedColumns`, since the `DetailsList` does not use the viewport size in any calculations.
      *
      * In addition, consider setting `skipViewportMeasures` to `true` when running within a React test renderer, to avoid
      * direct DOM dependencies.
      */
    var skipViewportMeasures: js.UndefOr[Boolean] = js.native
  }
  object IWithViewportProps {
    
    @scala.inline
    def apply(): IWithViewportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithViewportProps]
    }
    
    @scala.inline
    implicit class IWithViewportPropsMutableBuilder[Self <: IWithViewportProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableResizeObserver(value: Boolean): Self = StObject.set(x, "disableResizeObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableResizeObserverUndefined: Self = StObject.set(x, "disableResizeObserver", js.undefined)
      
      @scala.inline
      def setSkipViewportMeasures(value: Boolean): Self = StObject.set(x, "skipViewportMeasures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipViewportMeasuresUndefined: Self = StObject.set(x, "skipViewportMeasures", js.undefined)
    }
  }
  
  @js.native
  trait IWithViewportState extends StObject {
    
    var viewport: js.UndefOr[IViewport] = js.native
  }
  object IWithViewportState {
    
    @scala.inline
    def apply(): IWithViewportState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithViewportState]
    }
    
    @scala.inline
    implicit class IWithViewportStateMutableBuilder[Self <: IWithViewportState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
}
