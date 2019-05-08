package typings
package osenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("osenv", JSImport.Namespace)
@js.native
object osenvMod extends js.Object {
  def editor(): java.lang.String = js.native
  def editor(
    cb: js.Function2[/* editor */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def home(): java.lang.String = js.native
  def home(
    cb: js.Function2[/* home */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def hostname(
    cb: js.Function2[
      /* hostname */ java.lang.String, 
      /* error */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): java.lang.String = js.native
  def path(): java.lang.String = js.native
  def path(
    cb: js.Function2[/* path */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def prompt(): java.lang.String = js.native
  def prompt(
    cb: js.Function2[/* prompt */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def shell(): java.lang.String = js.native
  def shell(
    cb: js.Function2[/* shell */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def tmpdir(): java.lang.String = js.native
  def tmpdir(
    cb: js.Function2[/* tmpdir */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
  def user(): java.lang.String = js.native
  def user(
    cb: js.Function2[/* user */ java.lang.String, /* error */ js.UndefOr[java.lang.String], scala.Unit]
  ): java.lang.String = js.native
}

