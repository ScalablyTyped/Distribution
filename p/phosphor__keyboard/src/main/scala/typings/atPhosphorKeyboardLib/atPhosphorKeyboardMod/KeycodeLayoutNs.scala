package typings
package atPhosphorKeyboardLib.atPhosphorKeyboardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/keyboard", "KeycodeLayout")
@js.native
object KeycodeLayoutNs extends js.Object {
  /**
    * Extract the set of keys from a code map.
    *
    * @param code - The code map of interest.
    *
    * @returns A set of the keys in the code map.
    */
  def extractKeys(codes: CodeMap): KeySet = js.native
  /**
    * A type alias for a keycode map.
    */
  type CodeMap = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  /**
    * A type alias for a key set.
    */
  type KeySet = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}

