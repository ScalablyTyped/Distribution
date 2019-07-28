package typings.nodemailer.libSharedMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemailer.libSmtpDashConnectionMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/shared", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assign(target: js.Object, sources: js.Object*): js.Object = js.native
  def callbackPromise(resolve: js.Function1[/* repeated */ js.Any, Unit], reject: js.Function1[/* err */ Error, Unit]): js.Function0[Unit] = js.native
  def encodeXText(str: String): String = js.native
  def getLogger(): Logger = js.native
  def getLogger(options: StringDictionary[js.Any]): Logger = js.native
  def getLogger(options: StringDictionary[js.Any], defaults: StringDictionary[js.Any]): Logger = js.native
  def parseConnectionUrl(url: String): Options = js.native
  def resolveContent(data: js.Array[_], key: String): js.Promise[Buffer | String] = js.native
  def resolveContent(
    data: js.Array[_],
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def resolveContent(data: js.Array[_], key: Double): js.Promise[Buffer | String] = js.native
  def resolveContent(
    data: js.Array[_],
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def resolveContent(data: js.Object, key: String): js.Promise[Buffer | String] = js.native
  def resolveContent(
    data: js.Object,
    key: String,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def resolveContent(data: js.Object, key: Double): js.Promise[Buffer | String] = js.native
  def resolveContent(
    data: js.Object,
    key: Double,
    callback: js.Function2[/* err */ Error | Null, /* value */ Buffer | String, Unit]
  ): Unit = js.native
  def resolveHostname(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  def resolveHostname(
    options: Null,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
  def resolveHostname(
    options: ResolveHostnameOptions,
    callback: js.Function2[/* err */ Error | Null, /* value */ ResolveHostnameValue, Unit]
  ): Unit = js.native
}

