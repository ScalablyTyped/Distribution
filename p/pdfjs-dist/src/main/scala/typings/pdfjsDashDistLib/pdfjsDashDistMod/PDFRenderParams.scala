package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderParams extends js.Object {
  var canvasContext: stdLib.CanvasRenderingContext2D
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.undefined
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.undefined
  var viewport: js.UndefOr[PDFPageViewport] = js.undefined
}

