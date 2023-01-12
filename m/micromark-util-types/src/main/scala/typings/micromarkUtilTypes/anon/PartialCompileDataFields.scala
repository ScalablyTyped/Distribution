package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<micromark-util-types.micromark-util-types._CompileDataFields> */
trait PartialCompileDataFields extends StObject {
  
  var characterReferenceType: js.UndefOr[String] = js.undefined
  
  var expectFirstItem: js.UndefOr[Boolean] = js.undefined
  
  var fencedCodeInside: js.UndefOr[Boolean] = js.undefined
  
  var fencesCount: js.UndefOr[Double] = js.undefined
  
  var flowCodeSeenData: js.UndefOr[Boolean] = js.undefined
  
  var headingRank: js.UndefOr[Double] = js.undefined
  
  var ignoreEncode: js.UndefOr[Boolean] = js.undefined
  
  var inCodeText: js.UndefOr[Boolean] = js.undefined
  
  var lastWasTag: js.UndefOr[Boolean] = js.undefined
  
  var slurpAllLineEndings: js.UndefOr[Boolean] = js.undefined
  
  var slurpOneLineEnding: js.UndefOr[Boolean] = js.undefined
  
  var tightStack: js.UndefOr[js.Array[Boolean]] = js.undefined
}
object PartialCompileDataFields {
  
  inline def apply(): PartialCompileDataFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompileDataFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCompileDataFields] (val x: Self) extends AnyVal {
    
    inline def setCharacterReferenceType(value: String): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
    
    inline def setCharacterReferenceTypeUndefined: Self = StObject.set(x, "characterReferenceType", js.undefined)
    
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
    
    inline def setTightStackUndefined: Self = StObject.set(x, "tightStack", js.undefined)
    
    inline def setTightStackVarargs(value: Boolean*): Self = StObject.set(x, "tightStack", js.Array(value*))
  }
}
