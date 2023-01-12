package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRange extends StObject {
  
  /**
    * The one-based end line of the range to fold. The folded area ends with the line's last character.
    */
  var end: Double
  
  /**
    * Describes the {@link FoldingRangeKind Kind} of the folding range such as {@link FoldingRangeKind.Comment Comment} or
    * {@link FoldingRangeKind.Region Region}. The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * {@link FoldingRangeKind} for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.undefined
  
  /**
    * The one-based start line of the range to fold. The folded area starts after the line's last character.
    */
  var start: Double
}
object FoldingRange {
  
  inline def apply(end: Double, start: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldingRange] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setKind(value: FoldingRangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
