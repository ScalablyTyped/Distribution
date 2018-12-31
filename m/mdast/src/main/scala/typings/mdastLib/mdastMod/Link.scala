package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link
  extends Parent
     with Resource {
  @JSName("children")
  var children_Link: js.Array[StaticPhrasingContent]
  @JSName("type")
  var type_Link: mdastLib.mdastLibStrings.link
}

