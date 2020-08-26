package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolActualConfig extends PoolSpecificConfig {
  var connectionConfig: ConnectionConfig = js.native
}

object PoolActualConfig {
  @scala.inline
  def apply(connectionConfig: ConnectionConfig): PoolActualConfig = {
    val __obj = js.Dynamic.literal(connectionConfig = connectionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolActualConfig]
  }
  @scala.inline
  implicit class PoolActualConfigOps[Self <: PoolActualConfig] (val x: Self) extends AnyVal {
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
    def setConnectionConfig(value: ConnectionConfig): Self = this.set("connectionConfig", value.asInstanceOf[js.Any])
  }
  
}

