package typings
package nodeDashPolyglotLib.nodeDashPolyglotMod.PolyglotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyglotOptions extends js.Object {
  var allowMissing: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var onMissingKey: js.UndefOr[
    js.Function3[
      /* key */ java.lang.String, 
      /* options */ js.UndefOr[InterpolationOptions], 
      /* locale */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.undefined
  var phrases: js.UndefOr[js.Any] = js.undefined
}

