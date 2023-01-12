package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationLink extends StObject {
  
  /**
    * A range to select where this link originates from.
    */
  var originSelectionRange: js.UndefOr[IRange] = js.undefined
  
  /**
    * The full range this link points to.
    */
  var range: IRange
  
  /**
    * A range to select this link points to. Must be contained
    * in `LocationLink.range`.
    */
  var targetSelectionRange: js.UndefOr[IRange] = js.undefined
  
  /**
    * The target uri this link points to.
    */
  var uri: Uri
}
object LocationLink {
  
  inline def apply(range: IRange, uri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationLink] (val x: Self) extends AnyVal {
    
    inline def setOriginSelectionRange(value: IRange): Self = StObject.set(x, "originSelectionRange", value.asInstanceOf[js.Any])
    
    inline def setOriginSelectionRangeUndefined: Self = StObject.set(x, "originSelectionRange", js.undefined)
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionRange(value: IRange): Self = StObject.set(x, "targetSelectionRange", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionRangeUndefined: Self = StObject.set(x, "targetSelectionRange", js.undefined)
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
