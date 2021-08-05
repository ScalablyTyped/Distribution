package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetupTag extends StObject {
  
  /** If true, fire the main tag if and only if the setup tag fires successfully. If false, fire the main tag regardless of setup tag firing status. */
  var stopOnSetupFailure: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the setup tag. */
  var tagName: js.UndefOr[String] = js.undefined
}
object SetupTag {
  
  inline def apply(): SetupTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetupTag]
  }
  
  extension [Self <: SetupTag](x: Self) {
    
    inline def setStopOnSetupFailure(value: Boolean): Self = StObject.set(x, "stopOnSetupFailure", value.asInstanceOf[js.Any])
    
    inline def setStopOnSetupFailureUndefined: Self = StObject.set(x, "stopOnSetupFailure", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
