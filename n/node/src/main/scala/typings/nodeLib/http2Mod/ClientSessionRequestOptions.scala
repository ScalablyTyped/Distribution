package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientSessionRequestOptions extends js.Object {
  var endStream: js.UndefOr[scala.Boolean] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var getTrailers: js.UndefOr[
    js.Function2[
      /* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      /* flags */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var parent: js.UndefOr[scala.Double] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

