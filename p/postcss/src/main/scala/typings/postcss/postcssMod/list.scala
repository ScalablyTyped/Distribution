package typings.postcss.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "list")
@js.native
object list extends js.Object {
  /**
    * Safely splits comma-separated values (such as those for transition-* and
    * background  properties).
    */
  def comma(str: String): js.Array[String] = js.native
  /**
    * Safely splits space-separated values (such as those for background,
    * border-radius and other shorthand properties).
    */
  def space(str: String): js.Array[String] = js.native
}

