package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorConstructionOptions
  extends StObject
     with IDiffEditorOptions {
  
  /**
    * The initial editor dimension (to avoid measuring the container).
    */
  var dimension: js.UndefOr[IDimension] = js.undefined
  
  /**
    * Is the diff editor inside another editor
    * Defaults to false
    */
  var isInEmbeddedEditor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Aria label for modified editor.
    */
  var modifiedAriaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Aria label for original editor.
    */
  var originalAriaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Place overflow widgets inside an external DOM node.
    * Defaults to an internal DOM node.
    */
  var overflowWidgetsDomNode: js.UndefOr[HTMLElement] = js.undefined
}
object IDiffEditorConstructionOptions {
  
  inline def apply(): IDiffEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorConstructionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDiffEditorConstructionOptions] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: IDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setIsInEmbeddedEditor(value: Boolean): Self = StObject.set(x, "isInEmbeddedEditor", value.asInstanceOf[js.Any])
    
    inline def setIsInEmbeddedEditorUndefined: Self = StObject.set(x, "isInEmbeddedEditor", js.undefined)
    
    inline def setModifiedAriaLabel(value: String): Self = StObject.set(x, "modifiedAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setModifiedAriaLabelUndefined: Self = StObject.set(x, "modifiedAriaLabel", js.undefined)
    
    inline def setOriginalAriaLabel(value: String): Self = StObject.set(x, "originalAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setOriginalAriaLabelUndefined: Self = StObject.set(x, "originalAriaLabel", js.undefined)
    
    inline def setOverflowWidgetsDomNode(value: HTMLElement): Self = StObject.set(x, "overflowWidgetsDomNode", value.asInstanceOf[js.Any])
    
    inline def setOverflowWidgetsDomNodeUndefined: Self = StObject.set(x, "overflowWidgetsDomNode", js.undefined)
  }
}
