package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import typings.maximMazurokGapiClientSheets.anon.Callback
import typings.maximMazurokGapiClientSheets.anon.DateTimeRenderOption
import typings.maximMazurokGapiClientSheets.anon.IncludeValuesInResponse
import typings.maximMazurokGapiClientSheets.anon.InsertDataOption
import typings.maximMazurokGapiClientSheets.anon.MajorDimension
import typings.maximMazurokGapiClientSheets.anon.Oauthtoken
import typings.maximMazurokGapiClientSheets.anon.PrettyPrint
import typings.maximMazurokGapiClientSheets.anon.QuotaUser
import typings.maximMazurokGapiClientSheets.anon.Range
import typings.maximMazurokGapiClientSheets.anon.Resource
import typings.maximMazurokGapiClientSheets.anon.ResponseDateTimeRenderOption
import typings.maximMazurokGapiClientSheets.anon.ResponseValueRenderOption
import typings.maximMazurokGapiClientSheets.anon.SpreadsheetId
import typings.maximMazurokGapiClientSheets.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValuesResource extends StObject {
  
  /**
    * Appends values to a spreadsheet. The input range is used to search for existing data and find a "table" within that range. Values will be appended to the next row of the table,
    * starting with the first column of the table. See the [guide](/sheets/api/guides/values#appending_values) and [sample code](/sheets/api/samples/writing#append_values) for specific
    * details of how tables are detected and data is appended. The caller must specify the spreadsheet ID, range, and a valueInputOption. The `valueInputOption` only controls how the
    * input data will be added to the sheet (column-wise or row-wise), it does not influence what cell the data starts being written to.
    */
  def append(request: IncludeValuesInResponse): typings.gapiClient.gapi.client.Request[AppendValuesResponse] = js.native
  def append(request: InsertDataOption, body: ValueRange): typings.gapiClient.gapi.client.Request[AppendValuesResponse] = js.native
  
  def batchClear(request: Callback, body: BatchClearValuesRequest): typings.gapiClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. Only values are cleared -- all other properties of the
    * cell (such as formatting and data validation) are kept.
    */
  def batchClear(request: Oauthtoken): typings.gapiClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  
  def batchClearByDataFilter(request: Callback, body: BatchClearValuesByDataFilterRequest): typings.gapiClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges matching any of the specified data filters
    * will be cleared. Only values are cleared -- all other properties of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: PrettyPrint): typings.gapiClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  
  /** Returns one or more ranges of values from a spreadsheet. The caller must specify the spreadsheet ID and one or more ranges. */
  def batchGet(): typings.gapiClient.gapi.client.Request[BatchGetValuesResponse] = js.native
  def batchGet(request: DateTimeRenderOption): typings.gapiClient.gapi.client.Request[BatchGetValuesResponse] = js.native
  
  def batchGetByDataFilter(request: Callback, body: BatchGetValuesByDataFilterRequest): typings.gapiClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  /**
    * Returns one or more ranges of values that match the specified data filters. The caller must specify the spreadsheet ID and one or more DataFilters. Ranges that match any of the data
    * filters in the request will be returned.
    */
  def batchGetByDataFilter(request: QuotaUser): typings.gapiClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  
  def batchUpdate(request: Callback, body: BatchUpdateValuesRequest): typings.gapiClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  /** Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more ValueRanges. */
  def batchUpdate(request: Resource): typings.gapiClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  
  def batchUpdateByDataFilter(request: Callback, body: BatchUpdateValuesByDataFilterRequest): typings.gapiClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  /** Sets values in one or more ranges of a spreadsheet. The caller must specify the spreadsheet ID, a valueInputOption, and one or more DataFilterValueRanges. */
  def batchUpdateByDataFilter(request: SpreadsheetId): typings.gapiClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  
  /**
    * Clears values from a spreadsheet. The caller must specify the spreadsheet ID and range. Only values are cleared -- all other properties of the cell (such as formatting, data
    * validation, etc..) are kept.
    */
  def clear(request: Range): typings.gapiClient.gapi.client.Request[ClearValuesResponse] = js.native
  def clear(request: UploadType, body: ClearValuesRequest): typings.gapiClient.gapi.client.Request[ClearValuesResponse] = js.native
  
  /** Returns a range of values from a spreadsheet. The caller must specify the spreadsheet ID and a range. */
  def get(): typings.gapiClient.gapi.client.Request[ValueRange] = js.native
  def get(request: MajorDimension): typings.gapiClient.gapi.client.Request[ValueRange] = js.native
  
  /** Sets values in a range of a spreadsheet. The caller must specify the spreadsheet ID, range, and a valueInputOption. */
  def update(request: ResponseDateTimeRenderOption): typings.gapiClient.gapi.client.Request[UpdateValuesResponse] = js.native
  def update(request: ResponseValueRenderOption, body: ValueRange): typings.gapiClient.gapi.client.Request[UpdateValuesResponse] = js.native
}
