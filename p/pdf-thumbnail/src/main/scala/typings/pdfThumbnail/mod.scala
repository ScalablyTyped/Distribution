package typings.pdfThumbnail

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(body: String): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  @scala.inline
  def apply(body: String, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  @scala.inline
  def apply(body: Buffer): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  @scala.inline
  def apply(body: Buffer, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  @scala.inline
  def apply(body: ReadableStream): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  @scala.inline
  def apply(body: ReadableStream, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  
  @JSImport("pdf-thumbnail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompressParams extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CompressParams {
    
    @scala.inline
    def apply(): CompressParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressParams]
    }
    
    @scala.inline
    implicit class CompressParamsMutableBuilder[Self <: CompressParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CropParams extends StObject {
    
    var height: Double
    
    var ratio: js.UndefOr[Boolean] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object CropParams {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): CropParams = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropParams]
    }
    
    @scala.inline
    implicit class CropParamsMutableBuilder[Self <: CropParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatio(value: Boolean): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfThumbnail.pdfThumbnailStrings.compress
    - typings.pdfThumbnail.pdfThumbnailStrings.crop
    - typings.pdfThumbnail.pdfThumbnailStrings.resize
  */
  trait Operations extends StObject
  object Operations {
    
    @scala.inline
    def compress: typings.pdfThumbnail.pdfThumbnailStrings.compress = "compress".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.compress]
    
    @scala.inline
    def crop: typings.pdfThumbnail.pdfThumbnailStrings.crop = "crop".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.crop]
    
    @scala.inline
    def resize: typings.pdfThumbnail.pdfThumbnailStrings.resize = "resize".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.resize]
  }
  
  trait OperationsParams extends StObject {
    
    var compress: CompressParams
    
    var crop: CropParams
    
    var resize: ResizeParams
  }
  object OperationsParams {
    
    @scala.inline
    def apply(compress: CompressParams, crop: CropParams, resize: ResizeParams): OperationsParams = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationsParams]
    }
    
    @scala.inline
    implicit class OperationsParamsMutableBuilder[Self <: OperationsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: CompressParams): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrop(value: CropParams): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResize(value: ResizeParams): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ op in pdf-thumbnail.pdf-thumbnail.Operations ]:? pdf-thumbnail.pdf-thumbnail.OperationsParams[op]} */
  trait PDFThumbnailOptions extends StObject {
    
    var compress: js.UndefOr[CompressParams] = js.undefined
    
    var crop: js.UndefOr[CropParams] = js.undefined
    
    var resize: js.UndefOr[ResizeParams] = js.undefined
  }
  object PDFThumbnailOptions {
    
    @scala.inline
    def apply(): PDFThumbnailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFThumbnailOptions]
    }
    
    @scala.inline
    implicit class PDFThumbnailOptionsMutableBuilder[Self <: PDFThumbnailOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: CompressParams): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setCrop(value: CropParams): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setResize(value: ResizeParams): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    }
  }
  
  trait ResizeParams extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResizeParams {
    
    @scala.inline
    def apply(): ResizeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeParams]
    }
    
    @scala.inline
    implicit class ResizeParamsMutableBuilder[Self <: ResizeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
