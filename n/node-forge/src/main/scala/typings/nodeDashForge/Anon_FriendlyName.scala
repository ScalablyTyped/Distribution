package typings.nodeDashForge

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashForge.nodeDashForgeMod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FriendlyName
  extends /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] {
  var friendlyName: js.UndefOr[js.Array[Bag]] = js.undefined
  var localKeyId: js.UndefOr[js.Array[Bag]] = js.undefined
}

object Anon_FriendlyName {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] = null,
    friendlyName: js.Array[Bag] = null,
    localKeyId: js.Array[Bag] = null
  ): Anon_FriendlyName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FriendlyName]
  }
}

