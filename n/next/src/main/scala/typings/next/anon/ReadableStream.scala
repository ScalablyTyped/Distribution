package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStream extends StObject {
  
  var ReadableStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any
}
object ReadableStream {
  
  inline def apply(
    ReadableStream: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any
  ): ReadableStream = {
    val __obj = js.Dynamic.literal(ReadableStream = ReadableStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStream]
  }
  
  extension [Self <: ReadableStream](x: Self) {
    
    inline def setReadableStream(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReadableStream */ Any): Self = StObject.set(x, "ReadableStream", value.asInstanceOf[js.Any])
  }
}
