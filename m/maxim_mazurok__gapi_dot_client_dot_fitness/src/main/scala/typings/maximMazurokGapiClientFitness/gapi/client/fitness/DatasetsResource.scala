package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFitness.anon.CurrentTimeMillis
import typings.maximMazurokGapiClientFitness.anon.DataSourceId
import typings.maximMazurokGapiClientFitness.anon.DatasetId
import typings.maximMazurokGapiClientFitness.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetsResource extends StObject {
  
  /**
    * Performs an inclusive delete of all data points whose start and end times have any overlap with the time range specified by the dataset ID. For most data types, the entire data
    * point will be deleted. For data types where the time span represents a consistent value (such as com.google.activity.segment), and a data point straddles either end point of the
    * dataset, only the overlapping portion of the data point will be deleted.
    */
  def delete(): Request[Unit] = js.native
  def delete(request: CurrentTimeMillis): Request[Unit] = js.native
  
  /**
    * Returns a dataset containing all data points whose start and end times overlap with the specified range of the dataset minimum start time and maximum end time. Specifically, any
    * data point whose start time is less than or equal to the dataset end time and whose end time is greater than or equal to the dataset start time.
    */
  def get(): Request[Dataset] = js.native
  def get(request: DataSourceId): Request[Dataset] = js.native
  
  /**
    * Adds data points to a dataset. The dataset need not be previously created. All points within the given dataset will be returned with subsquent calls to retrieve this dataset. Data
    * points can belong to more than one dataset. This method does not use patch semantics.
    */
  def patch(request: DatasetId): Request[Dataset] = js.native
  def patch(request: Fields, body: Dataset): Request[Dataset] = js.native
}
