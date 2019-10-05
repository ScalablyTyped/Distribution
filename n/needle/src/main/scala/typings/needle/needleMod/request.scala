package typings.needle.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", "request")
@js.native
object request extends js.Object {
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData): ReadableStream = js.native
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def apply(method: NeedleHttpVerbs, url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def apply(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: NeedleOptions,
    callback: NeedleCallback
  ): ReadableStream = js.native
}

