package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerCluster extends StObject {
  
  /** The game server cluster connection information. This information is used to manage game server clusters. */
  var connectionInfo: js.UndefOr[GameServerClusterConnectionInfo] = js.native
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Human readable description of the cluster. */
  var description: js.UndefOr[String] = js.native
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The labels associated with this game server cluster. Each label is a key-value pair. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerCluster with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. The resource name of the game server cluster, in the following form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For example,
    * `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.native
}
object GameServerCluster {
  
  @scala.inline
  def apply(): GameServerCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerCluster]
  }
  
  @scala.inline
  implicit class GameServerClusterMutableBuilder[Self <: GameServerCluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionInfo(value: GameServerClusterConnectionInfo): Self = StObject.set(x, "connectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionInfoUndefined: Self = StObject.set(x, "connectionInfo", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.GameServerCluster with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
