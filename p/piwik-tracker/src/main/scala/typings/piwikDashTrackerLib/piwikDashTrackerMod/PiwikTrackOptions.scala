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

