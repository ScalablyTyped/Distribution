package typings
package nodeDashPersistLib.nodeDashPersistMod.NodePersistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[nodeDashPersistLib.milliseconds | scala.Boolean] = js.undefined
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var parse: js.UndefOr[js.Function1[/* serialized */ java.lang.String, _]] = js.undefined
  var stringify: js.UndefOr[js.Function1[/* toSerialize */ js.Any, java.lang.String]] = js.undefined
  var ttl: js.UndefOr[nodeDashPersistLib.milliseconds | scala.Boolean] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    encoding: java.lang.String = null,
    interval: nodeDashPersistLib.milliseconds | scala.Boolean = null,
    logging: scala.Boolean | js.Function = null,
    parse: js.Function1[/* serialized */ java.lang.String, _] = null,
    stringify: js.Function1[/* toSerialize */ js.Any, java.lang.String] = null,
    ttl: nodeDashPersistLib.milliseconds | scala.Boolean = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

