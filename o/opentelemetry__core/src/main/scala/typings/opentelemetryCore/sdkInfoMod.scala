package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkInfoMod {
  
  object SDK_INFO {
    
    @JSImport("@opentelemetry/core/build/src/platform/browser/sdk-info", "SDK_INFO")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/platform/browser/sdk-info", "SDK_INFO.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    inline def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser/sdk-info", "SDK_INFO.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser/sdk-info", "SDK_INFO.RUNTIME")
    @js.native
    def RUNTIME: String = js.native
    inline def RUNTIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/platform/browser/sdk-info", "SDK_INFO.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
