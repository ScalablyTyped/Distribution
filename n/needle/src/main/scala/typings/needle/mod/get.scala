package typings.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("needle", "get")
@js.native
object get extends js.Object {
  
  def apply(url: String): ReadableStream = js.native
  def apply(url: String, callback: NeedleCallback): ReadableStream = js.native
  def apply(url: String, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  def apply(url: String, options: NeedleOptions): ReadableStream = js.native
  def apply(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
}
