package typings.pdfParse

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dataBuffer: Buffer): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(dataBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(dataBuffer: Buffer, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(dataBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("pdf-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var pagerender: js.UndefOr[js.Function1[/* pageData */ js.Any, String]] = js.undefined
    
    var version: js.UndefOr[Version] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setPagerender(value: /* pageData */ js.Any => String): Self = StObject.set(x, "pagerender", js.Any.fromFunction1(value))
      
      inline def setPagerenderUndefined: Self = StObject.set(x, "pagerender", js.undefined)
      
      inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var info: js.Any
    
    var metadata: js.Any
    
    var numpages: Double
    
    var numrender: Double
    
    var text: String
    
    var version: Version
  }
  object Result {
    
    inline def apply(
      info: js.Any,
      metadata: js.Any,
      numpages: Double,
      numrender: Double,
      text: String,
      version: Version
    ): Result = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], numpages = numpages.asInstanceOf[js.Any], numrender = numrender.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setNumpages(value: Double): Self = StObject.set(x, "numpages", value.asInstanceOf[js.Any])
      
      inline def setNumrender(value: Double): Self = StObject.set(x, "numrender", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pdfParse.pdfParseStrings.default
    - typings.pdfParse.pdfParseStrings.v1Dot9Dot426
    - typings.pdfParse.pdfParseStrings.v1Dot10Dot100
    - typings.pdfParse.pdfParseStrings.v1Dot10Dot88
    - typings.pdfParse.pdfParseStrings.v2Dot0Dot550
  */
  trait Version extends StObject
  object Version {
    
    inline def default: typings.pdfParse.pdfParseStrings.default = "default".asInstanceOf[typings.pdfParse.pdfParseStrings.default]
    
    inline def v1Dot10Dot100: typings.pdfParse.pdfParseStrings.v1Dot10Dot100 = "v1.10.100".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot10Dot100]
    
    inline def v1Dot10Dot88: typings.pdfParse.pdfParseStrings.v1Dot10Dot88 = "v1.10.88".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot10Dot88]
    
    inline def v1Dot9Dot426: typings.pdfParse.pdfParseStrings.v1Dot9Dot426 = "v1.9.426".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot9Dot426]
    
    inline def v2Dot0Dot550: typings.pdfParse.pdfParseStrings.v2Dot0Dot550 = "v2.0.550".asInstanceOf[typings.pdfParse.pdfParseStrings.v2Dot0Dot550]
  }
}
