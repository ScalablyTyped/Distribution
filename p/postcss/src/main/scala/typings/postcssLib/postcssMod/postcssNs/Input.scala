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
    */
  var file: java.lang.String
  /**
    * The CSS source identifier. Contains input.file if the user set the
    * "from" option, or input.id if they did not.
    */
  var from: java.lang.String
  /**
    * The unique ID of the CSS source. Used if "from" option is not provided
    * (because PostCSS does not know the file path).
    */
  var id: java.lang.String
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
    file: java.lang.String,
    from: java.lang.String,
    id: java.lang.String,
    map: PreviousMap,
    origin: js.Function2[scala.Double, scala.Double, InputOrigin]
  ): Input = {
    val __obj = js.Dynamic.literal(file = file, from = from, id = id, map = map, origin = origin)
  
    __obj.asInstanceOf[Input]
  }
}

