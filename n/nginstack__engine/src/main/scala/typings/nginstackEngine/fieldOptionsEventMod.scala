package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldOptionsEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldOptionsEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldOptionsEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var options: js.Array[js.Array[Any]] = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldOptionsEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldOptionsEvent extends StObject {
    
    var options: js.Array[js.Array[Any]]
  }
  object FieldOptionsEvent {
    
    inline def apply(options: js.Array[js.Array[Any]]): FieldOptionsEvent = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOptionsEvent]
    }
    
    extension [Self <: FieldOptionsEvent](x: Self) {
      
      inline def setOptions(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
}
