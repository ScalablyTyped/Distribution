package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.hast.mod.Root
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-to-hast/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toHast(tree: MdastNode): js.UndefOr[HastNode | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHast")(tree.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HastNode | Null]]
  inline def toHast(tree: MdastNode, options: Options): js.UndefOr[HastNode | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("toHast")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HastNode | Null]]
  
  type Content = ElementContent
  
  type Data = (Record[String, Any]) & EmbeddedHastFields
  
  type Definition = typings.mdast.mod.Definition
  
  type Element = typings.hast.mod.Element
  
  trait EmbeddedHastFields extends StObject {
    
    /**
      * Defines the (hast) children of an element.
      */
    var hChildren: js.UndefOr[js.Array[ElementContent]] = js.undefined
    
    /**
      * Defines the tag name of an element.
      */
    var hName: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the properties of an element.
      */
    var hProperties: js.UndefOr[typings.hast.mod.Properties] = js.undefined
  }
  object EmbeddedHastFields {
    
    inline def apply(): EmbeddedHastFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbeddedHastFields]
    }
    
    extension [Self <: EmbeddedHastFields](x: Self) {
      
      inline def setHChildren(value: js.Array[ElementContent]): Self = StObject.set(x, "hChildren", value.asInstanceOf[js.Any])
      
      inline def setHChildrenUndefined: Self = StObject.set(x, "hChildren", js.undefined)
      
      inline def setHChildrenVarargs(value: ElementContent*): Self = StObject.set(x, "hChildren", js.Array(value*))
      
      inline def setHName(value: String): Self = StObject.set(x, "hName", value.asInstanceOf[js.Any])
      
      inline def setHNameUndefined: Self = StObject.set(x, "hName", js.undefined)
      
      inline def setHProperties(value: typings.hast.mod.Properties): Self = StObject.set(x, "hProperties", value.asInstanceOf[js.Any])
      
      inline def setHPropertiesUndefined: Self = StObject.set(x, "hProperties", js.undefined)
    }
  }
  
  type FootnoteDefinition = typings.mdast.mod.FootnoteDefinition
  
  @js.native
  trait H
    extends HFunctionProps
       with HFunctionNoProps
       with HFields {
    
    /* InferMemberOverrides */
    override def apply(
      arg1: /* node */ js.UndefOr[MdastNode | PositionLike | Null],
      arg2: /* tagName */ String,
      arg3: /* children */ js.UndefOr[js.Array[ElementContent] | Null]
    ): Element = js.native
    /* InferMemberOverrides */
    override def apply(
      arg1: /* node */ js.UndefOr[MdastNode | PositionLike | Null],
      arg2: /* tagName */ String,
      arg3: /* props */ Properties,
      arg4: /* children */ js.UndefOr[js.Array[ElementContent] | Null]
    ): Element = js.native
  }
  
  @js.native
  trait HFields extends StObject {
    
    def augment(left: Null, right: Content): Content = js.native
    def augment(left: Unit, right: Content): Content = js.native
    /**
      * Like `h` but lower-level and usable on non-elements.
      */
    def augment(left: NodeWithData, right: Content): Content = js.native
    def augment(left: PositionLike, right: Content): Content = js.native
    
    /**
      * Prefix to use to prevent DOM clobbering.
      */
    var clobberPrefix: String = js.native
    
    /**
      * Whether HTML is allowed.
      */
    var dangerous: Boolean = js.native
    
    /**
      * Definition cache.
      */
    def definition(identifier: String): Definition | Null = js.native
    
    /**
      * Label to use to go back to a footnote call from the footnote section.
      */
    var footnoteBackLabel: String = js.native
    
    /**
      * Footnote cache.
      */
    var footnoteById: Record[String, FootnoteDefinition] = js.native
    
    /**
      * Counts the same footnote was used.
      */
    var footnoteCounts: Record[String, Double] = js.native
    
    /**
      * Label to use to introduce the footnote section.
      */
    var footnoteLabel: String = js.native
    
    /**
      * Properties on the HTML tag used for the footnote label.
      */
    var footnoteLabelProperties: Properties = js.native
    
    /**
      * HTML used for the footnote label.
      */
    var footnoteLabelTagName: String = js.native
    
    /**
      * Order in which footnotes occur.
      */
    var footnoteOrder: js.Array[String] = js.native
    
    /**
      * Applied handlers.
      */
    var handlers: Handlers = js.native
    
    /**
      * List of node types to pass through untouched (except for their children).
      */
    var passThrough: js.Array[String] = js.native
    
    /**
      * Handler for any none not in `passThrough` or otherwise handled.
      */
    def unknownHandler(h: H, node: Any): js.UndefOr[Content | js.Array[Content] | Null] = js.native
    def unknownHandler(h: H, node: Any, parent: Parent): js.UndefOr[Content | js.Array[Content] | Null] = js.native
    /**
      * Handler for any none not in `passThrough` or otherwise handled.
      */
    @JSName("unknownHandler")
    var unknownHandler_Original: Handler = js.native
  }
  
  type HFunctionNoProps = js.Function3[
    /* node */ js.UndefOr[MdastNode | PositionLike | Null], 
    /* tagName */ String, 
    /* children */ js.UndefOr[js.Array[ElementContent] | Null], 
    Element
  ]
  
  type HFunctionProps = js.Function4[
    /* node */ js.UndefOr[MdastNode | PositionLike | Null], 
    /* tagName */ String, 
    /* props */ Properties, 
    /* children */ js.UndefOr[js.Array[ElementContent] | Null], 
    Element
  ]
  
  type Handler = js.Function3[
    /* h */ H, 
    /* node */ Any, 
    /* parent */ Parent | Null, 
    js.UndefOr[Content | js.Array[Content] | Null]
  ]
  
  type Handlers = Record[String, Handler]
  
  type HastNode = Root | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.Content>[number] */ js.Any)
  
  type MdastNode = typings.mdast.mod.Root | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<mdast.mdast.Content>[number] */ js.Any)
  
  type NodeWithData = MdastNode & typings.mdastUtilToHast.anon.Data
  
  trait Options extends StObject {
    
    /**
      * Whether to allow `html` nodes and inject them as `raw` HTML.
      */
    var allowDangerousHtml: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefix to use before the `id` attribute to prevent it from *clobbering*.
      * attributes.
      * DOM clobbering is this:
      *
      * ```html
      * <p id=x></p>
      * <script>alert(x)</script>
      * ```
      *
      * Elements by their ID are made available in browsers on the `window` object.
      * Using a prefix prevents this from being a problem.
      */
    var clobberPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Label to use from backreferences back to their footnote call.
      * Affects screen reader users.
      * Change it if you’re authoring in a different language.
      */
    var footnoteBackLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Label to use for the footnotes section.
      * Affects screen reader users.
      * Change it if you’re authoring in a different language.
      */
    var footnoteLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Properties to use on the footnote label.
      * A 'sr-only' class is added by default to hide this from sighted users.
      * Change it to make the label visible, or add classes for other purposes.
      */
    var footnoteLabelProperties: js.UndefOr[typings.hast.mod.Properties] = js.undefined
    
    /**
      * HTML tag to use for the footnote label.
      * Can be changed to match your document structure and play well with your choice of css.
      */
    var footnoteLabelTagName: js.UndefOr[String] = js.undefined
    
    /**
      * Object mapping mdast nodes to functions handling them
      */
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    /**
      * List of custom mdast node types to pass through (keep) in hast
      */
    var passThrough: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Handler for all unknown nodes.
      */
    var unknownHandler: js.UndefOr[Handler] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
      
      inline def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
      
      inline def setClobberPrefix(value: String): Self = StObject.set(x, "clobberPrefix", value.asInstanceOf[js.Any])
      
      inline def setClobberPrefixUndefined: Self = StObject.set(x, "clobberPrefix", js.undefined)
      
      inline def setFootnoteBackLabel(value: String): Self = StObject.set(x, "footnoteBackLabel", value.asInstanceOf[js.Any])
      
      inline def setFootnoteBackLabelUndefined: Self = StObject.set(x, "footnoteBackLabel", js.undefined)
      
      inline def setFootnoteLabel(value: String): Self = StObject.set(x, "footnoteLabel", value.asInstanceOf[js.Any])
      
      inline def setFootnoteLabelProperties(value: typings.hast.mod.Properties): Self = StObject.set(x, "footnoteLabelProperties", value.asInstanceOf[js.Any])
      
      inline def setFootnoteLabelPropertiesUndefined: Self = StObject.set(x, "footnoteLabelProperties", js.undefined)
      
      inline def setFootnoteLabelTagName(value: String): Self = StObject.set(x, "footnoteLabelTagName", value.asInstanceOf[js.Any])
      
      inline def setFootnoteLabelTagNameUndefined: Self = StObject.set(x, "footnoteLabelTagName", js.undefined)
      
      inline def setFootnoteLabelUndefined: Self = StObject.set(x, "footnoteLabel", js.undefined)
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setPassThrough(value: js.Array[String]): Self = StObject.set(x, "passThrough", value.asInstanceOf[js.Any])
      
      inline def setPassThroughUndefined: Self = StObject.set(x, "passThrough", js.undefined)
      
      inline def setPassThroughVarargs(value: String*): Self = StObject.set(x, "passThrough", js.Array(value*))
      
      inline def setUnknownHandler(
        value: (/* h */ H, /* node */ Any, /* parent */ Parent | Null) => js.UndefOr[Content | js.Array[Content] | Null]
      ): Self = StObject.set(x, "unknownHandler", js.Any.fromFunction3(value))
      
      inline def setUnknownHandlerUndefined: Self = StObject.set(x, "unknownHandler", js.undefined)
    }
  }
  
  type Parent = typings.mdast.mod.Parent
  
  type PositionLike = typings.unistUtilPosition.mod.PositionLike
  
  type Properties = typings.hast.mod.Properties
}
