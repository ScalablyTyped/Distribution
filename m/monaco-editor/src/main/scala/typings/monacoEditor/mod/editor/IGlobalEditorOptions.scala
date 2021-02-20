package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorBooleans.`false`
import typings.monacoEditor.monacoEditorBooleans.`true`
import typings.monacoEditor.monacoEditorStrings.configuredByTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlobalEditorOptions extends StObject {
  
  /**
    * Controls whether `tabSize` and `insertSpaces` will be automatically detected when a file is opened based on the file contents.
    * Defaults to true.
    */
  var detectIndentation: js.UndefOr[Boolean] = js.native
  
  /**
    * Insert spaces when pressing `Tab`.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to true.
    */
  var insertSpaces: js.UndefOr[Boolean] = js.native
  
  /**
    * Special handling for large files to disable certain memory intensive features.
    * Defaults to true.
    */
  var largeFileOptimizations: js.UndefOr[Boolean] = js.native
  
  /**
    * Lines above this length will not be tokenized for performance reasons.
    * Defaults to 20000.
    */
  var maxTokenizationLineLength: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether the semanticHighlighting is shown for the languages that support it.
    * true: semanticHighlighting is enabled for all themes
    * false: semanticHighlighting is disabled for all themes
    * 'configuredByTheme': semanticHighlighting is controlled by the current color theme's semanticHighlighting setting.
    * Defaults to 'byTheme'.
    */
  @JSName("semanticHighlighting.enabled")
  var semanticHighlightingDotenabled: js.UndefOr[`true` | `false` | configuredByTheme] = js.native
  
  /**
    * Keep peek editors open even when double clicking their content or when hitting `Escape`.
    * Defaults to false.
    */
  var stablePeek: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of spaces a tab is equal to.
    * This setting is overridden based on the file contents when `detectIndentation` is on.
    * Defaults to 4.
    */
  var tabSize: js.UndefOr[Double] = js.native
  
  /**
    * Theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Remove trailing auto inserted whitespace.
    * Defaults to true.
    */
  var trimAutoWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls whether completions should be computed based on words in the document.
    * Defaults to true.
    */
  var wordBasedSuggestions: js.UndefOr[Boolean] = js.native
}
object IGlobalEditorOptions {
  
  @scala.inline
  def apply(): IGlobalEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalEditorOptions]
  }
  
  @scala.inline
  implicit class IGlobalEditorOptionsMutableBuilder[Self <: IGlobalEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectIndentation(value: Boolean): Self = StObject.set(x, "detectIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectIndentationUndefined: Self = StObject.set(x, "detectIndentation", js.undefined)
    
    @scala.inline
    def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
    
    @scala.inline
    def setLargeFileOptimizations(value: Boolean): Self = StObject.set(x, "largeFileOptimizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeFileOptimizationsUndefined: Self = StObject.set(x, "largeFileOptimizations", js.undefined)
    
    @scala.inline
    def setMaxTokenizationLineLength(value: Double): Self = StObject.set(x, "maxTokenizationLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTokenizationLineLengthUndefined: Self = StObject.set(x, "maxTokenizationLineLength", js.undefined)
    
    @scala.inline
    def setSemanticHighlightingDotenabled(value: `true` | `false` | configuredByTheme): Self = StObject.set(x, "semanticHighlighting.enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticHighlightingDotenabledUndefined: Self = StObject.set(x, "semanticHighlighting.enabled", js.undefined)
    
    @scala.inline
    def setStablePeek(value: Boolean): Self = StObject.set(x, "stablePeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStablePeekUndefined: Self = StObject.set(x, "stablePeek", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTrimAutoWhitespace(value: Boolean): Self = StObject.set(x, "trimAutoWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimAutoWhitespaceUndefined: Self = StObject.set(x, "trimAutoWhitespace", js.undefined)
    
    @scala.inline
    def setWordBasedSuggestions(value: Boolean): Self = StObject.set(x, "wordBasedSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordBasedSuggestionsUndefined: Self = StObject.set(x, "wordBasedSuggestions", js.undefined)
  }
}
