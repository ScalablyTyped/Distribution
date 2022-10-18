package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldCalculateEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/FieldCalculateEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldCalculateEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var value: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/FieldCalculateEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldCalculateEvent extends StObject {
    
    var value: Any
  }
  object FieldCalculateEvent {
    
    inline def apply(value: Any): FieldCalculateEvent = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldCalculateEvent]
    }
    
    extension [Self <: FieldCalculateEvent](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
