package typings.parchment.distSrcBlotAbstractShadowMod

import typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode
import typings.parchment.distSrcRegistryMod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Default)
@js.native
class default protected () extends ShadowBlot {
  def this(domNode: Node) = this()
  /* CompleteClass */
  override var next: LinkedNode | Null = js.native
  /* CompleteClass */
  override var prev: LinkedNode | Null = js.native
  /* CompleteClass */
  override def length(): Double = js.native
}

/* static members */
@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Default)
@js.native
object default extends js.Object {
  var blotName: String = js.native
  var className: String = js.native
  var scope: Scope = js.native
  var tagName: String = js.native
  def create(value: js.Any): Node = js.native
}

