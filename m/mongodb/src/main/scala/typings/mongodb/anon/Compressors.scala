package typings.mongodb.anon

import typings.mongodb.mongodbStrings.snappy
import typings.mongodb.mongodbStrings.zlib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compressors extends StObject {
  
  /** The selected compressors in preference order */
  var compressors: js.UndefOr[js.Array[snappy | zlib]] = js.undefined
}
object Compressors {
  
  inline def apply(): Compressors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compressors]
  }
  
  extension [Self <: Compressors](x: Self) {
    
    inline def setCompressors(value: js.Array[snappy | zlib]): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
    
    inline def setCompressorsUndefined: Self = StObject.set(x, "compressors", js.undefined)
    
    inline def setCompressorsVarargs(value: (snappy | zlib)*): Self = StObject.set(x, "compressors", js.Array(value :_*))
  }
}
