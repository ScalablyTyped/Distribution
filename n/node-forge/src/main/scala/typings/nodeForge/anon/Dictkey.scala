package typings.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] {
  var friendlyName: js.UndefOr[js.Array[Bag]] = js.undefined
  var localKeyId: js.UndefOr[js.Array[Bag]] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] = null,
    friendlyName: js.Array[Bag] = null,
    localKeyId: js.Array[Bag] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

