package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileDataFields extends StObject {
  
  var characterReferenceType: String
  
  var expectFirstItem: Boolean
  
  var fencedCodeInside: Boolean
  
  var fencesCount: Double
  
  var flowCodeSeenData: Boolean
  
  var headingRank: Double
  
  var ignoreEncode: Boolean
  
  var inCodeText: Boolean
  
  var lastWasTag: Boolean
  
  var slurpAllLineEndings: Boolean
  
  var slurpOneLineEnding: Boolean
  
  var tightStack: js.Array[Boolean]
}
object CompileDataFields {
  
  inline def apply(
    characterReferenceType: String,
    expectFirstItem: Boolean,
    fencedCodeInside: Boolean,
    fencesCount: Double,
    flowCodeSeenData: Boolean,
    headingRank: Double,
    ignoreEncode: Boolean,
    inCodeText: Boolean,
    lastWasTag: Boolean,
    slurpAllLineEndings: Boolean,
    slurpOneLineEnding: Boolean,
    tightStack: js.Array[Boolean]
  ): CompileDataFields = {
    val __obj = js.Dynamic.literal(characterReferenceType = characterReferenceType.asInstanceOf[js.Any], expectFirstItem = expectFirstItem.asInstanceOf[js.Any], fencedCodeInside = fencedCodeInside.asInstanceOf[js.Any], fencesCount = fencesCount.asInstanceOf[js.Any], flowCodeSeenData = flowCodeSeenData.asInstanceOf[js.Any], headingRank = headingRank.asInstanceOf[js.Any], ignoreEncode = ignoreEncode.asInstanceOf[js.Any], inCodeText = inCodeText.asInstanceOf[js.Any], lastWasTag = lastWasTag.asInstanceOf[js.Any], slurpAllLineEndings = slurpAllLineEndings.asInstanceOf[js.Any], slurpOneLineEnding = slurpOneLineEnding.asInstanceOf[js.Any], tightStack = tightStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileDataFields]
  }
  
  extension [Self <: CompileDataFields](x: Self) {
    
    inline def setCharacterReferenceType(value: String): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
    
    inline def setExpectFirstItem(value: Boolean): Self = StObject.set(x, "expectFirstItem", value.asInstanceOf[js.Any])
    
    inline def setFencedCodeInside(value: Boolean): Self = StObject.set(x, "fencedCodeInside", value.asInstanceOf[js.Any])
    
    inline def setFencesCount(value: Double): Self = StObject.set(x, "fencesCount", value.asInstanceOf[js.Any])
    
    inline def setFlowCodeSeenData(value: Boolean): Self = StObject.set(x, "flowCodeSeenData", value.asInstanceOf[js.Any])
    
    inline def setHeadingRank(value: Double): Self = StObject.set(x, "headingRank", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEncode(value: Boolean): Self = StObject.set(x, "ignoreEncode", value.asInstanceOf[js.Any])
    
    inline def setInCodeText(value: Boolean): Self = StObject.set(x, "inCodeText", value.asInstanceOf[js.Any])
    
    inline def setLastWasTag(value: Boolean): Self = StObject.set(x, "lastWasTag", value.asInstanceOf[js.Any])
    
    inline def setSlurpAllLineEndings(value: Boolean): Self = StObject.set(x, "slurpAllLineEndings", value.asInstanceOf[js.Any])
    
    inline def setSlurpOneLineEnding(value: Boolean): Self = StObject.set(x, "slurpOneLineEnding", value.asInstanceOf[js.Any])
    
    inline def setTightStack(value: js.Array[Boolean]): Self = StObject.set(x, "tightStack", value.asInstanceOf[js.Any])
    
    inline def setTightStackVarargs(value: Boolean*): Self = StObject.set(x, "tightStack", js.Array(value*))
  }
}
