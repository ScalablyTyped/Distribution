package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZlibOptions extends js.Object {
   // default: zlib.constants.Z_FINISH
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var dictionary: js.UndefOr[
    nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView | stdLib.ArrayBuffer
  ] = js.undefined
   // default: zlib.constants.Z_NO_FLUSH
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  var flush: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var memLevel: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var strategy: js.UndefOr[scala.Double] = js.undefined
   // default: 16*1024
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

