package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefPersistEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/PersistEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PersistEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var action: typings.nginstackEngine.libDatasetApplyUpdatesActionMod.^ = js.native
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* CompleteClass */
    var key: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/PersistEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PersistEvent extends StObject {
    
    var action: typings.nginstackEngine.libDatasetApplyUpdatesActionMod.^
    
    var classKey: Double
    
    var key: Double
  }
  object PersistEvent {
    
    inline def apply(action: typings.nginstackEngine.libDatasetApplyUpdatesActionMod.^, classKey: Double, key: Double): PersistEvent = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], classKey = classKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistEvent] (val x: Self) extends AnyVal {
      
      inline def setAction(value: typings.nginstackEngine.libDatasetApplyUpdatesActionMod.^): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
