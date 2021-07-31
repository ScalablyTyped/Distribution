package typings.pako.mod

import typings.pako.pakoNumbers.`-1`
import typings.pako.pakoNumbers.`0`
import typings.pako.pakoNumbers.`1`
import typings.pako.pakoNumbers.`2`
import typings.pako.pakoNumbers.`3`
import typings.pako.pakoNumbers.`4`
import typings.pako.pakoNumbers.`5`
import typings.pako.pakoNumbers.`6`
import typings.pako.pakoNumbers.`7`
import typings.pako.pakoNumbers.`8`
import typings.pako.pakoNumbers.`9`
import typings.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeflateOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var dictionary: js.UndefOr[js.Any] = js.undefined
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var header: js.UndefOr[Header] = js.undefined
  
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  
  var memLevel: js.UndefOr[Double] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  
  var to: js.UndefOr[string] = js.undefined
  
  var windowBits: js.UndefOr[Double] = js.undefined
}
object DeflateOptions {
  
  @scala.inline
  def apply(): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateOptions]
  }
  
  @scala.inline
  implicit class DeflateOptionsMutableBuilder[Self <: DeflateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setStrategy(value: StrategyValues): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setTo(value: string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
