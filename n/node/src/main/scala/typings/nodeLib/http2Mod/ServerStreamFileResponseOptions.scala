package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerStreamFileResponseOptions extends js.Object {
  var getTrailers: js.UndefOr[js.Function1[/* trailers */ nodeLib.httpMod.OutgoingHttpHeaders, scala.Unit]] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ nodeLib.fsMod.Stats, 
      /* headers */ nodeLib.httpMod.OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
}

