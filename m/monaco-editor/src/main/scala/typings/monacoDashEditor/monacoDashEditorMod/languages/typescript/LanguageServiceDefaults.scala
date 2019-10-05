package typings.monacoDashEditor.monacoDashEditorMod.languages.typescript

import typings.monacoDashEditor.monacoDashEditorMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageServiceDefaults extends js.Object {
  /**
    * Add an additional source file to the language service. Use this
    * for typescript (definition) files that won't be loaded as editor
    * document, like `jquery.d.ts`.
    *
    * @param content The file content
    * @param filePath An optional file path
    * @returns A disposable which will remove the file from the
    * language service upon disposal.
    */
  def addExtraLib(content: String): IDisposable = js.native
  def addExtraLib(content: String, filePath: String): IDisposable = js.native
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
    * Configure when the worker shuts down. By default that is 2mins.
    *
    * @param value The maximum idle time in milliseconds. Values less than one
    * mean never shut down.
    */
  def setMaximumWorkerIdleTime(value: Double): Unit = js.native
}

