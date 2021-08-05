package typings.pdfThumbnail

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(body: String): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  inline def apply(body: String, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  inline def apply(body: Buffer): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  inline def apply(body: Buffer, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  inline def apply(body: ReadableStream): js.Promise[ReadableStream] = ^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStream]]
  inline def apply(body: ReadableStream, options: PDFThumbnailOptions): js.Promise[ReadableStream] = (^.asInstanceOf[js.Dynamic].apply(body.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream]]
  
  @JSImport("pdf-thumbnail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompressParams extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CompressParams {
    
    inline def apply(): CompressParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressParams]
    }
    
    extension [Self <: CompressParams](x: Self) {
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): CropParams = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CropParams]
    }
    
    extension [Self <: CropParams](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Boolean): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfThumbnail.pdfThumbnailStrings.compress
    - typings.pdfThumbnail.pdfThumbnailStrings.crop
    - typings.pdfThumbnail.pdfThumbnailStrings.resize
  */
  trait Operations extends StObject
  object Operations {
    
    inline def compress: typings.pdfThumbnail.pdfThumbnailStrings.compress = "compress".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.compress]
    
    inline def crop: typings.pdfThumbnail.pdfThumbnailStrings.crop = "crop".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.crop]
    
    inline def resize: typings.pdfThumbnail.pdfThumbnailStrings.resize = "resize".asInstanceOf[typings.pdfThumbnail.pdfThumbnailStrings.resize]
  }
  
  trait OperationsParams extends StObject {
    
    var compress: CompressParams
    
    var crop: CropParams
    
    var resize: ResizeParams
  }
  object OperationsParams {
    
    inline def apply(compress: CompressParams, crop: CropParams, resize: ResizeParams): OperationsParams = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationsParams]
    }
    
    extension [Self <: OperationsParams](x: Self) {
      
      inline def setCompress(value: CompressParams): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCrop(value: CropParams): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setResize(value: ResizeParams): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ op in pdf-thumbnail.pdf-thumbnail.Operations ]:? pdf-thumbnail.pdf-thumbnail.OperationsParams[op]} */
  trait PDFThumbnailOptions extends StObject {
    
    var compress: js.UndefOr[CompressParams] = js.undefined
    
    var crop: js.UndefOr[CropParams] = js.undefined
    
    var resize: js.UndefOr[ResizeParams] = js.undefined
  }
  object PDFThumbnailOptions {
    
    inline def apply(): PDFThumbnailOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFThumbnailOptions]
    }
    
    extension [Self <: PDFThumbnailOptions](x: Self) {
      
      inline def setCompress(value: CompressParams): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCrop(value: CropParams): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setResize(value: ResizeParams): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    }
  }
  
  trait ResizeParams extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResizeParams {
    
    inline def apply(): ResizeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeParams]
    }
    
    extension [Self <: ResizeParams](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
