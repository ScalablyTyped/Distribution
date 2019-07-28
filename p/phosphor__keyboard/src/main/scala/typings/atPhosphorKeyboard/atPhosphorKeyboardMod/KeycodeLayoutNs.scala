package typings.atPhosphorKeyboard.atPhosphorKeyboardMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.atPhosphorKeyboard.atPhosphorKeyboardMod.KeycodeLayoutNs.CodeMap
import typings.atPhosphorKeyboard.atPhosphorKeyboardMod.KeycodeLayoutNs.KeySet
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
  type CodeMap = NumberDictionary[String]
  /**
    * A type alias for a key set.
    */
  type KeySet = StringDictionary[Boolean]
}

