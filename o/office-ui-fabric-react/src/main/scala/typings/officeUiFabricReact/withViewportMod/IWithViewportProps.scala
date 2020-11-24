package typings.officeUiFabricReact.withViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWithViewportProps extends js.Object {
  
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
  implicit class IWithViewportPropsOps[Self <: IWithViewportProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableResizeObserver(value: Boolean): Self = this.set("disableResizeObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableResizeObserver: Self = this.set("disableResizeObserver", js.undefined)
    
    @scala.inline
    def setSkipViewportMeasures(value: Boolean): Self = this.set("skipViewportMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipViewportMeasures: Self = this.set("skipViewportMeasures", js.undefined)
  }
}
