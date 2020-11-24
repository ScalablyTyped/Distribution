package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionRequest extends js.Object {
  
  /**
    * If `true` and the user is an owner of the script, the script runs at the most recently saved version rather than the version deployed for use with the Apps Script API. Optional;
    * default is `false`.
    */
  var devMode: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the function to execute in the given script. The name does not include parentheses or parameters. It can reference a function in an included library such as
    * `Library.libFunction1`.
    */
  var function: js.UndefOr[String] = js.native
  
  /**
    * The parameters to be passed to the function being executed. The object type for each parameter should match the expected type in Apps Script. Parameters cannot be Apps
    * Script-specific object types (such as a `Document` or a `Calendar`); they can only be primitive types such as `string`, `number`, `array`, `object`, or `boolean`. Optional.
    */
  var parameters: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * *Deprecated*. For use with Android add-ons only. An ID that represents the user's current session in the Android app for Google Docs or Sheets, included as extra data in the
    * [Intent](https://developer.android.com/guide/components/intents-filters.html) that launches the add-on. When an Android add-on is run with a session state, it gains the privileges
    * of a [bound](https://developers.google.com/apps-script/guides/bound) script—that is, it can access information like the user's current cursor position (in Docs) or selected cell (in
    * Sheets). To retrieve the state, call `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`. Optional.
    */
  var sessionState: js.UndefOr[String] = js.native
}
object ExecutionRequest {
  
  @scala.inline
  def apply(): ExecutionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionRequest]
  }
  
  @scala.inline
  implicit class ExecutionRequestOps[Self <: ExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevMode(value: Boolean): Self = this.set("devMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevMode: Self = this.set("devMode", js.undefined)
    
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: js.Any*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSessionState(value: String): Self = this.set("sessionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionState: Self = this.set("sessionState", js.undefined)
  }
}
