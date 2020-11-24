package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindReplaceRequest extends js.Object {
  
  /** True to find/replace over all sheets. */
  var allSheets: js.UndefOr[Boolean] = js.native
  
  /** The value to search. */
  var find: js.UndefOr[String] = js.native
  
  /** True if the search should include cells with formulas. False to skip cells with formulas. */
  var includeFormulas: js.UndefOr[Boolean] = js.native
  
  /** True if the search is case sensitive. */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /** True if the find value should match the entire cell. */
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  
  /** The range to find/replace over. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The value to use as the replacement. */
  var replacement: js.UndefOr[String] = js.native
  
  /**
    * True if the find value is a regex. The regular expression and replacement should follow Java regex rules at https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups. For example, if one cell has the contents `"Google Sheets"` and another has `"Google Docs"`, then searching for `"o.*
    * (.*)"` with a replacement of `"$1 Rocks"` would change the contents of the cells to `"GSheets Rocks"` and `"GDocs Rocks"` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean] = js.native
  
  /** The sheet to find/replace over. */
  var sheetId: js.UndefOr[Double] = js.native
}
object FindReplaceRequest {
  
  @scala.inline
  def apply(): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindReplaceRequest]
  }
  
  @scala.inline
  implicit class FindReplaceRequestOps[Self <: FindReplaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllSheets(value: Boolean): Self = this.set("allSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllSheets: Self = this.set("allSheets", js.undefined)
    
    @scala.inline
    def setFind(value: String): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setIncludeFormulas(value: Boolean): Self = this.set("includeFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFormulas: Self = this.set("includeFormulas", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMatchEntireCell(value: Boolean): Self = this.set("matchEntireCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchEntireCell: Self = this.set("matchEntireCell", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setReplacement(value: String): Self = this.set("replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
    
    @scala.inline
    def setSearchByRegex(value: Boolean): Self = this.set("searchByRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchByRegex: Self = this.set("searchByRegex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
  }
}
