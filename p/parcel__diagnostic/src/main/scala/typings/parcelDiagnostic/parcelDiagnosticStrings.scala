package typings.parcelDiagnostic

import typings.parcelDiagnostic.mod.DiagnosticSeverity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parcelDiagnosticStrings {
  
  @js.native
  sealed trait error
    extends StObject
       with DiagnosticSeverity
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait info
    extends StObject
       with DiagnosticSeverity
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait key extends StObject
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait value extends StObject
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait warn
    extends StObject
       with DiagnosticSeverity
  inline def warn: warn = "warn".asInstanceOf[warn]
}
