package typings.mobileDetect

import typings.mobileDetect.mod.MobileDetectImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MobileDetect {
    
    @JSGlobal("MobileDetect")
    @js.native
    open class ^ protected ()
      extends typings.mobileDetect.mod.^ {
      def this(userAgent: String) = this()
      def this(userAgent: String, maxPhoneWidth: Double) = this()
    }
    
    @JSGlobal("MobileDetect")
    @js.native
    val ^ : js.Any = js.native
    
    // only used internally; if necessary, one can replace, intercept or augment particular methods or values
    /* static member */
    @JSGlobal("MobileDetect._impl")
    @js.native
    def impl: MobileDetectImpl = js.native
    
    inline def impl_=(x: MobileDetectImpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_impl")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isPhoneSized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneSized")().asInstanceOf[Boolean]
    inline def isPhoneSized(maxPhoneWidth: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneSized")(maxPhoneWidth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    @JSGlobal("MobileDetect.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
