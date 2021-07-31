package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesResource extends StObject {
  
  /**
    * DeleteSeries deletes all instances within the given study and series. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. The method returns an
    * Operation which will be marked successful when the deletion is complete. Warning: Inserting instances into a series while a delete operation is running for that series could result
    * in the new instances not appearing in search results until the deletion operation finishes. For samples that show how to call DeleteSeries, see [Deleting a study, series, or
    * instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#deleting_a_study_series_or_instance).
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  var instances: InstancesResource = js.native
  
  /**
    * RetrieveSeriesMetadata returns instance associated with the given study and series, presented as metadata with the bulk data removed. See [RetrieveTransaction]
    * (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveSeriesMetadata, see [Metadata
    * resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call
    * RetrieveSeriesMetadata, see [Retrieving metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_metadata).
    */
  def retrieveMetadata(): Request[HttpBody] = js.native
  def retrieveMetadata(request: Accesstoken): Request[HttpBody] = js.native
  
  /**
    * RetrieveSeries returns all instances within the given study and series. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4).
    * For details on the implementation of RetrieveSeries, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) in the Cloud
    * Healthcare API conformance statement. For samples that show how to call RetrieveSeries, see [Retrieving DICOM
    * data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_dicom_data).
    */
  def retrieveSeries(): Request[HttpBody] = js.native
  def retrieveSeries(request: Accesstoken): Request[HttpBody] = js.native
  
  /**
    * SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement.
    * For samples that show how to call SearchForInstances, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForInstances(): Request[HttpBody] = js.native
  def searchForInstances(request: Accesstoken): Request[HttpBody] = js.native
}
