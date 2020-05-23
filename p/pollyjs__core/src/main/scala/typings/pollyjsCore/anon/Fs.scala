package typings.pollyjsCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fs
  extends /* key */ StringDictionary[js.Any] {
  var fs: js.UndefOr[RecordingsDir] = js.undefined
  var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
  var `local-storage`: js.UndefOr[Key] = js.undefined
  var rest: js.UndefOr[ApiNamespace] = js.undefined
}

object Fs {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fs: RecordingsDir = null,
    keepUnusedRequests: js.UndefOr[Boolean] = js.undefined,
    `local-storage`: Key = null,
    rest: ApiNamespace = null
  ): Fs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(keepUnusedRequests)) __obj.updateDynamic("keepUnusedRequests")(keepUnusedRequests.get.asInstanceOf[js.Any])
    if (`local-storage` != null) __obj.updateDynamic("local-storage")(`local-storage`.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fs]
  }
}

