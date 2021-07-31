package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2CommandEnvironmentVariable extends StObject {
  
  /** The variable name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The variable value. */
  var value: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2CommandEnvironmentVariable {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2CommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2CommandEnvironmentVariable]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2CommandEnvironmentVariableMutableBuilder[Self <: BuildBazelRemoteExecutionV2CommandEnvironmentVariable] (val x: Self) extends AnyVal {
    
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
