package typings.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("needle", "delete")
@js.native
object delete extends js.Object {
  /**
    * Issues an HTTP DELETE request.
    */
  def apply(url: String, data: BodyData): ReadableStream = js.native
  def apply(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  def apply(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  def apply(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  def apply(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
}

