package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2PlatformProperty extends StObject {
  
  /** The property name. */
  var name: js.UndefOr[String] = js.native
  
  /** The property value. */
  var value: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2PlatformProperty {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2PlatformProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PlatformProperty]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2PlatformPropertyMutableBuilder[Self <: BuildBazelRemoteExecutionV2PlatformProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
