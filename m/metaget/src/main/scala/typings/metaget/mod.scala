package typings.metaget

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metaget", "fetch")
  @js.native
  def fetch(uri: String): js.Promise[Result] = js.native
  @JSImport("metaget", "fetch")
  @js.native
  def fetch(uri: String, userArgs: Options): js.Promise[Result] = js.native
  @JSImport("metaget", "fetch")
  @js.native
  def fetch[T](uri: String, callback: Callback[T]): js.Promise[T] = js.native
  @JSImport("metaget", "fetch")
  @js.native
  def fetch[T](uri: String, userArgs: Options, callback: Callback[T]): js.Promise[T] = js.native
  
  type Callback[T] = js.Function2[/* error */ Error | Null, /* data */ Result, T]
  
  @js.native
  trait Options extends StObject {
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type Result = Record[String, String]
}
