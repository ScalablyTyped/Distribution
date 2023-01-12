package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Choices extends StObject {
  
  var attr1: Any
  
  var attributes: Any
  
  var pred1: Any
  
  var predicates: Any
}
object Choices {
  
  inline def apply(attr1: Any, attributes: Any, pred1: Any, predicates: Any): Choices = {
    val __obj = js.Dynamic.literal(attr1 = attr1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], pred1 = pred1.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
    
    inline def setAttr1(value: Any): Self = StObject.set(x, "attr1", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPred1(value: Any): Self = StObject.set(x, "pred1", value.asInstanceOf[js.Any])
    
    inline def setPredicates(value: Any): Self = StObject.set(x, "predicates", value.asInstanceOf[js.Any])
  }
}
