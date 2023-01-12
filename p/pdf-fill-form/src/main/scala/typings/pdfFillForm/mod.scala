package typings.pdfFillForm

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.pdfFillForm.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-fill-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(sourceFile: String): js.Promise[ReadableFields] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableFields]]
  
  inline def readBuffer(sourceBuffer: Buffer): js.Promise[ReadableFields] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBuffer")(sourceBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableFields]]
  
  inline def readBufferSync(sourceBuffer: Buffer): ReadableFields = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferSync")(sourceBuffer.asInstanceOf[js.Any]).asInstanceOf[ReadableFields]
  
  inline def readSync(sourceFile: String): ReadableFields = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[ReadableFields]
  
  inline def write(sourceFile: String, fields: WritableFields): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(sourceFile.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def write(sourceFile: String, fields: WritableFields, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(sourceFile.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def writeAsync(sourceFile: String, fields: WritableFields, options: Options, callback: WriteAsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsync")(sourceFile.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeBuffer(sourceBuffer: Buffer, fields: WritableFields): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBuffer")(sourceBuffer.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def writeBuffer(sourceBuffer: Buffer, fields: WritableFields, options: Options): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBuffer")(sourceBuffer.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def writeBufferSync(sourceBuffer: Buffer, fields: WritableFields): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferSync")(sourceBuffer.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def writeBufferSync(sourceBuffer: Buffer, fields: WritableFields, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferSync")(sourceBuffer.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def writeSync(sourceFile: String, fields: WritableFields): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(sourceFile.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def writeSync(sourceFile: String, fields: WritableFields, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(sourceFile.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pdfFillForm.mod.Options because Already inherited */ trait ImgPdfOptions
    extends StObject
       with PdfOptions {
    
    var endPage: js.UndefOr[Double] = js.undefined
    
    var startPage: js.UndefOr[Double] = js.undefined
  }
  object ImgPdfOptions {
    
    inline def apply(): ImgPdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImgPdfOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImgPdfOptions] (val x: Self) extends AnyVal {
      
      inline def setEndPage(value: Double): Self = StObject.set(x, "endPage", value.asInstanceOf[js.Any])
      
      inline def setEndPageUndefined: Self = StObject.set(x, "endPage", js.undefined)
      
      inline def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
      
      inline def setStartPageUndefined: Self = StObject.set(x, "startPage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfFillForm.mod.PdfOptions
    - typings.pdfFillForm.mod.ImgPdfOptions
  */
  trait Options extends StObject
  object Options {
    
    inline def ImgPdfOptions(): typings.pdfFillForm.mod.ImgPdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pdfFillForm.mod.ImgPdfOptions]
    }
    
    inline def PdfOptions(): typings.pdfFillForm.mod.PdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pdfFillForm.mod.PdfOptions]
    }
  }
  
  trait PdfOptions
    extends StObject
       with Options {
    
    var antialias: js.UndefOr[Boolean] = js.undefined
    
    var cores: js.UndefOr[Double] = js.undefined
    
    var save: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object PdfOptions {
    
    inline def apply(): PdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfOptions] (val x: Self) extends AnyVal {
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      inline def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
      
      inline def setCoresUndefined: Self = StObject.set(x, "cores", js.undefined)
      
      inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  type ReadableFields = js.Array[Id]
  
  type WritableFields = StringDictionary[String | Boolean | Double]
  
  type WriteAsyncCallback = js.Function2[/* err */ js.Error, /* result */ Buffer, Unit]
}
