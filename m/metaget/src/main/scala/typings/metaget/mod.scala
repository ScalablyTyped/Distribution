package typings.metaget

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metaget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fetch(uri: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(uri.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  @scala.inline
  def fetch(uri: String, userArgs: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(uri.asInstanceOf[js.Any], userArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  @scala.inline
  def fetch[T](uri: String, callback: Callback[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(uri.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def fetch[T](uri: String, userArgs: Options, callback: Callback[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(uri.asInstanceOf[js.Any], userArgs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  type Callback[T] = js.Function2[/* error */ Error | Null, /* data */ Result, T]
  
  trait Options extends StObject {
    
    var headers: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
      def setHeaders(value: Record[String, js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
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
