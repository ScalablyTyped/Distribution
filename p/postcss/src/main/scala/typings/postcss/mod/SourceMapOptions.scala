package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var annotation: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Override "from" in map's sources.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * Indicates that the source map should be embedded in the output CSS as a
    * Base64-encoded comment. By default, it is true. But if all previous maps
    * are external, not inline, PostCSS will not embed the map even if you do
    * not set this option.
    *
    * If you have an inline source map, the result.map property will be empty,
    * as the source map will be contained within the text of result.css.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * Source map content from a previous processing step (e.g., Sass compilation).
    * PostCSS will try to read the previous source map automatically (based on comments
    * within the source CSS), but you can use this option to identify it manually.
    * If desired, you can omit the previous map with prev: false.
    */
  var prev: js.UndefOr[js.Any] = js.undefined
  /**
    * Indicates that PostCSS should set the origin content (e.g., Sass source)
    * of the source map. By default, it is true. But if all previous maps do not
    * contain sources content, PostCSS will also leave it out even if you do not set
    * this option.
    */
  var sourcesContent: js.UndefOr[Boolean] = js.undefined
}

object SourceMapOptions {
  @scala.inline
  def apply(
    annotation: String | Boolean = null,
    from: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    prev: js.Any = null,
    sourcesContent: js.UndefOr[Boolean] = js.undefined
  ): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcesContent)) __obj.updateDynamic("sourcesContent")(sourcesContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapOptions]
  }
}

