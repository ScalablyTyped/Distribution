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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf2image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileConverter(): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("compileConverter")().asInstanceOf[Converter]
  inline def compileConverter(options: PartialOptions): Converter = ^.asInstanceOf[js.Dynamic].applyDynamic("compileConverter")(options.asInstanceOf[js.Any]).asInstanceOf[Converter]
  
  inline def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertPDF")(pdfFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ConvertedFile]]]
  inline def convertPDF(pdfFilePath: String, options: PartialOptions): js.Promise[js.Array[ConvertedFile]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPDF")(pdfFilePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ConvertedFile]]]
  
  trait ConvertedFile extends StObject {
    
    var index: Double
    
    var name: String
    
    var page: Double
    
    var path: String
  }
  object ConvertedFile {
    
    inline def apply(index: Double, name: String, page: Double, path: String): ConvertedFile = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertedFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvertedFile] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Converter extends StObject {
    
    def convertPDF(pdfFilePath: String): js.Promise[js.Array[ConvertedFile]]
    
    def convertPDFList(pdfList: js.Array[String]): js.Promise[js.Array[ConvertedFile]]
  }
  object Converter {
    
    inline def apply(
      convertPDF: String => js.Promise[js.Array[ConvertedFile]],
      convertPDFList: js.Array[String] => js.Promise[js.Array[ConvertedFile]]
    ): Converter = {
      val __obj = js.Dynamic.literal(convertPDF = js.Any.fromFunction1(convertPDF), convertPDFList = js.Any.fromFunction1(convertPDFList))
      __obj.asInstanceOf[Converter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Converter] (val x: Self) extends AnyVal {
      
      inline def setConvertPDF(value: String => js.Promise[js.Array[ConvertedFile]]): Self = StObject.set(x, "convertPDF", js.Any.fromFunction1(value))
      
      inline def setConvertPDFList(value: js.Array[String] => js.Promise[js.Array[ConvertedFile]]): Self = StObject.set(x, "convertPDFList", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var backgroundColor: String
    
    var density: Double
    
    var height: Double
    
    // #ffffff
    var outputFormat: OutputFormat
    
    var outputType: jpg | png | Dotjpg | Dotpng
    
    var pages: Asterisk | String
    
    var quality: Double
    
    // * | even | odd | '/1,/3,5-6,-8, 9-'
    var singleProcess: Boolean
    
    var width: Double
  }
  object Options {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatFunction7(
        value: (/* pageNum */ Double, /* pageIndex */ Double, /* totalPagesProcessed */ Double, /* totalPDFPages */ Double, /* name */ String, /* path */ String, /* vm */ TypeofimportedVm) => String
      ): Self = StObject.set(x, "outputFormat", js.Any.fromFunction7(value))
      
      inline def setOutputType(value: jpg | png | Dotjpg | Dotpng): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
      
      inline def setPages(value: Asterisk | String): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSingleProcess(value: Boolean): Self = StObject.set(x, "singleProcess", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
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
