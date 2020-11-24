package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingGoogleUpdateInsight extends js.Object {
  
  /** The name of the Google-provided library with the non-SDK API dependency. */
  var nameOfGoogleLibrary: js.UndefOr[String] = js.native
}
object PendingGoogleUpdateInsight {
  
  @scala.inline
  def apply(): PendingGoogleUpdateInsight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingGoogleUpdateInsight]
  }
  
  @scala.inline
  implicit class PendingGoogleUpdateInsightOps[Self <: PendingGoogleUpdateInsight] (val x: Self) extends AnyVal {
    
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
    def setNameOfGoogleLibrary(value: String): Self = this.set("nameOfGoogleLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameOfGoogleLibrary: Self = this.set("nameOfGoogleLibrary", js.undefined)
  }
}
