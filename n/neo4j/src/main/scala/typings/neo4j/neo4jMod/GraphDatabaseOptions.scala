package typings.neo4j.neo4jMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphDatabaseOptions extends js.Object {
  /**
    * HTTP agent.
    * @type {any}
    */
  var agent: js.UndefOr[js.Any] = js.undefined
  /**
    * Authentication information.
    * @type {string|Authentication}
    */
  var auth: String | Authentication
  /**
    * HTTP headers.
    * @type {Object}
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * Proxy address.
    * @type {string}
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * URL connection.
    * @type {string}
    */
  var url: String
}

object GraphDatabaseOptions {
  @scala.inline
  def apply(
    auth: String | Authentication,
    url: String,
    agent: js.Any = null,
    headers: js.Object = null,
    proxy: String = null
  ): GraphDatabaseOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphDatabaseOptions]
  }
}

