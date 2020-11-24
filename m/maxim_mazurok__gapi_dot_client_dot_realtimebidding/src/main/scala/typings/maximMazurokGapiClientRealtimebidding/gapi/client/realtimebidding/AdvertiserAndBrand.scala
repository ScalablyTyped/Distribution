package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserAndBrand extends js.Object {
  
  /** See https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt for the list of possible values. Can be used to filter the response of the creatives.list method. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Advertiser name. Can be used to filter the response of the creatives.list method. */
  var advertiserName: js.UndefOr[String] = js.native
  
  /**
    * Detected brand ID or zero if no brand has been detected. See https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt for the list of possible values. Can be used to filter
    * the response of the creatives.list method.
    */
  var brandId: js.UndefOr[String] = js.native
  
  /** Brand name. Can be used to filter the response of the creatives.list method. */
  var brandName: js.UndefOr[String] = js.native
}
object AdvertiserAndBrand {
  
  @scala.inline
  def apply(): AdvertiserAndBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserAndBrand]
  }
  
  @scala.inline
  implicit class AdvertiserAndBrandOps[Self <: AdvertiserAndBrand] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    
    @scala.inline
    def setBrandId(value: String): Self = this.set("brandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandId: Self = this.set("brandId", js.undefined)
    
    @scala.inline
    def setBrandName(value: String): Self = this.set("brandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandName: Self = this.set("brandName", js.undefined)
  }
}
