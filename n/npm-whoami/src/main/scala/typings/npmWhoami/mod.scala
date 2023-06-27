package typings.npmWhoami

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: WhoamiCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(callback: WhoamiCallback, opts: WhoamiOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("npm-whoami", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(opts: WhoamiOptions): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(opts.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait BothOptions extends StObject {
    
    var registry: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BothOptions {
    
    inline def apply(): BothOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BothOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BothOptions] (val x: Self) extends AnyVal {
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait WhoamiCallback extends StObject {
    
    def apply(err: js.Error, username: Unit): Unit = js.native
    def apply(err: Null, username: String): Unit = js.native
  }
  
  type WhoamiOptions = Double | String | BothOptions
}
