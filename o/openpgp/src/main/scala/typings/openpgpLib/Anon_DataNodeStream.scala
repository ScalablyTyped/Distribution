package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNodeStream extends js.Object {
  var data: java.lang.String | ReadableStream[java.lang.String] | NodeStream
}

object Anon_DataNodeStream {
  @scala.inline
  def apply(data: java.lang.String | ReadableStream[java.lang.String] | NodeStream): Anon_DataNodeStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataNodeStream]
  }
}

