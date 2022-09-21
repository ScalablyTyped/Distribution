package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acceptsMod {
  
  inline def apply(request: Request): Unit = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/Accepts", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Accepts {
    def this(request: Request) = this()
  }
  @JSImport("@nginstack/engine/lib/http/Accepts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Accepts extends StObject {
    
    /* private */ var acceptHeader_ : Any = js.native
    
    /* private */ var extToMime_ : Any = js.native
    
    /* private */ var mediaTypeEquals_ : Any = js.native
    
    /* private */ var mediaTypeMap_ : Any = js.native
    
    /* private */ var removeSuffix_ : Any = js.native
    
    def `type`(extensions: String): js.UndefOr[String] = js.native
    def `type`(extensions: js.Array[Any]): js.UndefOr[String] = js.native
  }
  
  type Request = typings.nginstackEngine.httpRequestMod.^
}
