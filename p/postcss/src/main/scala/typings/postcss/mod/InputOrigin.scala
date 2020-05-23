package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOrigin extends js.Object {
  /**
    * Contains the source column of the error. PostCSS will use input
    * source map to detect the original error location. If you wrote a
    * Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you
    * need the position in the PostCSS input (e.g., to debug the
    * previous compiler), use error.input.column.
    */
  var column: js.UndefOr[Double] = js.undefined
  /**
    * If parser's from option is set, contains the absolute path to the
    * broken file. PostCSS will use the input source map to detect the
    * original error location. If you wrote a Sass file, then compiled it
    * to CSS and parsed it with PostCSS, PostCSS will show the original
    * position in the Sass file. If you need the position in the PostCSS
    * input (e.g., to debug the previous compiler), use error.input.file.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * Contains the source line of the error. PostCSS will use the input
    * source map to detect the original error location. If you wrote a Sass
    * file, then compiled it to CSS and parsed it with PostCSS, PostCSS
    * will show the original position in the Sass file. If you need the
    * position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.line.
    */
  var line: js.UndefOr[Double] = js.undefined
  /**
    * Contains the source code of the broken file. PostCSS will use the
    * input source map to detect the original error location. If you wrote
    * a Sass file, then compiled it to CSS and parsed it with PostCSS,
    * PostCSS will show the original position in the Sass file. If you need
    * the position in the PostCSS input (e.g., to debug the previous
    * compiler), use error.input.source.
    */
  var source: js.UndefOr[String] = js.undefined
}

object InputOrigin {
  @scala.inline
  def apply(
    column: js.UndefOr[Double] = js.undefined,
    file: String = null,
    line: js.UndefOr[Double] = js.undefined,
    source: String = null
  ): InputOrigin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOrigin]
  }
}

