package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorBooleans.`false`
import typings.monacoEditor.monacoEditorBooleans.`true`
import typings.monacoEditor.monacoEditorStrings.configuredByTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGlobalEditorOptions extends StObject {
  
  /**
    * If enabled, will automatically change to high contrast theme if the OS is using a high contrast theme.
    * Defaults to true.
    */
  var autoDetectHighContrast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether `tabSize` and `insertSpaces` will be automatically detected when a file is opened based on the file contents.
    * Defaults to true.
    */
  var detectIndentation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Insert spaces when pressing `Tab`.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to true.
    */
  var insertSpaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Special handling for large files to disable certain memory intensive features.
    * Defaults to true.
    */
  var largeFileOptimizations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Lines above this length will not be tokenized for performance reasons.
    * Defaults to 20000.
    */
  var maxTokenizationLineLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the semanticHighlighting is shown for the languages that support it.
    * true: semanticHighlighting is enabled for all themes
    * false: semanticHighlighting is disabled for all themes
    * 'configuredByTheme': semanticHighlighting is controlled by the current color theme's semanticHighlighting setting.
    * Defaults to 'byTheme'.
    */
  @JSName("semanticHighlighting.enabled")
  var semanticHighlightingDotenabled: js.UndefOr[`true` | `false` | configuredByTheme] = js.undefined
  
  /**
    * Keep peek editors open even when double clicking their content or when hitting `Escape`.
    * Defaults to false.
    */
  var stablePeek: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of spaces a tab is equal to.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to 4.
    */
  var tabSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black', 'hc-light'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`.
    * **NOTE**: The theme might be overwritten if the OS is in high contrast mode, unless `autoDetectHighContrast` is set to false.
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * Remove trailing auto inserted whitespace.
    * Defaults to true.
    */
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether completions should be computed based on words in the document.
    * Defaults to true.
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether word based completions should be included from opened documents of the same language or any language.
    */
  var wordBasedSuggestionsOnlySameLanguage: js.UndefOr[Boolean] = js.undefined
}
object IGlobalEditorOptions {
  
  inline def apply(): IGlobalEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalEditorOptions]
  }
  
  extension [Self <: IGlobalEditorOptions](x: Self) {
    
    inline def setAutoDetectHighContrast(value: Boolean): Self = StObject.set(x, "autoDetectHighContrast", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectHighContrastUndefined: Self = StObject.set(x, "autoDetectHighContrast", js.undefined)
    
    inline def setDetectIndentation(value: Boolean): Self = StObject.set(x, "detectIndentation", value.asInstanceOf[js.Any])
    
    inline def setDetectIndentationUndefined: Self = StObject.set(x, "detectIndentation", js.undefined)
    
    inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
    
    inline def setLargeFileOptimizations(value: Boolean): Self = StObject.set(x, "largeFileOptimizations", value.asInstanceOf[js.Any])
    
    inline def setLargeFileOptimizationsUndefined: Self = StObject.set(x, "largeFileOptimizations", js.undefined)
    
    inline def setMaxTokenizationLineLength(value: Double): Self = StObject.set(x, "maxTokenizationLineLength", value.asInstanceOf[js.Any])
    
    inline def setMaxTokenizationLineLengthUndefined: Self = StObject.set(x, "maxTokenizationLineLength", js.undefined)
    
    inline def setSemanticHighlightingDotenabled(value: `true` | `false` | configuredByTheme): Self = StObject.set(x, "semanticHighlighting.enabled", value.asInstanceOf[js.Any])
    
    inline def setSemanticHighlightingDotenabledUndefined: Self = StObject.set(x, "semanticHighlighting.enabled", js.undefined)
    
    inline def setStablePeek(value: Boolean): Self = StObject.set(x, "stablePeek", value.asInstanceOf[js.Any])
    
    inline def setStablePeekUndefined: Self = StObject.set(x, "stablePeek", js.undefined)
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTrimAutoWhitespace(value: Boolean): Self = StObject.set(x, "trimAutoWhitespace", value.asInstanceOf[js.Any])
    
    inline def setTrimAutoWhitespaceUndefined: Self = StObject.set(x, "trimAutoWhitespace", js.undefined)
    
    inline def setWordBasedSuggestions(value: Boolean): Self = StObject.set(x, "wordBasedSuggestions", value.asInstanceOf[js.Any])
    
    inline def setWordBasedSuggestionsOnlySameLanguage(value: Boolean): Self = StObject.set(x, "wordBasedSuggestionsOnlySameLanguage", value.asInstanceOf[js.Any])
    
    inline def setWordBasedSuggestionsOnlySameLanguageUndefined: Self = StObject.set(x, "wordBasedSuggestionsOnlySameLanguage", js.undefined)
    
    inline def setWordBasedSuggestionsUndefined: Self = StObject.set(x, "wordBasedSuggestions", js.undefined)
  }
}
