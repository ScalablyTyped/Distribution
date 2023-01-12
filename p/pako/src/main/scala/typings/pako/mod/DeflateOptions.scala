package typings.pako.mod

import typings.pako.pakoInts.`-1`
import typings.pako.pakoInts.`0`
import typings.pako.pakoInts.`1`
import typings.pako.pakoInts.`2`
import typings.pako.pakoInts.`3`
import typings.pako.pakoInts.`4`
import typings.pako.pakoInts.`5`
import typings.pako.pakoInts.`6`
import typings.pako.pakoInts.`7`
import typings.pako.pakoInts.`8`
import typings.pako.pakoInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeflateOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var dictionary: js.UndefOr[Any] = js.undefined
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var header: js.UndefOr[Header] = js.undefined
  
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  
  var memLevel: js.UndefOr[Double] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  
  var windowBits: js.UndefOr[Double] = js.undefined
}
object DeflateOptions {
  
  inline def apply(): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeflateOptions] (val x: Self) extends AnyVal {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setDictionary(value: Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setStrategy(value: StrategyValues): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
