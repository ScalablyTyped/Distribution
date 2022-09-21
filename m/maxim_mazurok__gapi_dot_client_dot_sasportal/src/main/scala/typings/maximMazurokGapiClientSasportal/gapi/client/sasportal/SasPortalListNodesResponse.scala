package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalListNodesResponse extends StObject {
  
  /** A pagination token returned from a previous call to ListNodes that indicates from where listing should continue. If the field is missing or empty, it means there is no more nodes. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The nodes that match the request. */
  var nodes: js.UndefOr[js.Array[SasPortalNode]] = js.undefined
}
object SasPortalListNodesResponse {
  
  inline def apply(): SasPortalListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalListNodesResponse]
  }
  
  extension [Self <: SasPortalListNodesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNodes(value: js.Array[SasPortalNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SasPortalNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
