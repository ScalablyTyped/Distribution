package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofSelection extends js.Object {
  var attributes: StringDictionary[AttributeChoice]
  var predicates: StringDictionary[PredicateChoice]
}

object ProofSelection {
  @scala.inline
  def apply(attributes: StringDictionary[AttributeChoice], predicates: StringDictionary[PredicateChoice]): ProofSelection = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProofSelection]
  }
}

