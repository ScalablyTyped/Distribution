package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Denoise extends js.Object {
  
  /** Set strength of the denoise. Enter a value between 0 and 1. The higher the value, the smoother the image. 0 is no denoising. The default is 0. */
  var strength: js.UndefOr[Double] = js.native
  
  /** Set the denoiser mode. The default is `"standard"`. Supported denoiser modes: - 'standard' - 'grain' */
  var tune: js.UndefOr[String] = js.native
}
object Denoise {
  
  @scala.inline
  def apply(): Denoise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Denoise]
  }
  
  @scala.inline
  implicit class DenoiseOps[Self <: Denoise] (val x: Self) extends AnyVal {
    
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
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    
    @scala.inline
    def setTune(value: String): Self = this.set("tune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTune: Self = this.set("tune", js.undefined)
  }
}
