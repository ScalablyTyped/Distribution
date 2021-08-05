package typings.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable2
import typings.officeUiFabricReact.anon.Viewport
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withViewportMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/withViewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withViewport[TProps /* <: Viewport */, TState](
    ComposedComponent: Instantiable2[/* props */ TProps, /* args (repeated) */ js.Any, Component[TProps, TState, js.Any]]
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withViewport")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait IViewport extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: Double
    
    /**
      * Width in pixels.
      */
    var width: Double
  }
  object IViewport {
    
    inline def apply(height: Double, width: Double): IViewport = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewport]
    }
    
    extension [Self <: IViewport](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWithViewportProps extends StObject {
    
    /**
      * Whether or not to explicitly disable usage of the `ResizeObserver` in favor of a `'resize'` event on `window`,
      * even if the browser supports `ResizeObserver`. This may be necessary if use of `ResizeObserver` results in too
      * many re-renders of the wrapped component due to the frequency at which events are fired.
      *
      * This has no impact if `skipViewportMeasures` is `true`, as no viewport measurement strategy is used.
      */
    var disableResizeObserver: js.UndefOr[Boolean] = js.undefined
    
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
    var skipViewportMeasures: js.UndefOr[Boolean] = js.undefined
  }
  object IWithViewportProps {
    
    inline def apply(): IWithViewportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithViewportProps]
    }
    
    extension [Self <: IWithViewportProps](x: Self) {
      
      inline def setDisableResizeObserver(value: Boolean): Self = StObject.set(x, "disableResizeObserver", value.asInstanceOf[js.Any])
      
      inline def setDisableResizeObserverUndefined: Self = StObject.set(x, "disableResizeObserver", js.undefined)
      
      inline def setSkipViewportMeasures(value: Boolean): Self = StObject.set(x, "skipViewportMeasures", value.asInstanceOf[js.Any])
      
      inline def setSkipViewportMeasuresUndefined: Self = StObject.set(x, "skipViewportMeasures", js.undefined)
    }
  }
  
  trait IWithViewportState extends StObject {
    
    var viewport: js.UndefOr[IViewport] = js.undefined
  }
  object IWithViewportState {
    
    inline def apply(): IWithViewportState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWithViewportState]
    }
    
    extension [Self <: IWithViewportState](x: Self) {
      
      inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
}
