package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGetTreeIconEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GetTreeIconEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GetTreeIconEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var iconPath: Double | String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GetTreeIconEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GetTreeIconEvent extends StObject {
    
    var iconPath: Double | String
  }
  object GetTreeIconEvent {
    
    inline def apply(iconPath: Double | String): GetTreeIconEvent = {
      val __obj = js.Dynamic.literal(iconPath = iconPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTreeIconEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTreeIconEvent] (val x: Self) extends AnyVal {
      
      inline def setIconPath(value: Double | String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    }
  }
}
