package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionComponentNode[P /* <: ComponentProps */] extends VNode {
  @JSName("props")
  val props_FunctionComponentNode: P with IntrinsicProps = js.native
  @JSName("type")
  val type_Original: FunctionComponent[P] = js.native
  @JSName("type")
  def type_MFunctionComponentNode(props: P, content: js.Array[Content]): FunctionComponentNode[P] = js.native
}

