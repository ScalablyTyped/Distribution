package typings.pdfFillForm

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.pdfFillForm.anon.Id
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-fill-form", "read")
  @js.native
  def read(sourceFile: String): js.Promise[ReadableFields] = js.native
  
  @JSImport("pdf-fill-form", "readBuffer")
  @js.native
  def readBuffer(sourceBuffer: Buffer): js.Promise[ReadableFields] = js.native
  
  @JSImport("pdf-fill-form", "readBufferSync")
  @js.native
  def readBufferSync(sourceBuffer: Buffer): ReadableFields = js.native
  
  @JSImport("pdf-fill-form", "readSync")
  @js.native
  def readSync(sourceFile: String): ReadableFields = js.native
  
  @JSImport("pdf-fill-form", "write")
  @js.native
  def write(sourceFile: String, fields: WritableFields): js.Promise[Buffer] = js.native
  @JSImport("pdf-fill-form", "write")
  @js.native
  def write(sourceFile: String, fields: WritableFields, options: Options): js.Promise[Buffer] = js.native
  
  @JSImport("pdf-fill-form", "writeAsync")
  @js.native
  def writeAsync(sourceFile: String, fields: WritableFields, options: Options, callback: WriteAsyncCallback): Unit = js.native
  
  @JSImport("pdf-fill-form", "writeBuffer")
  @js.native
  def writeBuffer(sourceBuffer: Buffer, fields: WritableFields): js.Promise[Buffer] = js.native
  @JSImport("pdf-fill-form", "writeBuffer")
  @js.native
  def writeBuffer(sourceBuffer: Buffer, fields: WritableFields, options: Options): js.Promise[Buffer] = js.native
  
  @JSImport("pdf-fill-form", "writeBufferSync")
  @js.native
  def writeBufferSync(sourceBuffer: Buffer, fields: WritableFields): Buffer = js.native
  @JSImport("pdf-fill-form", "writeBufferSync")
  @js.native
  def writeBufferSync(sourceBuffer: Buffer, fields: WritableFields, options: Options): Buffer = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pdfFillForm.mod.Options because Already inherited */ @js.native
  trait ImgPdfOptions extends PdfOptions {
    
    var endPage: js.UndefOr[Double] = js.native
    
    var startPage: js.UndefOr[Double] = js.native
  }
  object ImgPdfOptions {
    
    @scala.inline
    def apply(): ImgPdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImgPdfOptions]
    }
    
    @scala.inline
    implicit class ImgPdfOptionsMutableBuilder[Self <: ImgPdfOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndPage(value: Double): Self = StObject.set(x, "endPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPageUndefined: Self = StObject.set(x, "endPage", js.undefined)
      
      @scala.inline
      def setStartPage(value: Double): Self = StObject.set(x, "startPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPageUndefined: Self = StObject.set(x, "startPage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfFillForm.mod.PdfOptions
    - typings.pdfFillForm.mod.ImgPdfOptions
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def ImgPdfOptions(): typings.pdfFillForm.mod.ImgPdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pdfFillForm.mod.ImgPdfOptions]
    }
    
    @scala.inline
    def PdfOptions(): typings.pdfFillForm.mod.PdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pdfFillForm.mod.PdfOptions]
    }
  }
  
  @js.native
  trait PdfOptions extends Options {
    
    var antialias: js.UndefOr[Boolean] = js.native
    
    var cores: js.UndefOr[Double] = js.native
    
    var save: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[Double] = js.native
  }
  object PdfOptions {
    
    @scala.inline
    def apply(): PdfOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfOptions]
    }
    
    @scala.inline
    implicit class PdfOptionsMutableBuilder[Self <: PdfOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      @scala.inline
      def setCores(value: Double): Self = StObject.set(x, "cores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoresUndefined: Self = StObject.set(x, "cores", js.undefined)
      
      @scala.inline
      def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  type ReadableFields = js.Array[Id]
  
  type WritableFields = StringDictionary[String]
  
  type WriteAsyncCallback = js.Function2[/* err */ Error, /* result */ Buffer, Unit]
}
