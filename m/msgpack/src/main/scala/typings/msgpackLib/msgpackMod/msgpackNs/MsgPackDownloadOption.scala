package typings
package msgpackLib.msgpackMod.msgpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackDownloadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* option */ MsgPackDownloadOption, 
      /* result */ MsgPackCallbackResult, 
      scala.Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackDownloadOption, scala.Unit]
  ] = js.undefined
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

