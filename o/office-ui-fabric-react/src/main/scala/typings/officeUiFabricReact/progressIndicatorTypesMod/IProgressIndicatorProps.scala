package typings.officeUiFabricReact.progressIndicatorTypesMod

import typings.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressIndicatorProps extends ClassAttributes[ProgressIndicatorBase] {
  /**
    * Text alternative of the progress status, used by screen readers for reading the value of the progress.
    */
  var ariaValueText: js.UndefOr[String] = js.native
  /**
    * Height of the ProgressIndicator
    * @defaultvalue 2
    */
  var barHeight: js.UndefOr[Double] = js.native
  /**
    * Additional css class to apply to the ProgressIndicator
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Text describing or supplementing the operation. May be a string or React virtual elements.
    */
  var description: js.UndefOr[ReactNode] = js.native
  /**
    * Label to display above the control. May be a string or React virtual elements.
    */
  var label: js.UndefOr[ReactNode] = js.native
  /**
    * A render override for the progress track.
    */
  var onRenderProgress: js.UndefOr[IRenderFunction[IProgressIndicatorProps]] = js.native
  /**
    * Percentage of the operation's completeness, numerically between 0 and 1. If this is not set,
    * the indeterminate progress animation will be shown instead.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  /**
    * Whether or not to hide the progress state.
    */
  var progressHidden: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Deprecated at v0.43.0, to be removed at \>= v0.53.0. Use `label` instead.
    * @deprecated Use `label` instead.
    */
  var title: js.UndefOr[String] = js.native
}

object IProgressIndicatorProps {
  @scala.inline
  def apply(): IProgressIndicatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicatorProps]
  }
  @scala.inline
  implicit class IProgressIndicatorPropsOps[Self <: IProgressIndicatorProps] (val x: Self) extends AnyVal {
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
    def setAriaValueText(value: String): Self = this.set("ariaValueText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaValueText: Self = this.set("ariaValueText", js.undefined)
    @scala.inline
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDescription(value: ReactNode): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnRenderProgress(
      value: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderProgress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderProgress: Self = this.set("onRenderProgress", js.undefined)
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    @scala.inline
    def setProgressHidden(value: Boolean): Self = this.set("progressHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressHidden: Self = this.set("progressHidden", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IProgressIndicatorStyleProps => DeepPartial[IProgressIndicatorStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

