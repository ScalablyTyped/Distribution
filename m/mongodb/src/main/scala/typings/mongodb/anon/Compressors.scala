package typings.mongodb.anon

import typings.mongodb.mongodbStrings.snappy
import typings.mongodb.mongodbStrings.zlib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compressors extends StObject {
  
  /** The selected compressors in preference order */
  var compressors: js.UndefOr[js.Array[snappy | zlib]] = js.native
}
object Compressors {
  
  @scala.inline
  def apply(): Compressors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compressors]
  }
  
  @scala.inline
  implicit class CompressorsMutableBuilder[Self <: Compressors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressors(value: js.Array[snappy | zlib]): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressorsUndefined: Self = StObject.set(x, "compressors", js.undefined)
    
    @scala.inline
    def setCompressorsVarargs(value: (snappy | zlib)*): Self = StObject.set(x, "compressors", js.Array(value :_*))
  }
}
