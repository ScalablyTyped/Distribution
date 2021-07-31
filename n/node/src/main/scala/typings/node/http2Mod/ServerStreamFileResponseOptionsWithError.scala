package typings.node.http2Mod

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStreamFileResponseOptionsWithError
  extends StObject
     with ServerStreamFileResponseOptions {
  
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.undefined
}
object ServerStreamFileResponseOptionsWithError {
  
  @scala.inline
  def apply(): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
  
  @scala.inline
  implicit class ServerStreamFileResponseOptionsWithErrorMutableBuilder[Self <: ServerStreamFileResponseOptionsWithError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* err */ ErrnoException => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
