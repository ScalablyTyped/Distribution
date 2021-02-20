package typings.npmPacklist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.Array[String]] = js.native
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[js.Array[String]] = js.native
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  def apply[T](options: js.UndefOr[scala.Nothing], callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = js.native
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  def apply[T](options: Options, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = js.native
  
  @JSImport("npm-packlist", "sync")
  @js.native
  def sync(): js.Array[String] = js.native
  @JSImport("npm-packlist", "sync")
  @js.native
  def sync(options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Directory to walk recusively. Defaults to `process.cwd()`. */
    var path: js.UndefOr[String] = js.native
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
