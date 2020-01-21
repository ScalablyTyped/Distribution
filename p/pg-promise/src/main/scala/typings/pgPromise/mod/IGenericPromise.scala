package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGenericPromise extends js.Object {
  def apply(
    cb: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): XPromise[_] = js.native
  def all(iterable: js.Any): XPromise[_] = js.native
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  def resolve(): Unit = js.native
  def resolve(value: js.Any): Unit = js.native
}

