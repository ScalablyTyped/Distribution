package typings.powerAssertFormatter.mod

import typings.powerAssertFormatter.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.native
  
  var anonymous: js.UndefOr[String] = js.native
  
  var circular: js.UndefOr[String] = js.native
  
  var diff: js.UndefOr[js.Function] = js.native
  
  var lineDiffThreshold: js.UndefOr[Double] = js.native
  
  var lineSeparator: js.UndefOr[String] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var outputOffset: js.UndefOr[Double] = js.native
  
  var renderers: js.UndefOr[js.Array[_]] = js.native
  
  var stringify: js.UndefOr[js.Function] = js.native
  
  var widthOf: js.UndefOr[js.Function] = js.native
  
  var writerClass: js.UndefOr[Instantiable] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAmbiguousEastAsianCharWidth(value: Double): Self = this.set("ambiguousEastAsianCharWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmbiguousEastAsianCharWidth: Self = this.set("ambiguousEastAsianCharWidth", js.undefined)
    
    @scala.inline
    def setAnonymous(value: String): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    
    @scala.inline
    def setCircular(value: String): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setDiff(value: js.Function): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiff: Self = this.set("diff", js.undefined)
    
    @scala.inline
    def setLineDiffThreshold(value: Double): Self = this.set("lineDiffThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDiffThreshold: Self = this.set("lineDiffThreshold", js.undefined)
    
    @scala.inline
    def setLineSeparator(value: String): Self = this.set("lineSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSeparator: Self = this.set("lineSeparator", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setOutputOffset(value: Double): Self = this.set("outputOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputOffset: Self = this.set("outputOffset", js.undefined)
    
    @scala.inline
    def setRenderersVarargs(value: js.Any*): Self = this.set("renderers", js.Array(value :_*))
    
    @scala.inline
    def setRenderers(value: js.Array[_]): Self = this.set("renderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderers: Self = this.set("renderers", js.undefined)
    
    @scala.inline
    def setStringify(value: js.Function): Self = this.set("stringify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    
    @scala.inline
    def setWidthOf(value: js.Function): Self = this.set("widthOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthOf: Self = this.set("widthOf", js.undefined)
    
    @scala.inline
    def setWriterClass(value: Instantiable): Self = this.set("writerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriterClass: Self = this.set("writerClass", js.undefined)
  }
}
