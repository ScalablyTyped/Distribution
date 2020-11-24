package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSelection extends js.Object {
  
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
  implicit class ProofSelectionOps[Self <: ProofSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: StringDictionary[AttributeChoice]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicates(value: StringDictionary[PredicateChoice]): Self = this.set("predicates", value.asInstanceOf[js.Any])
  }
}
