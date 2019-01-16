package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IDocumentCard] {
  /**
    * Hex color value of the line below the card, which should correspond to the document type.
    * This should only be supplied when using the 'compact' card layout.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Child components to render within the card.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to call when the card is clicked or keyboard Enter/Space is pushed.
    */
  var onClick: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * A URL to navigate to when the card is clicked. If a function has also been provided,
    * it will be used instead of the URL.
    */
  var onClickHref: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Aria role assigned to the documentCard (Eg. button, link).
    * Use this to override the default assignment.
    * @defaultvalue When `onClick` is provided, default role will be 'button'. When `onClickHref` is provided, default role will be 'link'.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * The type of DocumentCard to display.
    * @defaultvalue DocumentCardType.normal
    */
  var `type`: js.UndefOr[DocumentCardType] = js.undefined
}

