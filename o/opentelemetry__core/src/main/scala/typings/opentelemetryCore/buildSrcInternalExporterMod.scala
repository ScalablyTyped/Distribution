package typings.opentelemetryCore

import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInternalExporterMod {
  
  @JSImport("@opentelemetry/core/build/src/internal/exporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `export`[T](exporter: Exporter[T], arg: T): js.Promise[ExportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("_export")(exporter.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExportResult]]
  
  trait Exporter[T] extends StObject {
    
    def `export`(arg: T, resultCallback: js.Function1[/* result */ ExportResult, Unit]): Unit
  }
  object Exporter {
    
    inline def apply[T](`export`: (T, js.Function1[/* result */ ExportResult, Unit]) => Unit): Exporter[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("export")(js.Any.fromFunction2(`export`))
      __obj.asInstanceOf[Exporter[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exporter[?], T] (val x: Self & Exporter[T]) extends AnyVal {
      
      inline def setExport(value: (T, js.Function1[/* result */ ExportResult, Unit]) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction2(value))
    }
  }
}
