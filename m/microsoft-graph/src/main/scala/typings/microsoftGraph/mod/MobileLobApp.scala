package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileLobApp extends MobileApp {
  
  // The internal committed content version.
  var committedContentVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The list of content versions for this app.
  var contentVersions: js.UndefOr[NullableOption[js.Array[MobileAppContent]]] = js.native
  
  // The name of the main Lob application file.
  var fileName: js.UndefOr[NullableOption[String]] = js.native
  
  // The total size, including all uploaded files.
  var size: js.UndefOr[Double] = js.native
}
object MobileLobApp {
  
  @scala.inline
  def apply(): MobileLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileLobApp]
  }
  
  @scala.inline
  implicit class MobileLobAppOps[Self <: MobileLobApp] (val x: Self) extends AnyVal {
    
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
    def setCommittedContentVersion(value: NullableOption[String]): Self = this.set("committedContentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommittedContentVersion: Self = this.set("committedContentVersion", js.undefined)
    
    @scala.inline
    def setCommittedContentVersionNull: Self = this.set("committedContentVersion", null)
    
    @scala.inline
    def setContentVersionsVarargs(value: MobileAppContent*): Self = this.set("contentVersions", js.Array(value :_*))
    
    @scala.inline
    def setContentVersions(value: NullableOption[js.Array[MobileAppContent]]): Self = this.set("contentVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentVersions: Self = this.set("contentVersions", js.undefined)
    
    @scala.inline
    def setContentVersionsNull: Self = this.set("contentVersions", null)
    
    @scala.inline
    def setFileName(value: NullableOption[String]): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFileNameNull: Self = this.set("fileName", null)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
