package typings.node.assertMod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("assert", "doesNotReject")
@js.native
object doesNotReject extends js.Object {
  
  def apply(block: js.Function0[js.Promise[_]]): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: js.Function): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: js.Function, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: RegExp): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: RegExp, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], message: String): js.Promise[Unit] = js.native
  def apply(block: js.Function0[js.Promise[_]], message: Error): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_]): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: js.Function): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: js.Function, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: js.Function, message: Error): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: RegExp): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: RegExp, message: String): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], error: RegExp, message: Error): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], message: String): js.Promise[Unit] = js.native
  def apply(block: js.Promise[_], message: Error): js.Promise[Unit] = js.native
}
