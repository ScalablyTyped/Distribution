package typings.atPollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fs
  extends /* key */ StringDictionary[js.Any] {
  var fs: js.UndefOr[Anon_RecordingsDir] = js.undefined
  var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
  var `local-storage`: js.UndefOr[Anon_ContextKey] = js.undefined
  var rest: js.UndefOr[Anon_ApiNamespace] = js.undefined
}

object Anon_Fs {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fs: Anon_RecordingsDir = null,
    keepUnusedRequests: js.UndefOr[Boolean] = js.undefined,
    `local-storage`: Anon_ContextKey = null,
    rest: Anon_ApiNamespace = null
  ): Anon_Fs = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (!js.isUndefined(keepUnusedRequests)) __obj.updateDynamic("keepUnusedRequests")(keepUnusedRequests)
    if (`local-storage` != null) __obj.updateDynamic("local-storage")(`local-storage`)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    __obj.asInstanceOf[Anon_Fs]
  }
}

