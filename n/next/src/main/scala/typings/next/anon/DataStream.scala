package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStream extends StObject {
  
  var dataStream: js.UndefOr[typings.std.ReadableStream[js.typedarray.Uint8Array]] = js.undefined
  
  var flushEffectHandler: js.UndefOr[js.Function0[String]] = js.undefined
  
  var flushEffectsToHead: Boolean
  
  var generateStaticHTML: Boolean
  
  var suffix: js.UndefOr[String] = js.undefined
}
object DataStream {
  
  inline def apply(flushEffectsToHead: Boolean, generateStaticHTML: Boolean): DataStream = {
    val __obj = js.Dynamic.literal(flushEffectsToHead = flushEffectsToHead.asInstanceOf[js.Any], generateStaticHTML = generateStaticHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStream]
  }
  
  extension [Self <: DataStream](x: Self) {
    
    inline def setDataStream(value: typings.std.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "dataStream", value.asInstanceOf[js.Any])
    
    inline def setDataStreamUndefined: Self = StObject.set(x, "dataStream", js.undefined)
    
    inline def setFlushEffectHandler(value: () => String): Self = StObject.set(x, "flushEffectHandler", js.Any.fromFunction0(value))
    
    inline def setFlushEffectHandlerUndefined: Self = StObject.set(x, "flushEffectHandler", js.undefined)
    
    inline def setFlushEffectsToHead(value: Boolean): Self = StObject.set(x, "flushEffectsToHead", value.asInstanceOf[js.Any])
    
    inline def setGenerateStaticHTML(value: Boolean): Self = StObject.set(x, "generateStaticHTML", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
