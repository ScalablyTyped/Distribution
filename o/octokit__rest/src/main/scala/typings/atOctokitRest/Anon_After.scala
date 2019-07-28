package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.HookError
import typings.atOctokitRest.atOctokitRestMod.HookOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  def after(name: String, callback: js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]): Unit
  def before(name: String, callback: js.Function1[/* options */ HookOptions, Unit]): Unit
  def error(name: String, callback: js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]): Unit
  def wrap(
    name: String,
    callback: js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
      /* options */ HookOptions, 
      Unit
    ]
  ): Unit
}

object Anon_After {
  @scala.inline
  def apply(
    after: (String, js.Function2[/* response */ Response[_], /* options */ HookOptions, Unit]) => Unit,
    before: (String, js.Function1[/* options */ HookOptions, Unit]) => Unit,
    error: (String, js.Function2[/* error */ HookError, /* options */ HookOptions, Unit]) => Unit,
    wrap: (String, js.Function2[
      /* request */ js.Function1[/* options */ HookOptions, js.Promise[Response[_]]], 
      /* options */ HookOptions, 
      Unit
    ]) => Unit
  ): Anon_After = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), before = js.Any.fromFunction2(before), error = js.Any.fromFunction2(error), wrap = js.Any.fromFunction2(wrap))
  
    __obj.asInstanceOf[Anon_After]
  }
}

