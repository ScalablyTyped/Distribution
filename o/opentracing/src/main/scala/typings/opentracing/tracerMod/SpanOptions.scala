package typings.opentracing.tracerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanOptions extends js.Object {
  /**
    * a parent SpanContext (or Span, for convenience) that the newly-started
    * span will be the child of (per REFERENCE_CHILD_OF). If specified,
    * `references` must be unspecified.
    */
  var childOf: js.UndefOr[typings.opentracing.spanMod.default | typings.opentracing.spanContextMod.default] = js.native
  /**
    * an array of Reference instances, each pointing to a causal parent
    * SpanContext. If specified, `fields.childOf` must be unspecified.
    */
  var references: js.UndefOr[js.Array[typings.opentracing.referenceMod.default]] = js.native
  /**
    * a manually specified start time for the created Span object. The time
    * should be specified in milliseconds as Unix timestamp. Decimal value are
    * supported to represent time values with sub-millisecond accuracy.
    */
  var startTime: js.UndefOr[Double] = js.native
  /**
    * set of key-value pairs which will be set as tags on the newly created
    * Span. Ownership of the object is passed to the created span for
    * efficiency reasons (the caller should not modify this object after
    * calling startSpan).
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SpanOptions {
  @scala.inline
  def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  @scala.inline
  implicit class SpanOptionsOps[Self <: SpanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildOf(value: typings.opentracing.spanMod.default | typings.opentracing.spanContextMod.default): Self = this.set("childOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildOf: Self = this.set("childOf", js.undefined)
    @scala.inline
    def setReferencesVarargs(value: typings.opentracing.referenceMod.default*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[typings.opentracing.referenceMod.default]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[js.Any]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

