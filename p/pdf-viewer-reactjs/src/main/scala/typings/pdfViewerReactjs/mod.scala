package typings.pdfViewerReactjs

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-viewer-reactjs", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PDFViewerProps, js.Object, Any]
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
    inline def alert_=(x: js.UndefOr[AlertHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.canvasCss")
    @js.native
    def canvasCss: js.UndefOr[String] = js.native
    inline def canvasCss_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canvasCss")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.css")
    @js.native
    def css: js.UndefOr[String] = js.native
    inline def css_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("css")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.document")
    @js.native
    def document: js.UndefOr[typings.std.Document] = js.native
    inline def document_=(x: js.UndefOr[typings.std.Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.externalInput")
    @js.native
    def externalInput: js.UndefOr[Boolean] = js.native
    inline def externalInput_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("externalInput")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.getMaxPageCount")
    @js.native
    def getMaxPageCount: js.UndefOr[MaxPageCount] = js.native
    inline def getMaxPageCount_=(x: js.UndefOr[MaxPageCount]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMaxPageCount")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideNavbar")
    @js.native
    def hideNavbar: js.UndefOr[Boolean] = js.native
    inline def hideNavbar_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideNavbar")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideRotation")
    @js.native
    def hideRotation: js.UndefOr[Boolean] = js.native
    inline def hideRotation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.hideZoom")
    @js.native
    def hideZoom: js.UndefOr[Boolean] = js.native
    inline def hideZoom_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideZoom")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.loader")
    @js.native
    def loader: js.UndefOr[ReactNode] = js.native
    inline def loader_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.maxScale")
    @js.native
    def maxScale: js.UndefOr[Double] = js.native
    inline def maxScale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.minScale")
    @js.native
    def minScale: js.UndefOr[Double] = js.native
    inline def minScale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minScale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.navbarOnTop")
    @js.native
    def navbarOnTop: js.UndefOr[Boolean] = js.native
    inline def navbarOnTop_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navbarOnTop")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.navigation")
    @js.native
    def navigation: js.UndefOr[Any] = js.native
    inline def navigation_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onDocumentClick")
    @js.native
    def onDocumentClick: js.UndefOr[DocClickHandler] = js.native
    inline def onDocumentClick_=(x: js.UndefOr[DocClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDocumentClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onNextBtnClick")
    @js.native
    def onNextBtnClick: js.UndefOr[BtnClickHandler] = js.native
    inline def onNextBtnClick_=(x: js.UndefOr[BtnClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNextBtnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onPrevBtnClick")
    @js.native
    def onPrevBtnClick: js.UndefOr[BtnClickHandler] = js.native
    inline def onPrevBtnClick_=(x: js.UndefOr[BtnClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPrevBtnClick")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onRotation")
    @js.native
    def onRotation: js.UndefOr[RotationClickHandler] = js.native
    inline def onRotation_=(x: js.UndefOr[RotationClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.onZoom")
    @js.native
    def onZoom: js.UndefOr[ZoomClickHandler] = js.native
    inline def onZoom_=(x: js.UndefOr[ZoomClickHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onZoom")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.page")
    @js.native
    def page: js.UndefOr[Double] = js.native
    inline def page_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.password")
    @js.native
    def password: js.UndefOr[String] = js.native
    inline def password_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("password")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.protectContent")
    @js.native
    def protectContent: js.UndefOr[Boolean] = js.native
    inline def protectContent_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protectContent")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.rotationAngle")
    @js.native
    def rotationAngle: js.UndefOr[Double] = js.native
    inline def rotationAngle_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotationAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.scale")
    @js.native
    def scale: js.UndefOr[Double] = js.native
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.scaleStep")
    @js.native
    def scaleStep: js.UndefOr[Double] = js.native
    inline def scaleStep_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scaleStep")(x.asInstanceOf[js.Any])
    
    inline def scale_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.showThumbnail")
    @js.native
    def showThumbnail: js.UndefOr[ShowThumbnail] = js.native
    inline def showThumbnail_=(x: js.UndefOr[ShowThumbnail]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showThumbnail")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.watermark")
    @js.native
    def watermark: js.UndefOr[Watermark] = js.native
    inline def watermark_=(x: js.UndefOr[Watermark]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("watermark")(x.asInstanceOf[js.Any])
    
    @JSImport("pdf-viewer-reactjs", "defaultProps.withCredentials")
    @js.native
    def withCredentials: js.UndefOr[Boolean] = js.native
    inline def withCredentials_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("pdf-viewer-reactjs", "propTypes")
  @js.native
  def propTypes: PDFViewerProps = js.native
  inline def propTypes_=(x: PDFViewerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  type AlertHandler = js.Function1[/* err */ Err, ReactNode]
  
  type BtnClickHandler = js.Function1[/* page */ Double, Unit]
  
  type DocClickHandler = js.Function0[Unit]
  
  trait Document extends StObject {
    
    var base64: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Document {
    
    inline def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Err extends StObject {
    
    var message: String
  }
  object Err {
    
    inline def apply(message: String): Err = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Err]
    }
    
    extension [Self <: Err](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type MaxPageCount = js.Function1[/* pageCount */ Double, Unit]
  
  type PDFViewer = Component[PDFViewerProps, js.Object, Any]
  
  trait PDFViewerProps extends StObject {
    
    var alert: js.UndefOr[AlertHandler] = js.undefined
    
    var canvasCss: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[String] = js.undefined
    
    var document: typings.std.Document
    
    var externalInput: js.UndefOr[Boolean] = js.undefined
    
    var getMaxPageCount: js.UndefOr[MaxPageCount] = js.undefined
    
    var hideNavbar: js.UndefOr[Boolean] = js.undefined
    
    var hideRotation: js.UndefOr[Boolean] = js.undefined
    
    var hideZoom: js.UndefOr[Boolean] = js.undefined
    
    var loader: js.UndefOr[ReactNode] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var navbarOnTop: js.UndefOr[Boolean] = js.undefined
    
    var navigation: js.UndefOr[Any] = js.undefined
    
    var onDocumentClick: js.UndefOr[DocClickHandler] = js.undefined
    
    var onNextBtnClick: js.UndefOr[BtnClickHandler] = js.undefined
    
    var onPrevBtnClick: js.UndefOr[BtnClickHandler] = js.undefined
    
    var onRotation: js.UndefOr[RotationClickHandler] = js.undefined
    
    var onZoom: js.UndefOr[ZoomClickHandler] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var protectContent: js.UndefOr[Boolean] = js.undefined
    
    var rotationAngle: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var scaleStep: js.UndefOr[Double] = js.undefined
    
    var showThumbnail: js.UndefOr[ShowThumbnail] = js.undefined
    
    var watermark: js.UndefOr[Watermark] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PDFViewerProps {
    
    inline def apply(document: typings.std.Document): PDFViewerProps = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFViewerProps]
    }
    
    extension [Self <: PDFViewerProps](x: Self) {
      
      inline def setAlert(value: /* err */ Err => ReactNode): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setCanvasCss(value: String): Self = StObject.set(x, "canvasCss", value.asInstanceOf[js.Any])
      
      inline def setCanvasCssUndefined: Self = StObject.set(x, "canvasCss", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setExternalInput(value: Boolean): Self = StObject.set(x, "externalInput", value.asInstanceOf[js.Any])
      
      inline def setExternalInputUndefined: Self = StObject.set(x, "externalInput", js.undefined)
      
      inline def setGetMaxPageCount(value: /* pageCount */ Double => Unit): Self = StObject.set(x, "getMaxPageCount", js.Any.fromFunction1(value))
      
      inline def setGetMaxPageCountUndefined: Self = StObject.set(x, "getMaxPageCount", js.undefined)
      
      inline def setHideNavbar(value: Boolean): Self = StObject.set(x, "hideNavbar", value.asInstanceOf[js.Any])
      
      inline def setHideNavbarUndefined: Self = StObject.set(x, "hideNavbar", js.undefined)
      
      inline def setHideRotation(value: Boolean): Self = StObject.set(x, "hideRotation", value.asInstanceOf[js.Any])
      
      inline def setHideRotationUndefined: Self = StObject.set(x, "hideRotation", js.undefined)
      
      inline def setHideZoom(value: Boolean): Self = StObject.set(x, "hideZoom", value.asInstanceOf[js.Any])
      
      inline def setHideZoomUndefined: Self = StObject.set(x, "hideZoom", js.undefined)
      
      inline def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      inline def setNavbarOnTop(value: Boolean): Self = StObject.set(x, "navbarOnTop", value.asInstanceOf[js.Any])
      
      inline def setNavbarOnTopUndefined: Self = StObject.set(x, "navbarOnTop", js.undefined)
      
      inline def setNavigation(value: Any): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setOnDocumentClick(value: () => Unit): Self = StObject.set(x, "onDocumentClick", js.Any.fromFunction0(value))
      
      inline def setOnDocumentClickUndefined: Self = StObject.set(x, "onDocumentClick", js.undefined)
      
      inline def setOnNextBtnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onNextBtnClick", js.Any.fromFunction1(value))
      
      inline def setOnNextBtnClickUndefined: Self = StObject.set(x, "onNextBtnClick", js.undefined)
      
      inline def setOnPrevBtnClick(value: /* page */ Double => Unit): Self = StObject.set(x, "onPrevBtnClick", js.Any.fromFunction1(value))
      
      inline def setOnPrevBtnClickUndefined: Self = StObject.set(x, "onPrevBtnClick", js.undefined)
      
      inline def setOnRotation(value: /* angle */ Double => Unit): Self = StObject.set(x, "onRotation", js.Any.fromFunction1(value))
      
      inline def setOnRotationUndefined: Self = StObject.set(x, "onRotation", js.undefined)
      
      inline def setOnZoom(value: /* scale */ Double => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      inline def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setProtectContent(value: Boolean): Self = StObject.set(x, "protectContent", value.asInstanceOf[js.Any])
      
      inline def setProtectContentUndefined: Self = StObject.set(x, "protectContent", js.undefined)
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleStep(value: Double): Self = StObject.set(x, "scaleStep", value.asInstanceOf[js.Any])
      
      inline def setScaleStepUndefined: Self = StObject.set(x, "scaleStep", js.undefined)
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowThumbnail(value: ShowThumbnail): Self = StObject.set(x, "showThumbnail", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailUndefined: Self = StObject.set(x, "showThumbnail", js.undefined)
      
      inline def setWatermark(value: Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      inline def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  type RotationClickHandler = js.Function1[/* angle */ Double, Unit]
  
  trait ShowThumbnail extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var onTop: js.UndefOr[Boolean] = js.undefined
    
    var rotationAngle: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var selectedThumbCss: js.UndefOr[String] = js.undefined
    
    var thumbCss: js.UndefOr[String] = js.undefined
  }
  object ShowThumbnail {
    
    inline def apply(): ShowThumbnail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowThumbnail]
    }
    
    extension [Self <: ShowThumbnail](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setOnTop(value: Boolean): Self = StObject.set(x, "onTop", value.asInstanceOf[js.Any])
      
      inline def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSelectedThumbCss(value: String): Self = StObject.set(x, "selectedThumbCss", value.asInstanceOf[js.Any])
      
      inline def setSelectedThumbCssUndefined: Self = StObject.set(x, "selectedThumbCss", js.undefined)
      
      inline def setThumbCss(value: String): Self = StObject.set(x, "thumbCss", value.asInstanceOf[js.Any])
      
      inline def setThumbCssUndefined: Self = StObject.set(x, "thumbCss", js.undefined)
    }
  }
  
  trait Watermark extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var diagonal: js.UndefOr[Boolean] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Watermark {
    
    inline def apply(): Watermark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Watermark]
    }
    
    extension [Self <: Watermark](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDiagonal(value: Boolean): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
      inline def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ZoomClickHandler = js.Function1[/* scale */ Double, Unit]
}
