package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalListNodesResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to ListNodes method that indicates from where listing should continue. If the field is missing or empty, it means there is no more
    * nodes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The nodes that match the request. */
  var nodes: js.UndefOr[js.Array[SasPortalNode]] = js.native
}
object SasPortalListNodesResponse {
  
  @scala.inline
  def apply(): SasPortalListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListNodesResponse]
  }
  
  @scala.inline
  implicit class SasPortalListNodesResponseMutableBuilder[Self <: SasPortalListNodesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[SasPortalNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: SasPortalNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
