package typings.piwikTracker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// refer to http://developer.piwik.org/api-reference/tracking-api
@js.native
trait PiwikTrackOptions extends js.Object {
  var _cvar: js.UndefOr[String] = js.native
  var _ects: js.UndefOr[Double] = js.native
  var _id: js.UndefOr[String] = js.native
  var _idts: js.UndefOr[String] = js.native
  var _idvc: js.UndefOr[String] = js.native
  var _rck: js.UndefOr[String] = js.native
  var _rcn: js.UndefOr[String] = js.native
  var _viewts: js.UndefOr[String] = js.native
  // Recommended parameters
  var action_name: js.UndefOr[String] = js.native
  var apiv: js.UndefOr[Double] = js.native
  var c_i: js.UndefOr[String] = js.native
  // Optional Content Tracking info
  var c_n: js.UndefOr[String] = js.native
  var c_p: js.UndefOr[String] = js.native
  var c_t: js.UndefOr[String] = js.native
  var cdt: js.UndefOr[String] = js.native
  var cid: js.UndefOr[String] = js.native
  var cip: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var cs: js.UndefOr[String] = js.native
  // Optional Action info
  var cvar: js.UndefOr[String] = js.native
  var download: js.UndefOr[String] = js.native
  var e_a: js.UndefOr[String] = js.native
  // Optional Event Tracking info
  var e_c: js.UndefOr[String] = js.native
  var e_n: js.UndefOr[String] = js.native
  var e_v: js.UndefOr[String] = js.native
  var ec_dt: js.UndefOr[Double] = js.native
  // Optional Ecommerce info
  var ec_id: js.UndefOr[String] = js.native
  var ec_items: js.UndefOr[String] = js.native
  var ec_sh: js.UndefOr[Double] = js.native
  var ec_st: js.UndefOr[Double] = js.native
  var ec_tx: js.UndefOr[Double] = js.native
  var gt_ms: js.UndefOr[Double] = js.native
  var h: js.UndefOr[Double] = js.native
  var idgoal: js.UndefOr[Double] = js.native
  var lang: js.UndefOr[String] = js.native
  var lat: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var long: js.UndefOr[String] = js.native
  var m: js.UndefOr[Double] = js.native
  var new_visit: js.UndefOr[Double] = js.native
  var rand: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var res: js.UndefOr[String] = js.native
  var revenue: js.UndefOr[Double] = js.native
  var s: js.UndefOr[Double] = js.native
  var search: js.UndefOr[String] = js.native
  var search_cat: js.UndefOr[String] = js.native
  var search_count: js.UndefOr[Double] = js.native
  // Other parameters
  var send_image: js.UndefOr[Double] = js.native
  // Other parameters (require authentication via token_auth)
  var token_auth: js.UndefOr[String] = js.native
  var ua: js.UndefOr[String] = js.native
  var uid: js.UndefOr[String] = js.native
  // Required parameters
  var url: String = js.native
  // Optional User info
  var urlref: js.UndefOr[String] = js.native
}

object PiwikTrackOptions {
  @scala.inline
  def apply(url: String): PiwikTrackOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiwikTrackOptions]
  }
  @scala.inline
  implicit class PiwikTrackOptionsOps[Self <: PiwikTrackOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def set_cvar(value: String): Self = this.set("_cvar", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_cvar: Self = this.set("_cvar", js.undefined)
    @scala.inline
    def set_ects(value: Double): Self = this.set("_ects", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_ects: Self = this.set("_ects", js.undefined)
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    @scala.inline
    def set_idts(value: String): Self = this.set("_idts", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_idts: Self = this.set("_idts", js.undefined)
    @scala.inline
    def set_idvc(value: String): Self = this.set("_idvc", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_idvc: Self = this.set("_idvc", js.undefined)
    @scala.inline
    def set_rck(value: String): Self = this.set("_rck", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rck: Self = this.set("_rck", js.undefined)
    @scala.inline
    def set_rcn(value: String): Self = this.set("_rcn", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rcn: Self = this.set("_rcn", js.undefined)
    @scala.inline
    def set_viewts(value: String): Self = this.set("_viewts", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_viewts: Self = this.set("_viewts", js.undefined)
    @scala.inline
    def setAction_name(value: String): Self = this.set("action_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction_name: Self = this.set("action_name", js.undefined)
    @scala.inline
    def setApiv(value: Double): Self = this.set("apiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiv: Self = this.set("apiv", js.undefined)
    @scala.inline
    def setC_i(value: String): Self = this.set("c_i", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC_i: Self = this.set("c_i", js.undefined)
    @scala.inline
    def setC_n(value: String): Self = this.set("c_n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC_n: Self = this.set("c_n", js.undefined)
    @scala.inline
    def setC_p(value: String): Self = this.set("c_p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC_p: Self = this.set("c_p", js.undefined)
    @scala.inline
    def setC_t(value: String): Self = this.set("c_t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC_t: Self = this.set("c_t", js.undefined)
    @scala.inline
    def setCdt(value: String): Self = this.set("cdt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdt: Self = this.set("cdt", js.undefined)
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    @scala.inline
    def setCip(value: String): Self = this.set("cip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCip: Self = this.set("cip", js.undefined)
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCs(value: String): Self = this.set("cs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCs: Self = this.set("cs", js.undefined)
    @scala.inline
    def setCvar(value: String): Self = this.set("cvar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCvar: Self = this.set("cvar", js.undefined)
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setE_a(value: String): Self = this.set("e_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE_a: Self = this.set("e_a", js.undefined)
    @scala.inline
    def setE_c(value: String): Self = this.set("e_c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE_c: Self = this.set("e_c", js.undefined)
    @scala.inline
    def setE_n(value: String): Self = this.set("e_n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE_n: Self = this.set("e_n", js.undefined)
    @scala.inline
    def setE_v(value: String): Self = this.set("e_v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE_v: Self = this.set("e_v", js.undefined)
    @scala.inline
    def setEc_dt(value: Double): Self = this.set("ec_dt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_dt: Self = this.set("ec_dt", js.undefined)
    @scala.inline
    def setEc_id(value: String): Self = this.set("ec_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_id: Self = this.set("ec_id", js.undefined)
    @scala.inline
    def setEc_items(value: String): Self = this.set("ec_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_items: Self = this.set("ec_items", js.undefined)
    @scala.inline
    def setEc_sh(value: Double): Self = this.set("ec_sh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_sh: Self = this.set("ec_sh", js.undefined)
    @scala.inline
    def setEc_st(value: Double): Self = this.set("ec_st", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_st: Self = this.set("ec_st", js.undefined)
    @scala.inline
    def setEc_tx(value: Double): Self = this.set("ec_tx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc_tx: Self = this.set("ec_tx", js.undefined)
    @scala.inline
    def setGt_ms(value: Double): Self = this.set("gt_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGt_ms: Self = this.set("gt_ms", js.undefined)
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setIdgoal(value: Double): Self = this.set("idgoal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdgoal: Self = this.set("idgoal", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLat(value: String): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    @scala.inline
    def setM(value: Double): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setNew_visit(value: Double): Self = this.set("new_visit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_visit: Self = this.set("new_visit", js.undefined)
    @scala.inline
    def setRand(value: String): Self = this.set("rand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRand: Self = this.set("rand", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRes(value: String): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    @scala.inline
    def setRevenue(value: Double): Self = this.set("revenue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevenue: Self = this.set("revenue", js.undefined)
    @scala.inline
    def setS(value: Double): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSearch_cat(value: String): Self = this.set("search_cat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_cat: Self = this.set("search_cat", js.undefined)
    @scala.inline
    def setSearch_count(value: Double): Self = this.set("search_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_count: Self = this.set("search_count", js.undefined)
    @scala.inline
    def setSend_image(value: Double): Self = this.set("send_image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSend_image: Self = this.set("send_image", js.undefined)
    @scala.inline
    def setToken_auth(value: String): Self = this.set("token_auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_auth: Self = this.set("token_auth", js.undefined)
    @scala.inline
    def setUa(value: String): Self = this.set("ua", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUa: Self = this.set("ua", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUrlref(value: String): Self = this.set("urlref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlref: Self = this.set("urlref", js.undefined)
  }
  
}

