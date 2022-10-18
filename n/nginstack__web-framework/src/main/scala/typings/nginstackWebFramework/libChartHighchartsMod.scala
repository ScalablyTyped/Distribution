package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartHighchartsMod {
  
  @JSImport("@nginstack/web-framework/lib/chart/Highcharts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Axis")
  @js.native
  open class Axis () extends StObject
  object Axis {
    
    @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Axis")
    @js.native
    def apply(): Unit = js.native
  }
  
  @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Chart")
  @js.native
  open class Chart protected () extends StObject {
    def this(options: Any) = this()
    
    /* private */ var _createId: Any = js.native
    
    /* private */ var _renderDiv: Any = js.native
    
    /* private */ var config_ : Any = js.native
    
    def getClientLibraries(): js.Array[Any] = js.native
    
    /* private */ var hasHint_ : Any = js.native
    
    def html(): String = js.native
    
    var options: Any = js.native
  }
  object Chart {
    
    inline def apply(options: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Chart")
    @js.native
    val ^ : js.Any = js.native
    
    inline def dateFormat(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("dateFormat")().asInstanceOf[scala.Nothing]
    
    inline def numberFormat(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")().asInstanceOf[scala.Nothing]
  }
  
  @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Point")
  @js.native
  open class Point () extends StObject
  object Point {
    
    @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Point")
    @js.native
    def apply(): Unit = js.native
  }
  
  @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Series")
  @js.native
  open class Series () extends StObject
  object Series {
    
    @JSImport("@nginstack/web-framework/lib/chart/Highcharts", "Series")
    @js.native
    def apply(): Unit = js.native
  }
  
  inline def addOptionsFile(uri: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOptionsFile")(uri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
}
