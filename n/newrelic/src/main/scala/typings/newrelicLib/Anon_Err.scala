package typings
package newrelicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var moduleName: java.lang.String
  var onError: js.UndefOr[js.Function1[/* err */ stdLib.Error, scala.Unit]] = js.undefined
  def onRequire(): scala.Unit
}

