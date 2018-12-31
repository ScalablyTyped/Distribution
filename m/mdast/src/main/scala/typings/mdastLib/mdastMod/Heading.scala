package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading extends Parent {
  @JSName("children")
  var children_Heading: js.Array[PhrasingContent]
  var depth: mdastLib.mdastLibNumbers.`1` | mdastLib.mdastLibNumbers.`2` | mdastLib.mdastLibNumbers.`3` | mdastLib.mdastLibNumbers.`4` | mdastLib.mdastLibNumbers.`5` | mdastLib.mdastLibNumbers.`6`
  @JSName("type")
  var type_Heading: mdastLib.mdastLibStrings.heading
}

