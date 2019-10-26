package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardProps
  extends HTMLAttributes[HTMLDivElement]
     with IBaseProps[IDocumentCard] {
  /**
    * Hex color value of the line below the card, which should correspond to the document type.
    * This should only be supplied when using the 'compact' card layout.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[String] = js.undefined
  /**
    * A URL to navigate to when the card is clicked. If a function has also been provided,
    * it will be used instead of the URL.
    */
  var onClickHref: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the card is clicked or keyboard Enter/Space is pushed.
    */
  @JSName("onClick")
  var onClick_IDocumentCardProps: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The type of DocumentCard to display.
    * @defaultvalue DocumentCardType.normal
    */
  var `type`: js.UndefOr[DocumentCardType] = js.undefined
}

object IDocumentCardProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    IBaseProps: IBaseProps[IDocumentCard] = null,
    accentColor: String = null,
    children: ReactNode = null,
    className: String = null,
    componentRef: IRefObject[IDocumentCard] = null,
    onClick: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit = null,
    onClickHref: String = null,
    role: String = null,
    styles: IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles] = null,
    theme: ITheme = null,
    `type`: DocumentCardType = null
  ): IDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, IBaseProps)
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickHref != null) __obj.updateDynamic("onClickHref")(onClickHref)
    if (role != null) __obj.updateDynamic("role")(role)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IDocumentCardProps]
  }
}

