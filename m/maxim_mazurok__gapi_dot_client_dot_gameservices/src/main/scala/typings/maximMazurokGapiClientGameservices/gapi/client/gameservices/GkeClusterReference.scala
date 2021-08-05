package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeClusterReference extends StObject {
  
  /**
    * The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` *
    * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate
    * the full name of the GKE cluster.
    */
  var cluster: js.UndefOr[String] = js.undefined
}
object GkeClusterReference {
  
  inline def apply(): GkeClusterReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeClusterReference]
  }
  
  extension [Self <: GkeClusterReference](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
