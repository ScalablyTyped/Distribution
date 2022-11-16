package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel
import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogger
import typings.opentelemetryApi.buildSrcDiagTypesMod.LoggerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(logger: DiagLogger): Boolean = js.native
    def apply(logger: DiagLogger, logLevel: DiagLogLevel): Boolean = js.native
    def apply(logger: DiagLogger, options: LoggerOptions): Boolean = js.native
  }
}
