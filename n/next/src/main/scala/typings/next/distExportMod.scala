package typings.next

import typings.next.distExportWorkerMod.ExportPageInput
import typings.next.distExportWorkerMod.ExportPageResults
import typings.next.distServerConfigSharedMod.NextConfigComplete
import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportMod {
  
  @JSImport("next/dist/export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dir: String, options: ExportOptions, span: Span): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(dir: String, options: ExportOptions, span: Span, configuration: NextConfigComplete): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], span.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ExportOptions extends StObject {
    
    var appPaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var buildExport: js.UndefOr[Boolean] = js.undefined
    
    var endWorker: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
    
    var exportPageWorker: js.UndefOr[
        js.Function1[
          /* hasParentSpanIdPathPathMapDistDirOutDirPagesDataDirRenderOptsBuildExportServerRuntimeConfigSubFoldersServerlessOptimizeFontsOptimizeCssDisableOptimizedLoadingHttpAgentOptionsServerComponents */ ExportPageInput, 
          js.Promise[ExportPageResults]
        ]
      ] = js.undefined
    
    var outdir: String
    
    var pages: js.UndefOr[js.Array[String]] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
    
    var threads: js.UndefOr[Double] = js.undefined
  }
  object ExportOptions {
    
    inline def apply(outdir: String): ExportOptions = {
      val __obj = js.Dynamic.literal(outdir = outdir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportOptions]
    }
    
    extension [Self <: ExportOptions](x: Self) {
      
      inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
      
      inline def setAppPathsUndefined: Self = StObject.set(x, "appPaths", js.undefined)
      
      inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
      
      inline def setBuildExport(value: Boolean): Self = StObject.set(x, "buildExport", value.asInstanceOf[js.Any])
      
      inline def setBuildExportUndefined: Self = StObject.set(x, "buildExport", js.undefined)
      
      inline def setEndWorker(value: () => js.Promise[Unit]): Self = StObject.set(x, "endWorker", js.Any.fromFunction0(value))
      
      inline def setEndWorkerUndefined: Self = StObject.set(x, "endWorker", js.undefined)
      
      inline def setExportPageWorker(
        value: /* hasParentSpanIdPathPathMapDistDirOutDirPagesDataDirRenderOptsBuildExportServerRuntimeConfigSubFoldersServerlessOptimizeFontsOptimizeCssDisableOptimizedLoadingHttpAgentOptionsServerComponents */ ExportPageInput => js.Promise[ExportPageResults]
      ): Self = StObject.set(x, "exportPageWorker", js.Any.fromFunction1(value))
      
      inline def setExportPageWorkerUndefined: Self = StObject.set(x, "exportPageWorker", js.undefined)
      
      inline def setOutdir(value: String): Self = StObject.set(x, "outdir", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
}
