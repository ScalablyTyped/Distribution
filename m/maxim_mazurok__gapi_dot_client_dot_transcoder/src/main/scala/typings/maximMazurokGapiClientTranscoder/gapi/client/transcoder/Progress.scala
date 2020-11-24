package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends js.Object {
  
  /** Estimated fractional progress for `analyzing` step. */
  var analyzed: js.UndefOr[Double] = js.native
  
  /** Estimated fractional progress for `encoding` step. */
  var encoded: js.UndefOr[Double] = js.native
  
  /** Estimated fractional progress for `notifying` step. */
  var notified: js.UndefOr[Double] = js.native
  
  /** Estimated fractional progress for `uploading` step. */
  var uploaded: js.UndefOr[Double] = js.native
}
object Progress {
  
  @scala.inline
  def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    
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
    def setAnalyzed(value: Double): Self = this.set("analyzed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzed: Self = this.set("analyzed", js.undefined)
    
    @scala.inline
    def setEncoded(value: Double): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoded: Self = this.set("encoded", js.undefined)
    
    @scala.inline
    def setNotified(value: Double): Self = this.set("notified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotified: Self = this.set("notified", js.undefined)
    
    @scala.inline
    def setUploaded(value: Double): Self = this.set("uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploaded: Self = this.set("uploaded", js.undefined)
  }
}
