package typings.postcss.mod

import typings.postcss.postcssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the source CSS.
  */
@js.native
trait Input extends js.Object {
  /**
    * The absolute path to the CSS source file defined with the "from" option.
    * Either this property or the "id" property are always defined.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * The CSS source identifier. Contains input.file if the user set the
    * "from" option, or input.id if they did not.
    */
  var from: String = js.native
  /**
    * The flag to indicate whether or not the source code has Unicode BOM.
    */
  var hasBOM: Boolean = js.native
  /**
    * The unique ID of the CSS source. Used if "from" option is not provided
    * (because PostCSS does not know the file path). Either this property
    * or the "file" property are always defined.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Represents the input source map passed from a compilation step before
    * PostCSS (e.g., from the Sass compiler).
    */
  var map: PreviousMap = js.native
  /**
    * Reads the input source map.
    * @returns A symbol position in the input source (e.g., in a Sass file
    * that was compiled to CSS before being passed to PostCSS):
    */
  def origin(line: Double, column: Double): InputOrigin | `false` = js.native
}

object Input {
  @scala.inline
  def apply(from: String, hasBOM: Boolean, map: PreviousMap, origin: (Double, Double) => InputOrigin | `false`): Input = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], hasBOM = hasBOM.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], origin = js.Any.fromFunction2(origin))
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasBOM(value: Boolean): Self = this.set("hasBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: PreviousMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: (Double, Double) => InputOrigin | `false`): Self = this.set("origin", js.Any.fromFunction2(value))
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

