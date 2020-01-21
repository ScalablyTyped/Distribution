package typings.nodePersist.mod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var dir: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var expiredInterval: js.UndefOr[Milliseconds] = js.undefined
  var forgiveParseErrors: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var parse: js.UndefOr[js.Function1[/* str */ String, _]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.undefined
  var ttl: js.UndefOr[Milliseconds] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    dir: String = null,
    encoding: BufferEncoding = null,
    expiredInterval: Int | Double = null,
    forgiveParseErrors: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    parse: /* str */ String => _ = null,
    stringify: /* data */ js.Any => String = null,
    ttl: Int | Double = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (expiredInterval != null) __obj.updateDynamic("expiredInterval")(expiredInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(forgiveParseErrors)) __obj.updateDynamic("forgiveParseErrors")(forgiveParseErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

