package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issue extends StObject {
  
  /** Short error description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The severity of the issue. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** Position of the issue in the `Source`. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.undefined
}
object Issue {
  
  @scala.inline
  def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  
  @scala.inline
  implicit class IssueMutableBuilder[Self <: Issue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: SourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
  }
}
