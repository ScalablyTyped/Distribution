package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import typings.monacoEditor.mod.IDisposable
import typings.monacoEditor.monacoEditorStrings.`force-aligned`
import typings.monacoEditor.monacoEditorStrings.`force-expand-multiline`
import typings.monacoEditor.monacoEditorStrings.auto
import typings.monacoEditor.monacoEditorStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object html {
  
  @JSImport("monaco-editor", "languages.html.handlebarDefaults")
  @js.native
  val handlebarDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.html.htmlDefaults")
  @js.native
  val htmlDefaults: LanguageServiceDefaults = js.native
  
  @JSImport("monaco-editor", "languages.html.razorDefaults")
  @js.native
  val razorDefaults: LanguageServiceDefaults = js.native
  
  type CompletionConfiguration = StringDictionary[Boolean]
  
  trait HTMLFormatConfiguration extends StObject {
    
    val contentUnformatted: String
    
    val endWithNewline: Boolean
    
    val extraLiners: String
    
    val indentHandlebars: Boolean
    
    val indentInnerHtml: Boolean
    
    val insertSpaces: Boolean
    
    val maxPreserveNewLines: Double
    
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
      maxPreserveNewLines: Double,
      preserveNewLines: Boolean,
      tabSize: Double,
      unformatted: String,
      wrapAttributes: auto | force | `force-aligned` | `force-expand-multiline`,
      wrapLineLength: Double
    ): HTMLFormatConfiguration = {
      val __obj = js.Dynamic.literal(contentUnformatted = contentUnformatted.asInstanceOf[js.Any], endWithNewline = endWithNewline.asInstanceOf[js.Any], extraLiners = extraLiners.asInstanceOf[js.Any], indentHandlebars = indentHandlebars.asInstanceOf[js.Any], indentInnerHtml = indentInnerHtml.asInstanceOf[js.Any], insertSpaces = insertSpaces.asInstanceOf[js.Any], maxPreserveNewLines = maxPreserveNewLines.asInstanceOf[js.Any], preserveNewLines = preserveNewLines.asInstanceOf[js.Any], tabSize = tabSize.asInstanceOf[js.Any], unformatted = unformatted.asInstanceOf[js.Any], wrapAttributes = wrapAttributes.asInstanceOf[js.Any], wrapLineLength = wrapLineLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLFormatConfiguration]
    }
    
    extension [Self <: HTMLFormatConfiguration](x: Self) {
      
      inline def setContentUnformatted(value: String): Self = StObject.set(x, "contentUnformatted", value.asInstanceOf[js.Any])
      
      inline def setEndWithNewline(value: Boolean): Self = StObject.set(x, "endWithNewline", value.asInstanceOf[js.Any])
      
      inline def setExtraLiners(value: String): Self = StObject.set(x, "extraLiners", value.asInstanceOf[js.Any])
      
      inline def setIndentHandlebars(value: Boolean): Self = StObject.set(x, "indentHandlebars", value.asInstanceOf[js.Any])
      
      inline def setIndentInnerHtml(value: Boolean): Self = StObject.set(x, "indentInnerHtml", value.asInstanceOf[js.Any])
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setMaxPreserveNewLines(value: Double): Self = StObject.set(x, "maxPreserveNewLines", value.asInstanceOf[js.Any])
      
      inline def setPreserveNewLines(value: Boolean): Self = StObject.set(x, "preserveNewLines", value.asInstanceOf[js.Any])
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setUnformatted(value: String): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      inline def setWrapAttributes(value: auto | force | `force-aligned` | `force-expand-multiline`): Self = StObject.set(x, "wrapAttributes", value.asInstanceOf[js.Any])
      
      inline def setWrapLineLength(value: Double): Self = StObject.set(x, "wrapLineLength", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LanguageServiceDefaults extends StObject {
    
    val languageId: String = js.native
    
    val modeConfiguration: ModeConfiguration = js.native
    
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, js.Any]): IDisposable = js.native
    def onDidChange(listener: js.Function1[/* e */ LanguageServiceDefaults, js.Any], thisArg: js.Any): IDisposable = js.native
    
    val options: Options = js.native
    
    def setOptions(options: Options): Unit = js.native
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
    
    extension [Self <: ModeConfiguration](x: Self) {
      
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
      * If set, comments are tolerated. If set to false, syntax errors will be emitted for comments.
      */
    val format: js.UndefOr[HTMLFormatConfiguration] = js.undefined
    
    /**
      * A list of known schemas and/or associations of schemas to file names.
      */
    val suggest: js.UndefOr[CompletionConfiguration] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormat(value: HTMLFormatConfiguration): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setSuggest(value: CompletionConfiguration): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    }
  }
}
