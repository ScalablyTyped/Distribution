package typings
package mobileDashDetectLib.mobileDashDetectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileDetect extends js.Object {
  def is(key: java.lang.String): scala.Boolean = js.native
  def isPhoneSized(): scala.Boolean = js.native
  def isPhoneSized(maxPhoneWidth: scala.Double): scala.Boolean = js.native
  def `match`(pattern: java.lang.String): scala.Boolean = js.native
  def `match`(pattern: stdLib.RegExp): scala.Boolean = js.native
  def mobile(): java.lang.String = js.native
  def mobileGrade(): java.lang.String = js.native
  def os(): java.lang.String = js.native
  def phone(): java.lang.String = js.native
  def tablet(): java.lang.String = js.native
  def userAgent(): java.lang.String = js.native
  def userAgents(): js.Array[java.lang.String] = js.native
  def version(value: java.lang.String): scala.Double = js.native
  def versionStr(value: java.lang.String): java.lang.String = js.native
}

