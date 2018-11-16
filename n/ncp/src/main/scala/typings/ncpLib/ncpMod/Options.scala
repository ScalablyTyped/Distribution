package typings
package ncpLib.ncpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var clobber: js.UndefOr[scala.Boolean] = js.undefined
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  var errs: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  var filter: js.UndefOr[stdLib.RegExp | (js.Function1[/* filename */ java.lang.String, scala.Boolean])] = js.undefined
  var stopOnErr: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function2[
      /* read */ nodeLib.NodeJSNs.ReadableStream, 
      /* write */ nodeLib.NodeJSNs.WritableStream, 
      scala.Unit
    ]
  ] = js.undefined
}

