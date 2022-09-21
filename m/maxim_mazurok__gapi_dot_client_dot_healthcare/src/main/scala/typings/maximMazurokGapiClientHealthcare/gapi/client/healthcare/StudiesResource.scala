package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.CallbackDicomWebPath
import typings.maximMazurokGapiClientHealthcare.anon.DicomWebPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StudiesResource extends StObject {
  
  /**
    * DeleteStudy deletes all instances within the given study. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. The method returns an Operation
    * which will be marked successful when the deletion is complete. Warning: Instances cannot be inserted into a study that is being deleted by an operation until the operation
    * completes. For samples that show how to call DeleteStudy, see [Deleting a study, series, or
    * instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#deleting_a_study_series_or_instance).
    */
  def delete(): Request[Operation] = js.native
  def delete(request: DicomWebPath): Request[Operation] = js.native
  
  /**
    * RetrieveStudyMetadata returns instance associated with the given study presented as metadata with the bulk data removed. See [RetrieveTransaction]
    * (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveStudyMetadata, see [Metadata
    * resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call
    * RetrieveStudyMetadata, see [Retrieving metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_metadata).
    */
  def retrieveMetadata(): Request[HttpBody] = js.native
  def retrieveMetadata(request: DicomWebPath): Request[HttpBody] = js.native
  
  /**
    * RetrieveStudy returns all instances within the given study. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on
    * the implementation of RetrieveStudy, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) in the Cloud Healthcare API
    * conformance statement. For samples that show how to call RetrieveStudy, see [Retrieving DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_dicom_data).
    */
  def retrieveStudy(): Request[HttpBody] = js.native
  def retrieveStudy(request: DicomWebPath): Request[HttpBody] = js.native
  
  /**
    * SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement.
    * For samples that show how to call SearchForInstances, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForInstances(): Request[HttpBody] = js.native
  def searchForInstances(request: DicomWebPath): Request[HttpBody] = js.native
  
  /**
    * SearchForSeries returns a list of matching series. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the
    * implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For
    * samples that show how to call SearchForSeries, see [Searching for studies, series, instances, and
    * frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
    */
  def searchForSeries(): Request[HttpBody] = js.native
  def searchForSeries(request: DicomWebPath): Request[HttpBody] = js.native
  
  var series: SeriesResource = js.native
  
  /**
    * StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction]
    * (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store
    * transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances,
    * see [Storing DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#storing_dicom_data).
    */
  def storeInstances(request: CallbackDicomWebPath): Request[HttpBody] = js.native
  def storeInstances(request: DicomWebPath, body: HttpBody): Request[HttpBody] = js.native
}
