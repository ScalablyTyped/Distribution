package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefClassDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ClassDef {
    
    /* private */ /* CompleteClass */
    var __proto__ : Any = js.native
    
    /* CompleteClass */
    var classKey: Double | Null = js.native
    
    /* private */ /* CompleteClass */
    var evalSource: Any = js.native
    
    /* protected */ /* CompleteClass */
    var evaluatingSource_ : Boolean = js.native
    
    /* private */ /* CompleteClass */
    var init: Any = js.native
    
    /* CompleteClass */
    var key: Double | Null = js.native
    
    /* protected */ /* CompleteClass */
    var logger_ : typings.nginstackEngine.libLogLoggerMod.^ = js.native
    
    /* CompleteClass */
    var parentDef: ClassDef = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/ClassDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ClassDef extends StObject {
    
    /* private */ var __proto__ : Any
    
    var classKey: Double | Null
    
    /* private */ var evalSource: Any
    
    /* protected */ var evaluatingSource_ : Boolean
    
    /* private */ var init: Any
    
    var key: Double | Null
    
    /* protected */ var logger_ : typings.nginstackEngine.libLogLoggerMod.^
    
    var parentDef: ClassDef
  }
  object ClassDef {
    
    inline def apply(
      __proto__ : Any,
      evalSource: Any,
      evaluatingSource_ : Boolean,
      init: Any,
      logger_ : typings.nginstackEngine.libLogLoggerMod.^,
      parentDef: ClassDef
    ): ClassDef = {
      val __obj = js.Dynamic.literal(__proto__ = __proto__.asInstanceOf[js.Any], evalSource = evalSource.asInstanceOf[js.Any], evaluatingSource_ = evaluatingSource_.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], parentDef = parentDef.asInstanceOf[js.Any], classKey = null, key = null)
      __obj.asInstanceOf[ClassDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassDef] (val x: Self) extends AnyVal {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKeyNull: Self = StObject.set(x, "classKey", null)
      
      inline def setEvalSource(value: Any): Self = StObject.set(x, "evalSource", value.asInstanceOf[js.Any])
      
      inline def setEvaluatingSource_(value: Boolean): Self = StObject.set(x, "evaluatingSource_", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Any): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setLogger_(value: typings.nginstackEngine.libLogLoggerMod.^): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setParentDef(value: ClassDef): Self = StObject.set(x, "parentDef", value.asInstanceOf[js.Any])
      
      inline def set__proto__(value: Any): Self = StObject.set(x, "__proto__", value.asInstanceOf[js.Any])
    }
  }
}
