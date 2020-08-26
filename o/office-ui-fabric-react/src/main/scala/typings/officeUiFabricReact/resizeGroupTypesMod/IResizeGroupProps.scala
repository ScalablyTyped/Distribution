package typings.officeUiFabricReact.resizeGroupTypesMod

import typings.officeUiFabricReact.resizeGroupBaseMod.ResizeGroupBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResizeGroupProps extends HTMLAttributes[ResizeGroupBase | HTMLElement] {
  /**
    * Optional callback to access the IResizeGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IResizeGroup]] = js.native
  /**
    * Initial data to be passed to the `onRenderData` function. When there is no `onGrowData` provided, this data should
    * represent what should be passed to the render function when the parent container of the ResizeGroup is at its
    * maximum supported width. A `cacheKey` property may optionally be included as part of the data. Two data objects
    * with the same `cacheKey` will be assumed to take up the same width and will prevent measurements.
    * The type of `cacheKey` is a string.
    */
  var data: js.Any = js.native
  /**
    * Function to be called every time data is rendered. It provides the data that was actually rendered.
    * A use case would be adding telemetry when a particular control is shown in an overflow well or
    * dropped as a result of onReduceData or to count the number of renders that an implementation of
    * onReduceData triggers.
    */
  var dataDidRender: js.UndefOr[js.Function1[/* renderedData */ js.Any, Unit]] = js.native
  /**
    * Direction of this resize group, vertical or horizontal
    * @defaultvalue ResizeGroupDirection.horizontal
    */
  var direction: js.UndefOr[ResizeGroupDirection] = js.native
  /**
    * Function to be performed on the data in order to increase its width. It is called in scenarios where the
    * container has more room than the previous render and we may be able to fit more content. If there are no more
    * scaling operations to perform on teh data, it should return undefined to prevent an infinite render loop.
    */
  var onGrowData: js.UndefOr[js.Function1[/* prevData */ js.Any, _]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    * @deprecated Removed to reduce bundle size.  Please use `className` and add css rules to `className` instead.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Function to be performed on the data in order to reduce its width and make it fit into the given space.
    * If there are no more scaling steps to apply, it should return undefined to prevent
    * an infinite render loop.
    */
  def onReduceData(prevData: js.Any): js.Any = js.native
  /**
    * Function to render the data. Called when rendering the contents to the screen and when
    * rendering in a hidden div to measure the size of the contents.
    */
  def onRenderData(data: js.Any): Element = js.native
}

object IResizeGroupProps {
  @scala.inline
  def apply(data: js.Any, onReduceData: js.Any => js.Any, onRenderData: js.Any => Element): IResizeGroupProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onReduceData = js.Any.fromFunction1(onReduceData), onRenderData = js.Any.fromFunction1(onRenderData))
    __obj.asInstanceOf[IResizeGroupProps]
  }
  @scala.inline
  implicit class IResizeGroupPropsOps[Self <: IResizeGroupProps] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnReduceData(value: js.Any => js.Any): Self = this.set("onReduceData", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRenderData(value: js.Any => Element): Self = this.set("onRenderData", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IResizeGroup | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IResizeGroup]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDataDidRender(value: /* renderedData */ js.Any => Unit): Self = this.set("dataDidRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataDidRender: Self = this.set("dataDidRender", js.undefined)
    @scala.inline
    def setDirection(value: ResizeGroupDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOnGrowData(value: /* prevData */ js.Any => _): Self = this.set("onGrowData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGrowData: Self = this.set("onGrowData", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IResizeGroupStyleProps => DeepPartial[IResizeGroupStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IResizeGroupStyleProps, IResizeGroupStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

