package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingCriteria extends StObject {
  
  /**
    * Required. The name of a CloudEvents atrribute. Currently, only a subset of attributes can be specified. All triggers MUST provide a matching criteria for attribute 'type'. Event
    * types specify what event type has attributes are allowed based on
    */
  var attribute: js.UndefOr[String] = js.undefined
  
  /** Required. The value for the attribute */
  var value: js.UndefOr[String] = js.undefined
}
object MatchingCriteria {
  
  @scala.inline
  def apply(): MatchingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingCriteria]
  }
  
  @scala.inline
  implicit class MatchingCriteriaMutableBuilder[Self <: MatchingCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
