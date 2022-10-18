package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefConfigDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ConfigDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ConfigDef {
    
    /* protected */ /* CompleteClass */
    var logger_ : typings.nginstackEngine.libLogLoggerMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var vfsToCheckStrictMode_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/ConfigDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConfigDef extends StObject {
    
    /* protected */ var logger_ : typings.nginstackEngine.libLogLoggerMod.^
    
    /* private */ var vfsToCheckStrictMode_ : Any
  }
  object ConfigDef {
    
    inline def apply(logger_ : typings.nginstackEngine.libLogLoggerMod.^, vfsToCheckStrictMode_ : Any): ConfigDef = {
      val __obj = js.Dynamic.literal(logger_ = logger_.asInstanceOf[js.Any], vfsToCheckStrictMode_ = vfsToCheckStrictMode_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigDef]
    }
    
    extension [Self <: ConfigDef](x: Self) {
      
      inline def setLogger_(value: typings.nginstackEngine.libLogLoggerMod.^): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setVfsToCheckStrictMode_(value: Any): Self = StObject.set(x, "vfsToCheckStrictMode_", value.asInstanceOf[js.Any])
    }
  }
}
