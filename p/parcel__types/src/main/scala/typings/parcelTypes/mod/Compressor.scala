package typings.parcelTypes.mod

import typings.parcelTypes.anon.Logger
import typings.parcelTypes.anon.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compressor extends StObject {
  
  def compress(arg0: Logger): Async[js.UndefOr[Stream | Null]]
}
object Compressor {
  
  inline def apply(compress: Logger => Async[js.UndefOr[Stream | Null]]): Compressor = {
    val __obj = js.Dynamic.literal(compress = js.Any.fromFunction1(compress))
    __obj.asInstanceOf[Compressor]
  }
  
  extension [Self <: Compressor](x: Self) {
    
    inline def setCompress(value: Logger => Async[js.UndefOr[Stream | Null]]): Self = StObject.set(x, "compress", js.Any.fromFunction1(value))
  }
}
