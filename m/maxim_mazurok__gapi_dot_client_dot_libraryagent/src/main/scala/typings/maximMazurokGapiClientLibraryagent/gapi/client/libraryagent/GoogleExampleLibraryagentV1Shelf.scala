package typings.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleExampleLibraryagentV1Shelf extends js.Object {
  
  /** Output only. The resource name of the shelf. Shelf names have the form `shelves/{shelf_id}`. The name is ignored when creating a shelf. */
  var name: js.UndefOr[String] = js.native
  
  /** The theme of the shelf */
  var theme: js.UndefOr[String] = js.native
}
object GoogleExampleLibraryagentV1Shelf {
  
  @scala.inline
  def apply(): GoogleExampleLibraryagentV1Shelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleExampleLibraryagentV1Shelf]
  }
  
  @scala.inline
  implicit class GoogleExampleLibraryagentV1ShelfOps[Self <: GoogleExampleLibraryagentV1Shelf] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
