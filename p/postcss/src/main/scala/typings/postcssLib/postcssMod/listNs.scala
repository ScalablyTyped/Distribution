package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "list")
@js.native
object listNs extends js.Object {
  /**
    * Safely splits comma-separated values (such as those for transition-* and
    * background  properties).
    */
  def comma(str: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Safely splits space-separated values (such as those for background,
    * border-radius and other shorthand properties).
    */
  def space(str: java.lang.String): js.Array[java.lang.String] = js.native
}

