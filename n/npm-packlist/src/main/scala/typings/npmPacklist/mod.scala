package typings.npmPacklist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(options: Options): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply[T](options: Unit, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def apply[T](options: Options, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /** Directory to walk recusively. Defaults to `process.cwd()`. */
    var path: js.UndefOr[String] = js.undefined
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
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
