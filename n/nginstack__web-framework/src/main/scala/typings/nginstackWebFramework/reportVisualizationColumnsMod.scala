package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportVisualizationColumnsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumns", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ReportVisualizationColumns
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArray(arr: js.Array[typings.nginstackWebFramework.reportVisualizationColumnMod.^]): ReportVisualizationColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReportVisualizationColumns]
  
  @js.native
  trait ReportVisualizationColumns extends StObject {
    
    def add(column: typings.nginstackWebFramework.reportVisualizationColumnMod.^): Unit = js.native
    
    def find(f: js.Function1[/* arg0 */ typings.nginstackWebFramework.reportVisualizationColumnMod.^, Unit]): typings.nginstackWebFramework.reportVisualizationColumnMod.^ = js.native
    def find(
      f: js.Function1[/* arg0 */ typings.nginstackWebFramework.reportVisualizationColumnMod.^, Unit],
      opt_obj: Any
    ): typings.nginstackWebFramework.reportVisualizationColumnMod.^ = js.native
    
    def forEach(f: js.Function1[/* arg0 */ typings.nginstackWebFramework.reportVisualizationColumnMod.^, Unit]): Unit = js.native
    def forEach(
      f: js.Function1[/* arg0 */ typings.nginstackWebFramework.reportVisualizationColumnMod.^, Unit],
      opt_obj: Any
    ): Unit = js.native
    
    def getColumn(name: String): typings.nginstackWebFramework.reportVisualizationColumnMod.^ = js.native
    
    def getColumnOrder(column: String): Double = js.native
    def getColumnOrder(column: typings.nginstackWebFramework.reportVisualizationColumnMod.^): Double = js.native
    
    /* private */ var items_ : Any = js.native
    
    /* private */ var orderedNames_ : Any = js.native
    
    def toArray(): js.Array[typings.nginstackWebFramework.reportVisualizationColumnMod.^] = js.native
    
    def tryGetColumn(name: String): typings.nginstackWebFramework.reportVisualizationColumnMod.^ = js.native
  }
}
