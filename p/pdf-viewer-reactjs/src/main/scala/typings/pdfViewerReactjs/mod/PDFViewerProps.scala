package typings.pdfViewerReactjs.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerProps extends Props[PDFViewer] {
  var alert: js.UndefOr[AlertHandler] = js.undefined
  var canvasCss: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[String] = js.undefined
  var defaultScale: js.UndefOr[Double] = js.undefined
  var document: Document
  var hideNavbar: js.UndefOr[Boolean] = js.undefined
  var hideRotation: js.UndefOr[Boolean] = js.undefined
  var hideZoom: js.UndefOr[Boolean] = js.undefined
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
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var scaleStep: js.UndefOr[Double] = js.undefined
  var watermark: js.UndefOr[Watermark] = js.undefined
}

object PDFViewerProps {
  @scala.inline
  def apply(
    document: Document,
    alert: /* err */ Err => ReactNode = null,
    canvasCss: String = null,
    children: ReactNode = null,
    css: String = null,
    defaultScale: Int | Double = null,
    hideNavbar: js.UndefOr[Boolean] = js.undefined,
    hideRotation: js.UndefOr[Boolean] = js.undefined,
    hideZoom: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    loader: ReactNode = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    navbarOnTop: js.UndefOr[Boolean] = js.undefined,
    navigation: js.Any = null,
    onDocumentClick: () => Unit = null,
    onNextBtnClick: /* page */ Double => Unit = null,
    onPrevBtnClick: /* page */ Double => Unit = null,
    onRotation: /* angle */ Double => Unit = null,
    onZoom: /* scale */ Double => Unit = null,
    page: Int | Double = null,
    protectContent: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[PDFViewer] = null,
    rotationAngle: Int | Double = null,
    scale: Int | Double = null,
    scaleStep: Int | Double = null,
    watermark: Watermark = null
  ): PDFViewerProps = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    if (alert != null) __obj.updateDynamic("alert")(js.Any.fromFunction1(alert))
    if (canvasCss != null) __obj.updateDynamic("canvasCss")(canvasCss.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (defaultScale != null) __obj.updateDynamic("defaultScale")(defaultScale.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavbar)) __obj.updateDynamic("hideNavbar")(hideNavbar.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRotation)) __obj.updateDynamic("hideRotation")(hideRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(hideZoom)) __obj.updateDynamic("hideZoom")(hideZoom.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (!js.isUndefined(navbarOnTop)) __obj.updateDynamic("navbarOnTop")(navbarOnTop.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (onDocumentClick != null) __obj.updateDynamic("onDocumentClick")(js.Any.fromFunction0(onDocumentClick))
    if (onNextBtnClick != null) __obj.updateDynamic("onNextBtnClick")(js.Any.fromFunction1(onNextBtnClick))
    if (onPrevBtnClick != null) __obj.updateDynamic("onPrevBtnClick")(js.Any.fromFunction1(onPrevBtnClick))
    if (onRotation != null) __obj.updateDynamic("onRotation")(js.Any.fromFunction1(onRotation))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(protectContent)) __obj.updateDynamic("protectContent")(protectContent.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleStep != null) __obj.updateDynamic("scaleStep")(scaleStep.asInstanceOf[js.Any])
    if (watermark != null) __obj.updateDynamic("watermark")(watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerProps]
  }
}

