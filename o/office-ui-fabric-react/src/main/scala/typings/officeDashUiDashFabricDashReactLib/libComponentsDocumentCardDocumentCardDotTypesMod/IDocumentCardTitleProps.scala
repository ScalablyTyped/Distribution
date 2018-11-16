package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDocumentCardTitleProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardTitleMod.DocumentCardTitle
    ] {
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /**
       * Whether we truncate the title to fit within the box. May have a performance impact.
       * @defaultvalue true
       */
  var shouldTruncate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether show as title as secondary title style such as smaller font and lighter color.
       * @defaultvalue false
       */
  var showAsSecondaryTitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Title text. If the card represents more than one document, this should be the title of one document and a "+X" string.
       * For example, a collection of four documents would have a string of "Document.docx +3".
       */
  var title: java.lang.String
}

