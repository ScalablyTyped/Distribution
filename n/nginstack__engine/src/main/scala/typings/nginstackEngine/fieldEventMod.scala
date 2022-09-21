package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var field: typings.nginstackEngine.fieldMod.^ = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldEvent extends StObject {
    
    var field: typings.nginstackEngine.fieldMod.^
  }
  object FieldEvent {
    
    inline def apply(field: typings.nginstackEngine.fieldMod.^): FieldEvent = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEvent]
    }
    
    extension [Self <: FieldEvent](x: Self) {
      
      inline def setField(value: typings.nginstackEngine.fieldMod.^): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
}
