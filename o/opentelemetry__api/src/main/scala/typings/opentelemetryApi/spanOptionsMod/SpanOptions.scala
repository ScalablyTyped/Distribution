package typings.opentelemetryApi.spanOptionsMod

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.spanMod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpanOptions extends js.Object {
  
  /** A span's attributes */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The SpanKind of a span
    * @default {@link SpanKind.INTERNAL}
    */
  var kind: js.UndefOr[SpanKind] = js.native
  
  /** {@link Link}s span to other spans */
  var links: js.UndefOr[js.Array[Link]] = js.native
  
  /**
    * This option is NOT RECOMMENDED for normal use and should ONLY be used
    * if your application manages context manually without the global context
    * manager, or you are trying to override the parent extracted from context.
    *
    * A parent `SpanContext` (or `Span`, for convenience) that the newly-started
    * span will be the child of. This overrides the parent span extracted from
    * the currently active context.
    *
    * A null value here should prevent the SDK from extracting a parent from
    * the current context, forcing the new span to be a root span.
    */
  var parent: js.UndefOr[Span | SpanContext | Null] = js.native
  
  /** A manually specified start time for the created `Span` object. */
  var startTime: js.UndefOr[Double] = js.native
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
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setKind(value: SpanKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setParent(value: Span | SpanContext): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
