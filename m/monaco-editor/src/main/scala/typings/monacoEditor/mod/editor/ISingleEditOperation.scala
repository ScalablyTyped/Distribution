package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISingleEditOperation extends StObject {
  
  /**
    * This indicates that this operation has "insert" semantics.
    * i.e. forceMoveMarkers = true => if `range` is collapsed, all markers at the position will be moved.
    */
  var forceMoveMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The range to replace. This can be empty to emulate a simple insert.
    */
  var range: IRange
  
  /**
    * The text to replace with. This can be null to emulate a simple delete.
    */
  var text: String | Null
}
object ISingleEditOperation {
  
  inline def apply(range: IRange): ISingleEditOperation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = null)
    __obj.asInstanceOf[ISingleEditOperation]
  }
  
  extension [Self <: ISingleEditOperation](x: Self) {
    
    inline def setForceMoveMarkers(value: Boolean): Self = StObject.set(x, "forceMoveMarkers", value.asInstanceOf[js.Any])
    
    inline def setForceMoveMarkersUndefined: Self = StObject.set(x, "forceMoveMarkers", js.undefined)
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
  }
}
