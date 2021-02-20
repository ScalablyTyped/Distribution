package typings.node.inspectorMod.Profiler

import typings.node.inspectorMod.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type profile data collected during runtime for a JavaScript script.
  * @experimental
  */
@js.native
trait ScriptTypeProfile extends StObject {
  
  /**
    * Type profile entries for parameters and return values of the functions in the script.
    */
  var entries: js.Array[TypeProfileEntry] = js.native
  
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId = js.native
  
  /**
    * JavaScript script name or url.
    */
  var url: String = js.native
}
object ScriptTypeProfile {
  
  @scala.inline
  def apply(entries: js.Array[TypeProfileEntry], scriptId: ScriptId, url: String): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTypeProfile]
  }
  
  @scala.inline
  implicit class ScriptTypeProfileMutableBuilder[Self <: ScriptTypeProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[TypeProfileEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: TypeProfileEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
