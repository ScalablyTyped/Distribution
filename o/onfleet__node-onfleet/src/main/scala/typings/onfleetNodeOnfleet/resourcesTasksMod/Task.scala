package typings.onfleetNodeOnfleet.resourcesTasksMod

import typings.onfleetNodeOnfleet.anon.CompletionDetails
import typings.onfleetNodeOnfleet.anon.PartialCreateTaskProps
import typings.onfleetNodeOnfleet.metadataMod.MatchMetadata
import typings.onfleetNodeOnfleet.metadataMod.MatchMetadataResult
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Task extends StObject {
  
  def autoAssign(tasks: js.Array[OnfleetTask]): js.Promise[Any] = js.native
  
  // TODO need to confirm response
  def batchCreate(tasks: js.Array[CreateTaskProps]): js.Promise[js.Array[OnfleetTask]] = js.native
  
  def clone(id: String): js.Promise[OnfleetTask] = js.native
  
  def create(task: CreateTaskProps): js.Promise[OnfleetTask] = js.native
  
  def deleteOne(id: String): js.Promise[Double] = js.native
  
  def forceComplete(id: String, details: CompletionDetails): js.Promise[Unit] = js.native
  
  def get(): js.Promise[GetManyTaskResult] = js.native
  def get(queryOrId: String): js.Promise[GetTaskResult] = js.native
  def get(queryOrId: String, queryKey: TaskQueryKey): js.Promise[GetTaskResult] = js.native
  def get(queryParams: TaskQueryParam): js.Promise[GetManyTaskResult] = js.native
  
  def matchMetadata(obj: js.Array[OnfleetMetadata]): js.Promise[js.Array[MatchMetadataResult]] = js.native
  @JSName("matchMetadata")
  var matchMetadata_Original: MatchMetadata[js.Array[OnfleetMetadata]] = js.native
  
  def update(id: String, task: PartialCreateTaskProps): js.Promise[UpdateTaskResult] = js.native
}
