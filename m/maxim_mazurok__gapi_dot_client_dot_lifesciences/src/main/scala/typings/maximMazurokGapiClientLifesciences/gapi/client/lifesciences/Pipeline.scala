package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipeline extends StObject {
  
  /** The list of actions to execute, in the order they are specified. */
  var actions: js.UndefOr[js.Array[Action]] = js.native
  
  /**
    * The environment to pass into every action. Each action can also specify additional environment variables but cannot delete an entry from this map (though they can overwrite it with
    * a different value).
    */
  var environment: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Pipeline with TopLevel[js.Any]
  ] = js.native
  
  /** The resources required for execution. */
  var resources: js.UndefOr[Resources] = js.native
  
  /**
    * The maximum amount of time to give the pipeline to complete. This includes the time spent waiting for a worker to be allocated. If the pipeline fails to complete before the timeout,
    * it will be cancelled and the error code will be set to DEADLINE_EXCEEDED. If unspecified, it will default to 7 days.
    */
  var timeout: js.UndefOr[String] = js.native
}
object Pipeline {
  
  @scala.inline
  def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  @scala.inline
  implicit class PipelineMutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Pipeline with TopLevel[js.Any]
    ): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
