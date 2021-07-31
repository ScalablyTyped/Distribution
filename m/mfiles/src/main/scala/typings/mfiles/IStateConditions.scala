package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateConditions extends StObject {
  
  def Clone(): IStateConditions
  
  var PropertyConditions: Boolean
  
  var PropertyConditionsDefinition: ISearchConditions
  
  var VBScript: Boolean
  
  var VBScriptDefinition: String
}
object IStateConditions {
  
  @scala.inline
  def apply(
    Clone: () => IStateConditions,
    PropertyConditions: Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: Boolean,
    VBScriptDefinition: String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyConditions = PropertyConditions.asInstanceOf[js.Any], PropertyConditionsDefinition = PropertyConditionsDefinition.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any], VBScriptDefinition = VBScriptDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateConditions]
  }
  
  @scala.inline
  implicit class IStateConditionsMutableBuilder[Self <: IStateConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IStateConditions): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPropertyConditions(value: Boolean): Self = StObject.set(x, "PropertyConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyConditionsDefinition(value: ISearchConditions): Self = StObject.set(x, "PropertyConditionsDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBScript(value: Boolean): Self = StObject.set(x, "VBScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBScriptDefinition(value: String): Self = StObject.set(x, "VBScriptDefinition", value.asInstanceOf[js.Any])
  }
}
