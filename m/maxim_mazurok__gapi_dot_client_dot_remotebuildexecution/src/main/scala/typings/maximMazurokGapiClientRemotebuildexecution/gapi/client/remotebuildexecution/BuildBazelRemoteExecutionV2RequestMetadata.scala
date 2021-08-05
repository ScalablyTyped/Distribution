package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2RequestMetadata extends StObject {
  
  /** An identifier that ties multiple requests to the same action. For example, multiple requests to the CAS, Action Cache, and Execution API are used in order to compile foo.cc. */
  var actionId: js.UndefOr[String] = js.undefined
  
  /** An identifier to tie multiple tool invocations together. For example, runs of foo_test, bar_test and baz_test on a post-submit of a given patch. */
  var correlatedInvocationsId: js.UndefOr[String] = js.undefined
  
  /** The details for the tool invoking the requests. */
  var toolDetails: js.UndefOr[BuildBazelRemoteExecutionV2ToolDetails] = js.undefined
  
  /** An identifier that ties multiple actions together to a final result. For example, multiple actions are required to build and run foo_test. */
  var toolInvocationId: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2RequestMetadata {
  
  inline def apply(): BuildBazelRemoteExecutionV2RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2RequestMetadata]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2RequestMetadata](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setCorrelatedInvocationsId(value: String): Self = StObject.set(x, "correlatedInvocationsId", value.asInstanceOf[js.Any])
    
    inline def setCorrelatedInvocationsIdUndefined: Self = StObject.set(x, "correlatedInvocationsId", js.undefined)
    
    inline def setToolDetails(value: BuildBazelRemoteExecutionV2ToolDetails): Self = StObject.set(x, "toolDetails", value.asInstanceOf[js.Any])
    
    inline def setToolDetailsUndefined: Self = StObject.set(x, "toolDetails", js.undefined)
    
    inline def setToolInvocationId(value: String): Self = StObject.set(x, "toolInvocationId", value.asInstanceOf[js.Any])
    
    inline def setToolInvocationIdUndefined: Self = StObject.set(x, "toolInvocationId", js.undefined)
  }
}
