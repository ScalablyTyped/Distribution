package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P /* <: ComponentProps */] extends js.Object {
  
  def apply(props: P, content: js.Array[Content]): FunctionComponentNode[P] = js.native
  
  var shouldUpdate: js.UndefOr[ShouldUpdate[P]] = js.native
}
