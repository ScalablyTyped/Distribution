package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultPromiseFactory extends js.Object {
  def create(callback: js.Any): DefaultPromise
  def reject(reason: js.Any): DefaultPromise
  def resolve(value: js.Any): DefaultPromise
}

object DefaultPromiseFactory {
  @scala.inline
  def apply(
    create: js.Any => DefaultPromise,
    reject: js.Any => DefaultPromise,
    resolve: js.Any => DefaultPromise
  ): DefaultPromiseFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[DefaultPromiseFactory]
  }
}

