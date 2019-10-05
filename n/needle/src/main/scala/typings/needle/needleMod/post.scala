package typings.needle.needleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", "post")
@js.native
object post extends js.Object {
  def apply(url: String, data: BodyData): ReadableStream = js.native
  def apply(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def apply(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def apply(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
}

