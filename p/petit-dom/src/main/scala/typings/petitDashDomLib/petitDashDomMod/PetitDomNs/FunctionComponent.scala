package typings
package petitDashDomLib.petitDashDomMod.PetitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponent[P /* <: ComponentProps */] extends js.Object {
  var shouldUpdate: js.UndefOr[ShouldUpdate[P]] = js.native
  def apply(props: P, content: js.Array[Content]): FunctionComponentNode[P] = js.native
}

