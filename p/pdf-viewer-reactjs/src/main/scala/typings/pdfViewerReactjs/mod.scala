package typings.pdfViewerReactjs

import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-viewer-reactjs", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PDFViewerProps, js.Object, js.Any]
  @JSImport("pdf-viewer-reactjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* Inlined std.Partial<pdf-viewer-reactjs.pdf-viewer-reactjs.PDFViewerProps> */
  object defaultProps {
    
    @JSImport("pdf-viewer-reactjs", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.alert")
    @js.native
    def alert: js.UndefOr[AlertHandler] = js.native
    @scala.inline
    def alert_=(x: js.UndefOr[AlertHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.canvasCss")
    @js.native
    def canvasCss: js.UndefOr[String] = js.native
    @scala.inline
    def canvasCss_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvasCss")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.children")
    @js.native
    def children: js.UndefOr[ReactNode] = js.native
    @scala.inline
    def children_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.css")
    @js.native
    def css: js.UndefOr[String] = js.native
    @scala.inline
    def css_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.defaultScale")
    @js.native
    def defaultScale: js.UndefOr[Double] = js.native
    @scala.inline
    def defaultScale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultScale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.document")
    @js.native
    def document: js.UndefOr[typings.std.Document] = js.native
    @scala.inline
    def document_=(x: js.UndefOr[typings.std.Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideNavbar")
    @js.native
    def hideNavbar: js.UndefOr[Boolean] = js.native
    @scala.inline
    def hideNavbar_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideNavbar")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideRotation")
    @js.native
    def hideRotation: js.UndefOr[Boolean] = js.native
    @scala.inline
    def hideRotation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideZoom")
    @js.native
    def hideZoom: js.UndefOr[Boolean] = js.native
    @scala.inline
    def hideZoom_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideZoom")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.key")
    @js.native
    def key: js.UndefOr[Key] = js.native
    @scala.inline
    def key_=(x: js.UndefOr[Key]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("key")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.loader")
    @js.native
    def loader: js.UndefOr[ReactNode] = js.native
    @scala.inline
    def loader_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.maxScale")
    @js.native
    def maxScale: js.UndefOr[Double] = js.native
    @scala.inline
    def maxScale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.minScale")
    @js.native
    def minScale: js.UndefOr[Double] = js.native
    @scala.inline
    def minScale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minScale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.navbarOnTop")
    @js.native
    def navbarOnTop: js.UndefOr[Boolean] = js.native
    @scala.inline
    def navbarOnTop_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navbarOnTop")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.navigation")
    @js.native
    def navigation: js.UndefOr[js.Any] = js.native
    @scala.inline
    def navigation_=(x: js.UndefOr[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onDocumentClick")
    @js.native
    def onDocumentClick: js.UndefOr[DocClickHandler] = js.native
    @scala.inline
    def onDocumentClick_=(x: js.UndefOr[DocClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDocumentClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onNextBtnClick")
    @js.native
    def onNextBtnClick: js.UndefOr[BtnClickHandler] = js.native
    @scala.inline
    def onNextBtnClick_=(x: js.UndefOr[BtnClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNextBtnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onPrevBtnClick")
    @js.native
    def onPrevBtnClick: js.UndefOr[BtnClickHandler] = js.native
    @scala.inline
    def onPrevBtnClick_=(x: js.UndefOr[BtnClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPrevBtnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onRotation")
    @js.native
    def onRotation: js.UndefOr[RotationClickHandler] = js.native
    @scala.inline
    def onRotation_=(x: js.UndefOr[RotationClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onZoom")
    @js.native
    def onZoom: js.UndefOr[ZoomClickHandler] = js.native
    @scala.inline
    def onZoom_=(x: js.UndefOr[ZoomClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.page")
    @js.native
    def page: js.UndefOr[Double] = js.native
    @scala.inline
    def page_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.protectContent")
    @js.native
    def protectContent: js.UndefOr[Boolean] = js.native
    @scala.inline
    def protectContent_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protectContent")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.ref")
    @js.native
    def ref: js.UndefOr[LegacyRef[PDFViewer]] = js.native
    @scala.inline
    def ref_=(x: js.UndefOr[LegacyRef[PDFViewer]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ref")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.rotationAngle")
    @js.native
    def rotationAngle: js.UndefOr[Double] = js.native
    @scala.inline
    def rotationAngle_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.scale")
    @js.native
    def scale: js.UndefOr[Double] = js.native
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.scaleStep")
    @js.native
    def scaleStep: js.UndefOr[Double] = js.native
    @scala.inline
    def scaleStep_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleStep")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def scale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.watermark")
    @js.native
    def watermark: js.UndefOr[Watermark] = js.native
    @scala.inline
    def watermark_=(x: js.UndefOr[Watermark]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watermark")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("pdf-viewer-reactjs", "propTypes")
  @js.native
  def propTypes: PDFViewerProps = js.native
  @scala.inline
  def propTypes_=(x: PDFViewerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  type AlertHandler = js.Function1[/* err */ Err, ReactNode]
  
  type BtnClickHandler = js.Function1[/* page */ Double, Unit]
  
  type DocClickHandler = js.Function0[Unit]
  
  trait Document extends StObject {
    
    var base64: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Document {
    
    @scala.inline
    def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Err extends StObject {
    
    var message: String
  }
  object Err {
    
    @scala.inline
    def apply(message: String): Err = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err]
    }
    
    @scala.inline
    implicit class ErrMutableBuilder[Self <: Err] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PDFViewer
    extends Component[PDFViewerProps, js.Object, js.Any]
  
  trait PDFViewerProps
    extends StObject
       with Props[PDFViewer] {
    
    var alert: js.UndefOr[AlertHandler] = js.undefined
    
    var canvasCss: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[String] = js.undefined
    
    var defaultScale: js.UndefOr[Double] = js.undefined
    
    var document: typings.std.Document
    
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
    def apply(document: typings.std.Document): PDFViewerProps = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFViewerProps]
    }
    
    @scala.inline
    implicit class PDFViewerPropsMutableBuilder[Self <: PDFViewerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: /* err */ Err => ReactNode): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      @scala.inline
      def setCanvasCss(value: String): Self = StObject.set(x, "canvasCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasCssUndefined: Self = StObject.set(x, "canvasCss", js.undefined)
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setDefaultScale(value: Double): Self = StObject.set(x, "defaultScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultScaleUndefined: Self = StObject.set(x, "defaultScale", js.undefined)
      
      @scala.inline
      def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNavbar(value: Boolean): Self = StObject.set(x, "hideNavbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNavbarUndefined: Self = StObject.set(x, "hideNavbar", js.undefined)
      
      @scala.inline
      def setHideRotation(value: Boolean): Self = StObject.set(x, "hideRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideRotationUndefined: Self = StObject.set(x, "hideRotation", js.undefined)
      
      @scala.inline
      def setHideZoom(value: Boolean): Self = StObject.set(x, "hideZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideZoomUndefined: Self = StObject.set(x, "hideZoom", js.undefined)
      
      @scala.inline
      def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      @scala.inline
      def setNavbarOnTop(value: Boolean): Self = StObject.set(x, "navbarOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarOnTopUndefined: Self = StObject.set(x, "navbarOnTop", js.undefined)
      
      @scala.inline
      def setNavigation(value: js.Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      @scala.inline
      def setOnDocumentClick(value: () => Unit): Self = StObject.set(x, "onDocumentClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDocumentClickUndefined: Self = StObject.set(x, "onDocumentClick", js.undefined)
      
      @scala.inline
      def setOnNextBtnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onNextBtnClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextBtnClickUndefined: Self = StObject.set(x, "onNextBtnClick", js.undefined)
      
      @scala.inline
      def setOnPrevBtnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onPrevBtnClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPrevBtnClickUndefined: Self = StObject.set(x, "onPrevBtnClick", js.undefined)
      
      @scala.inline
      def setOnRotation(value: /* angle */ Double => Unit): Self = StObject.set(x, "onRotation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRotationUndefined: Self = StObject.set(x, "onRotation", js.undefined)
      
      @scala.inline
      def setOnZoom(value: /* scale */ Double => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setProtectContent(value: Boolean): Self = StObject.set(x, "protectContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtectContentUndefined: Self = StObject.set(x, "protectContent", js.undefined)
      
      @scala.inline
      def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleStep(value: Double): Self = StObject.set(x, "scaleStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleStepUndefined: Self = StObject.set(x, "scaleStep", js.undefined)
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setWatermark(value: Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  type RotationClickHandler = js.Function1[/* angle */ Double, Unit]
  
  trait Watermark extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var diagonal: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Watermark {
    
    @scala.inline
    def apply(): Watermark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Watermark]
    }
    
    @scala.inline
    implicit class WatermarkMutableBuilder[Self <: Watermark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDiagonal(value: Boolean): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ZoomClickHandler = js.Function1[/* scale */ Double, Unit]
}
