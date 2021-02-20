package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotCommandStatus extends StObject {
  
  /** The status code. */
  var code: js.UndefOr[String] = js.native
  
  /** The error message. */
  var message: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildbotCommandStatus {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotCommandStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandStatus]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotCommandStatusMutableBuilder[Self <: GoogleDevtoolsRemotebuildbotCommandStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
