package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.monacoEditorDoubles.`1.1`
import typings.monacoEditor.monacoEditorInts.`1`
import typings.monacoEditor.monacoEditorStrings.`force-aligned`
import typings.monacoEditor.monacoEditorStrings.`force-expand-multiline`
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html {
  
  @JSImport("monaco-editor", "languages.html")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monaco-editor", "languages.html.handlebarDefaults")
  @js.native
  val handlebarDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.html.handlebarLanguageService")
  @js.native
  val handlebarLanguageService: LanguageServiceRegistration = js.native
  
  @JSImport("monaco-editor", "languages.html.htmlDefaults")
  @js.native
  val htmlDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.html.htmlLanguageService")
  @js.native
  val htmlLanguageService: LanguageServiceRegistration = js.native
  
  @JSImport("monaco-editor", "languages.html.razorDefaults")
  @js.native
  val razorDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.html.razorLanguageService")
  @js.native
  val razorLanguageService: LanguageServiceRegistration = js.native
  
  inline def registerHTMLLanguageService(languageId: String): LanguageServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any]).asInstanceOf[LanguageServiceRegistration]
  inline def registerHTMLLanguageService(languageId: String, options: Unit, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], modeConfiguration.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
  inline def registerHTMLLanguageService(languageId: String, options: Options): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
  inline def registerHTMLLanguageService(languageId: String, options: Options, modeConfiguration: ModeConfiguration): LanguageServiceRegistration = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHTMLLanguageService")(languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], modeConfiguration.asInstanceOf[js.Any])).asInstanceOf[LanguageServiceRegistration]
  
  type CompletionConfiguration = StringDictionary[Boolean]
  
  trait HTMLDataConfiguration extends StObject {
    
    /**
      * Provides a set of custom data providers.
      */
    val dataProviders: js.UndefOr[StringDictionary[HTMLDataV1]] = js.undefined
    
    /**
      * Defines whether the standard HTML tags and attributes are shown
      */
    val useDefaultDataProvider: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLDataConfiguration {
    
    inline def apply(): HTMLDataConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLDataConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLDataConfiguration] (val x: Self) extends AnyVal {
      
      inline def setDataProviders(value: StringDictionary[HTMLDataV1]): Self = StObject.set(x, "dataProviders", value.asInstanceOf[js.Any])
      
      inline def setDataProvidersUndefined: Self = StObject.set(x, "dataProviders", js.undefined)
      
      inline def setUseDefaultDataProvider(value: Boolean): Self = StObject.set(x, "useDefaultDataProvider", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultDataProviderUndefined: Self = StObject.set(x, "useDefaultDataProvider", js.undefined)
    }
  }
  
  trait HTMLDataV1 extends StObject {
    
    val globalAttributes: js.UndefOr[js.Array[IAttributeData]] = js.undefined
    
    val tags: js.UndefOr[js.Array[ITagData]] = js.undefined
    
    val valueSets: js.UndefOr[js.Array[IValueSet]] = js.undefined
    
    val version: `1` | `1.1`
  }
  object HTMLDataV1 {
    
    inline def apply(version: `1` | `1.1`): HTMLDataV1 = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLDataV1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLDataV1] (val x: Self) extends AnyVal {
      
      inline def setGlobalAttributes(value: js.Array[IAttributeData]): Self = StObject.set(x, "globalAttributes", value.asInstanceOf[js.Any])
      
      inline def setGlobalAttributesUndefined: Self = StObject.set(x, "globalAttributes", js.undefined)
      
      inline def setGlobalAttributesVarargs(value: IAttributeData*): Self = StObject.set(x, "globalAttributes", js.Array(value*))
      
      inline def setTags(value: js.Array[ITagData]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: ITagData*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setValueSets(value: js.Array[IValueSet]): Self = StObject.set(x, "valueSets", value.asInstanceOf[js.Any])
      
      inline def setValueSetsUndefined: Self = StObject.set(x, "valueSets", js.undefined)
      
      inline def setValueSetsVarargs(value: IValueSet*): Self = StObject.set(x, "valueSets", js.Array(value*))
      
      inline def setVersion(value: `1` | `1.1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTMLFormatConfiguration extends StObject {
    
    val contentUnformatted: String
    
    val endWithNewline: Boolean
    
    val extraLiners: String
    
    val indentHandlebars: Boolean
    
    val indentInnerHtml: Boolean
    
    val insertSpaces: Boolean
    
    val maxPreserveNewLines: js.UndefOr[Double] = js.undefined
    
    val preserveNewLines: Boolean
    
    val tabSize: Double
    
    val unformatted: String
    
    val wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`
    
    val wrapLineLength: Double
  }
  object HTMLFormatConfiguration {
    
    inline def apply(
      contentUnformatted: String,
      endWithNewline: Boolean,
      extraLiners: String,
      indentHandlebars: Boolean,
      indentInnerHtml: Boolean,
      insertSpaces: Boolean,
      preserveNewLines: Boolean,
      tabSize: Double,
      unformatted: String,
      wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`,
      wrapLineLength: Double
    ): HTMLFormatConfiguration = {
      val __obj = js.Dynamic.literal(contentUnformatted = contentUnformatted.asInstanceOf[js.Any], endWithNewline = endWithNewline.asInstanceOf[js.Any], extraLiners = extraLiners.asInstanceOf[js.Any], indentHandlebars = indentHandlebars.asInstanceOf[js.Any], indentInnerHtml = indentInnerHtml.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], preserveNewLines = preserveNewLines.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], unformatted = unformatted.asInstanceOf[js.Any], wrapAttributes = wrapAttributes.asInstanceOf[js.Any], wrapLineLength = wrapLineLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLFormatConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HTMLFormatConfiguration] (val x: Self) extends AnyVal {
      
      inline def setContentUnformatted(value: String): Self = StObject.set(x, "contentUnformatted", value.asInstanceOf[js.Any])
      
      inline def setEndWithNewline(value: Boolean): Self = StObject.set(x, "endWithNewline", value.asInstanceOf[js.Any])
      
      inline def setExtraLiners(value: String): Self = StObject.set(x, "extraLiners", value.asInstanceOf[js.Any])
      
      inline def setIndentHandlebars(value: Boolean): Self = StObject.set(x, "indentHandlebars", value.asInstanceOf[js.Any])
      
      inline def setIndentInnerHtml(value: Boolean): Self = StObject.set(x, "indentInnerHtml", value.asInstanceOf[js.Any])
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setMaxPreserveNewLines(value: Double): Self = StObject.set(x, "maxPreserveNewLines", value.asInstanceOf[js.Any])
      
      inline def setMaxPreserveNewLinesUndefined: Self = StObject.set(x, "maxPreserveNewLines", js.undefined)
      
      inline def setPreserveNewLines(value: Boolean): Self = StObject.set(x, "preserveNewLines", value.asInstanceOf[js.Any])
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setUnformatted(value: String): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      inline def setWrapAttributes(value: auto | force | `force-aligned` | `force-expand-multiline`): Self = StObject.set(x, "wrapAttributes", value.asInstanceOf[js.Any])
      
      inline def setWrapLineLength(value: Double): Self = StObject.set(x, "wrapLineLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAttributeData extends StObject {
    
    val description: js.UndefOr[String | MarkupContent] = js.undefined
    
    val name: String
    
    val references: js.UndefOr[js.Array[IReference]] = js.undefined
    
    val valueSet: js.UndefOr[String] = js.undefined
    
    val values: js.UndefOr[js.Array[IValueData]] = js.undefined
  }
  object IAttributeData {
    
    inline def apply(name: String): IAttributeData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAttributeData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAttributeData] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String | MarkupContent): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: js.Array[IReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: IReference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
      
      inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
      
      inline def setValues(value: js.Array[IValueData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: IValueData*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait IReference extends StObject {
    
    val name: String
    
    val url: String
  }
  object IReference {
    
    inline def apply(name: String, url: String): IReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IReference] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITagData extends StObject {
    
    val attributes: js.Array[IAttributeData]
    
    val description: js.UndefOr[String | MarkupContent] = js.undefined
    
    val name: String
    
    val references: js.UndefOr[js.Array[IReference]] = js.undefined
  }
  object ITagData {
    
    inline def apply(attributes: js.Array[IAttributeData], name: String): ITagData = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITagData] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[IAttributeData]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: IAttributeData*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setDescription(value: String | MarkupContent): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: js.Array[IReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: IReference*): Self = StObject.set(x, "references", js.Array(value*))
    }
  }
  
  trait IValueData extends StObject {
    
    val description: js.UndefOr[String | MarkupContent] = js.undefined
    
    val name: String
    
    val references: js.UndefOr[js.Array[IReference]] = js.undefined
  }
  object IValueData {
    
    inline def apply(name: String): IValueData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValueData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValueData] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String | MarkupContent): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: js.Array[IReference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: IReference*): Self = StObject.set(x, "references", js.Array(value*))
    }
  }
  
  trait IValueSet extends StObject {
    
    val name: String
    
    val values: js.Array[IValueData]
  }
  object IValueSet {
    
    inline def apply(name: String, values: js.Array[IValueData]): IValueSet = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValueSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValueSet] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[IValueData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: IValueData*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  @js.native
  trait LanguageServiceDefaults extends StObject {
    
    val languageId: String = js.native
    
    val modeConfiguration: ModeConfiguration = js.native
    
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any]): IDisposable = js.native
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, Any], thisArg: Any): IDisposable = js.native
    
    val options: Options = js.native
    
    def setModeConfiguration(modeConfiguration: ModeConfiguration): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
  }
  
  trait LanguageServiceRegistration
    extends StObject
       with IDisposable {
    
    val defaults: LanguageServiceDefaults
  }
  object LanguageServiceRegistration {
    
    inline def apply(defaults: LanguageServiceDefaults, dispose: () => Unit): LanguageServiceRegistration = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[LanguageServiceRegistration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LanguageServiceRegistration] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: LanguageServiceDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkupContent extends StObject {
    
    val kind: MarkupKind
    
    val value: String
  }
  object MarkupContent {
    
    inline def apply(kind: MarkupKind, value: String): MarkupContent = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkupContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkupContent] (val x: Self) extends AnyVal {
      
      inline def setKind(value: MarkupKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.monacoEditor.monacoEditorStrings.plaintext
    - typings.monacoEditor.monacoEditorStrings.markdown
  */
  trait MarkupKind extends StObject
  object MarkupKind {
    
    inline def markdown: typings.monacoEditor.monacoEditorStrings.markdown = "markdown".asInstanceOf[typings.monacoEditor.monacoEditorStrings.markdown]
    
    inline def plaintext: typings.monacoEditor.monacoEditorStrings.plaintext = "plaintext".asInstanceOf[typings.monacoEditor.monacoEditorStrings.plaintext]
  }
  
  trait ModeConfiguration extends StObject {
    
    /**
      * Defines whether the built-in color provider is enabled.
      */
    val colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in completionItemProvider is enabled.
      */
    val completionItems: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in diagnostic provider is enabled.
      */
    val diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in documentFormattingEdit provider is enabled.
      */
    val documentFormattingEdits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in references provider is enabled.
      */
    val documentHighlights: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in documentRangeFormattingEdit provider is enabled.
      */
    val documentRangeFormattingEdits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in documentSymbolProvider is enabled.
      */
    val documentSymbols: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in foldingRange provider is enabled.
      */
    val foldingRanges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in hoverProvider is enabled.
      */
    val hovers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in definitions provider is enabled.
      */
    val links: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in rename provider is enabled.
      */
    val rename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether the built-in selection range provider is enabled.
      */
    val selectionRanges: js.UndefOr[Boolean] = js.undefined
  }
  object ModeConfiguration {
    
    inline def apply(): ModeConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModeConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModeConfiguration] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setCompletionItems(value: Boolean): Self = StObject.set(x, "completionItems", value.asInstanceOf[js.Any])
      
      inline def setCompletionItemsUndefined: Self = StObject.set(x, "completionItems", js.undefined)
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDocumentFormattingEdits(value: Boolean): Self = StObject.set(x, "documentFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setDocumentFormattingEditsUndefined: Self = StObject.set(x, "documentFormattingEdits", js.undefined)
      
      inline def setDocumentHighlights(value: Boolean): Self = StObject.set(x, "documentHighlights", value.asInstanceOf[js.Any])
      
      inline def setDocumentHighlightsUndefined: Self = StObject.set(x, "documentHighlights", js.undefined)
      
      inline def setDocumentRangeFormattingEdits(value: Boolean): Self = StObject.set(x, "documentRangeFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "documentRangeFormattingEdits", js.undefined)
      
      inline def setDocumentSymbols(value: Boolean): Self = StObject.set(x, "documentSymbols", value.asInstanceOf[js.Any])
      
      inline def setDocumentSymbolsUndefined: Self = StObject.set(x, "documentSymbols", js.undefined)
      
      inline def setFoldingRanges(value: Boolean): Self = StObject.set(x, "foldingRanges", value.asInstanceOf[js.Any])
      
      inline def setFoldingRangesUndefined: Self = StObject.set(x, "foldingRanges", js.undefined)
      
      inline def setHovers(value: Boolean): Self = StObject.set(x, "hovers", value.asInstanceOf[js.Any])
      
      inline def setHoversUndefined: Self = StObject.set(x, "hovers", js.undefined)
      
      inline def setLinks(value: Boolean): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setSelectionRanges(value: Boolean): Self = StObject.set(x, "selectionRanges", value.asInstanceOf[js.Any])
      
      inline def setSelectionRangesUndefined: Self = StObject.set(x, "selectionRanges", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Configures the HTML data types known by the HTML langauge service.
      */
    val data: js.UndefOr[HTMLDataConfiguration] = js.undefined
    
    /**
      * Settings for the HTML formatter.
      */
    val format: js.UndefOr[HTMLFormatConfiguration] = js.undefined
    
    /**
      * Code completion settings.
      */
    val suggest: js.UndefOr[CompletionConfiguration] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setData(value: HTMLDataConfiguration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFormat(value: HTMLFormatConfiguration): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSuggest(value: CompletionConfiguration): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    }
  }
}
