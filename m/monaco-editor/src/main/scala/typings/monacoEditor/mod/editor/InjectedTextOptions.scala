package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectedTextOptions extends StObject {
  
  /**
    * This field allows to attach data to this injected text.
    * The data can be read when injected texts at a given position are queried.
    */
  val attachedData: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the text to inject. Must be a single line.
    */
  val content: String
  
  /**
    * Configures cursor stops around injected text.
    * Defaults to {@link InjectedTextCursorStops.Both}.
    */
  val cursorStops: js.UndefOr[InjectedTextCursorStops | Null] = js.undefined
  
  /**
    * If set, the decoration will be rendered inline with the text with this CSS class name.
    */
  val inlineClassName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If there is an `inlineClassName` which affects letter spacing.
    */
  val inlineClassNameAffectsLetterSpacing: js.UndefOr[Boolean] = js.undefined
}
object InjectedTextOptions {
  
  inline def apply(content: String): InjectedTextOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InjectedTextOptions] (val x: Self) extends AnyVal {
    
    inline def setAttachedData(value: Any): Self = StObject.set(x, "attachedData", value.asInstanceOf[js.Any])
    
    inline def setAttachedDataUndefined: Self = StObject.set(x, "attachedData", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCursorStops(value: InjectedTextCursorStops): Self = StObject.set(x, "cursorStops", value.asInstanceOf[js.Any])
    
    inline def setCursorStopsNull: Self = StObject.set(x, "cursorStops", null)
    
    inline def setCursorStopsUndefined: Self = StObject.set(x, "cursorStops", js.undefined)
    
    inline def setInlineClassName(value: String): Self = StObject.set(x, "inlineClassName", value.asInstanceOf[js.Any])
    
    inline def setInlineClassNameAffectsLetterSpacing(value: Boolean): Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", value.asInstanceOf[js.Any])
    
    inline def setInlineClassNameAffectsLetterSpacingUndefined: Self = StObject.set(x, "inlineClassNameAffectsLetterSpacing", js.undefined)
    
    inline def setInlineClassNameNull: Self = StObject.set(x, "inlineClassName", null)
    
    inline def setInlineClassNameUndefined: Self = StObject.set(x, "inlineClassName", js.undefined)
  }
}
