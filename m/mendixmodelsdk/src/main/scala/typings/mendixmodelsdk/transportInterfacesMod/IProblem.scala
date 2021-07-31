package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProblem extends StObject {
  
  var arguments: js.UndefOr[IProblemArguments] = js.undefined
  
  var errorCode: js.UndefOr[String] = js.undefined
  
  var locations: js.UndefOr[js.Array[IProblemLocation]] = js.undefined
  
  var message: String
  
  var name: String
  
  var severity: String
}
object IProblem {
  
  @scala.inline
  def apply(message: String, name: String, severity: String): IProblem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProblem]
  }
  
  @scala.inline
  implicit class IProblemMutableBuilder[Self <: IProblem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: IProblemArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[IProblemLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: IProblemLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
