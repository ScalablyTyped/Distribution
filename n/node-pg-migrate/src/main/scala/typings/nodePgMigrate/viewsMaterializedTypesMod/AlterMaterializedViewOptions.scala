package typings.nodePgMigrate.viewsMaterializedTypesMod

import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlterMaterializedViewOptions extends js.Object {
  var cluster: js.UndefOr[Null | `false` | String] = js.native
  var extension: js.UndefOr[String] = js.native
  var storageParameters: js.UndefOr[js.Object] = js.native
}

object AlterMaterializedViewOptions {
  @scala.inline
  def apply(): AlterMaterializedViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterMaterializedViewOptions]
  }
  @scala.inline
  implicit class AlterMaterializedViewOptionsOps[Self <: AlterMaterializedViewOptions] (val x: Self) extends AnyVal {
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
    def setCluster(value: `false` | String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setClusterNull: Self = this.set("cluster", null)
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setStorageParameters(value: js.Object): Self = this.set("storageParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageParameters: Self = this.set("storageParameters", js.undefined)
  }
  
}

