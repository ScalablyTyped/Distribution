package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TDocumentDefinitions extends js.Object {
  var content: java.lang.String | Content
  var defaultStyle: js.UndefOr[Style] = js.undefined
  var footer: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var header: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var info: js.UndefOr[TDocumentInformation] = js.undefined
  var pageMargins: js.UndefOr[Margins] = js.undefined
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  var pageSize: js.UndefOr[PageSize] = js.undefined
  var styles: js.UndefOr[Style] = js.undefined
}

