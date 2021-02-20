package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapOptions extends StObject {
  
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
  implicit class SourceMapOptionsMutableBuilder[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: String | Boolean): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setPrev(value: js.Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setSourcesContent(value: Boolean): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
  }
}
