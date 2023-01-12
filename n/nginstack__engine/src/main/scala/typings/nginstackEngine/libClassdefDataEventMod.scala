package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefDataEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/DataEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var data: DataSet = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/DataEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataEvent extends StObject {
    
    var data: DataSet
  }
  object DataEvent {
    
    inline def apply(data: DataSet): DataEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: DataSet): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
}
