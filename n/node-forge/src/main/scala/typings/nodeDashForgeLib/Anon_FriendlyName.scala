package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FriendlyName
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]]] {
  var friendlyName: js.UndefOr[js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]] = js.undefined
  var localKeyId: js.UndefOr[js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]] = js.undefined
}

object Anon_FriendlyName {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]]] = null,
    friendlyName: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag] = null,
    localKeyId: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag] = null
  ): Anon_FriendlyName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId)
    __obj.asInstanceOf[Anon_FriendlyName]
  }
}

