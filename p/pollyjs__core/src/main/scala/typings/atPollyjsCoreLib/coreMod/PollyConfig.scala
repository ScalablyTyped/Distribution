package typings
package atPollyjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollyConfig extends js.Object {
  var adapterOptions: js.UndefOr[js.Any] = js.undefined
  var adapters: js.UndefOr[js.Array[java.lang.String | atPollyjsCoreLib.Anon_Name]] = js.undefined
  var expiresIn: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var matchRequestsBy: js.UndefOr[atPollyjsCoreLib.Anon_Body] = js.undefined
  var mode: js.UndefOr[atPollyjsUtilsLib.utilsMod.MODES | java.lang.String] = js.undefined
  var persister: js.UndefOr[java.lang.String | atPollyjsCoreLib.Anon_NameType] = js.undefined
  var persisterOptions: js.UndefOr[atPollyjsCoreLib.Anon_KeepUnusedRequests] = js.undefined
  var recordFailedRequests: js.UndefOr[scala.Boolean] = js.undefined
  var recordIfExpired: js.UndefOr[scala.Boolean] = js.undefined
  var recordIfMissing: js.UndefOr[scala.Boolean] = js.undefined
  var timing: js.UndefOr[
    (js.Function1[/* ms */ scala.Double, js.Promise[scala.Unit]]) | js.Function0[js.Promise[scala.Unit]]
  ] = js.undefined
}

