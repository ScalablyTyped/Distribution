package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppDirIntent extends js.Object {
  
  /**
    * The context types that this intent supports. A context type is a namespaced name;
    * examples are given [here](https://fdc3.finos.org/docs/1.0/context-spec).
    */
  var contexts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Custom configuration for the intent. Currently unused, reserved for future use.
    */
  var customConfig: js.UndefOr[js.Any] = js.native
  
  /**
    * A short, human-readable description of this intent.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The intent name.
    */
  var name: String = js.native
}
object AppDirIntent {
  
  @scala.inline
  def apply(name: String): AppDirIntent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDirIntent]
  }
  
  @scala.inline
  implicit class AppDirIntentOps[Self <: AppDirIntent] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setCustomConfig(value: js.Any): Self = this.set("customConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomConfig: Self = this.set("customConfig", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
}
