package typings.parchment

import org.scalablytyped.runtime.Instantiable0
import typings.parchment.blotMod.Blot
import typings.parchment.blotMod.BlotConstructor
import typings.parchment.blotMod.Parent
import typings.parchment.blotMod.Root
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentMod {
  
  @JSImport("parchment/dist/typings/blot/abstract/parent", JSImport.Default)
  @js.native
  open class default protected () extends ParentBlot {
    def this(scroll: Root, domNode: Node) = this()
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/abstract/parent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/parent", "default.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] | Null = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/parent", "default.defaultChild")
    @js.native
    def defaultChild: BlotConstructor | Null = js.native
    inline def defaultChild_=(x: BlotConstructor | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultChild")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/parent", "default.uiClass")
    @js.native
    def uiClass: String = js.native
    inline def uiClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uiClass")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typings.parchment.blotMod.Blot because Already inherited
  - typings.parchment.blotMod.Parent because var conflicts: domNode, next, parent, prev, scroll, statics. Inlined children, appendChild, descendant, descendant, descendants, descendants, insertBefore, insertBefore, moveChildren, moveChildren, path, path, removeChild, unwrap */ @js.native
  trait ParentBlot
    extends typings.parchment.shadowMod.default {
    
    def appendChild(other: Blot): Unit = js.native
    
    def attachUI(node: HTMLElement): Unit = js.native
    
    def build(): Unit = js.native
    
    var children: typings.parchment.linkedListMod.default[Blot] = js.native
    
    def descendant(criteria: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[Blot | Null, Double] = js.native
    def descendant(criteria: Instantiable0[Blot], index: Double): js.Tuple2[Blot | Null, Double] = js.native
    @JSName("descendant")
    def descendant_T[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[T, Double] = js.native
    @JSName("descendant")
    def descendant_T[T](`type`: Instantiable0[T], index: Double): js.Tuple2[T, Double] = js.native
    
    def descendants(criteria: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[Blot] = js.native
    def descendants(criteria: Instantiable0[Blot], index: Double, length: Double): js.Array[Blot] = js.native
    @JSName("descendants")
    def descendants_T[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[T] = js.native
    @JSName("descendants")
    def descendants_T[T](`type`: Instantiable0[T], index: Double, length: Double): js.Array[T] = js.native
    
    @JSName("domNode")
    var domNode_ParentBlot: HTMLElement = js.native
    
    def enforceAllowedChildren(): Unit = js.native
    
    def insertBefore(childBlot: Blot): Unit = js.native
    def insertBefore(childBlot: Blot, refBlot: Blot): Unit = js.native
    
    def moveChildren(targetParent: Parent): Unit = js.native
    def moveChildren(targetParent: Parent, refNode: Blot): Unit = js.native
    
    def path(index: Double): js.Array[js.Tuple2[Blot, Double]] = js.native
    def path(index: Double, inclusive: Boolean): js.Array[js.Tuple2[Blot, Double]] = js.native
    
    def removeChild(child: Blot): Unit = js.native
    
    def splitAfter(child: Blot): Parent = js.native
    
    var uiNode: HTMLElement | Null = js.native
    
    def unwrap(): Unit = js.native
  }
}
