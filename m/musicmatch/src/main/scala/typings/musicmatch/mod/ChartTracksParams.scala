package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTracksParams extends Pageable {
  
  var country: js.UndefOr[String] = js.native
  
  var f_has_lyrics: js.UndefOr[TBoolean] = js.native
}
object ChartTracksParams {
  
  @scala.inline
  def apply(): ChartTracksParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTracksParams]
  }
  
  @scala.inline
  implicit class ChartTracksParamsOps[Self <: ChartTracksParams] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setF_has_lyrics(value: TBoolean): Self = this.set("f_has_lyrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteF_has_lyrics: Self = this.set("f_has_lyrics", js.undefined)
  }
}
