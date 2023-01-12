package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvHighchartsVisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/HighchartsVisualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HighchartsVisualization {
    def this(definition: Any) = this()
    
    /* private */ /* CompleteClass */
    var canExport_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var chart_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var ds_ : Any = js.native
    
    /* CompleteClass */
    var onGetOptions: Event = js.native
    
    /* CompleteClass */
    override def queryData(filterValues: Record[String, Any]): Unit = js.native
    
    /* CompleteClass */
    override def render(outputObj: Any): Unit = js.native
    
    /* CompleteClass */
    override def setCanExport(): scala.Nothing = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/HighchartsVisualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Event = typings.nginstackEngine.libEventEventMod.^
  
  trait HighchartsVisualization extends StObject {
    
    /* private */ var canExport_ : Any
    
    /* private */ var chart_ : Any
    
    /* private */ var ds_ : Any
    
    var onGetOptions: Event
    
    def queryData(filterValues: Record[String, Any]): Unit
    
    def render(outputObj: Any): Unit
    
    def setCanExport(): scala.Nothing
  }
  object HighchartsVisualization {
    
    inline def apply(
      canExport_ : Any,
      chart_ : Any,
      ds_ : Any,
      onGetOptions: Event,
      queryData: Record[String, Any] => Unit,
      render: Any => Unit,
      setCanExport: () => scala.Nothing
    ): HighchartsVisualization = {
      val __obj = js.Dynamic.literal(canExport_ = canExport_.asInstanceOf[js.Any], chart_ = chart_.asInstanceOf[js.Any], ds_ = ds_.asInstanceOf[js.Any], onGetOptions = onGetOptions.asInstanceOf[js.Any], queryData = js.Any.fromFunction1(queryData), render = js.Any.fromFunction1(render), setCanExport = js.Any.fromFunction0(setCanExport))
      __obj.asInstanceOf[HighchartsVisualization]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighchartsVisualization] (val x: Self) extends AnyVal {
      
      inline def setCanExport_(value: Any): Self = StObject.set(x, "canExport_", value.asInstanceOf[js.Any])
      
      inline def setChart_(value: Any): Self = StObject.set(x, "chart_", value.asInstanceOf[js.Any])
      
      inline def setDs_(value: Any): Self = StObject.set(x, "ds_", value.asInstanceOf[js.Any])
      
      inline def setOnGetOptions(value: Event): Self = StObject.set(x, "onGetOptions", value.asInstanceOf[js.Any])
      
      inline def setQueryData(value: Record[String, Any] => Unit): Self = StObject.set(x, "queryData", js.Any.fromFunction1(value))
      
      inline def setRender(value: Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setSetCanExport(value: () => scala.Nothing): Self = StObject.set(x, "setCanExport", js.Any.fromFunction0(value))
    }
  }
}
