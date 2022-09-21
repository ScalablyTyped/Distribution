package typings.monacoEditor.mod.languages.typescript

import typings.monacoEditor.anon.Content
import typings.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceDefaults extends StObject {
  
  /**
    * Add an additional source file to the language service. Use this
    * for typescript (definition) files that won't be loaded as editor
    * documents, like `jquery.d.ts`.
    *
    * @param content The file content
    * @param filePath An optional file path
    * @returns A disposable which will remove the file from the
    * language service upon disposal.
    */
  def addExtraLib(content: String): IDisposable = js.native
  def addExtraLib(content: String, filePath: String): IDisposable = js.native
  
  /**
    * Get current TypeScript compiler options for the language service.
    */
  def getCompilerOptions(): CompilerOptions = js.native
  
  /**
    * Get the current diagnostics options for the language service.
    */
  def getDiagnosticsOptions(): DiagnosticsOptions = js.native
  
  /**
    * Get the current setting for whether all existing models should be eagerly sync'd
    * to the worker on start or restart.
    */
  def getEagerModelSync(): Boolean = js.native
  
  /**
    * Get the current extra libs registered with the language service.
    */
  def getExtraLibs(): IExtraLibs = js.native
  
  val inlayHintsOptions: InlayHintsOptions = js.native
  
  /**
    * Event fired when compiler options or diagnostics options are changed.
    */
  def onDidChange(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidChange(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * Event fired when extra libraries registered with the language service change.
    */
  def onDidExtraLibsChange(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidExtraLibsChange(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  /**
    * Set TypeScript compiler options.
    */
  def setCompilerOptions(options: CompilerOptions): Unit = js.native
  
  /**
    * Configure whether syntactic and/or semantic validation should
    * be performed
    */
  def setDiagnosticsOptions(options: DiagnosticsOptions): Unit = js.native
  
  /**
    * Configure if all existing models should be eagerly sync'd
    * to the worker on start or restart.
    */
  def setEagerModelSync(value: Boolean): Unit = js.native
  
  /**
    * Remove all existing extra libs and set the additional source
    * files to the language service. Use this for typescript definition
    * files that won't be loaded as editor documents, like `jquery.d.ts`.
    * @param libs An array of entries to register.
    */
  def setExtraLibs(libs: js.Array[Content]): Unit = js.native
  
  /**
    * Configure inlay hints options.
    */
  def setInlayHintsOptions(options: InlayHintsOptions): Unit = js.native
  
  /**
    * No-op.
    */
  def setMaximumWorkerIdleTime(value: Double): Unit = js.native
  
  /**
    * Configure webworker options
    */
  def setWorkerOptions(options: WorkerOptions): Unit = js.native
  
  val workerOptions: WorkerOptions = js.native
}
