package typings
package msgpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object msgpackMod {
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ MsgPackDownloadOption, 
    /* result */ MsgPackCallbackResult, 
    scala.Unit
  ]
  type MsgPackUploadCallback = js.Function3[
    /* data */ java.lang.String, 
    /* option */ MsgPackUploadOption, 
    /* result */ MsgPackCallbackResult, 
    scala.Unit
  ]
}
