package typings.parchment

import typings.parchment.distSrcBlotAbstractBlotMod.Blot
import typings.parchment.distSrcBlotAbstractBlotMod.Parent
import typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode
import typings.parchment.distSrcRegistryMod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/shadow", JSImport.Namespace)
@js.native
object distSrcBlotAbstractShadowMod extends js.Object {
  @js.native
  trait ShadowBlot extends Blot {
    val statics: js.Any = js.native
    def replaceWith(name: String): Blot = js.native
    def replaceWith(name: Blot, value: js.Any): Blot = js.native
    def wrap(name: String): Parent = js.native
    def wrap(name: Parent, value: js.Any): Parent = js.native
  }
  
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
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var className: String = js.native
    var scope: Scope = js.native
    var tagName: String = js.native
    def create(value: js.Any): Node = js.native
  }
  
}

