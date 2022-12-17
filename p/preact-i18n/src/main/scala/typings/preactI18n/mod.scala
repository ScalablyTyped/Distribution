package typings.preactI18n

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.preact.mod.Component
import typings.preact.mod.ComponentChild
import typings.preact.mod.Context
import typings.preact.mod.VNode
import typings.preact.srcJsxMod.JSXInternal.Element
import typings.preactI18n.anon.Definition
import typings.preactI18n.anon.Mark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("preact-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("preact-i18n", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Intl_ & Double] = js.native
    
    /* 1 */ val IntlContext: typings.preactI18n.mod.Intl_.IntlContext & Double = js.native
    
    /* 2 */ val IntlProvider: typings.preactI18n.mod.Intl_.IntlProvider & Double = js.native
    
    /* 5 */ val Localizer: typings.preactI18n.mod.Intl_.Localizer & Double = js.native
    
    /* 4 */ val MarkupText: typings.preactI18n.mod.Intl_.MarkupText & Double = js.native
    
    /* 3 */ val Text: typings.preactI18n.mod.Intl_.Text & Double = js.native
    
    /* 0 */ val intl: typings.preactI18n.mod.Intl_.intl & Double = js.native
    
    /* 8 */ val translate: typings.preactI18n.mod.Intl_.translate & Double = js.native
    
    /* 7 */ val useText: typings.preactI18n.mod.Intl_.useText & Double = js.native
    
    /* 6 */ val withText: typings.preactI18n.mod.Intl_.withText & Double = js.native
  }
  
  trait IntlContext extends StObject {
    
    var intl: Mark
  }
  object IntlContext {
    
    @JSImport("preact-i18n", "IntlContext")
    @js.native
    val ^ : Context[IntlContext] = js.native
    
    extension [Self <: IntlContext](x: Self) {
      
      inline def setIntl(value: Mark): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
    }
  }
  
  inline def IntlProvider(props: IntlProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IntlProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  sealed trait Intl_ extends StObject
  @JSImport("preact-i18n", "Intl")
  @js.native
  object Intl_ extends StObject {
    
    @js.native
    sealed trait IntlContext
      extends StObject
         with Intl_
    
    @js.native
    sealed trait IntlProvider
      extends StObject
         with Intl_
    
    @js.native
    sealed trait Localizer
      extends StObject
         with Intl_
    
    @js.native
    sealed trait MarkupText
      extends StObject
         with Intl_
    
    @js.native
    sealed trait Text
      extends StObject
         with Intl_
    
    @js.native
    sealed trait intl
      extends StObject
         with Intl_
    
    @js.native
    sealed trait translate
      extends StObject
         with Intl_
    
    @js.native
    sealed trait useText
      extends StObject
         with Intl_
    
    @js.native
    sealed trait withText
      extends StObject
         with Intl_
  }
  
  inline def Localizer(props: LocalizerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Localizer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MarkupText(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MarkupText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Text(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Text")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def intl(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
    ]
  ): VNode[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("intl")(Child.asInstanceOf[js.Any]).asInstanceOf[VNode[js.Object]]
  inline def intl(
    Child: Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for P */ Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for S */ Any
    ],
    options: Definition
  ): VNode[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("intl")(Child.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Object]]
  
  inline def translate(id: String, scope: String, dictionary: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(id: String, scope: String, dictionary: js.Object, fields: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(id: String, scope: String, dictionary: js.Object, fields: js.Object, plural: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(
    id: String,
    scope: String,
    dictionary: js.Object,
    fields: js.Object,
    plural: Double,
    fallback: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(
    id: String,
    scope: String,
    dictionary: js.Object,
    fields: js.Object,
    plural: Unit,
    fallback: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(id: String, scope: String, dictionary: js.Object, fields: Unit, plural: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(id: String, scope: String, dictionary: js.Object, fields: Unit, plural: Double, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def translate(id: String, scope: String, dictionary: js.Object, fields: Unit, plural: Unit, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(id.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useText(mapping: String): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useText")(mapping.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def useText(mapping: StringDictionary[String | Element]): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useText")(mapping.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def useText(mapping: Element): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useText")(mapping.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def withText[Props, Context](mapping: js.Object): js.Function1[
    /* Child */ ComponentChild, 
    Instantiable2[/* props */ js.UndefOr[Props], /* context */ js.UndefOr[Context], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withText")(mapping.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* Child */ ComponentChild, 
    Instantiable2[/* props */ js.UndefOr[Props], /* context */ js.UndefOr[Context], Any]
  ]]
  
  trait IntlProviderProps extends StObject {
    
    var children: Element | js.Array[Element]
    
    var definition: js.UndefOr[js.Object] = js.undefined
    
    var mark: js.UndefOr[Boolean] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object IntlProviderProps {
    
    inline def apply(children: Element | js.Array[Element]): IntlProviderProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlProviderProps]
    }
    
    extension [Self <: IntlProviderProps](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDefinition(value: js.Object): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
      
      inline def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait LocalizerProps extends StObject {
    
    var children: Element | js.Array[Element]
  }
  object LocalizerProps {
    
    inline def apply(children: Element | js.Array[Element]): LocalizerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizerProps]
    }
    
    extension [Self <: LocalizerProps](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait TextProps extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[js.Object] = js.undefined
    
    var id: String
    
    var plural: js.UndefOr[Double] = js.undefined
  }
  object TextProps {
    
    inline def apply(id: String): TextProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPlural(value: Double): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    }
  }
}
