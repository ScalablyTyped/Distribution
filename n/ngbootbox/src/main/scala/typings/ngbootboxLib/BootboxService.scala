package typings
package ngbootboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootboxService extends js.Object {
  def addLocale(name: java.lang.String, values: bootboxLib.BootboxLocaleValues): scala.Unit
  def alert(msg: java.lang.String): js.Promise[_]
  def confirm(msg: java.lang.String): js.Promise[_]
  def customDialog(options: NgBootboxDialog): scala.Unit
  def hideAll(): scala.Unit
  def prompt(msg: java.lang.String): js.Promise[_]
  def removeLocale(name: java.lang.String): scala.Unit
  def setDefaults(options: bootboxLib.BootboxDefaultOptions): scala.Unit
  def setLocale(name: java.lang.String): scala.Unit
}

