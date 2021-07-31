package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleRaws
  extends StObject
     with ContainerRaws {
  
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object RuleRaws {
  
  @scala.inline
  def apply(): RuleRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleRaws]
  }
  
  @scala.inline
  implicit class RuleRawsMutableBuilder[Self <: RuleRaws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
