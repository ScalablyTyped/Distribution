package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupMultipleInsertEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/LookupMultipleInsertEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LookupMultipleInsertEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var lookupGrid: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/LookupMultipleInsertEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LookupMultipleInsertEvent extends StObject {
    
    var lookupGrid: Any
  }
  object LookupMultipleInsertEvent {
    
    inline def apply(lookupGrid: Any): LookupMultipleInsertEvent = {
      val __obj = js.Dynamic.literal(lookupGrid = lookupGrid.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupMultipleInsertEvent]
    }
    
    extension [Self <: LookupMultipleInsertEvent](x: Self) {
      
      inline def setLookupGrid(value: Any): Self = StObject.set(x, "lookupGrid", value.asInstanceOf[js.Any])
    }
  }
}
