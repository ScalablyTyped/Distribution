package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridGridExportEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/GridExportEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridExportEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var exporter: GridExporter = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/GridExportEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Grid = typings.nginstackWebFramework.libGridGridMod.^
  
  trait GridExportEvent extends StObject {
    
    var exporter: GridExporter
  }
  object GridExportEvent {
    
    inline def apply(exporter: GridExporter): GridExportEvent = {
      val __obj = js.Dynamic.literal(exporter = exporter.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridExportEvent]
    }
    
    extension [Self <: GridExportEvent](x: Self) {
      
      inline def setExporter(value: GridExporter): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
    }
  }
  
  type GridExporter = typings.nginstackWebFramework.libGridGridExporterMod.^
  
  type GridField = typings.nginstackWebFramework.libGridGridFieldMod.^
}
