package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSelection extends StObject {
  
  var attributes: StringDictionary[AttributeChoice] = js.native
  
  var predicates: StringDictionary[PredicateChoice] = js.native
}
object ProofSelection {
  
  @scala.inline
  def apply(attributes: StringDictionary[AttributeChoice], predicates: StringDictionary[PredicateChoice]): ProofSelection = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSelection]
  }
  
  @scala.inline
  implicit class ProofSelectionMutableBuilder[Self <: ProofSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[AttributeChoice]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicates(value: StringDictionary[PredicateChoice]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
  }
}
