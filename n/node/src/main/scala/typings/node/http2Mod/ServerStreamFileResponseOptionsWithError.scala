package typings.node.http2Mod

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamFileResponseOptionsWithError extends ServerStreamFileResponseOptions {
  
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.native
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
