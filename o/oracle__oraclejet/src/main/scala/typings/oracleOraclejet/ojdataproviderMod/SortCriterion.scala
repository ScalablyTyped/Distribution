package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCriterion[D] extends StObject {
  
  var attribute: /* keyof D */ String = js.native
  
  var direction: String = js.native
}
object SortCriterion {
  
  @scala.inline
  def apply[D](attribute: /* keyof D */ String, direction: String): SortCriterion[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion[D]]
  }
  
  @scala.inline
  implicit class SortCriterionMutableBuilder[Self <: SortCriterion[_], D] (val x: Self with SortCriterion[D]) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: /* keyof D */ String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
