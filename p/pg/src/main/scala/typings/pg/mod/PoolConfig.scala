package typings.pg.mod

import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolConfig extends ClientConfig {
  var Promise: js.UndefOr[PromiseConstructorLike] = js.native
  var connectionTimeoutMillis: js.UndefOr[Double] = js.native
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  // properties from module 'node-pool'
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
}

object PoolConfig {
  @scala.inline
  def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  @scala.inline
  implicit class PoolConfigOps[Self <: PoolConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(value: PromiseConstructorLike): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    @scala.inline
    def setConnectionTimeoutMillis(value: Double): Self = this.set("connectionTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeoutMillis: Self = this.set("connectionTimeoutMillis", js.undefined)
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleTimeoutMillis: Self = this.set("idleTimeoutMillis", js.undefined)
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

