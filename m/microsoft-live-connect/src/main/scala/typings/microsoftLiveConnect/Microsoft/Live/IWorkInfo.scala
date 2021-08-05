package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains work information for one employer.
  */
trait IWorkInfo extends StObject {
  
  /**
    * Info about the user's employer.
    */
  var employer: Name
  
  /**
    * Info about the user's work position.
    */
  var position: Name
}
object IWorkInfo {
  
  inline def apply(employer: Name, position: Name): IWorkInfo = {
    val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkInfo]
  }
  
  extension [Self <: IWorkInfo](x: Self) {
    
    inline def setEmployer(value: Name): Self = StObject.set(x, "employer", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Name): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
