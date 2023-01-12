package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofSelection extends StObject {
  
  var attributes: StringDictionary[AttributeChoice]
  
  var predicates: StringDictionary[PredicateChoice]
}
object ProofSelection {
  
  inline def apply(attributes: StringDictionary[AttributeChoice], predicates: StringDictionary[PredicateChoice]): ProofSelection = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProofSelection] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[AttributeChoice]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPredicates(value: StringDictionary[PredicateChoice]): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
  }
}
