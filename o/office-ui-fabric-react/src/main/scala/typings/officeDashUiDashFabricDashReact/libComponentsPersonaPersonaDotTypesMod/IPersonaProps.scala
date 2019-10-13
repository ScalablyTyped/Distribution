package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaProps extends IPersonaSharedProps {
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.undefined
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.undefined
}

object IPersonaProps {
  @scala.inline
  def apply(
    IPersonaSharedProps: IPersonaSharedProps = null,
    className: String = null,
    componentRef: IRefObject[IPersona] = null,
    onRenderOptionalText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null,
    onRenderPrimaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null,
    onRenderSecondaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null,
    onRenderTertiaryText: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null = null,
    styles: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles] = null
  ): IPersonaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPersonaSharedProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onRenderOptionalText != null) __obj.updateDynamic("onRenderOptionalText")(js.Any.fromFunction2(onRenderOptionalText))
    if (onRenderPrimaryText != null) __obj.updateDynamic("onRenderPrimaryText")(js.Any.fromFunction2(onRenderPrimaryText))
    if (onRenderSecondaryText != null) __obj.updateDynamic("onRenderSecondaryText")(js.Any.fromFunction2(onRenderSecondaryText))
    if (onRenderTertiaryText != null) __obj.updateDynamic("onRenderTertiaryText")(js.Any.fromFunction2(onRenderTertiaryText))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaProps]
  }
}

