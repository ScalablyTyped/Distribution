package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Choices extends StObject {
  
  var attr1: js.Any = js.native
  
  var attributes: js.Any = js.native
  
  var pred1: js.Any = js.native
  
  var predicates: js.Any = js.native
}
object Choices {
  
  @scala.inline
  def apply(attr1: js.Any, attributes: js.Any, pred1: js.Any, predicates: js.Any): Choices = {
    val __obj = js.Dynamic.literal(attr1 = attr1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], pred1 = pred1.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  @scala.inline
  implicit class ChoicesMutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr1(value: js.Any): Self = StObject.set(x, "attr1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPred1(value: js.Any): Self = StObject.set(x, "pred1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicates(value: js.Any): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
  }
}
