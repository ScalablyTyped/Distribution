package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.advanced
import typings.monacoEditor.monacoEditorStrings.inherit
import typings.monacoEditor.monacoEditorStrings.legacy
import typings.monacoEditor.monacoEditorStrings.off
import typings.monacoEditor.monacoEditorStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorBaseOptions extends StObject {
  
  /**
    * Whether the diff editor aria label should be verbose.
    */
  var accessibilityVerbose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Diff Algorithm
    */
  var diffAlgorithm: js.UndefOr[legacy | advanced | IDocumentDiffProvider] = js.undefined
  
  /**
    * Should the diff editor enable code lens?
    * Defaults to false.
    */
  var diffCodeLens: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control the wrapping of the diff editor.
    */
  var diffWordWrap: js.UndefOr[off | on | inherit] = js.undefined
  
  /**
    * Allow the user to resize the diff editor split view.
    * Defaults to true.
    */
  var enableSplitViewResizing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Compute the diff by ignoring leading/trailing whitespace
    * Defaults to true.
    */
  var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Timeout in milliseconds after which diff computation is cancelled.
    * Defaults to 5000.
    */
  var maxComputationTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum supported file size in MB.
    * Defaults to 50.
    */
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Original model should be editable?
    * Defaults to false.
    */
  var originalEditable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render +/- indicators for added/deleted changes.
    * Defaults to true.
    */
  var renderIndicators: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows icons in the glyph margin to revert changes.
    * Default to true.
    */
  var renderMarginRevertIcon: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is the diff editor should render overview ruler
    * Defaults to true
    */
  var renderOverviewRuler: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default ratio when rendering side-by-side editors.
    * Must be a number between 0 and 1, min sizes apply.
    * Defaults to 0.5
    */
  var splitViewDefaultRatio: js.UndefOr[Double] = js.undefined
}
object IDiffEditorBaseOptions {
  
  inline def apply(): IDiffEditorBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorBaseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDiffEditorBaseOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityVerbose(value: Boolean): Self = StObject.set(x, "accessibilityVerbose", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityVerboseUndefined: Self = StObject.set(x, "accessibilityVerbose", js.undefined)
    
    inline def setDiffAlgorithm(value: legacy | advanced | IDocumentDiffProvider): Self = StObject.set(x, "diffAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDiffAlgorithmUndefined: Self = StObject.set(x, "diffAlgorithm", js.undefined)
    
    inline def setDiffCodeLens(value: Boolean): Self = StObject.set(x, "diffCodeLens", value.asInstanceOf[js.Any])
    
    inline def setDiffCodeLensUndefined: Self = StObject.set(x, "diffCodeLens", js.undefined)
    
    inline def setDiffWordWrap(value: off | on | inherit): Self = StObject.set(x, "diffWordWrap", value.asInstanceOf[js.Any])
    
    inline def setDiffWordWrapUndefined: Self = StObject.set(x, "diffWordWrap", js.undefined)
    
    inline def setEnableSplitViewResizing(value: Boolean): Self = StObject.set(x, "enableSplitViewResizing", value.asInstanceOf[js.Any])
    
    inline def setEnableSplitViewResizingUndefined: Self = StObject.set(x, "enableSplitViewResizing", js.undefined)
    
    inline def setIgnoreTrimWhitespace(value: Boolean): Self = StObject.set(x, "ignoreTrimWhitespace", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTrimWhitespaceUndefined: Self = StObject.set(x, "ignoreTrimWhitespace", js.undefined)
    
    inline def setMaxComputationTime(value: Double): Self = StObject.set(x, "maxComputationTime", value.asInstanceOf[js.Any])
    
    inline def setMaxComputationTimeUndefined: Self = StObject.set(x, "maxComputationTime", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setOriginalEditable(value: Boolean): Self = StObject.set(x, "originalEditable", value.asInstanceOf[js.Any])
    
    inline def setOriginalEditableUndefined: Self = StObject.set(x, "originalEditable", js.undefined)
    
    inline def setRenderIndicators(value: Boolean): Self = StObject.set(x, "renderIndicators", value.asInstanceOf[js.Any])
    
    inline def setRenderIndicatorsUndefined: Self = StObject.set(x, "renderIndicators", js.undefined)
    
    inline def setRenderMarginRevertIcon(value: Boolean): Self = StObject.set(x, "renderMarginRevertIcon", value.asInstanceOf[js.Any])
    
    inline def setRenderMarginRevertIconUndefined: Self = StObject.set(x, "renderMarginRevertIcon", js.undefined)
    
    inline def setRenderOverviewRuler(value: Boolean): Self = StObject.set(x, "renderOverviewRuler", value.asInstanceOf[js.Any])
    
    inline def setRenderOverviewRulerUndefined: Self = StObject.set(x, "renderOverviewRuler", js.undefined)
    
    inline def setRenderSideBySide(value: Boolean): Self = StObject.set(x, "renderSideBySide", value.asInstanceOf[js.Any])
    
    inline def setRenderSideBySideUndefined: Self = StObject.set(x, "renderSideBySide", js.undefined)
    
    inline def setSplitViewDefaultRatio(value: Double): Self = StObject.set(x, "splitViewDefaultRatio", value.asInstanceOf[js.Any])
    
    inline def setSplitViewDefaultRatioUndefined: Self = StObject.set(x, "splitViewDefaultRatio", js.undefined)
  }
}
