package typings.pdfParse

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-parse", JSImport.Namespace)
  @js.native
  def apply(dataBuffer: Buffer): js.Promise[Result] = js.native
  @JSImport("pdf-parse", JSImport.Namespace)
  @js.native
  def apply(dataBuffer: Buffer, options: Options): js.Promise[Result] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var pagerender: js.UndefOr[js.Function1[/* pageData */ js.Any, String]] = js.native
    
    var version: js.UndefOr[Version] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setPagerender(value: /* pageData */ js.Any => String): Self = StObject.set(x, "pagerender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPagerenderUndefined: Self = StObject.set(x, "pagerender", js.undefined)
      
      @scala.inline
      def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var info: js.Any = js.native
    
    var metadata: js.Any = js.native
    
    var numpages: Double = js.native
    
    var numrender: Double = js.native
    
    var text: String = js.native
    
    var version: Version = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumpages(value: Double): Self = StObject.set(x, "numpages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumrender(value: Double): Self = StObject.set(x, "numrender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def default: typings.pdfParse.pdfParseStrings.default = "default".asInstanceOf[typings.pdfParse.pdfParseStrings.default]
    
    @scala.inline
    def v1Dot10Dot100: typings.pdfParse.pdfParseStrings.v1Dot10Dot100 = "v1.10.100".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot10Dot100]
    
    @scala.inline
    def v1Dot10Dot88: typings.pdfParse.pdfParseStrings.v1Dot10Dot88 = "v1.10.88".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot10Dot88]
    
    @scala.inline
    def v1Dot9Dot426: typings.pdfParse.pdfParseStrings.v1Dot9Dot426 = "v1.9.426".asInstanceOf[typings.pdfParse.pdfParseStrings.v1Dot9Dot426]
    
    @scala.inline
    def v2Dot0Dot550: typings.pdfParse.pdfParseStrings.v2Dot0Dot550 = "v2.0.550".asInstanceOf[typings.pdfParse.pdfParseStrings.v2Dot0Dot550]
  }
}
