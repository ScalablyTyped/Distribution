package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersResource extends StObject {
  
  var dataSources: DataSourcesResource
  
  var dataset: DatasetResource
  
  var sessions: SessionsResource
}
object UsersResource {
  
  @scala.inline
  def apply(dataSources: DataSourcesResource, dataset: DatasetResource, sessions: SessionsResource): UsersResource = {
    val __obj = js.Dynamic.literal(dataSources = dataSources.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit class UsersResourceMutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSources(value: DataSourcesResource): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataset(value: DatasetResource): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessions(value: SessionsResource): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
  }
}
