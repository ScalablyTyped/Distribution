package typings.pdf2image

import typings.pdf2image.anon.PartialOptions
import typings.pdf2image.anon.TypeofimportedVm
import typings.pdf2image.pdf2imageStrings.Asterisk
import typings.pdf2image.pdf2imageStrings.Dotjpg
import typings.pdf2image.pdf2imageStrings.Dotpng
import typings.pdf2image.pdf2imageStrings.jpg
import typings.pdf2image.pdf2imageStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf2image", "compileConverter")
  @js.native
  def compileConverter(): Converter = js.native
  @JSImport("pdf2image", "compileConverter")
  @js.native
  def compileConverter(options: PartialOptions): Converter = js.native
  
  @JSImport("pdf2image", "convertPDF")
  @js.native
  def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
  @JSImport("pdf2image", "convertPDF")
  @js.native
  def convertPDF(pdfFilePath: String, options: PartialOptions): js.Promise[js.Array[ConvertedFile]] = js.native
  
  @js.native
  trait ConvertedFile extends StObject {
    
    var index: Double = js.native
    
    var name: String = js.native
    
    var page: Double = js.native
    
    var path: String = js.native
  }
  object ConvertedFile {
    
    @scala.inline
    def apply(index: Double, name: String, page: Double, path: String): ConvertedFile = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertedFile]
    }
    
    @scala.inline
    implicit class ConvertedFileMutableBuilder[Self <: ConvertedFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Converter extends StObject {
    
    def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = js.native
    
    def convertPDFList(pdfList: js.Array[String]): js.Promise[js.Array[ConvertedFile]] = js.native
  }
  object Converter {
    
    @scala.inline
    def apply(
      convertPDF: String => js.Promise[js.Array[ConvertedFile]],
      convertPDFList: js.Array[String] => js.Promise[js.Array[ConvertedFile]]
    ): Converter = {
      val __obj = js.Dynamic.literal(convertPDF = js.Any.fromFunction1(convertPDF), convertPDFList = js.Any.fromFunction1(convertPDFList))
      __obj.asInstanceOf[Converter]
    }
    
    @scala.inline
    implicit class ConverterMutableBuilder[Self <: Converter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConvertPDF(value: String => js.Promise[js.Array[ConvertedFile]]): Self = StObject.set(x, "convertPDF", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConvertPDFList(value: js.Array[String] => js.Promise[js.Array[ConvertedFile]]): Self = StObject.set(x, "convertPDFList", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var backgroundColor: String = js.native
    
    var density: Double = js.native
    
    var height: Double = js.native
    
    // #ffffff
    var outputFormat: OutputFormat = js.native
    
    var outputType: jpg | png | Dotjpg | Dotpng = js.native
    
    var pages: Asterisk | String = js.native
    
    var quality: Double = js.native
    
    // * | even | odd | '/1,/3,5-6,-8, 9-'
    var singleProcess: Boolean = js.native
    
    var width: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      backgroundColor: String,
      density: Double,
      height: Double,
      outputFormat: OutputFormat,
      outputType: jpg | png | Dotjpg | Dotpng,
      pages: Asterisk | String,
      quality: Double,
      singleProcess: Boolean,
      width: Double
    ): Options = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], outputFormat = outputFormat.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], singleProcess = singleProcess.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatFunction7(
        value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
      ): Self = StObject.set(x, "outputFormat", js.Any.fromFunction7(value))
      
      @scala.inline
      def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: Asterisk | String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputFormat = (js.Function7[
    /* pageNum */ Double, 
    /* pageIndex */ Double, 
    /* totalPagesProcessed */ Double, 
    /* totalPDFPages */ Double, 
    /* name */ String, 
    /* path */ String, 
    /* vm */ TypeofimportedVm, 
    String
  ]) | String
}
