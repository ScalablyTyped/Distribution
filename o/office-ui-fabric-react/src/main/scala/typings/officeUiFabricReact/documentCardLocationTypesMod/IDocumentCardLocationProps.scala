package typings.officeUiFabricReact.documentCardLocationTypesMod

import typings.officeUiFabricReact.documentCardLocationBaseMod.DocumentCardLocationBase
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
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
    ref: js.UndefOr[Null | LegacyRef[DocumentCardLocationBase]] = js.undefined,
    styles: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles] = null,
    theme: ITheme = null
  ): IDocumentCardLocationProps = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locationHref != null) __obj.updateDynamic("locationHref")(locationHref.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLocationProps]
  }
}

