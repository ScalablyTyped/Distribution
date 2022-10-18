package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpServerIdMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/http/ServerId", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ServerId
  @JSImport("@nginstack/engine/lib/http/ServerId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/http/ServerId", "COOKIE_ID")
  @js.native
  def COOKIE_ID: String = js.native
  inline def COOKIE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COOKIE_ID")(x.asInstanceOf[js.Any])
  
  inline def getInstance(): typings.nginstackEngine.libHttpServerIdMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.nginstackEngine.libHttpServerIdMod.^]
  
  @JSImport("@nginstack/engine/lib/http/ServerId", "instance_")
  @js.native
  def instance: ServerId = js.native
  
  inline def instance_=(x: ServerId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance_")(x.asInstanceOf[js.Any])
  
  type Response = typings.nginstackEngine.libHttpResponseMod.^
  
  @js.native
  trait ServerId extends StObject {
    
    def clearCookie(): Unit = js.native
    def clearCookie(opt_response: Response): Unit = js.native
    
    /* private */ var salt_ : Any = js.native
    
    def updateCookie(): Unit = js.native
    def updateCookie(opt_response: Response): Unit = js.native
    
    /* private */ var value_ : Any = js.native
  }
}
