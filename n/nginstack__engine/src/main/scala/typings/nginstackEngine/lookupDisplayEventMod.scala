package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupDisplayEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/LookupDisplayEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LookupDisplayEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var displayValue: String = js.native
    
    /* CompleteClass */
    var key: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/LookupDisplayEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LookupDisplayEvent extends StObject {
    
    var displayValue: String
    
    var key: Double
  }
  object LookupDisplayEvent {
    
    inline def apply(displayValue: String, key: Double): LookupDisplayEvent = {
      val __obj = js.Dynamic.literal(displayValue = displayValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupDisplayEvent]
    }
    
    extension [Self <: LookupDisplayEvent](x: Self) {
      
      inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
