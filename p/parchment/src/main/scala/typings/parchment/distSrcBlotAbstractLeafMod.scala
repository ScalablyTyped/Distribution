package typings.parchment

import typings.parchment.distSrcBlotAbstractLeafMod.LeafBlot
import typings.parchment.distSrcRegistryMod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/leaf", JSImport.Namespace)
@js.native
object distSrcBlotAbstractLeafMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.parchment.distSrcCollectionLinkedDashNodeMod.LinkedNode because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Blot because Already inherited
  - typings.parchment.distSrcBlotAbstractBlotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll. Inlined index, position, value */ @js.native
  trait LeafBlot
    extends typings.parchment.distSrcBlotAbstractShadowMod.default {
    def index(node: Node, offset: Double): Double = js.native
    def position(index: Double): js.Tuple2[Node, Double] = js.native
    def position(index: Double, inclusive: Boolean): js.Tuple2[Node, Double] = js.native
    def value(): js.Any = js.native
  }
  
  @js.native
  class default () extends LeafBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    var scope: Scope = js.native
    def value(domNode: Node): js.Any = js.native
  }
  
}

