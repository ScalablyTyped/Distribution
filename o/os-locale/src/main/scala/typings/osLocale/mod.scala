package typings.osLocale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def osLocale(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("osLocale")().asInstanceOf[js.Promise[String]]
  inline def osLocale(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("osLocale")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def osLocaleSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("osLocaleSync")().asInstanceOf[String]
  inline def osLocaleSync(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("osLocaleSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Set to `false` to avoid spawning subprocesses and instead only resolve the locale from environment variables.
    	@default true
    	*/
    val spawn: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setSpawn(value: Boolean): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
}
