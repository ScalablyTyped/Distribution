package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardLocationDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLocationProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardLocationDotBaseMod.DocumentCardLocationBase
    ] {
  /**
    * Aria label for the link to the document location.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDocumentCardLocation]] = js.undefined
  /**
    * Text for the location of the document.
    */
  var location: java.lang.String
  /**
    * URL to navigate to for this location.
    */
  var locationHref: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Function to call when the location is clicked.
    */
  var onClick: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

