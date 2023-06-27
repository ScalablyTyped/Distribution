package typings.micromarkUtilTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileData extends StObject {
  
  /**
    * Current character reference kind.
    */
  var characterReferenceType: js.UndefOr[String] = js.undefined
  
  /**
    * Collected definitions.
    */
  var definitions: Record[String, Definition]
  
  /**
    * Whether the first list item is expected, used by lists.
    */
  var expectFirstItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether we’re in fenced code, used by code (fenced).
    */
  var fencedCodeInside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of fences that were seen, used by code (fenced).
    */
  var fencesCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether we’ve seen code data, used by code (fenced, indented).
    */
  var flowCodeSeenData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current heading rank, used by heading (atx, setext).
    */
  var headingRank: js.UndefOr[Double] = js.undefined
  
  /**
    * Ignore encoding unsafe characters, used for example for URLs which are
    * first percent encoded, or by HTML when supporting it.
    */
  var ignoreEncode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether we’re in code data, used by code (text).
    */
  var inCodeText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the last emitted value was a tag.
    */
  var lastWasTag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to slurp all future line endings (has to be unset manually).
    */
  var slurpAllLineEndings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to slurp the next line ending (resets itself on the next line
    * ending).
    */
  var slurpOneLineEnding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Stack of containers, whether they’re tight or not.
    */
  var tightStack: js.Array[Boolean]
}
object CompileData {
  
  inline def apply(definitions: Record[String, Definition], tightStack: js.Array[Boolean]): CompileData = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], tightStack = tightStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileData] (val x: Self) extends AnyVal {
    
    inline def setCharacterReferenceType(value: String): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
    
    inline def setCharacterReferenceTypeUndefined: Self = StObject.set(x, "characterReferenceType", js.undefined)
    
    inline def setDefinitions(value: Record[String, Definition]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setExpectFirstItem(value: Boolean): Self = StObject.set(x, "expectFirstItem", value.asInstanceOf[js.Any])
    
    inline def setExpectFirstItemUndefined: Self = StObject.set(x, "expectFirstItem", js.undefined)
    
    inline def setFencedCodeInside(value: Boolean): Self = StObject.set(x, "fencedCodeInside", value.asInstanceOf[js.Any])
    
    inline def setFencedCodeInsideUndefined: Self = StObject.set(x, "fencedCodeInside", js.undefined)
    
    inline def setFencesCount(value: Double): Self = StObject.set(x, "fencesCount", value.asInstanceOf[js.Any])
    
    inline def setFencesCountUndefined: Self = StObject.set(x, "fencesCount", js.undefined)
    
    inline def setFlowCodeSeenData(value: Boolean): Self = StObject.set(x, "flowCodeSeenData", value.asInstanceOf[js.Any])
    
    inline def setFlowCodeSeenDataUndefined: Self = StObject.set(x, "flowCodeSeenData", js.undefined)
    
    inline def setHeadingRank(value: Double): Self = StObject.set(x, "headingRank", value.asInstanceOf[js.Any])
    
    inline def setHeadingRankUndefined: Self = StObject.set(x, "headingRank", js.undefined)
    
    inline def setIgnoreEncode(value: Boolean): Self = StObject.set(x, "ignoreEncode", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEncodeUndefined: Self = StObject.set(x, "ignoreEncode", js.undefined)
    
    inline def setInCodeText(value: Boolean): Self = StObject.set(x, "inCodeText", value.asInstanceOf[js.Any])
    
    inline def setInCodeTextUndefined: Self = StObject.set(x, "inCodeText", js.undefined)
    
    inline def setLastWasTag(value: Boolean): Self = StObject.set(x, "lastWasTag", value.asInstanceOf[js.Any])
    
    inline def setLastWasTagUndefined: Self = StObject.set(x, "lastWasTag", js.undefined)
    
    inline def setSlurpAllLineEndings(value: Boolean): Self = StObject.set(x, "slurpAllLineEndings", value.asInstanceOf[js.Any])
    
    inline def setSlurpAllLineEndingsUndefined: Self = StObject.set(x, "slurpAllLineEndings", js.undefined)
    
    inline def setSlurpOneLineEnding(value: Boolean): Self = StObject.set(x, "slurpOneLineEnding", value.asInstanceOf[js.Any])
    
    inline def setSlurpOneLineEndingUndefined: Self = StObject.set(x, "slurpOneLineEnding", js.undefined)
    
    inline def setTightStack(value: js.Array[Boolean]): Self = StObject.set(x, "tightStack", value.asInstanceOf[js.Any])
    
    inline def setTightStackVarargs(value: Boolean*): Self = StObject.set(x, "tightStack", js.Array(value*))
  }
}
