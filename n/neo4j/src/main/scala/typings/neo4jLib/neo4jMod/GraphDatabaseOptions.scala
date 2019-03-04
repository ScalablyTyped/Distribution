package typings
package neo4jLib.neo4jMod

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
  var auth: java.lang.String | Authentication
  /**
    * HTTP headers.
    * @type {Object}
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  /**
    * Proxy address.
    * @type {string}
    */
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL connection.
    * @type {string}
    */
  var url: java.lang.String
}

object GraphDatabaseOptions {
  @scala.inline
  def apply(
    auth: java.lang.String | Authentication,
    url: java.lang.String,
    agent: js.Any = null,
    headers: js.Object = null,
    proxy: java.lang.String = null
  ): GraphDatabaseOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], url = url)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[GraphDatabaseOptions]
  }
}

