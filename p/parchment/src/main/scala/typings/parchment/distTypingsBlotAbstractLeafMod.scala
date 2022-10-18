package typings.parchment

import typings.parchment.distTypingsScopeMod.Scope
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotAbstractLeafMod {
  
  @JSImport("parchment/dist/typings/blot/abstract/leaf", JSImport.Default)
  @js.native
  open class default () extends LeafBlot
  object default {
    
    @JSImport("parchment/dist/typings/blot/abstract/leaf", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/leaf", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def value(_domNode: Node): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(_domNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parchment.distTypingsCollectionLinkedNodeMod.LinkedNode because Already inherited
  - typings.parchment.distTypingsBlotAbstractBlotMod.Blot because Already inherited
  - typings.parchment.distTypingsBlotAbstractBlotMod.Leaf because var conflicts: domNode, next, parent, prev, scroll, statics. Inlined index, position, value */ @js.native
  trait LeafBlot
    extends typings.parchment.distTypingsBlotAbstractShadowMod.default {
    
    def index(node: Node, offset: Double): Double = js.native
    
    def position(index: Double): js.Tuple2[Node, Double] = js.native
    def position(index: Double, _inclusive: Boolean): js.Tuple2[Node, Double] = js.native
    
    def value(): Any = js.native
  }
}
