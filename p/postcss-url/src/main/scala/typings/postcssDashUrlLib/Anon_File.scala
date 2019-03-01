package typings
package postcssDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File extends js.Object {
  /**
    * File path.
    */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * PostCSS from option.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
    * PostCSS to option.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_File {
  @scala.inline
  def apply(file: java.lang.String = null, from: java.lang.String = null, to: java.lang.String = null): Anon_File = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_File]
  }
}

