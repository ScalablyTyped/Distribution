package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStreamFileResponseOptionsWithError
  extends StObject
     with ServerStreamFileResponseOptions {
  
  var onError: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any, 
      Unit
    ]
  ] = js.undefined
}
object ServerStreamFileResponseOptionsWithError {
  
  inline def apply(): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
  
  extension [Self <: ServerStreamFileResponseOptionsWithError](x: Self) {
    
    inline def setOnError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ /* err */ Any => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
