package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataprocParameters extends StObject {
  
  /** URI for cluster used to run Dataproc execution. Format: `projects/{PROJECT_ID}/regions/{REGION}/clusters/{CLUSTER_NAME}` */
  var cluster: js.UndefOr[String] = js.undefined
}
object DataprocParameters {
  
  inline def apply(): DataprocParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataprocParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataprocParameters] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
