package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardTitleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardTitleDotBaseMod.DocumentCardTitleBase
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardTitleProps extends ClassAttributes[DocumentCardTitleBase] {
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardTitle]] = js.undefined
  /**
    * Whether we truncate the title to fit within the box. May have a performance impact.
    * @defaultvalue true
    */
  var shouldTruncate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether show as title as secondary title style such as smaller font and lighter color.
    * @defaultvalue false
    */
  var showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Title text. If the card represents more than one document, this should be the title of one document and a "+X" string.
    * For example, a collection of four documents would have a string of "Document.docx +3".
    */
  var title: String
}

object IDocumentCardTitleProps {
  @scala.inline
  def apply(
    title: String,
    className: String = null,
    componentRef: IRefObject[IDocumentCardTitle] = null,
    key: Key = null,
    ref: LegacyRef[DocumentCardTitleBase] = null,
    shouldTruncate: js.UndefOr[Boolean] = js.undefined,
    showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles] = null,
    theme: ITheme = null
  ): IDocumentCardTitleProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldTruncate)) __obj.updateDynamic("shouldTruncate")(shouldTruncate)
    if (!js.isUndefined(showAsSecondaryTitle)) __obj.updateDynamic("showAsSecondaryTitle")(showAsSecondaryTitle)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IDocumentCardTitleProps]
  }
}

