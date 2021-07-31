package typings.pako.mod

import typings.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InflateOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var dictionary: js.UndefOr[js.Any] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[string] = js.undefined
  
  var windowBits: js.UndefOr[Double] = js.undefined
}
object InflateOptions {
  
  @scala.inline
  def apply(): InflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InflateOptions]
  }
  
  @scala.inline
  implicit class InflateOptionsMutableBuilder[Self <: InflateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
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
