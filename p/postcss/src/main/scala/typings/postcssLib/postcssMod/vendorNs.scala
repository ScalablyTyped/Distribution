package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", "vendor")
@js.native
object vendorNs extends js.Object {
  /**
           * @returns The vendor prefix extracted from the input string.
           */
  def prefix(prop: java.lang.String): java.lang.String = js.native
  /**
           * @returns The input string stripped of its vendor prefix.
           */
  def unprefixed(prop: java.lang.String): java.lang.String = js.native
}

