package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorOptions
  extends StObject
     with IEditorOptions {
  
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
    * Modified editor should be have code lens enabled?
    * Defaults to false.
    */
  var modifiedCodeLens: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Original editor should be have code lens enabled?
    * Defaults to false.
    */
  var originalCodeLens: js.UndefOr[Boolean] = js.undefined
  
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
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.undefined
}
object IDiffEditorOptions {
  
  @scala.inline
  def apply(): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorOptions]
  }
  
  @scala.inline
  implicit class IDiffEditorOptionsMutableBuilder[Self <: IDiffEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableSplitViewResizing(value: Boolean): Self = StObject.set(x, "enableSplitViewResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSplitViewResizingUndefined: Self = StObject.set(x, "enableSplitViewResizing", js.undefined)
    
    @scala.inline
    def setIgnoreTrimWhitespace(value: Boolean): Self = StObject.set(x, "ignoreTrimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTrimWhitespaceUndefined: Self = StObject.set(x, "ignoreTrimWhitespace", js.undefined)
    
    @scala.inline
    def setMaxComputationTime(value: Double): Self = StObject.set(x, "maxComputationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComputationTimeUndefined: Self = StObject.set(x, "maxComputationTime", js.undefined)
    
    @scala.inline
    def setModifiedCodeLens(value: Boolean): Self = StObject.set(x, "modifiedCodeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCodeLensUndefined: Self = StObject.set(x, "modifiedCodeLens", js.undefined)
    
    @scala.inline
    def setOriginalCodeLens(value: Boolean): Self = StObject.set(x, "originalCodeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalCodeLensUndefined: Self = StObject.set(x, "originalCodeLens", js.undefined)
    
    @scala.inline
    def setOriginalEditable(value: Boolean): Self = StObject.set(x, "originalEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEditableUndefined: Self = StObject.set(x, "originalEditable", js.undefined)
    
    @scala.inline
    def setRenderIndicators(value: Boolean): Self = StObject.set(x, "renderIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderIndicatorsUndefined: Self = StObject.set(x, "renderIndicators", js.undefined)
    
    @scala.inline
    def setRenderSideBySide(value: Boolean): Self = StObject.set(x, "renderSideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSideBySideUndefined: Self = StObject.set(x, "renderSideBySide", js.undefined)
  }
}
