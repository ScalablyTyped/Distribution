package typings.piwikTracker

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("piwik-tracker", JSImport.Namespace)
  @js.native
  class ^ protected () extends PiwikTracker {
    def this(siteId: Double, trackerUrl: String) = this()
  }
  
  // refer to http://developer.piwik.org/api-reference/tracking-api
  trait PiwikTrackOptions extends StObject {
    
    var _cvar: js.UndefOr[String] = js.undefined
    
    var _ects: js.UndefOr[Double] = js.undefined
    
    var _id: js.UndefOr[String] = js.undefined
    
    var _idts: js.UndefOr[String] = js.undefined
    
    var _idvc: js.UndefOr[String] = js.undefined
    
    var _rck: js.UndefOr[String] = js.undefined
    
    var _rcn: js.UndefOr[String] = js.undefined
    
    var _viewts: js.UndefOr[String] = js.undefined
    
    // Recommended parameters
    var action_name: js.UndefOr[String] = js.undefined
    
    var apiv: js.UndefOr[Double] = js.undefined
    
    var c_i: js.UndefOr[String] = js.undefined
    
    // Optional Content Tracking info
    var c_n: js.UndefOr[String] = js.undefined
    
    var c_p: js.UndefOr[String] = js.undefined
    
    var c_t: js.UndefOr[String] = js.undefined
    
    var cdt: js.UndefOr[String] = js.undefined
    
    var cid: js.UndefOr[String] = js.undefined
    
    var cip: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var cs: js.UndefOr[String] = js.undefined
    
    // Optional Action info
    var cvar: js.UndefOr[String] = js.undefined
    
    var download: js.UndefOr[String] = js.undefined
    
    var e_a: js.UndefOr[String] = js.undefined
    
    // Optional Event Tracking info
    var e_c: js.UndefOr[String] = js.undefined
    
    var e_n: js.UndefOr[String] = js.undefined
    
    var e_v: js.UndefOr[String] = js.undefined
    
    var ec_dt: js.UndefOr[Double] = js.undefined
    
    // Optional Ecommerce info
    var ec_id: js.UndefOr[String] = js.undefined
    
    var ec_items: js.UndefOr[String] = js.undefined
    
    var ec_sh: js.UndefOr[Double] = js.undefined
    
    var ec_st: js.UndefOr[Double] = js.undefined
    
    var ec_tx: js.UndefOr[Double] = js.undefined
    
    var gt_ms: js.UndefOr[Double] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var idgoal: js.UndefOr[Double] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var lat: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var long: js.UndefOr[String] = js.undefined
    
    var m: js.UndefOr[Double] = js.undefined
    
    var new_visit: js.UndefOr[Double] = js.undefined
    
    var rand: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var res: js.UndefOr[String] = js.undefined
    
    var revenue: js.UndefOr[Double] = js.undefined
    
    var s: js.UndefOr[Double] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var search_cat: js.UndefOr[String] = js.undefined
    
    var search_count: js.UndefOr[Double] = js.undefined
    
    // Other parameters
    var send_image: js.UndefOr[Double] = js.undefined
    
    // Other parameters (require authentication via token_auth)
    var token_auth: js.UndefOr[String] = js.undefined
    
    var ua: js.UndefOr[String] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
    
    // Required parameters
    var url: String
    
    // Optional User info
    var urlref: js.UndefOr[String] = js.undefined
  }
  object PiwikTrackOptions {
    
    inline def apply(url: String): PiwikTrackOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PiwikTrackOptions]
    }
    
    extension [Self <: PiwikTrackOptions](x: Self) {
      
      inline def setAction_name(value: String): Self = StObject.set(x, "action_name", value.asInstanceOf[js.Any])
      
      inline def setAction_nameUndefined: Self = StObject.set(x, "action_name", js.undefined)
      
      inline def setApiv(value: Double): Self = StObject.set(x, "apiv", value.asInstanceOf[js.Any])
      
      inline def setApivUndefined: Self = StObject.set(x, "apiv", js.undefined)
      
      inline def setC_i(value: String): Self = StObject.set(x, "c_i", value.asInstanceOf[js.Any])
      
      inline def setC_iUndefined: Self = StObject.set(x, "c_i", js.undefined)
      
      inline def setC_n(value: String): Self = StObject.set(x, "c_n", value.asInstanceOf[js.Any])
      
      inline def setC_nUndefined: Self = StObject.set(x, "c_n", js.undefined)
      
      inline def setC_p(value: String): Self = StObject.set(x, "c_p", value.asInstanceOf[js.Any])
      
      inline def setC_pUndefined: Self = StObject.set(x, "c_p", js.undefined)
      
      inline def setC_t(value: String): Self = StObject.set(x, "c_t", value.asInstanceOf[js.Any])
      
      inline def setC_tUndefined: Self = StObject.set(x, "c_t", js.undefined)
      
      inline def setCdt(value: String): Self = StObject.set(x, "cdt", value.asInstanceOf[js.Any])
      
      inline def setCdtUndefined: Self = StObject.set(x, "cdt", js.undefined)
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setCip(value: String): Self = StObject.set(x, "cip", value.asInstanceOf[js.Any])
      
      inline def setCipUndefined: Self = StObject.set(x, "cip", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCs(value: String): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      inline def setCsUndefined: Self = StObject.set(x, "cs", js.undefined)
      
      inline def setCvar(value: String): Self = StObject.set(x, "cvar", value.asInstanceOf[js.Any])
      
      inline def setCvarUndefined: Self = StObject.set(x, "cvar", js.undefined)
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setE_a(value: String): Self = StObject.set(x, "e_a", value.asInstanceOf[js.Any])
      
      inline def setE_aUndefined: Self = StObject.set(x, "e_a", js.undefined)
      
      inline def setE_c(value: String): Self = StObject.set(x, "e_c", value.asInstanceOf[js.Any])
      
      inline def setE_cUndefined: Self = StObject.set(x, "e_c", js.undefined)
      
      inline def setE_n(value: String): Self = StObject.set(x, "e_n", value.asInstanceOf[js.Any])
      
      inline def setE_nUndefined: Self = StObject.set(x, "e_n", js.undefined)
      
      inline def setE_v(value: String): Self = StObject.set(x, "e_v", value.asInstanceOf[js.Any])
      
      inline def setE_vUndefined: Self = StObject.set(x, "e_v", js.undefined)
      
      inline def setEc_dt(value: Double): Self = StObject.set(x, "ec_dt", value.asInstanceOf[js.Any])
      
      inline def setEc_dtUndefined: Self = StObject.set(x, "ec_dt", js.undefined)
      
      inline def setEc_id(value: String): Self = StObject.set(x, "ec_id", value.asInstanceOf[js.Any])
      
      inline def setEc_idUndefined: Self = StObject.set(x, "ec_id", js.undefined)
      
      inline def setEc_items(value: String): Self = StObject.set(x, "ec_items", value.asInstanceOf[js.Any])
      
      inline def setEc_itemsUndefined: Self = StObject.set(x, "ec_items", js.undefined)
      
      inline def setEc_sh(value: Double): Self = StObject.set(x, "ec_sh", value.asInstanceOf[js.Any])
      
      inline def setEc_shUndefined: Self = StObject.set(x, "ec_sh", js.undefined)
      
      inline def setEc_st(value: Double): Self = StObject.set(x, "ec_st", value.asInstanceOf[js.Any])
      
      inline def setEc_stUndefined: Self = StObject.set(x, "ec_st", js.undefined)
      
      inline def setEc_tx(value: Double): Self = StObject.set(x, "ec_tx", value.asInstanceOf[js.Any])
      
      inline def setEc_txUndefined: Self = StObject.set(x, "ec_tx", js.undefined)
      
      inline def setGt_ms(value: Double): Self = StObject.set(x, "gt_ms", value.asInstanceOf[js.Any])
      
      inline def setGt_msUndefined: Self = StObject.set(x, "gt_ms", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setIdgoal(value: Double): Self = StObject.set(x, "idgoal", value.asInstanceOf[js.Any])
      
      inline def setIdgoalUndefined: Self = StObject.set(x, "idgoal", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setLongUndefined: Self = StObject.set(x, "long", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setNew_visit(value: Double): Self = StObject.set(x, "new_visit", value.asInstanceOf[js.Any])
      
      inline def setNew_visitUndefined: Self = StObject.set(x, "new_visit", js.undefined)
      
      inline def setRand(value: String): Self = StObject.set(x, "rand", value.asInstanceOf[js.Any])
      
      inline def setRandUndefined: Self = StObject.set(x, "rand", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setRevenue(value: Double): Self = StObject.set(x, "revenue", value.asInstanceOf[js.Any])
      
      inline def setRevenueUndefined: Self = StObject.set(x, "revenue", js.undefined)
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSearch_cat(value: String): Self = StObject.set(x, "search_cat", value.asInstanceOf[js.Any])
      
      inline def setSearch_catUndefined: Self = StObject.set(x, "search_cat", js.undefined)
      
      inline def setSearch_count(value: Double): Self = StObject.set(x, "search_count", value.asInstanceOf[js.Any])
      
      inline def setSearch_countUndefined: Self = StObject.set(x, "search_count", js.undefined)
      
      inline def setSend_image(value: Double): Self = StObject.set(x, "send_image", value.asInstanceOf[js.Any])
      
      inline def setSend_imageUndefined: Self = StObject.set(x, "send_image", js.undefined)
      
      inline def setToken_auth(value: String): Self = StObject.set(x, "token_auth", value.asInstanceOf[js.Any])
      
      inline def setToken_authUndefined: Self = StObject.set(x, "token_auth", js.undefined)
      
      inline def setUa(value: String): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
      
      inline def setUaUndefined: Self = StObject.set(x, "ua", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlref(value: String): Self = StObject.set(x, "urlref", value.asInstanceOf[js.Any])
      
      inline def setUrlrefUndefined: Self = StObject.set(x, "urlref", js.undefined)
      
      inline def set_cvar(value: String): Self = StObject.set(x, "_cvar", value.asInstanceOf[js.Any])
      
      inline def set_cvarUndefined: Self = StObject.set(x, "_cvar", js.undefined)
      
      inline def set_ects(value: Double): Self = StObject.set(x, "_ects", value.asInstanceOf[js.Any])
      
      inline def set_ectsUndefined: Self = StObject.set(x, "_ects", js.undefined)
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
      
      inline def set_idts(value: String): Self = StObject.set(x, "_idts", value.asInstanceOf[js.Any])
      
      inline def set_idtsUndefined: Self = StObject.set(x, "_idts", js.undefined)
      
      inline def set_idvc(value: String): Self = StObject.set(x, "_idvc", value.asInstanceOf[js.Any])
      
      inline def set_idvcUndefined: Self = StObject.set(x, "_idvc", js.undefined)
      
      inline def set_rck(value: String): Self = StObject.set(x, "_rck", value.asInstanceOf[js.Any])
      
      inline def set_rckUndefined: Self = StObject.set(x, "_rck", js.undefined)
      
      inline def set_rcn(value: String): Self = StObject.set(x, "_rcn", value.asInstanceOf[js.Any])
      
      inline def set_rcnUndefined: Self = StObject.set(x, "_rcn", js.undefined)
      
      inline def set_viewts(value: String): Self = StObject.set(x, "_viewts", value.asInstanceOf[js.Any])
      
      inline def set_viewtsUndefined: Self = StObject.set(x, "_viewts", js.undefined)
    }
  }
  
  @js.native
  trait PiwikTracker extends EventEmitter {
    
    def track(options: PiwikTrackOptions): Unit = js.native
  }
}
