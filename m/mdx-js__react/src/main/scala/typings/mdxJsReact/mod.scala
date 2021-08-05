package typings.mdxJsReact

import org.scalablytyped.runtime.StringDictionary
import typings.mdxJsReact.mdxJsReactStrings.components
import typings.mdxJsReact.mdxJsReactStrings.input
import typings.react.mod.Attributes
import typings.react.mod.CElement
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassType
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.FunctionComponentElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactSVGElement
import typings.react.mod.SVGAttributes
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Pick
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mdx-js/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mdx-js/react", "MDXProvider")
  @js.native
  val MDXProvider: FC[MDXProviderProps] = js.native
  
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Unit,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  // Custom components
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[FunctionComponentElement[P]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactSVGElement]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, js.Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[CElement[P, T]]
  
  /* was `typeof createElement` */
  inline def mdx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DOMElement[P, T]]
  
  /* was `typeof createElement` */
  inline def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] & P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  /* was `typeof createElement` */
  inline def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Unit,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  /* was `typeof createElement` */
  inline def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  /* was `typeof createElement` */
  inline def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  /* was `typeof createElement` */
  inline def mdx_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  /* was `typeof createElement` */
  inline def mdx_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  /* was `typeof createElement` */
  inline def mdx_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("mdx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  
  inline def useMDXComponents(): MDXProviderComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")().asInstanceOf[MDXProviderComponents]
  inline def useMDXComponents(components: MDXProviderComponentsProp): MDXProviderComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("useMDXComponents")(components.asInstanceOf[js.Any]).asInstanceOf[MDXProviderComponents]
  
  inline def withMDXComponents[GProps /* <: InjectedMDXProviderProps */](Component: ComponentType[GProps]): FC[Except[GProps, components]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMDXComponents")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[Except[GProps, components]]]
  
  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = Pick[ObjectType, Exclude[/* keyof ObjectType */ String, KeysType]]
  
  trait InjectedMDXProviderProps extends StObject {
    
    var components: MDXProviderComponents
  }
  object InjectedMDXProviderProps {
    
    inline def apply(components: MDXProviderComponents): InjectedMDXProviderProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedMDXProviderProps]
    }
    
    extension [Self <: InjectedMDXProviderProps](x: Self) {
      
      inline def setComponents(value: MDXProviderComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDXProviderComponents
    extends StObject
       with /**
    * Any other components we wish to define
    */
  /* key */ StringDictionary[ReactNode] {
    
    /**
      * Link    <https://mdxjs.com> or [MDX](https://mdxjs.com)
      */
    var a: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Blockquote    >
      */
    var blockquote: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Code    `\code```
      */
    var code: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Delete    ~~strikethrough~~
      */
    var delete: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Emphasis    _emphasis_
      */
    var em: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 1    #
      */
    var h1: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 2    ##
      */
    var h2: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 3    ###
      */
    var h3: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 4    ####
      */
    var h4: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 5    #####
      */
    var h5: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Heading 6    ######
      */
    var h6: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Break    ---
      */
    var hr: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Image    ![alt](https://mdx-logo.now.sh)
      */
    var img: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * InlineCode    `inlineCode`
      */
    var inlineCode: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * List item
      */
    var li: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Ordered list    1.
      */
    var ol: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Paragraph
      */
    var p: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Pre
      */
    var pre: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Strong    **strong**
      */
    var strong: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Table
      */
    var table: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    var td: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Table Cell
      */
    var th: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Thematic break    ***
      */
    var thematicBreak: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * Table row
      */
    var tr: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * List    -
      */
    var ul: js.UndefOr[ComponentType[js.Any]] = js.undefined
    
    /**
      * The wrapper component can be used to set the layout for the MDX document.
      * It’s often used to set container width, borders, background colors, etc.
      * However, it’s also unique because it has access to the children passed to
      * it.
      *
      * This means that you can do powerful things with the MDX document
      * elements.
      */
    var wrapper: js.UndefOr[ComponentType[js.Any]] = js.undefined
  }
  object MDXProviderComponents {
    
    inline def apply(): MDXProviderComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProviderComponents]
    }
    
    extension [Self <: MDXProviderComponents](x: Self) {
      
      inline def setA(value: ComponentType[js.Any]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setBlockquote(value: ComponentType[js.Any]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      inline def setCode(value: ComponentType[js.Any]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDelete(value: ComponentType[js.Any]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setEm(value: ComponentType[js.Any]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      inline def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      inline def setH1(value: ComponentType[js.Any]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setH2(value: ComponentType[js.Any]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      inline def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      inline def setH3(value: ComponentType[js.Any]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      inline def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      inline def setH4(value: ComponentType[js.Any]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      inline def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      inline def setH5(value: ComponentType[js.Any]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      inline def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      inline def setH6(value: ComponentType[js.Any]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      inline def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      inline def setHr(value: ComponentType[js.Any]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      inline def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      inline def setImg(value: ComponentType[js.Any]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setInlineCode(value: ComponentType[js.Any]): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
      
      inline def setLi(value: ComponentType[js.Any]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      inline def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
      
      inline def setOl(value: ComponentType[js.Any]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      inline def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      inline def setP(value: ComponentType[js.Any]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setPre(value: ComponentType[js.Any]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setStrong(value: ComponentType[js.Any]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setTable(value: ComponentType[js.Any]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setTd(value: ComponentType[js.Any]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      inline def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      inline def setTh(value: ComponentType[js.Any]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      inline def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      inline def setThematicBreak(value: ComponentType[js.Any]): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      inline def setThematicBreakUndefined: Self = StObject.set(x, "thematicBreak", js.undefined)
      
      inline def setTr(value: ComponentType[js.Any]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setUl(value: ComponentType[js.Any]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      inline def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
      
      inline def setWrapper(value: ComponentType[js.Any]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type MDXProviderComponentsProp = MDXProviderComponents | (js.Function1[/* components */ MDXProviderComponents, MDXProviderComponents])
  
  trait MDXProviderProps extends StObject {
    
    var children: ReactNode
    
    var components: MDXProviderComponentsProp
  }
  object MDXProviderProps {
    
    inline def apply(components: MDXProviderComponentsProp): MDXProviderProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDXProviderProps]
    }
    
    extension [Self <: MDXProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponents(value: MDXProviderComponentsProp): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsFunction1(value: /* components */ MDXProviderComponents => MDXProviderComponents): Self = StObject.set(x, "components", js.Any.fromFunction1(value))
    }
  }
}
