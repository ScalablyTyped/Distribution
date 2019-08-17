package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLocationDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardLocationDotBaseMod.DocumentCardLocationBase
import typings.react.NativeMouseEvent
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLocationProps extends ClassAttributes[DocumentCardLocationBase] {
  /**
    * Aria label for the link to the document location.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardLocation]] = js.undefined
  /**
    * Text for the location of the document.
    */
  var location: String
  /**
    * URL to navigate to for this location.
    */
  var locationHref: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the location is clicked.
    */
  var onClick: js.UndefOr[
    js.Function1[/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], Unit]
  ] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDocumentCardLocationProps {
  @scala.inline
  def apply(
    location: String,
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IDocumentCardLocation] = null,
    key: Key = null,
    locationHref: String = null,
    onClick: /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]] => Unit = null,
    ref: LegacyRef[DocumentCardLocationBase] = null,
    styles: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles] = null,
    theme: ITheme = null
  ): IDocumentCardLocationProps = {
    val __obj = js.Dynamic.literal(location = location)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locationHref != null) __obj.updateDynamic("locationHref")(locationHref)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IDocumentCardLocationProps]
  }
}

