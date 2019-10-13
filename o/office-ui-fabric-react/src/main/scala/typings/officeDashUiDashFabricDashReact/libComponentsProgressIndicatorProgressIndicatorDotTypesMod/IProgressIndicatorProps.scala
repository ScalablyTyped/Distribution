package typings.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsProgressIndicatorProgressIndicatorDotBaseMod.ProgressIndicatorBase
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
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
    barHeight: Int | Double = null,
    className: String = null,
    description: ReactNode = null,
    key: Key = null,
    label: ReactNode = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => Element | Null = null,
    percentComplete: Int | Double = null,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[ProgressIndicatorBase] = null,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    title: String = null
  ): IProgressIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText)
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onRenderProgress != null) __obj.updateDynamic("onRenderProgress")(js.Any.fromFunction2(onRenderProgress))
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(progressHidden)) __obj.updateDynamic("progressHidden")(progressHidden)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IProgressIndicatorProps]
  }
}

