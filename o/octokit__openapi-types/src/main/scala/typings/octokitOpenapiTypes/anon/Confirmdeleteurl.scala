package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirmdeleteurl extends StObject {
  
  /**
    * Format: uri
    * @description Next deletable analysis in chain, with last analysis deletion confirmation
    */
  var confirm_delete_url: String | Null
  
  /**
    * Format: uri
    * @description Next deletable analysis in chain, without last analysis deletion confirmation
    */
  var next_analysis_url: String | Null
}
object Confirmdeleteurl {
  
  inline def apply(): Confirmdeleteurl = {
    val __obj = js.Dynamic.literal(confirm_delete_url = null, next_analysis_url = null)
    __obj.asInstanceOf[Confirmdeleteurl]
  }
  
  extension [Self <: Confirmdeleteurl](x: Self) {
    
    inline def setConfirm_delete_url(value: String): Self = StObject.set(x, "confirm_delete_url", value.asInstanceOf[js.Any])
    
    inline def setConfirm_delete_urlNull: Self = StObject.set(x, "confirm_delete_url", null)
    
    inline def setNext_analysis_url(value: String): Self = StObject.set(x, "next_analysis_url", value.asInstanceOf[js.Any])
    
    inline def setNext_analysis_urlNull: Self = StObject.set(x, "next_analysis_url", null)
  }
}
