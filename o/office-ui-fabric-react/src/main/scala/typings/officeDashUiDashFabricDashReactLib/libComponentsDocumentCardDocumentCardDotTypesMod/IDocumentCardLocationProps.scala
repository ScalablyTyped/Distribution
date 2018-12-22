package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDocumentCardLocationProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardLocationMod.DocumentCardLocation
    ] {
  /**
       * Aria label for the link to the document location.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
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
}

