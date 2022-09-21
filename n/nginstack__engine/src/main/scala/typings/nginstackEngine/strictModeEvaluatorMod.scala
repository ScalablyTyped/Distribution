package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictModeEvaluatorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/StrictModeEvaluator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StrictModeEvaluator {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var enableLevel_ : Any = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var pauseLevel_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var preserve_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var preserved_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var protectProperty_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var protect_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var protected_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var restoreProperty_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var restore_ : Any = js.native
    
    /* CompleteClass */
    override def resume(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var unprotect_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/StrictModeEvaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ProtectedObject extends StObject {
    
    var events: js.Array[String]
    
    var id: String
    
    var methods: Any
    
    var `object`: Any
    
    var properties: js.Array[String]
  }
  object ProtectedObject {
    
    inline def apply(events: js.Array[String], id: String, methods: Any, `object`: Any, properties: js.Array[String]): ProtectedObject = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectedObject]
    }
    
    extension [Self <: ProtectedObject](x: Self) {
      
      inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Any): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait StrictModeEvaluator extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    /* private */ var enableLevel_ : Any
    
    var enabled: Boolean
    
    def pause(): Unit
    
    /* private */ var pauseLevel_ : Any
    
    /* private */ var preserve_ : Any
    
    /* private */ var preserved_ : Any
    
    /* private */ var protectProperty_ : Any
    
    /* private */ var protect_ : Any
    
    /* private */ var protected_ : Any
    
    /* private */ var restoreProperty_ : Any
    
    /* private */ var restore_ : Any
    
    def resume(): Unit
    
    /* private */ var unprotect_ : Any
  }
  object StrictModeEvaluator {
    
    inline def apply(
      disable: () => Unit,
      enable: () => Unit,
      enableLevel_ : Any,
      enabled: Boolean,
      pause: () => Unit,
      pauseLevel_ : Any,
      preserve_ : Any,
      preserved_ : Any,
      protectProperty_ : Any,
      protect_ : Any,
      protected_ : Any,
      restoreProperty_ : Any,
      restore_ : Any,
      resume: () => Unit,
      unprotect_ : Any
    ): StrictModeEvaluator = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), enableLevel_ = enableLevel_.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), pauseLevel_ = pauseLevel_.asInstanceOf[js.Any], preserve_ = preserve_.asInstanceOf[js.Any], preserved_ = preserved_.asInstanceOf[js.Any], protectProperty_ = protectProperty_.asInstanceOf[js.Any], protect_ = protect_.asInstanceOf[js.Any], protected_ = protected_.asInstanceOf[js.Any], restoreProperty_ = restoreProperty_.asInstanceOf[js.Any], restore_ = restore_.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), unprotect_ = unprotect_.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictModeEvaluator]
    }
    
    extension [Self <: StrictModeEvaluator](x: Self) {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnableLevel_(value: Any): Self = StObject.set(x, "enableLevel_", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPauseLevel_(value: Any): Self = StObject.set(x, "pauseLevel_", value.asInstanceOf[js.Any])
      
      inline def setPreserve_(value: Any): Self = StObject.set(x, "preserve_", value.asInstanceOf[js.Any])
      
      inline def setPreserved_(value: Any): Self = StObject.set(x, "preserved_", value.asInstanceOf[js.Any])
      
      inline def setProtectProperty_(value: Any): Self = StObject.set(x, "protectProperty_", value.asInstanceOf[js.Any])
      
      inline def setProtect_(value: Any): Self = StObject.set(x, "protect_", value.asInstanceOf[js.Any])
      
      inline def setProtected_(value: Any): Self = StObject.set(x, "protected_", value.asInstanceOf[js.Any])
      
      inline def setRestoreProperty_(value: Any): Self = StObject.set(x, "restoreProperty_", value.asInstanceOf[js.Any])
      
      inline def setRestore_(value: Any): Self = StObject.set(x, "restore_", value.asInstanceOf[js.Any])
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setUnprotect_(value: Any): Self = StObject.set(x, "unprotect_", value.asInstanceOf[js.Any])
    }
  }
}
