package typings
package postcssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Generated extends js.Object {
  var generated: Anon_Column
  var name: js.UndefOr[java.lang.String] = js.undefined
  var original: Anon_Column
  /**
    * The original source file (relative to the sourceRoot).
    */
  var source: java.lang.String
}

object Anon_Generated {
  @scala.inline
  def apply(
    generated: Anon_Column,
    original: Anon_Column,
    source: java.lang.String,
    name: java.lang.String = null
  ): Anon_Generated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generated")(generated)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("source")(source)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Generated]
  }
}

