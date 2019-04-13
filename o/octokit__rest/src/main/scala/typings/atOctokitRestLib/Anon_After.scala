package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  def after(
    name: java.lang.String,
    callback: js.Function2[
      /* response */ atOctokitRestLib.atOctokitRestMod.Response[_], 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def before(
    name: java.lang.String,
    callback: js.Function1[/* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, scala.Unit]
  ): scala.Unit
  def error(
    name: java.lang.String,
    callback: js.Function2[
      /* error */ atOctokitRestLib.atOctokitRestMod.HookError, 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]
  ): scala.Unit
  def wrap(
    name: java.lang.String,
    callback: js.Function2[
      /* request */ js.Function1[
        /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
        js.Promise[atOctokitRestLib.atOctokitRestMod.Response[_]]
      ], 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_After {
  @scala.inline
  def apply(
    after: (java.lang.String, js.Function2[
      /* response */ atOctokitRestLib.atOctokitRestMod.Response[_], 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]) => scala.Unit,
    before: (java.lang.String, js.Function1[/* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, scala.Unit]) => scala.Unit,
    error: (java.lang.String, js.Function2[
      /* error */ atOctokitRestLib.atOctokitRestMod.HookError, 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]) => scala.Unit,
    wrap: (java.lang.String, js.Function2[
      /* request */ js.Function1[
        /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
        js.Promise[atOctokitRestLib.atOctokitRestMod.Response[_]]
      ], 
      /* options */ atOctokitRestLib.atOctokitRestMod.HookOptions, 
      scala.Unit
    ]) => scala.Unit
  ): Anon_After = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), before = js.Any.fromFunction2(before), error = js.Any.fromFunction2(error), wrap = js.Any.fromFunction2(wrap))
  
    __obj.asInstanceOf[Anon_After]
  }
}

