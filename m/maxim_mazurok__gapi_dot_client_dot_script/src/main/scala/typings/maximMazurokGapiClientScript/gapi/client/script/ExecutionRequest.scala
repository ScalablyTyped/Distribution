package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionRequest extends StObject {
  
  /**
    * If `true` and the user is an owner of the script, the script runs at the most recently saved version rather than the version deployed for use with the Apps Script API. Optional;
    * default is `false`.
    */
  var devMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the function to execute in the given script. The name does not include parentheses or parameters. It can reference a function in an included library such as
    * `Library.libFunction1`.
    */
  var function: js.UndefOr[String] = js.undefined
  
  /**
    * The parameters to be passed to the function being executed. The object type for each parameter should match the expected type in Apps Script. Parameters cannot be Apps
    * Script-specific object types (such as a `Document` or a `Calendar`); they can only be primitive types such as `string`, `number`, `array`, `object`, or `boolean`. Optional.
    */
  var parameters: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * *Deprecated*. For use with Android add-ons only. An ID that represents the user's current session in the Android app for Google Docs or Sheets, included as extra data in the
    * [Intent](https://developer.android.com/guide/components/intents-filters.html) that launches the add-on. When an Android add-on is run with a session state, it gains the privileges
    * of a [bound](https://developers.google.com/apps-script/guides/bound) script—that is, it can access information like the user's current cursor position (in Docs) or selected cell (in
    * Sheets). To retrieve the state, call `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`. Optional.
    */
  var sessionState: js.UndefOr[String] = js.undefined
}
object ExecutionRequest {
  
  inline def apply(): ExecutionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionRequest]
  }
  
  extension [Self <: ExecutionRequest](x: Self) {
    
    inline def setDevMode(value: Boolean): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
    
    inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setParameters(value: js.Array[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: Any*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setSessionState(value: String): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
