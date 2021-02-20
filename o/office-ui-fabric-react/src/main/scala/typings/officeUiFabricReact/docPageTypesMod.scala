package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Root
import typings.officeUiFabricReact.anon.Section
import typings.officeUiFabricReact.anon.Theme
import typings.officeUiFabricReact.anon.Value
import typings.officeUiFabricReact.officeUiFabricReactStrings.defaultValue
import typings.officeUiFabricReact.officeUiFabricReactStrings.kind
import typings.officeUiFabricReact.officeUiFabricReactStrings.method
import typings.officeUiFabricReact.officeUiFabricReactStrings.property
import typings.officeUiFabricReact.officeUiFabricReactStrings.required
import typings.officeUiFabricReact.officeUiFabricReactStrings.typeTokens
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docPageTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.interface
    - typings.officeUiFabricReact.officeUiFabricReactStrings.enum
    - typings.officeUiFabricReact.officeUiFabricReactStrings.`class`
    - typings.officeUiFabricReact.officeUiFabricReactStrings.typeAlias
  */
  trait ApiKind extends StObject
  object ApiKind {
    
    @scala.inline
    def `class`: typings.officeUiFabricReact.officeUiFabricReactStrings.`class` = "class".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.`class`]
    
    @scala.inline
    def enum: typings.officeUiFabricReact.officeUiFabricReactStrings.enum = "enum".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.enum]
    
    @scala.inline
    def interface: typings.officeUiFabricReact.officeUiFabricReactStrings.interface = "interface".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.interface]
    
    @scala.inline
    def typeAlias: typings.officeUiFabricReact.officeUiFabricReactStrings.typeAlias = "typeAlias".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.typeAlias]
  }
  
  @js.native
  trait IDocPageProps extends StObject {
    
    /** Accessibility of the component as markdown string */
    var accessibility: js.UndefOr[String] = js.native
    
    /** If true, the component accepts all native props from elements specified in `nativePropsElement` */
    var allowNativeProps: js.UndefOr[Boolean] = js.native
    
    /** Override component name to use in the native props message */
    var allowNativePropsForComponentName: js.UndefOr[String] = js.native
    
    /** Best practice as markdown string */
    var bestPractices: js.UndefOr[String] = js.native
    
    /** Name of the component being documented */
    var componentName: String = js.native
    
    /** URL of the checked in component, should be somewhere on github.com */
    var componentUrl: String = js.native
    
    /** DON'Ts blurb as markdown string */
    var donts: js.UndefOr[String] = js.native
    
    /** DO's blurb as markdown string */
    var dos: js.UndefOr[String] = js.native
    
    /** Knobs that applies to all the examples */
    var exampleKnobs: js.UndefOr[Element] = js.native
    
    /** Array of examples, displayed in the order defined */
    var examples: js.UndefOr[js.Array[IExample]] = js.native
    
    /** Feedback section includes link to new issue page and displays Github issues */
    var isFeedbackVisible: js.UndefOr[Boolean] = js.native
    
    /** Passed through header visibility flag from the demo component page component */
    var isHeaderVisible: Boolean = js.native
    
    /**
      * JSON to populate the api reference tables
      */
    var jsonDocs: js.UndefOr[IPageJson] = js.native
    
    /**
      * Element(s) whose native props this component accepts (default div).
      * Only relevant if `allowNativeProps` is true.
      */
    var nativePropsElement: js.UndefOr[String | js.Array[String]] = js.native
    
    /** Pass through other sections for ComponentPage */
    var otherSections: js.UndefOr[js.Array[Section]] = js.native
    
    /** Overview of the component as markdown string */
    var overview: js.UndefOr[String] = js.native
    
    /** Properties table(s) as markdown string */
    var propertiesTablesSources: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Related link
      * @deprecated No longer shown on ComponentPage
      */
    var related: js.UndefOr[Element] = js.native
    
    /** Title that goes into the header */
    var title: String = js.native
  }
  object IDocPageProps {
    
    @scala.inline
    def apply(componentName: String, componentUrl: String, isHeaderVisible: Boolean, title: String): IDocPageProps = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentUrl = componentUrl.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocPageProps]
    }
    
    @scala.inline
    implicit class IDocPagePropsMutableBuilder[Self <: IDocPageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibility(value: String): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      @scala.inline
      def setAllowNativeProps(value: Boolean): Self = StObject.set(x, "allowNativeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNativePropsForComponentName(value: String): Self = StObject.set(x, "allowNativePropsForComponentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNativePropsForComponentNameUndefined: Self = StObject.set(x, "allowNativePropsForComponentName", js.undefined)
      
      @scala.inline
      def setAllowNativePropsUndefined: Self = StObject.set(x, "allowNativeProps", js.undefined)
      
      @scala.inline
      def setBestPractices(value: String): Self = StObject.set(x, "bestPractices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBestPracticesUndefined: Self = StObject.set(x, "bestPractices", js.undefined)
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUrl(value: String): Self = StObject.set(x, "componentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDonts(value: String): Self = StObject.set(x, "donts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontsUndefined: Self = StObject.set(x, "donts", js.undefined)
      
      @scala.inline
      def setDos(value: String): Self = StObject.set(x, "dos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDosUndefined: Self = StObject.set(x, "dos", js.undefined)
      
      @scala.inline
      def setExampleKnobs(value: Element): Self = StObject.set(x, "exampleKnobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExampleKnobsUndefined: Self = StObject.set(x, "exampleKnobs", js.undefined)
      
      @scala.inline
      def setExamples(value: js.Array[IExample]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
      
      @scala.inline
      def setExamplesVarargs(value: IExample*): Self = StObject.set(x, "examples", js.Array(value :_*))
      
      @scala.inline
      def setIsFeedbackVisible(value: Boolean): Self = StObject.set(x, "isFeedbackVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFeedbackVisibleUndefined: Self = StObject.set(x, "isFeedbackVisible", js.undefined)
      
      @scala.inline
      def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonDocs(value: IPageJson): Self = StObject.set(x, "jsonDocs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonDocsUndefined: Self = StObject.set(x, "jsonDocs", js.undefined)
      
      @scala.inline
      def setNativePropsElement(value: String | js.Array[String]): Self = StObject.set(x, "nativePropsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativePropsElementUndefined: Self = StObject.set(x, "nativePropsElement", js.undefined)
      
      @scala.inline
      def setNativePropsElementVarargs(value: String*): Self = StObject.set(x, "nativePropsElement", js.Array(value :_*))
      
      @scala.inline
      def setOtherSections(value: js.Array[Section]): Self = StObject.set(x, "otherSections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherSectionsUndefined: Self = StObject.set(x, "otherSections", js.undefined)
      
      @scala.inline
      def setOtherSectionsVarargs(value: Section*): Self = StObject.set(x, "otherSections", js.Array(value :_*))
      
      @scala.inline
      def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
      
      @scala.inline
      def setPropertiesTablesSources(value: js.Array[String]): Self = StObject.set(x, "propertiesTablesSources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesTablesSourcesUndefined: Self = StObject.set(x, "propertiesTablesSources", js.undefined)
      
      @scala.inline
      def setPropertiesTablesSourcesVarargs(value: String*): Self = StObject.set(x, "propertiesTablesSources", js.Array(value :_*))
      
      @scala.inline
      def setRelated(value: Element): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type IEnumTableRowJson = (Omit[ITableRowJson, kind | typeTokens | defaultValue | required]) with Value
  
  @js.native
  trait IExample extends StObject {
    
    /** Raw source code of the example */
    var code: String = js.native
    
    /** JS String for codepen of the example */
    var codepenJS: js.UndefOr[String] = js.native
    
    var isScrollable: js.UndefOr[Boolean] = js.native
    
    /** Custom styles. Partial version of `IExampleCardProps['styles']`. */
    var styles: js.UndefOr[IStyleFunctionOrObject[Theme, Root]] = js.native
    
    /** Title of the example */
    var title: String = js.native
    
    /** Working example of the example */
    var view: Element = js.native
  }
  object IExample {
    
    @scala.inline
    def apply(code: String, title: String, view: Element): IExample = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExample]
    }
    
    @scala.inline
    implicit class IExampleMutableBuilder[Self <: IExample] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodepenJS(value: String): Self = StObject.set(x, "codepenJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodepenJSUndefined: Self = StObject.set(x, "codepenJS", js.undefined)
      
      @scala.inline
      def setIsScrollable(value: Boolean): Self = StObject.set(x, "isScrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollableUndefined: Self = StObject.set(x, "isScrollable", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[Theme, Root]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: Theme => DeepPartial[Root]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Element): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILinkToken extends StObject {
    
    /** If this token is a link, name of the doc page it points to */
    var linkedPage: js.UndefOr[String] = js.native
    
    /** If this token is a link, group/category of the doc page it points to */
    var linkedPageGroup: js.UndefOr[String] = js.native
    
    var text: String = js.native
  }
  object ILinkToken {
    
    @scala.inline
    def apply(text: String): ILinkToken = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILinkToken]
    }
    
    @scala.inline
    implicit class ILinkTokenMutableBuilder[Self <: ILinkToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkedPage(value: String): Self = StObject.set(x, "linkedPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedPageGroup(value: String): Self = StObject.set(x, "linkedPageGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkedPageGroupUndefined: Self = StObject.set(x, "linkedPageGroup", js.undefined)
      
      @scala.inline
      def setLinkedPageUndefined: Self = StObject.set(x, "linkedPage", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPageJson extends StObject {
    
    var group: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var tables: js.Array[ITableJson] = js.native
  }
  object IPageJson {
    
    @scala.inline
    def apply(name: String, tables: js.Array[ITableJson]): IPageJson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPageJson]
    }
    
    @scala.inline
    implicit class IPageJsonMutableBuilder[Self <: IPageJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTables(value: js.Array[ITableJson]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablesVarargs(value: ITableJson*): Self = StObject.set(x, "tables", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITableJson extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.native
    
    var deprecatedMessage: js.UndefOr[String] = js.native
    
    var description: String = js.native
    
    /**
      * Any types the item extends, translated to an array of text elements and links to other types.
      * For classes and interfaces only.
      */
    var extendsTokens: js.Array[ILinkToken] = js.native
    
    var kind: ApiKind = js.native
    
    var members: js.UndefOr[js.Array[IEnumTableRowJson | ITableRowJson]] = js.native
    
    var name: String = js.native
  }
  object ITableJson {
    
    @scala.inline
    def apply(description: String, extendsTokens: js.Array[ILinkToken], kind: ApiKind, name: String): ITableJson = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], extendsTokens = extendsTokens.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableJson]
    }
    
    @scala.inline
    implicit class ITableJsonMutableBuilder[Self <: ITableJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedMessage(value: String): Self = StObject.set(x, "deprecatedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedMessageUndefined: Self = StObject.set(x, "deprecatedMessage", js.undefined)
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsTokens(value: js.Array[ILinkToken]): Self = StObject.set(x, "extendsTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsTokensVarargs(value: ILinkToken*): Self = StObject.set(x, "extendsTokens", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: ApiKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: js.Array[IEnumTableRowJson | ITableRowJson]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: (IEnumTableRowJson | ITableRowJson)*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITableRowJson extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var deprecated: Boolean = js.native
    
    var deprecatedMessage: js.UndefOr[String] = js.native
    
    var description: String = js.native
    
    var kind: js.UndefOr[method | property] = js.native
    
    var name: String = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    /**
      * The row's type translated to an array of text elements and links to other types.
      * For example, `Readonly<IFoo>` would translate to:
      * `[{ text: 'Readonly<' }, { text: 'IFoo', hyperlinkedPage: '(page name)', pageKind: '(kind)' }, { text: '>' }]`
      */
    var typeTokens: js.Array[ILinkToken] = js.native
  }
  object ITableRowJson {
    
    @scala.inline
    def apply(deprecated: Boolean, description: String, name: String, typeTokens: js.Array[ILinkToken]): ITableRowJson = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeTokens = typeTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITableRowJson]
    }
    
    @scala.inline
    implicit class ITableRowJsonMutableBuilder[Self <: ITableRowJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedMessage(value: String): Self = StObject.set(x, "deprecatedMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedMessageUndefined: Self = StObject.set(x, "deprecatedMessage", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: method | property): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTypeTokens(value: js.Array[ILinkToken]): Self = StObject.set(x, "typeTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeTokensVarargs(value: ILinkToken*): Self = StObject.set(x, "typeTokens", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.References
    - typings.officeUiFabricReact.officeUiFabricReactStrings.Components
  */
  trait PageKind extends StObject
  object PageKind {
    
    @scala.inline
    def Components: typings.officeUiFabricReact.officeUiFabricReactStrings.Components = "Components".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.Components]
    
    @scala.inline
    def References: typings.officeUiFabricReact.officeUiFabricReactStrings.References = "References".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.References]
  }
}
