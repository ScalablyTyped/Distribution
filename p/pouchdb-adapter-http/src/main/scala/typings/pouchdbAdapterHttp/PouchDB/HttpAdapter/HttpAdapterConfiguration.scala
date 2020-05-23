package typings.pouchdbAdapterHttp.PouchDB.HttpAdapter

import typings.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import typings.pouchdbCore.anon.Password
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: http,
    auth: Password = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
}

