package typings.npmPacklist

import typings.npmPacklist.anon.Files
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(options: Options): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply[T](options: Unit, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](options: Options, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Array[String]]
  inline def sync(options: Options): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /** packageJsonCache */
    var packageJsonCache: js.UndefOr[Map[String, String | Files]] = js.undefined
    
    /** Directory to walk recusively. Defaults to `process.cwd()`. */
    var path: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPackageJsonCache(value: Map[String, String | Files]): Self = StObject.set(x, "packageJsonCache", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonCacheUndefined: Self = StObject.set(x, "packageJsonCache", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
