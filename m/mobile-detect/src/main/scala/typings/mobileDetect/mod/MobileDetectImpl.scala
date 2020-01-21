package typings.mobileDetect.mod

import typings.mobileDetect.AnonFullPattern
import typings.mobileDetect.AnonOss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileDetectImpl extends js.Object {
  var FALLBACK_MOBILE: String = js.native
  var FALLBACK_PHONE: String = js.native
  var FALLBACK_TABLET: String = js.native
  var detectMobileBrowsers: AnonFullPattern = js.native
  var mobileDetectRules: AnonOss = js.native
  def detectOS(userAgent: String): String = js.native
  def findMatch(rules: MobileDetectRules, userAgent: String): String = js.native
  def findMatches(rules: MobileDetectRules, userAgent: String): js.Array[String] = js.native
  def getDeviceSmallerSide(): Double = js.native
  def getVersion(propertyName: String, userAgent: String): Double = js.native
  def getVersionStr(propertyName: String, userAgent: String): String = js.native
  def isMobileFallback(userAgent: String): Boolean = js.native
  def isTabletFallback(userAgent: String): Boolean = js.native
  def mobileGrade(md: MobileDetect): String = js.native
  def prepareDetectionCache(cache: js.Object, userAgent: String): Unit = js.native
  def prepareDetectionCache(cache: js.Object, userAgent: String, maxPhoneWidth: Double): Unit = js.native
  def prepareVersionNo(version: String): Double = js.native
}

