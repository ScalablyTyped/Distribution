package typings.osenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("osenv", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def editor(): String = js.native
  def editor(cb: js.Function2[/* editor */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def home(): String = js.native
  def home(cb: js.Function2[/* home */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def hostname(): String = js.native
  def hostname(cb: js.Function2[/* hostname */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def path(): String = js.native
  def path(cb: js.Function2[/* path */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def prompt(): String = js.native
  def prompt(cb: js.Function2[/* prompt */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def shell(): String = js.native
  def shell(cb: js.Function2[/* shell */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def tmpdir(): String = js.native
  def tmpdir(cb: js.Function2[/* tmpdir */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
  def user(): String = js.native
  def user(cb: js.Function2[/* user */ String, /* error */ js.UndefOr[String], Unit]): String = js.native
}

