package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import typings.maximMazurokGapiClientSheets.anon.Fields
import typings.maximMazurokGapiClientSheets.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsResource extends js.Object {
  
  /** Copies a single sheet from a spreadsheet to another spreadsheet. Returns the properties of the newly created sheet. */
  def copyTo(request: Fields): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Key, body: CopySheetToAnotherSpreadsheetRequest): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
}
