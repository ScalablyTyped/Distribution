package typings.parchment

import org.scalablytyped.runtime.StringDictionary
import typings.parchment.distTypingsBlotAbstractBlotMod.Blot
import typings.parchment.distTypingsBlotAbstractBlotMod.BlotConstructor
import typings.parchment.distTypingsBlotAbstractBlotMod.Root
import typings.parchment.distTypingsScopeMod.Scope
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.MutationObserver
import typings.std.MutationRecord
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotScrollMod {
  
  @JSImport("parchment/dist/typings/blot/scroll", JSImport.Default)
  @js.native
  open class default protected () extends ScrollBlot {
    def this(registry: typings.parchment.distTypingsRegistryMod.default, node: HTMLDivElement) = this()
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/scroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* was `typeof BlockBlot` */
    @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild")
    @js.native
    open class defaultChild protected ()
      extends typings.parchment.distTypingsBlotBlockMod.default {
      def this(scroll: Root, domNode: Node) = this()
    }
    /* was `typeof BlockBlot` */
    object defaultChild {
      
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.allowedChildren")
      @js.native
      def allowedChildren: js.Array[BlotConstructor] = js.native
      inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.blotName")
      @js.native
      def blotName: String = js.native
      inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.scope")
      @js.native
      def scope: Scope = js.native
      inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.tagName")
      @js.native
      def tagName: String = js.native
      inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parchment.distTypingsCollectionLinkedNodeMod.LinkedNode because Already inherited
  - typings.parchment.distTypingsBlotAbstractBlotMod.Blot because Already inherited
  - typings.parchment.distTypingsBlotAbstractBlotMod.Parent because Already inherited
  - typings.parchment.distTypingsBlotAbstractBlotMod.Root because var conflicts: children, domNode, next, parent, prev, scroll, statics. Inlined create, create, create, create, create, create, find, find, find, find, query, query, query, query, query, query */ @js.native
  trait ScrollBlot
    extends typings.parchment.distTypingsBlotAbstractParentMod.default {
    
    def create(input: String): Blot = js.native
    def create(input: String, value: Any): Blot = js.native
    def create(input: Scope): Blot = js.native
    def create(input: Scope, value: Any): Blot = js.native
    def create(input: Node): Blot = js.native
    def create(input: Node, value: Any): Blot = js.native
    
    def find(): Blot | Null = js.native
    def find(node: Null, bubble: Boolean): Blot | Null = js.native
    def find(node: Node): Blot | Null = js.native
    def find(node: Node, bubble: Boolean): Blot | Null = js.native
    
    var observer: MutationObserver = js.native
    
    def query(query: String): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: String, scope: Scope): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope, scope: Scope): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node, scope: Scope): typings.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    
    def register(definitions: Any*): Any = js.native
    
    var registry: typings.parchment.distTypingsRegistryMod.default = js.native
    
    def update(): Unit = js.native
    def update(mutations: js.Array[MutationRecord]): Unit = js.native
    def update(mutations: Unit, context: StringDictionary[Any]): Unit = js.native
  }
  object ScrollBlot {
    
    /* was `typeof BlockBlot` */
    type defaultChild = typings.parchment.distTypingsBlotBlockMod.default
  }
}
