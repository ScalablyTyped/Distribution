package typings.nodeDashPersist.nodeDashPersistMod

import typings.nodeDashPersist.milliseconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var continuous: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[milliseconds | Boolean] = js.undefined
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  var parse: js.UndefOr[js.Function1[/* serialized */ String, _]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* toSerialize */ js.Any, String]] = js.undefined
  var ttl: js.UndefOr[milliseconds | Boolean] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    continuous: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    encoding: String = null,
    interval: milliseconds | Boolean = null,
    logging: Boolean | js.Function = null,
    parse: /* serialized */ String => _ = null,
    stringify: /* toSerialize */ js.Any => String = null,
    ttl: milliseconds | Boolean = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1(parse))
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction1(stringify))
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

