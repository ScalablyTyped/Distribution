package typings.opentelemetryApi.mod

import typings.opentelemetryApi.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", "NoopSpan")
@js.native
class NoopSpan ()
  extends typings.opentelemetryApi.noopSpanMod.NoopSpan {
  def this(_spanContext: SpanContext) = this()
}
