package typings
package postcssDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shrink extends js.Object {
  /**
    * Append the original filename in resulting filename.
    */
  var append: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hashing method or custom function.
    */
  var method: js.UndefOr[
    postcssDashUrlLib.postcssDashUrlLibStrings.xxhash32 | postcssDashUrlLib.postcssDashUrlLibStrings.xxhash64 | postcssDashUrlLib.postcssDashUrlMod.urlNs.CustomHashFunction
  ] = js.undefined
  /**
    * Shrink hast to certain length.
    */
  var shrink: js.UndefOr[scala.Double] = js.undefined
}

