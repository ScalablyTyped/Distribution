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
    * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
    * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.undefined
  
  /**
    * The one-based start line of the range to fold. The folded area starts after the line's last character.
    */
  var start: Double
}
object FoldingRange {
  
  @scala.inline
  def apply(end: Double, start: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  
  @scala.inline
  implicit class FoldingRangeMutableBuilder[Self <: FoldingRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: FoldingRangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
