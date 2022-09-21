package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.DiagnosticWithoutOrigin
import typings.parcelDiagnostic.mod.Diagnostifiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginLogger extends StObject {
  
  def error(input: js.Array[DiagnosticWithoutOrigin]): Unit = js.native
  def error(input: DiagnosticWithoutOrigin): Unit = js.native
  /** Logs a diagnostic at the verbose error log level. */
  def error(input: Diagnostifiable): Unit = js.native
  
  def info(diagnostic: js.Array[DiagnosticWithoutOrigin]): Unit = js.native
  /** Logs a diagnostic at the info log level. */
  def info(diagnostic: DiagnosticWithoutOrigin): Unit = js.native
  
  def log(diagnostic: js.Array[DiagnosticWithoutOrigin]): Unit = js.native
  /** Synonym for logger.info. */
  def log(diagnostic: DiagnosticWithoutOrigin): Unit = js.native
  
  def verbose(diagnostic: js.Array[DiagnosticWithoutOrigin]): Unit = js.native
  /** Logs a diagnostic at the verbose log level. */
  def verbose(diagnostic: DiagnosticWithoutOrigin): Unit = js.native
  
  def warn(diagnostic: js.Array[DiagnosticWithoutOrigin]): Unit = js.native
  /** Logs a diagnostic at the verbose warning log level. */
  def warn(diagnostic: DiagnosticWithoutOrigin): Unit = js.native
}
