package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStream extends StObject {
  
  var dataStream: js.UndefOr[typings.std.ReadableStream[js.typedarray.Uint8Array]] = js.undefined
  
  var generateStaticHTML: Boolean
  
  var getServerInsertedHTML: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
  
  var serverInsertedHTMLToHead: Boolean
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var validateRootLayout: js.UndefOr[GetTree] = js.undefined
}
object DataStream {
  
  inline def apply(generateStaticHTML: Boolean, serverInsertedHTMLToHead: Boolean): DataStream = {
    val __obj = js.Dynamic.literal(generateStaticHTML = generateStaticHTML.asInstanceOf[js.Any], serverInsertedHTMLToHead = serverInsertedHTMLToHead.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStream]
  }
  
  extension [Self <: DataStream](x: Self) {
    
    inline def setDataStream(value: typings.std.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "dataStream", value.asInstanceOf[js.Any])
    
    inline def setDataStreamUndefined: Self = StObject.set(x, "dataStream", js.undefined)
    
    inline def setGenerateStaticHTML(value: Boolean): Self = StObject.set(x, "generateStaticHTML", value.asInstanceOf[js.Any])
    
    inline def setGetServerInsertedHTML(value: () => js.Promise[String]): Self = StObject.set(x, "getServerInsertedHTML", js.Any.fromFunction0(value))
    
    inline def setGetServerInsertedHTMLUndefined: Self = StObject.set(x, "getServerInsertedHTML", js.undefined)
    
    inline def setServerInsertedHTMLToHead(value: Boolean): Self = StObject.set(x, "serverInsertedHTMLToHead", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setValidateRootLayout(value: GetTree): Self = StObject.set(x, "validateRootLayout", value.asInstanceOf[js.Any])
    
    inline def setValidateRootLayoutUndefined: Self = StObject.set(x, "validateRootLayout", js.undefined)
  }
}
