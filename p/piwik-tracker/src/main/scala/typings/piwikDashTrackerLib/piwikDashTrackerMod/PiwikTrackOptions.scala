package typings
package piwikDashTrackerLib.piwikDashTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// refer to http://developer.piwik.org/api-reference/tracking-api
trait PiwikTrackOptions extends js.Object {
  var _cvar: js.UndefOr[java.lang.String] = js.undefined
  var _ects: js.UndefOr[scala.Double] = js.undefined
  var _id: js.UndefOr[java.lang.String] = js.undefined
  var _idts: js.UndefOr[java.lang.String] = js.undefined
  var _idvc: js.UndefOr[java.lang.String] = js.undefined
  var _rck: js.UndefOr[java.lang.String] = js.undefined
  var _rcn: js.UndefOr[java.lang.String] = js.undefined
  var _viewts: js.UndefOr[java.lang.String] = js.undefined
  // Recommended parameters
  var action_name: js.UndefOr[java.lang.String] = js.undefined
  var apiv: js.UndefOr[scala.Double] = js.undefined
  var c_i: js.UndefOr[java.lang.String] = js.undefined
  // Optional Content Tracking info
  var c_n: js.UndefOr[java.lang.String] = js.undefined
  var c_p: js.UndefOr[java.lang.String] = js.undefined
  var c_t: js.UndefOr[java.lang.String] = js.undefined
  var cdt: js.UndefOr[java.lang.String] = js.undefined
  var cid: js.UndefOr[java.lang.String] = js.undefined
  var cip: js.UndefOr[java.lang.String] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var cs: js.UndefOr[java.lang.String] = js.undefined
  // Optional Action info
  var cvar: js.UndefOr[java.lang.String] = js.undefined
  var download: js.UndefOr[java.lang.String] = js.undefined
  var e_a: js.UndefOr[java.lang.String] = js.undefined
  // Optional Event Tracking info
  var e_c: js.UndefOr[java.lang.String] = js.undefined
  var e_n: js.UndefOr[java.lang.String] = js.undefined
  var e_v: js.UndefOr[java.lang.String] = js.undefined
  var ec_dt: js.UndefOr[scala.Double] = js.undefined
  // Optional Ecommerce info
  var ec_id: js.UndefOr[java.lang.String] = js.undefined
  var ec_items: js.UndefOr[java.lang.String] = js.undefined
  var ec_sh: js.UndefOr[scala.Double] = js.undefined
  var ec_st: js.UndefOr[scala.Double] = js.undefined
  var ec_tx: js.UndefOr[scala.Double] = js.undefined
  var gt_ms: js.UndefOr[scala.Double] = js.undefined
  var h: js.UndefOr[scala.Double] = js.undefined
  var idgoal: js.UndefOr[scala.Double] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var lat: js.UndefOr[java.lang.String] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var long: js.UndefOr[java.lang.String] = js.undefined
  var m: js.UndefOr[scala.Double] = js.undefined
  var new_visit: js.UndefOr[scala.Double] = js.undefined
  var rand: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var res: js.UndefOr[java.lang.String] = js.undefined
  var revenue: js.UndefOr[scala.Double] = js.undefined
  var s: js.UndefOr[scala.Double] = js.undefined
  var search: js.UndefOr[java.lang.String] = js.undefined
  var search_cat: js.UndefOr[java.lang.String] = js.undefined
  var search_count: js.UndefOr[scala.Double] = js.undefined
  // Other parameters
  var send_image: js.UndefOr[scala.Double] = js.undefined
  // Other parameters (require authentication via token_auth)
  var token_auth: js.UndefOr[java.lang.String] = js.undefined
  var ua: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  // Required parameters
  var url: java.lang.String
  // Optional User info
  var urlref: js.UndefOr[java.lang.String] = js.undefined
}

object PiwikTrackOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    _cvar: java.lang.String = null,
    _ects: scala.Int | scala.Double = null,
    _id: java.lang.String = null,
    _idts: java.lang.String = null,
    _idvc: java.lang.String = null,
    _rck: java.lang.String = null,
    _rcn: java.lang.String = null,
    _viewts: java.lang.String = null,
    action_name: java.lang.String = null,
    apiv: scala.Int | scala.Double = null,
    c_i: java.lang.String = null,
    c_n: java.lang.String = null,
    c_p: java.lang.String = null,
    c_t: java.lang.String = null,
    cdt: java.lang.String = null,
    cid: java.lang.String = null,
    cip: java.lang.String = null,
    city: java.lang.String = null,
    country: java.lang.String = null,
    cs: java.lang.String = null,
    cvar: java.lang.String = null,
    download: java.lang.String = null,
    e_a: java.lang.String = null,
    e_c: java.lang.String = null,
    e_n: java.lang.String = null,
    e_v: java.lang.String = null,
    ec_dt: scala.Int | scala.Double = null,
    ec_id: java.lang.String = null,
    ec_items: java.lang.String = null,
    ec_sh: scala.Int | scala.Double = null,
    ec_st: scala.Int | scala.Double = null,
    ec_tx: scala.Int | scala.Double = null,
    gt_ms: scala.Int | scala.Double = null,
    h: scala.Int | scala.Double = null,
    idgoal: scala.Int | scala.Double = null,
    lang: java.lang.String = null,
    lat: java.lang.String = null,
    link: java.lang.String = null,
    long: java.lang.String = null,
    m: scala.Int | scala.Double = null,
    new_visit: scala.Int | scala.Double = null,
    rand: java.lang.String = null,
    region: java.lang.String = null,
    res: java.lang.String = null,
    revenue: scala.Int | scala.Double = null,
    s: scala.Int | scala.Double = null,
    search: java.lang.String = null,
    search_cat: java.lang.String = null,
    search_count: scala.Int | scala.Double = null,
    send_image: scala.Int | scala.Double = null,
    token_auth: java.lang.String = null,
    ua: java.lang.String = null,
    uid: java.lang.String = null,
    urlref: java.lang.String = null
  ): PiwikTrackOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (_cvar != null) __obj.updateDynamic("_cvar")(_cvar)
    if (_ects != null) __obj.updateDynamic("_ects")(_ects.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_idts != null) __obj.updateDynamic("_idts")(_idts)
    if (_idvc != null) __obj.updateDynamic("_idvc")(_idvc)
    if (_rck != null) __obj.updateDynamic("_rck")(_rck)
    if (_rcn != null) __obj.updateDynamic("_rcn")(_rcn)
    if (_viewts != null) __obj.updateDynamic("_viewts")(_viewts)
    if (action_name != null) __obj.updateDynamic("action_name")(action_name)
    if (apiv != null) __obj.updateDynamic("apiv")(apiv.asInstanceOf[js.Any])
    if (c_i != null) __obj.updateDynamic("c_i")(c_i)
    if (c_n != null) __obj.updateDynamic("c_n")(c_n)
    if (c_p != null) __obj.updateDynamic("c_p")(c_p)
    if (c_t != null) __obj.updateDynamic("c_t")(c_t)
    if (cdt != null) __obj.updateDynamic("cdt")(cdt)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (cip != null) __obj.updateDynamic("cip")(cip)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (cs != null) __obj.updateDynamic("cs")(cs)
    if (cvar != null) __obj.updateDynamic("cvar")(cvar)
    if (download != null) __obj.updateDynamic("download")(download)
    if (e_a != null) __obj.updateDynamic("e_a")(e_a)
    if (e_c != null) __obj.updateDynamic("e_c")(e_c)
    if (e_n != null) __obj.updateDynamic("e_n")(e_n)
    if (e_v != null) __obj.updateDynamic("e_v")(e_v)
    if (ec_dt != null) __obj.updateDynamic("ec_dt")(ec_dt.asInstanceOf[js.Any])
    if (ec_id != null) __obj.updateDynamic("ec_id")(ec_id)
    if (ec_items != null) __obj.updateDynamic("ec_items")(ec_items)
    if (ec_sh != null) __obj.updateDynamic("ec_sh")(ec_sh.asInstanceOf[js.Any])
    if (ec_st != null) __obj.updateDynamic("ec_st")(ec_st.asInstanceOf[js.Any])
    if (ec_tx != null) __obj.updateDynamic("ec_tx")(ec_tx.asInstanceOf[js.Any])
    if (gt_ms != null) __obj.updateDynamic("gt_ms")(gt_ms.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (idgoal != null) __obj.updateDynamic("idgoal")(idgoal.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (lat != null) __obj.updateDynamic("lat")(lat)
    if (link != null) __obj.updateDynamic("link")(link)
    if (long != null) __obj.updateDynamic("long")(long)
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (new_visit != null) __obj.updateDynamic("new_visit")(new_visit.asInstanceOf[js.Any])
    if (rand != null) __obj.updateDynamic("rand")(rand)
    if (region != null) __obj.updateDynamic("region")(region)
    if (res != null) __obj.updateDynamic("res")(res)
    if (revenue != null) __obj.updateDynamic("revenue")(revenue.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search)
    if (search_cat != null) __obj.updateDynamic("search_cat")(search_cat)
    if (search_count != null) __obj.updateDynamic("search_count")(search_count.asInstanceOf[js.Any])
    if (send_image != null) __obj.updateDynamic("send_image")(send_image.asInstanceOf[js.Any])
    if (token_auth != null) __obj.updateDynamic("token_auth")(token_auth)
    if (ua != null) __obj.updateDynamic("ua")(ua)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (urlref != null) __obj.updateDynamic("urlref")(urlref)
    __obj.asInstanceOf[PiwikTrackOptions]
  }
}

