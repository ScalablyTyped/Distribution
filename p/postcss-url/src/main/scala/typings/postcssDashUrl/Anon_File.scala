package typings.postcssDashUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  /**
    * File path.
    */
  var file: js.UndefOr[String] = js.undefined
  /**
    * PostCSS from option.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * PostCSS to option.
    */
  var to: js.UndefOr[String] = js.undefined
}

object Anon_File {
  @scala.inline
  def apply(file: String = null, from: String = null, to: String = null): Anon_File = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_File]
  }
}

