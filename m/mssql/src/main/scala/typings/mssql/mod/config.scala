package typings.mssql.mod

import typings.tedious.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  /**
    * Invoked before opening the connection. The parameter conn is the configured
    * tedious Connection. It can be used for attaching event handlers.
    */
  var beforeConnect: js.UndefOr[js.Function1[/* conn */ Connection, Unit]] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var database: String
  var domain: js.UndefOr[String] = js.undefined
  var driver: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[IOptions] = js.undefined
  var parseJSON: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[IPool] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var server: String
  var stream: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object config {
  @scala.inline
  def apply(
    database: String,
    server: String,
    beforeConnect: /* conn */ Connection => Unit = null,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    domain: String = null,
    driver: String = null,
    options: IOptions = null,
    parseJSON: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    pool: IPool = null,
    port: js.UndefOr[Double] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): config = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    if (beforeConnect != null) __obj.updateDynamic("beforeConnect")(js.Any.fromFunction1(beforeConnect))
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (driver != null) __obj.updateDynamic("driver")(driver.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
}

