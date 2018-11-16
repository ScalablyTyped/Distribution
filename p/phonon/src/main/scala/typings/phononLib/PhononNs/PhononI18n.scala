package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Internationalization ***/
@js.native
trait PhononI18n extends js.Object {
  def bind(): scala.Unit = js.native
  def bind(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def bind(element: phononLib.Element): scala.Unit = js.native
  def bind(element: phononLib.Element, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String, callback: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def get(key: js.Array[java.lang.String], callback: js.Function1[/* values */ js.Any, scala.Unit]): scala.Unit = js.native
  def getAll(callback: js.Function1[/* json */ js.Any, scala.Unit]): scala.Unit = js.native
  def getLocale(): java.lang.String = js.native
  def getPreference(): java.lang.String = js.native
  def setPreference(newLanguage: java.lang.String): scala.Unit = js.native
}

