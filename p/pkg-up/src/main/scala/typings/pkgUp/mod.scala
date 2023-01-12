package typings.pkgUp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkg-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pkgUp(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pkgUp")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def pkgUp(options: Options): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pkgUp")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def pkgUpSync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pkgUpSync")().asInstanceOf[js.UndefOr[String]]
  inline def pkgUpSync(options: Options): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pkgUpSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait Options extends StObject {
    
    /**
    	The directory to start from.
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
