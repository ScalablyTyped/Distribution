package typings.parcelTypes.mod

import typings.parcelTypes.anon.Stream
import typings.parcelTypes.anon.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compressor extends StObject {
  
  def compress(arg0: Stream): Async[js.UndefOr[StreamType | Null]]
}
object Compressor {
  
  inline def apply(compress: Stream => Async[js.UndefOr[StreamType | Null]]): Compressor = {
    val __obj = js.Dynamic.literal(compress = js.Any.fromFunction1(compress))
    __obj.asInstanceOf[Compressor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compressor] (val x: Self) extends AnyVal {
    
    inline def setCompress(value: Stream => Async[js.UndefOr[StreamType | Null]]): Self = StObject.set(x, "compress", js.Any.fromFunction1(value))
  }
}
