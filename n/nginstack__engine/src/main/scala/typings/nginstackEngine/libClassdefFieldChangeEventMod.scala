package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldChangeEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldChangeEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldChangeEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var beforeValue: Any = js.native
    
    /* CompleteClass */
    var newValue: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldChangeEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldChangeEvent extends StObject {
    
    var beforeValue: Any
    
    var newValue: Any
  }
  object FieldChangeEvent {
    
    inline def apply(beforeValue: Any, newValue: Any): FieldChangeEvent = {
      val __obj = js.Dynamic.literal(beforeValue = beforeValue.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldChangeEvent]
    }
    
    extension [Self <: FieldChangeEvent](x: Self) {
      
      inline def setBeforeValue(value: Any): Self = StObject.set(x, "beforeValue", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    }
  }
}
