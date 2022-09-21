package typings.parchment

import typings.parchment.blotMod.Blot
import typings.parchment.blotMod.BlotConstructor
import typings.parchment.blotMod.Parent
import typings.parchment.blotMod.Root
import typings.parchment.linkedNodeMod.LinkedNode
import typings.parchment.scopeMod.Scope
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMod {
  
  @JSImport("parchment/dist/typings/blot/abstract/shadow", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ShadowBlot {
    def this(scroll: Root, domNode: Node) = this()
    
    /* CompleteClass */
    override def length(): Double = js.native
    
    /* CompleteClass */
    var next: LinkedNode | Null = js.native
    
    /* CompleteClass */
    var prev: LinkedNode | Null = js.native
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/abstract/shadow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def create(value: Any): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Node]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.requiredContainer")
    @js.native
    open class requiredContainer protected ()
      extends StObject
         with Blot {
      def this(scroll: Root, node: Node) = this()
      def this(scroll: Root, node: Node, value: Any) = this()
      
      /* CompleteClass */
      override def length(): Double = js.native
      
      /* CompleteClass */
      var next: LinkedNode | Null = js.native
      
      /* CompleteClass */
      var prev: LinkedNode | Null = js.native
    }
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.requiredContainer")
    @js.native
    def requiredContainer: BlotConstructor = js.native
    inline def requiredContainer_=(x: BlotConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requiredContainer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/abstract/shadow", "default.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ShadowBlot
    extends StObject
       with Blot {
    
    def replaceWith(name: String): Blot = js.native
    def replaceWith(name: Blot, value: Any): Blot = js.native
    
    @JSName("statics")
    def statics_MShadowBlot: Any = js.native
    
    def wrap(name: String): Parent = js.native
    def wrap(name: Parent, value: Any): Parent = js.native
  }
}
