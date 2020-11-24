package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemixInfo extends js.Object {
  
  /** Resource ids for the sources of this remix, of the form: `assets/{ASSET_ID}` */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.native
}
object RemixInfo {
  
  @scala.inline
  def apply(): RemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixInfo]
  }
  
  @scala.inline
  implicit class RemixInfoOps[Self <: RemixInfo] (val x: Self) extends AnyVal {
    
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
    def setSourceAssetVarargs(value: String*): Self = this.set("sourceAsset", js.Array(value :_*))
    
    @scala.inline
    def setSourceAsset(value: js.Array[String]): Self = this.set("sourceAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAsset: Self = this.set("sourceAsset", js.undefined)
  }
}
