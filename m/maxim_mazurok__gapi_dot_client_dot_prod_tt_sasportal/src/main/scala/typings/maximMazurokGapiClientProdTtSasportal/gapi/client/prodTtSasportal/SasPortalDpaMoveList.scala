package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalDpaMoveList extends js.Object {
  
  /** The ID of the DPA. */
  var dpaId: js.UndefOr[String] = js.native
  
  /** The frequency range that the move list affects. */
  var frequencyRange: js.UndefOr[SasPortalFrequencyRange] = js.native
}
object SasPortalDpaMoveList {
  
  @scala.inline
  def apply(): SasPortalDpaMoveList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalDpaMoveList]
  }
  
  @scala.inline
  implicit class SasPortalDpaMoveListOps[Self <: SasPortalDpaMoveList] (val x: Self) extends AnyVal {
    
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
    def setDpaId(value: String): Self = this.set("dpaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpaId: Self = this.set("dpaId", js.undefined)
    
    @scala.inline
    def setFrequencyRange(value: SasPortalFrequencyRange): Self = this.set("frequencyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyRange: Self = this.set("frequencyRange", js.undefined)
  }
}
