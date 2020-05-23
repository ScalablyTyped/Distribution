package typings.pdfViewerReactjs.anon

import typings.pdfViewerReactjs.mod.AlertHandler
import typings.pdfViewerReactjs.mod.BtnClickHandler
import typings.pdfViewerReactjs.mod.DocClickHandler
import typings.pdfViewerReactjs.mod.Document
import typings.pdfViewerReactjs.mod.Err
import typings.pdfViewerReactjs.mod.PDFViewer
import typings.pdfViewerReactjs.mod.RotationClickHandler
import typings.pdfViewerReactjs.mod.Watermark
import typings.pdfViewerReactjs.mod.ZoomClickHandler
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<pdf-viewer-reactjs.pdf-viewer-reactjs.PDFViewerProps> */
trait PartialPDFViewerProps extends js.Object {
  var alert: js.UndefOr[AlertHandler] = js.undefined
  var canvasCss: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var css: js.UndefOr[String] = js.undefined
  var defaultScale: js.UndefOr[Double] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
  var hideNavbar: js.UndefOr[Boolean] = js.undefined
  var hideRotation: js.UndefOr[Boolean] = js.undefined
  var hideZoom: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var loader: js.UndefOr[ReactNode] = js.undefined
  var maxScale: js.UndefOr[Double] = js.undefined
  var minScale: js.UndefOr[Double] = js.undefined
  var navbarOnTop: js.UndefOr[Boolean] = js.undefined
  var navigation: js.UndefOr[js.Any] = js.undefined
  var onDocumentClick: js.UndefOr[DocClickHandler] = js.undefined
  var onNextBtnClick: js.UndefOr[BtnClickHandler] = js.undefined
  var onPrevBtnClick: js.UndefOr[BtnClickHandler] = js.undefined
  var onRotation: js.UndefOr[RotationClickHandler] = js.undefined
  var onZoom: js.UndefOr[ZoomClickHandler] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var protectContent: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[LegacyRef[PDFViewer]] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleStep: js.UndefOr[Double] = js.undefined
  var watermark: js.UndefOr[Watermark] = js.undefined
}

object PartialPDFViewerProps {
  @scala.inline
  def apply(
    alert: /* err */ Err => ReactNode = null,
    canvasCss: String = null,
    children: ReactNode = null,
    css: String = null,
    defaultScale: js.UndefOr[Double] = js.undefined,
    document: Document = null,
    hideNavbar: js.UndefOr[Boolean] = js.undefined,
    hideRotation: js.UndefOr[Boolean] = js.undefined,
    hideZoom: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    loader: ReactNode = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    navbarOnTop: js.UndefOr[Boolean] = js.undefined,
    navigation: js.Any = null,
    onDocumentClick: () => Unit = null,
    onNextBtnClick: /* page */ Double => Unit = null,
    onPrevBtnClick: /* page */ Double => Unit = null,
    onRotation: /* angle */ Double => Unit = null,
    onZoom: /* scale */ Double => Unit = null,
    page: js.UndefOr[Double] = js.undefined,
    protectContent: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[PDFViewer]] = js.undefined,
    rotationAngle: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    scaleStep: js.UndefOr[Double] = js.undefined,
    watermark: Watermark = null
  ): PartialPDFViewerProps = {
    val __obj = js.Dynamic.literal()
    if (alert != null) __obj.updateDynamic("alert")(js.Any.fromFunction1(alert))
    if (canvasCss != null) __obj.updateDynamic("canvasCss")(canvasCss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultScale)) __obj.updateDynamic("defaultScale")(defaultScale.get.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavbar)) __obj.updateDynamic("hideNavbar")(hideNavbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRotation)) __obj.updateDynamic("hideRotation")(hideRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideZoom)) __obj.updateDynamic("hideZoom")(hideZoom.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navbarOnTop)) __obj.updateDynamic("navbarOnTop")(navbarOnTop.get.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (onDocumentClick != null) __obj.updateDynamic("onDocumentClick")(js.Any.fromFunction0(onDocumentClick))
    if (onNextBtnClick != null) __obj.updateDynamic("onNextBtnClick")(js.Any.fromFunction1(onNextBtnClick))
    if (onPrevBtnClick != null) __obj.updateDynamic("onPrevBtnClick")(js.Any.fromFunction1(onPrevBtnClick))
    if (onRotation != null) __obj.updateDynamic("onRotation")(js.Any.fromFunction1(onRotation))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(protectContent)) __obj.updateDynamic("protectContent")(protectContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationAngle)) __obj.updateDynamic("rotationAngle")(rotationAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleStep)) __obj.updateDynamic("scaleStep")(scaleStep.get.asInstanceOf[js.Any])
    if (watermark != null) __obj.updateDynamic("watermark")(watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPDFViewerProps]
  }
}

