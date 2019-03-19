package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the source CSS.
  */
trait Input extends js.Object {
  /**
    * The absolute path to the CSS source file defined with the "from" option.
    * Either this property or the "id" property are always defined.
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The CSS source identifier. Contains input.file if the user set the
    * "from" option, or input.id if they did not.
    */
  var from: java.lang.String
  /**
    * The flag to indicate whether or not the source code has Unicode BOM.
    */
  var hasBOM: scala.Boolean
  /**
    * The unique ID of the CSS source. Used if "from" option is not provided
    * (because PostCSS does not know the file path). Either this property
    * or the "file" property are always defined.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents the input source map passed from a compilation step before
    * PostCSS (e.g., from the Sass compiler).
    */
  var map: PreviousMap
  /**
    * Reads the input source map.
    * @returns A symbol position in the input source (e.g., in a Sass file
    * that was compiled to CSS before being passed to PostCSS):
    */
  def origin(line: scala.Double, column: scala.Double): InputOrigin
}

object Input {
  @scala.inline
  def apply(
    from: java.lang.String,
    hasBOM: scala.Boolean,
    map: PreviousMap,
    origin: (scala.Double, scala.Double) => InputOrigin,
    file: java.lang.String = null,
    id: java.lang.String = null
  ): Input = {
    val __obj = js.Dynamic.literal(from = from, hasBOM = hasBOM, map = map, origin = js.Any.fromFunction2(origin))
    if (file != null) __obj.updateDynamic("file")(file)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Input]
  }
}

