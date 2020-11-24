package typings.opentelemetryApi.metricMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends js.Object
@JSImport("@opentelemetry/api/build/src/metrics/Metric", "ValueType")
@js.native
object ValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait DOUBLE extends ValueType
  /* 1 */ @js.native
  object DOUBLE extends TopLevel[DOUBLE with Double]
  
  @js.native
  sealed trait INT extends ValueType
  /* 0 */ @js.native
  object INT extends TopLevel[INT with Double]
}
