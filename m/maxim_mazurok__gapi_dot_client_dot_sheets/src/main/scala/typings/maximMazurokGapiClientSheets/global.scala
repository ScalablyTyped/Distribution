package typings.maximMazurokGapiClientSheets

import typings.maximMazurokGapiClientSheets.gapi.client.sheets.SpreadsheetsResource
import typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.sheets
import typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google Sheets API v4 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sheets, version: v4): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sheets, version: v4, callback: js.Function0[_]): Unit = js.native
      
      object sheets {
        
        @JSGlobal("gapi.client.sheets.spreadsheets")
        @js.native
        val spreadsheets: SpreadsheetsResource = js.native
      }
    }
  }
}
