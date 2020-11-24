package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapOptions extends js.Object {
  
  /**
    * Indicates that PostCSS should add annotation comments to the CSS. By default,
    * PostCSS will always add a comment with a path to the source map. PostCSS will
    * not add annotations to CSS files that do not contain any comments.
    *
    * By default, PostCSS presumes that you want to save the source map as
    * opts.to + '.map' and will use this path in the annotation comment. A different
    * path can be set by providing a string value for annotation.
    *
    * If you have set inline: true, annotation cannot be disabled.
    */
  var annotation: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Override "from" in map's sources.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the source map should be embedded in the output CSS as a
    * Base64-encoded comment. By default, it is true. But if all previous maps
    * are external, not inline, PostCSS will not embed the map even if you do
    * not set this option.
    *
    * If you have an inline source map, the result.map property will be empty,
    * as the source map will be contained within the text of result.css.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /**
    * Source map content from a previous processing step (e.g., Sass compilation).
    * PostCSS will try to read the previous source map automatically (based on comments
    * within the source CSS), but you can use this option to identify it manually.
    * If desired, you can omit the previous map with prev: false.
    */
  var prev: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates that PostCSS should set the origin content (e.g., Sass source)
    * of the source map. By default, it is true. But if all previous maps do not
    * contain sources content, PostCSS will also leave it out even if you do not set
    * this option.
    */
  var sourcesContent: js.UndefOr[Boolean] = js.native
}
object SourceMapOptions {
  
  @scala.inline
  def apply(): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOptions]
  }
  
  @scala.inline
  implicit class SourceMapOptionsOps[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: String | Boolean): Self = this.set("annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setPrev(value: js.Any): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setSourcesContent(value: Boolean): Self = this.set("sourcesContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesContent: Self = this.set("sourcesContent", js.undefined)
  }
}
