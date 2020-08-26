package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedMobileLobApp extends ManagedApp {
  // The internal committed content version.
  var committedContentVersion: js.UndefOr[String] = js.native
  // The list of content versions for this app.
  var contentVersions: js.UndefOr[js.Array[MobileAppContent]] = js.native
  // The name of the main Lob application file.
  var fileName: js.UndefOr[String] = js.native
  // The total size, including all uploaded files.
  var size: js.UndefOr[Double] = js.native
}

object ManagedMobileLobApp {
  @scala.inline
  def apply(): ManagedMobileLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedMobileLobApp]
  }
  @scala.inline
  implicit class ManagedMobileLobAppOps[Self <: ManagedMobileLobApp] (val x: Self) extends AnyVal {
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
    def setCommittedContentVersion(value: String): Self = this.set("committedContentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommittedContentVersion: Self = this.set("committedContentVersion", js.undefined)
    @scala.inline
    def setContentVersionsVarargs(value: MobileAppContent*): Self = this.set("contentVersions", js.Array(value :_*))
    @scala.inline
    def setContentVersions(value: js.Array[MobileAppContent]): Self = this.set("contentVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentVersions: Self = this.set("contentVersions", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

