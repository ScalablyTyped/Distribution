package typings.officeUiFabricReact.progressIndicatorTypesMod

import typings.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressIndicatorProps extends ClassAttributes[ProgressIndicatorBase] {
  /**
    * Text alternative of the progress status, used by screen readers for reading the value of the progress.
    */
  var ariaValueText: js.UndefOr[String] = js.undefined
  /**
    * Height of the ProgressIndicator
    * @defaultvalue 2
    */
  var barHeight: js.UndefOr[Double] = js.undefined
  /**
    * Additional css class to apply to the ProgressIndicator
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Text describing or supplementing the operation. May be a string or React virtual elements.
    */
  var description: js.UndefOr[ReactNode] = js.undefined
  /**
    * Label to display above the control. May be a string or React virtual elements.
    */
  var label: js.UndefOr[ReactNode] = js.undefined
  /**
    * A render override for the progress track.
    */
  var onRenderProgress: js.UndefOr[IRenderFunction[IProgressIndicatorProps]] = js.undefined
  /**
    * Percentage of the operation's completeness, numerically between 0 and 1. If this is not set,
    * the indeterminate progress animation will be shown instead.
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to hide the progress state.
    */
  var progressHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Deprecated at v0.43.0, to be removed at \>= v0.53.0. Use `label` instead.
    * @deprecated Use `label` instead.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IProgressIndicatorProps {
  @scala.inline
  def apply(
    ariaValueText: String = null,
    barHeight: js.UndefOr[Double] = js.undefined,
    className: String = null,
    description: ReactNode = null,
    key: Key = null,
    label: ReactNode = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => Element | Null = null,
    percentComplete: js.UndefOr[Double] = js.undefined,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[ProgressIndicatorBase]] = js.undefined,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    title: String = null
  ): IProgressIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText.asInstanceOf[js.Any])
    if (!js.isUndefined(barHeight)) __obj.updateDynamic("barHeight")(barHeight.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onRenderProgress != null) __obj.updateDynamic("onRenderProgress")(js.Any.fromFunction2(onRenderProgress))
    if (!js.isUndefined(percentComplete)) __obj.updateDynamic("percentComplete")(percentComplete.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressHidden)) __obj.updateDynamic("progressHidden")(progressHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorProps]
  }
}

