package typings.parchment

import typings.parchment.registryMod.Scope
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/leaf", JSImport.Namespace)
@js.native
object leafMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typings.parchment.blotMod.Blot because Already inherited
  - typings.parchment.blotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll. Inlined index, position, value */ @js.native
  trait LeafBlot
    extends typings.parchment.shadowMod.default {
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

