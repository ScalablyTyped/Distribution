package typings.opentelemetryInstrumentation

import typings.requireInTheMiddle.mod.OnRequireFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeRequireInTheMiddleSingletonMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/platform/node/RequireInTheMiddleSingleton", "RequireInTheMiddleSingleton")
  @js.native
  /* private */ open class RequireInTheMiddleSingleton () extends StObject {
    
    /* private */ var _initialize: Any = js.native
    
    /* private */ var _moduleNameTrie: Any = js.native
    
    /**
      * Register a hook with `require-in-the-middle`
      *
      * @param {string} moduleName Module name
      * @param {OnRequireFn} onRequire Hook function
      * @returns {Hooked} Registered hook
      */
    def register(moduleName: String, onRequire: OnRequireFn): Hooked = js.native
  }
  /* static members */
  object RequireInTheMiddleSingleton {
    
    @JSImport("@opentelemetry/instrumentation/build/src/platform/node/RequireInTheMiddleSingleton", "RequireInTheMiddleSingleton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/instrumentation/build/src/platform/node/RequireInTheMiddleSingleton", "RequireInTheMiddleSingleton._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * Get the `RequireInTheMiddleSingleton` singleton
      *
      * @returns {RequireInTheMiddleSingleton} Singleton of `RequireInTheMiddleSingleton`
      */
    inline def getInstance(): RequireInTheMiddleSingleton = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[RequireInTheMiddleSingleton]
  }
  
  trait Hooked extends StObject {
    
    var moduleName: String
    
    def onRequire[T](exports: T, name: String): T
    def onRequire[T](exports: T, name: String, basedir: String): T
    @JSName("onRequire")
    var onRequire_Original: OnRequireFn
  }
  object Hooked {
    
    inline def apply(
      moduleName: String,
      onRequire: (/* exports */ Any, /* name */ String, /* basedir */ js.UndefOr[String]) => Any
    ): Hooked = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = js.Any.fromFunction3(onRequire))
      __obj.asInstanceOf[Hooked]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hooked] (val x: Self) extends AnyVal {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOnRequire(value: (/* exports */ Any, /* name */ String, /* basedir */ js.UndefOr[String]) => Any): Self = StObject.set(x, "onRequire", js.Any.fromFunction3(value))
    }
  }
}
