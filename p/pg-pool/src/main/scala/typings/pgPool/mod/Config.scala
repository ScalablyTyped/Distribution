package typings.pgPool.mod

import typings.pg.mod.Client
import typings.pg.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[T /* <: Client */] extends PoolConfig {
  var Client: js.UndefOr[ClientLikeCtr[T]] = js.native
}

object Config {
  @scala.inline
  def apply[/* <: typings.pg.mod.Client */ T](): Config[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T]]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], /* <: typings.pg.mod.Client */ T] (val x: Self with Config[T]) extends AnyVal {
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
    def setClient(value: ClientLikeCtr[T]): Self = this.set("Client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("Client", js.undefined)
  }
  
}

