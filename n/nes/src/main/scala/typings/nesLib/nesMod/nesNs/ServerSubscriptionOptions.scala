package typings
package nesLib.nesMod.nesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerSubscriptionOptions extends js.Object {
  var auth: js.UndefOr[scala.Boolean | ServerSubscriptionOptionsAuthOptions] = js.undefined
  var filter: js.UndefOr[
    js.Function4[
      /* path */ java.lang.String, 
      /* message */ js.Any, 
      /* options */ ServerSubscriptionOptionsFilterOptions, 
      /* next */ js.Function2[/* isMatch */ scala.Boolean, /* override */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.undefined
  var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.undefined
}

