package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordNet extends StObject {
  
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit
  
  def lookup(word: String, callback: WordNetLookupCallback): Unit
}
object WordNet {
  
  inline def apply(get: (Double, String, WordNetGetCallback) => Unit, lookup: (String, WordNetLookupCallback) => Unit): WordNet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), lookup = js.Any.fromFunction2(lookup))
    __obj.asInstanceOf[WordNet]
  }
  
  extension [Self <: WordNet](x: Self) {
    
    inline def setGet(value: (Double, String, WordNetGetCallback) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    inline def setLookup(value: (String, WordNetLookupCallback) => Unit): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
  }
}
