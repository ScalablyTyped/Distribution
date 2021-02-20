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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mdx-js/react", "MDXProvider")
  @js.native
  val MDXProvider: FC[MDXProviderProps] = js.native
  
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: Null,
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, ComponentState]] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement = js.native
  // Custom components
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): FunctionComponentElement[P] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): FunctionComponentElement[P] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactNode*): DOMElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): ReactSVGElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): ReactSVGElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: Null,
    children: ReactNode*
  ): ReactSVGElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactNode*): CElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: js.UndefOr[scala.Nothing], children: ReactNode*): CElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx[P /* <: js.Object */, T /* <: Component[P, ComponentState, _] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): DOMElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: ClassAttributes[T] with P,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_HTMLAttributesTT_HTMLElement_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: Null,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_P_Object_ReactElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement = js.native
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_input(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
    children: ReactNode*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_input(`type`: input, props: js.UndefOr[scala.Nothing], children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  /* was `typeof createElement` */
  @JSImport("@mdx-js/react", "mdx")
  @js.native
  def mdx_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  
  @JSImport("@mdx-js/react", "useMDXComponents")
  @js.native
  def useMDXComponents(): MDXProviderComponents = js.native
  @JSImport("@mdx-js/react", "useMDXComponents")
  @js.native
  def useMDXComponents(components: MDXProviderComponentsProp): MDXProviderComponents = js.native
  
  @JSImport("@mdx-js/react", "withMDXComponents")
  @js.native
  def withMDXComponents[GProps /* <: InjectedMDXProviderProps */](Component: ComponentType[GProps]): FC[Except[GProps, components]] = js.native
  
  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = Pick[ObjectType, Exclude[/* keyof ObjectType */ String, KeysType]]
  
  @js.native
  trait InjectedMDXProviderProps extends StObject {
    
    var components: MDXProviderComponents = js.native
  }
  object InjectedMDXProviderProps {
    
    @scala.inline
    def apply(components: MDXProviderComponents): InjectedMDXProviderProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedMDXProviderProps]
    }
    
    @scala.inline
    implicit class InjectedMDXProviderPropsMutableBuilder[Self <: InjectedMDXProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: MDXProviderComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDXProviderComponents extends /**
    * Any other components we wish to define
    */
  /* key */ StringDictionary[ReactNode] {
    
    /**
      * Link    <https://mdxjs.com> or [MDX](https://mdxjs.com)
      */
    var a: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Blockquote    >
      */
    var blockquote: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Code    `\code```
      */
    var code: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Delete    ~~strikethrough~~
      */
    var delete: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Emphasis    _emphasis_
      */
    var em: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 1    #
      */
    var h1: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 2    ##
      */
    var h2: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 3    ###
      */
    var h3: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 4    ####
      */
    var h4: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 5    #####
      */
    var h5: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Heading 6    ######
      */
    var h6: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Break    ---
      */
    var hr: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Image    ![alt](https://mdx-logo.now.sh)
      */
    var img: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * InlineCode    `inlineCode`
      */
    var inlineCode: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * List item
      */
    var li: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Ordered list    1.
      */
    var ol: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Paragraph
      */
    var p: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Pre
      */
    var pre: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Strong    **strong**
      */
    var strong: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Table
      */
    var table: js.UndefOr[ComponentType[_]] = js.native
    
    var td: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Table Cell
      */
    var th: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Thematic break    ***
      */
    var thematicBreak: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * Table row
      */
    var tr: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * List    -
      */
    var ul: js.UndefOr[ComponentType[_]] = js.native
    
    /**
      * The wrapper component can be used to set the layout for the MDX document.
      * It’s often used to set container width, borders, background colors, etc.
      * However, it’s also unique because it has access to the children passed to
      * it.
      *
      * This means that you can do powerful things with the MDX document
      * elements.
      */
    var wrapper: js.UndefOr[ComponentType[_]] = js.native
  }
  object MDXProviderComponents {
    
    @scala.inline
    def apply(): MDXProviderComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProviderComponents]
    }
    
    @scala.inline
    implicit class MDXProviderComponentsMutableBuilder[Self <: MDXProviderComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: ComponentType[_]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setBlockquote(value: ComponentType[_]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockquoteUndefined: Self = StObject.set(x, "blockquote", js.undefined)
      
      @scala.inline
      def setCode(value: ComponentType[_]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDelete(value: ComponentType[_]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setEm(value: ComponentType[_]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      @scala.inline
      def setH1(value: ComponentType[_]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: ComponentType[_]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: ComponentType[_]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: ComponentType[_]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: ComponentType[_]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: ComponentType[_]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHr(value: ComponentType[_]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setImg(value: ComponentType[_]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setInlineCode(value: ComponentType[_]): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
      
      @scala.inline
      def setLi(value: ComponentType[_]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiUndefined: Self = StObject.set(x, "li", js.undefined)
      
      @scala.inline
      def setOl(value: ComponentType[_]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      @scala.inline
      def setP(value: ComponentType[_]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPre(value: ComponentType[_]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setStrong(value: ComponentType[_]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setTable(value: ComponentType[_]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTd(value: ComponentType[_]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      @scala.inline
      def setTh(value: ComponentType[_]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      @scala.inline
      def setThematicBreak(value: ComponentType[_]): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThematicBreakUndefined: Self = StObject.set(x, "thematicBreak", js.undefined)
      
      @scala.inline
      def setTr(value: ComponentType[_]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setUl(value: ComponentType[_]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
      
      @scala.inline
      def setWrapper(value: ComponentType[_]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type MDXProviderComponentsProp = MDXProviderComponents | (js.Function1[/* components */ MDXProviderComponents, MDXProviderComponents])
  
  @js.native
  trait MDXProviderProps extends StObject {
    
    var children: ReactNode = js.native
    
    var components: MDXProviderComponentsProp = js.native
  }
  object MDXProviderProps {
    
    @scala.inline
    def apply(components: MDXProviderComponentsProp): MDXProviderProps = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDXProviderProps]
    }
    
    @scala.inline
    implicit class MDXProviderPropsMutableBuilder[Self <: MDXProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponents(value: MDXProviderComponentsProp): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsFunction1(value: /* components */ MDXProviderComponents => MDXProviderComponents): Self = StObject.set(x, "components", js.Any.fromFunction1(value))
    }
  }
}
