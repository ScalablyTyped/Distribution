package typings.opentracing.libTestApiUnderscoreCompatibilityMod

import typings.opentracing.opentracingMod.Tracer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/test/api_compatibility", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * A function that takes a tracer factory, and tests wheter the initialized tracer
    * fulfills Opentracing's api requirements.
    *
    * @param {object} createTracer - a factory function that allocates a tracer.
    * @param {object} [options] - the options to be set on api compatibility
    */
  def apply(): Unit = js.native
  def apply(createTracer: js.Function0[Tracer]): Unit = js.native
  def apply(createTracer: js.Function0[Tracer], options: ApiCompatibilityChecksOptions): Unit = js.native
}

