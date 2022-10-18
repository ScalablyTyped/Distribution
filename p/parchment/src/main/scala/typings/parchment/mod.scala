package typings.parchment

import typings.parchment.distTypingsAttributorAttributorMod.AttributorOptions
import typings.parchment.distTypingsAttributorAttributorMod.default
import typings.parchment.distTypingsBlotAbstractBlotMod.Blot
import typings.parchment.distTypingsBlotAbstractBlotMod.BlotConstructor
import typings.parchment.distTypingsBlotAbstractBlotMod.Root
import typings.parchment.distTypingsScopeMod.Scope
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Text
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parchment", "Attributor")
  @js.native
  open class Attributor protected () extends default {
    def this(attrName: String, keyName: String) = this()
    def this(attrName: String, keyName: String, options: AttributorOptions) = this()
  }
  /* static members */
  object Attributor {
    
    @JSImport("parchment", "Attributor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def keys(node: HTMLElement): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("parchment", "AttributorStore")
  @js.native
  open class AttributorStore protected ()
    extends typings.parchment.distTypingsAttributorStoreMod.default {
    def this(domNode: HTMLElement) = this()
  }
  
  @JSImport("parchment", "BlockBlot")
  @js.native
  open class BlockBlot protected ()
    extends typings.parchment.distTypingsBlotBlockMod.default {
    def this(scroll: Root, domNode: Node) = this()
  }
  object BlockBlot {
    
    @JSImport("parchment", "BlockBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "BlockBlot.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "BlockBlot.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    @JSImport("parchment", "BlockBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "BlockBlot.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parchment", "ClassAttributor")
  @js.native
  open class ClassAttributor ()
    extends typings.parchment.distTypingsAttributorClassMod.default
  object ClassAttributor {
    
    @JSImport("parchment", "ClassAttributor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def keys(node: HTMLElement): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("parchment", "ContainerBlot")
  @js.native
  open class ContainerBlot ()
    extends typings.parchment.distTypingsBlotAbstractContainerMod.default
  object ContainerBlot {
    
    @JSImport("parchment", "ContainerBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "ContainerBlot.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ContainerBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ContainerBlot.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parchment", "EmbedBlot")
  @js.native
  open class EmbedBlot ()
    extends typings.parchment.distTypingsBlotEmbedMod.default
  object EmbedBlot {
    
    @JSImport("parchment", "EmbedBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def formats(_domNode: HTMLElement, _scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(_domNode.asInstanceOf[js.Any], _scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("parchment", "InlineBlot")
  @js.native
  open class InlineBlot protected ()
    extends typings.parchment.distTypingsBlotInlineMod.default {
    def this(scroll: Root, domNode: Node) = this()
  }
  object InlineBlot {
    
    @JSImport("parchment", "InlineBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "InlineBlot.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "InlineBlot.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    @JSImport("parchment", "InlineBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "InlineBlot.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parchment", "LeafBlot")
  @js.native
  open class LeafBlot ()
    extends typings.parchment.distTypingsBlotAbstractLeafMod.default
  object LeafBlot {
    
    @JSImport("parchment", "LeafBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "LeafBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def value(_domNode: Node): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(_domNode.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("parchment", "ParentBlot")
  @js.native
  open class ParentBlot protected ()
    extends typings.parchment.distTypingsBlotAbstractParentMod.default {
    def this(scroll: Root, domNode: Node) = this()
  }
  object ParentBlot {
    
    @JSImport("parchment", "ParentBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "ParentBlot.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] | Null = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ParentBlot.defaultChild")
    @js.native
    def defaultChild: BlotConstructor | Null = js.native
    inline def defaultChild_=(x: BlotConstructor | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultChild")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ParentBlot.uiClass")
    @js.native
    def uiClass: String = js.native
    inline def uiClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uiClass")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parchment", "Registry")
  @js.native
  open class Registry ()
    extends typings.parchment.distTypingsRegistryMod.default
  /* static members */
  object Registry {
    
    @JSImport("parchment", "Registry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parchment", "Registry.blots")
    @js.native
    def blots: WeakMap[Node, Blot] = js.native
    inline def blots_=(x: WeakMap[Node, Blot]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blots")(x.asInstanceOf[js.Any])
    
    inline def find(): Blot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[Blot | Null]
    inline def find(node: Null, bubble: Boolean): Blot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Blot | Null]
    inline def find(node: Node): Blot | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any]).asInstanceOf[Blot | Null]
    inline def find(node: Node, bubble: Boolean): Blot | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(node.asInstanceOf[js.Any], bubble.asInstanceOf[js.Any])).asInstanceOf[Blot | Null]
  }
  
  @JSImport("parchment", "Scope")
  @js.native
  object Scope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.parchment.distTypingsScopeMod.Scope & Double] = js.native
    
    /* 15 */ val ANY: typings.parchment.distTypingsScopeMod.Scope.ANY & Double = js.native
    
    /* 13 */ val ATTRIBUTE: typings.parchment.distTypingsScopeMod.Scope.ATTRIBUTE & Double = js.native
    
    /* 11 */ val BLOCK: typings.parchment.distTypingsScopeMod.Scope.BLOCK & Double = js.native
    
    /* 9 */ val BLOCK_ATTRIBUTE: typings.parchment.distTypingsScopeMod.Scope.BLOCK_ATTRIBUTE & Double = js.native
    
    /* 10 */ val BLOCK_BLOT: typings.parchment.distTypingsScopeMod.Scope.BLOCK_BLOT & Double = js.native
    
    /* 14 */ val BLOT: typings.parchment.distTypingsScopeMod.Scope.BLOT & Double = js.native
    
    /* 7 */ val INLINE: typings.parchment.distTypingsScopeMod.Scope.INLINE & Double = js.native
    
    /* 5 */ val INLINE_ATTRIBUTE: typings.parchment.distTypingsScopeMod.Scope.INLINE_ATTRIBUTE & Double = js.native
    
    /* 6 */ val INLINE_BLOT: typings.parchment.distTypingsScopeMod.Scope.INLINE_BLOT & Double = js.native
    
    /* 12 */ val LEVEL: typings.parchment.distTypingsScopeMod.Scope.LEVEL & Double = js.native
    
    /* 3 */ val TYPE: typings.parchment.distTypingsScopeMod.Scope.TYPE & Double = js.native
  }
  
  @JSImport("parchment", "ScrollBlot")
  @js.native
  open class ScrollBlot protected ()
    extends typings.parchment.distTypingsBlotScrollMod.default {
    def this(registry: typings.parchment.distTypingsRegistryMod.default, node: HTMLDivElement) = this()
  }
  object ScrollBlot {
    
    @JSImport("parchment", "ScrollBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "ScrollBlot.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ScrollBlot.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* was `typeof BlockBlot` */
    @JSImport("parchment", "ScrollBlot.defaultChild")
    @js.native
    open class defaultChild protected ()
      extends typings.parchment.distTypingsBlotScrollMod.default.defaultChild {
      def this(scroll: Root, domNode: Node) = this()
    }
    /* was `typeof BlockBlot` */
    object defaultChild {
      
      @JSImport("parchment", "ScrollBlot.defaultChild")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("parchment", "ScrollBlot.defaultChild.allowedChildren")
      @js.native
      def allowedChildren: js.Array[BlotConstructor] = js.native
      inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment", "ScrollBlot.defaultChild.blotName")
      @js.native
      def blotName: String = js.native
      inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /* static member */
      @JSImport("parchment", "ScrollBlot.defaultChild.scope")
      @js.native
      def scope: Scope = js.native
      inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment", "ScrollBlot.defaultChild.tagName")
      @js.native
      def tagName: String = js.native
      inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("parchment", "ScrollBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment", "ScrollBlot.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parchment", "StyleAttributor")
  @js.native
  open class StyleAttributor ()
    extends typings.parchment.distTypingsAttributorStyleMod.default
  object StyleAttributor {
    
    @JSImport("parchment", "StyleAttributor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def keys(node: Element): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @JSImport("parchment", "TextBlot")
  @js.native
  open class TextBlot protected ()
    extends typings.parchment.distTypingsBlotTextMod.default {
    def this(scroll: Root, node: Node) = this()
  }
  object TextBlot {
    
    @JSImport("parchment", "TextBlot")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment", "TextBlot.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def create(value: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[Text]
    
    /* static member */
    @JSImport("parchment", "TextBlot.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def value(domNode: Text): String = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(domNode.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
