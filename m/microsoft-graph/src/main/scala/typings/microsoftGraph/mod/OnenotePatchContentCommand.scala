package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenotePatchContentCommand extends StObject {
  
  // The action to perform on the target element. The possible values are: replace, append, delete, insert, or prepend.
  var action: js.UndefOr[OnenotePatchActionType] = js.undefined
  
  /**
    * A string of well-formed HTML to add to the page, and any image or file binary data. If the content contains binary
    * data, the request must be sent using the multipart/form-data content type with a 'Commands' part.
    */
  var content: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The location to add the supplied content, relative to the target element. The possible values are: after (default) or
    * before.
    */
  var position: js.UndefOr[NullableOption[OnenotePatchInsertPosition]] = js.undefined
  
  /**
    * The element to update. Must be the #&amp;lt;data-id&amp;gt; or the generated &amp;lt;id&amp;gt; of the element, or the
    * body or title keyword.
    */
  var target: js.UndefOr[String] = js.undefined
}
object OnenotePatchContentCommand {
  
  inline def apply(): OnenotePatchContentCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePatchContentCommand]
  }
  
  extension [Self <: OnenotePatchContentCommand](x: Self) {
    
    inline def setAction(value: OnenotePatchActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setContent(value: NullableOption[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPosition(value: NullableOption[OnenotePatchInsertPosition]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
