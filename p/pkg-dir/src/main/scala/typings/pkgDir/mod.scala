package typings.pkgDir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkg-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packageDirectory(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageDirectory")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def packageDirectory(options: Options): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageDirectory")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def packageDirectorySync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageDirectorySync")().asInstanceOf[js.UndefOr[String]]
  inline def packageDirectorySync(options: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("packageDirectorySync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait Options extends StObject {
    
    /**
    	The directory to start searching from.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    }
  }
}
