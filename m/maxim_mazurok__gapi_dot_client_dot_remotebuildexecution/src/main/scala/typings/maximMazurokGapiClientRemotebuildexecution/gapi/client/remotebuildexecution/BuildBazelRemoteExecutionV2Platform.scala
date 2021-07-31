package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Platform extends StObject {
  
  /**
    * The properties that make up this platform. In order to ensure that equivalent `Platform`s always hash to the same value, the properties MUST be lexicographically sorted by name, and
    * then by value. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
    */
  var properties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2PlatformProperty]] = js.undefined
}
object BuildBazelRemoteExecutionV2Platform {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Platform]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2PlatformMutableBuilder[Self <: BuildBazelRemoteExecutionV2Platform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[BuildBazelRemoteExecutionV2PlatformProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: BuildBazelRemoteExecutionV2PlatformProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
