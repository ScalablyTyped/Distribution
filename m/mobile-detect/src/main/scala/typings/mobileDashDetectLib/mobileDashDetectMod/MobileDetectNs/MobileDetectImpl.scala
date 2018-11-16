package typings
package mobileDashDetectLib.mobileDashDetectMod.MobileDetectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileDetectImpl extends js.Object {
  var FALLBACK_MOBILE: java.lang.String = js.native
  var FALLBACK_PHONE: java.lang.String = js.native
  var FALLBACK_TABLET: java.lang.String = js.native
  var detectMobileBrowsers: mobileDashDetectLib.Anon_TabletPattern = js.native
  var mobileDetectRules: mobileDashDetectLib.Anon_Tablets = js.native
  def detectOS(userAgent: java.lang.String): java.lang.String = js.native
  def findMatch(rules: MobileDetectRules, userAgent: java.lang.String): java.lang.String = js.native
  def findMatches(rules: MobileDetectRules, userAgent: java.lang.String): js.Array[java.lang.String] = js.native
  def getDeviceSmallerSide(): scala.Double = js.native
  def getVersion(propertyName: java.lang.String, userAgent: java.lang.String): scala.Double = js.native
  def getVersionStr(propertyName: java.lang.String, userAgent: java.lang.String): java.lang.String = js.native
  def isMobileFallback(userAgent: java.lang.String): scala.Boolean = js.native
  def isTabletFallback(userAgent: java.lang.String): scala.Boolean = js.native
  def mobileGrade(md: mobileDashDetectLib.mobileDashDetectMod.MobileDetect): java.lang.String = js.native
  def prepareDetectionCache(cache: js.Object, userAgent: java.lang.String): scala.Unit = js.native
  def prepareDetectionCache(cache: js.Object, userAgent: java.lang.String, maxPhoneWidth: scala.Double): scala.Unit = js.native
  def prepareVersionNo(version: java.lang.String): scala.Double = js.native
}

