package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import typings.maximMazurokGapiClientSheets.anon.Fields
import typings.maximMazurokGapiClientSheets.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetsResource extends StObject {
  
  /** Copies a single sheet from a spreadsheet to another spreadsheet. Returns the properties of the newly created sheet. */
  def copyTo(request: Fields): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Key, body: CopySheetToAnotherSpreadsheetRequest): typings.gapiClient.gapi.client.Request[SheetProperties] = js.native
}
