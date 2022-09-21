package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openKeyEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/OpenKeyEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OpenKeyEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* CompleteClass */
    var lookupType: Any = js.native
    
    /* CompleteClass */
    var process: Any = js.native
    
    /* CompleteClass */
    var value: Double | String | Null = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/OpenKeyEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait OpenKeyEvent extends StObject {
    
    var classKey: Double
    
    var lookupType: Any
    
    var process: Any
    
    var value: Double | String | Null
  }
  object OpenKeyEvent {
    
    inline def apply(classKey: Double, lookupType: Any, process: Any): OpenKeyEvent = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], lookupType = lookupType.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[OpenKeyEvent]
    }
    
    extension [Self <: OpenKeyEvent](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setLookupType(value: Any): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Any): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
