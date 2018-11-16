package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaFile extends js.Object {
  var fullPath: java.lang.String = js.native
  var lastModifiedDate: stdLib.Date = js.native
  var name: java.lang.String = js.native
  var size: scala.Double = js.native
  var `type`: java.lang.String = js.native
  def getFormatData(successCallback: js.Function): scala.Unit = js.native
  def getFormatData(successCallback: js.Function, errorCallback: js.Function): scala.Unit = js.native
}

