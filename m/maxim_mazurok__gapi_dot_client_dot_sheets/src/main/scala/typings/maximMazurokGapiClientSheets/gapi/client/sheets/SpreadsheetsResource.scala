package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import typings.maximMazurokGapiClientSheets.anon.AccesstokenAlt
import typings.maximMazurokGapiClientSheets.anon.AltCallback
import typings.maximMazurokGapiClientSheets.anon.Callback
import typings.maximMazurokGapiClientSheets.anon.IncludeGridData
import typings.maximMazurokGapiClientSheets.anon.Uploadprotocol
import typings.maximMazurokGapiClientSheets.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetsResource extends js.Object {
  
  def batchUpdate(request: Callback, body: BatchUpdateSpreadsheetRequest): typings.gapiClient.gapi.client.Request[BatchUpdateSpreadsheetResponse] = js.native
  /**
    * Applies one or more updates to the spreadsheet. Each request is validated before being applied. If any request is not valid then the entire request will fail and nothing will be
    * applied. Some requests have replies to give you some information about how they are applied. The replies will mirror the requests. For example, if you applied 4 updates and the 3rd
    * one had a reply, then the response will have 2 empty replies, the actual reply, and another empty reply, in that order. Due to the collaborative nature of spreadsheets, it is not
    * guaranteed that the spreadsheet will reflect exactly your changes after this completes, however it is guaranteed that the updates in the request will be applied together atomically.
    * Your changes may be altered with respect to collaborator changes. If there are no collaborators, the spreadsheet should reflect your changes.
    */
  def batchUpdate(request: Uploadprotocol): typings.gapiClient.gapi.client.Request[BatchUpdateSpreadsheetResponse] = js.native
  
  def create(request: AccesstokenAlt, body: Spreadsheet): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  /** Creates a spreadsheet, returning the newly created spreadsheet. */
  def create(request: Xgafv): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  
  var developerMetadata: DeveloperMetadataResource = js.native
  
  /**
    * Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. By default, data within grids will not be returned. You can include grid data one of two ways: *
    * Specify a field mask listing your desired fields using the `fields` URL parameter in HTTP * Set the includeGridData URL parameter to true. If a field mask is set, the
    * `includeGridData` parameter is ignored For large spreadsheets, it is recommended to retrieve only the specific fields of the spreadsheet that you want. To retrieve only subsets of
    * the spreadsheet, use the ranges URL parameter. Multiple ranges can be specified. Limiting the range will return only the portions of the spreadsheet that intersect the requested
    * ranges. Ranges are specified using A1 notation.
    */
  def get(): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  def get(request: IncludeGridData): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  
  /**
    * Returns the spreadsheet at the given ID. The caller must specify the spreadsheet ID. This method differs from GetSpreadsheet in that it allows selecting which subsets of spreadsheet
    * data to return by specifying a dataFilters parameter. Multiple DataFilters can be specified. Specifying one or more data filters will return the portions of the spreadsheet that
    * intersect ranges matched by any of the filters. By default, data within grids will not be returned. You can include grid data one of two ways: * Specify a field mask listing your
    * desired fields using the `fields` URL parameter in HTTP * Set the includeGridData parameter to true. If a field mask is set, the `includeGridData` parameter is ignored For large
    * spreadsheets, it is recommended to retrieve only the specific fields of the spreadsheet that you want.
    */
  def getByDataFilter(request: AltCallback): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  def getByDataFilter(request: Callback, body: GetSpreadsheetByDataFilterRequest): typings.gapiClient.gapi.client.Request[Spreadsheet] = js.native
  
  var sheets: SheetsResource = js.native
  
  var values: ValuesResource = js.native
}
