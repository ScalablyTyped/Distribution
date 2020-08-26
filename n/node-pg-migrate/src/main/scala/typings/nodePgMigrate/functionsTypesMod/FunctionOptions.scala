package typings.nodePgMigrate.functionsTypesMod

import typings.nodePgMigrate.nodePgMigrateStrings.IMMUTABLE
import typings.nodePgMigrate.nodePgMigrateStrings.RESTRICTED
import typings.nodePgMigrate.nodePgMigrateStrings.SAFE
import typings.nodePgMigrate.nodePgMigrateStrings.STABLE
import typings.nodePgMigrate.nodePgMigrateStrings.UNSAFE
import typings.nodePgMigrate.nodePgMigrateStrings.VOLATILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionOptions extends js.Object {
  var behavior: js.UndefOr[IMMUTABLE | STABLE | VOLATILE] = js.native
  var language: String = js.native
  var onNull: js.UndefOr[Boolean] = js.native
  var parallel: js.UndefOr[UNSAFE | RESTRICTED | SAFE] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var returns: js.UndefOr[String] = js.native
  var window: js.UndefOr[Boolean] = js.native
}

object FunctionOptions {
  @scala.inline
  def apply(language: String): FunctionOptions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionOptions]
  }
  @scala.inline
  implicit class FunctionOptionsOps[Self <: FunctionOptions] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setBehavior(value: IMMUTABLE | STABLE | VOLATILE): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setOnNull(value: Boolean): Self = this.set("onNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnNull: Self = this.set("onNull", js.undefined)
    @scala.inline
    def setParallel(value: UNSAFE | RESTRICTED | SAFE): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    @scala.inline
    def setReturns(value: String): Self = this.set("returns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    @scala.inline
    def setWindow(value: Boolean): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

