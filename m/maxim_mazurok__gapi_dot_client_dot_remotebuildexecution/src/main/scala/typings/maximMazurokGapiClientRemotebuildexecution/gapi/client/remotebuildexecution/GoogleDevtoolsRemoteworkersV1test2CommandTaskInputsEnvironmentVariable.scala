package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable extends StObject {
  
  /** The envvar name. */
  var name: js.UndefOr[String] = js.native
  
  /** The envvar value. */
  var value: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariableMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandTaskInputsEnvironmentVariable] (val x: Self) extends AnyVal {
    
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
