package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration object that may be applied to a Context Choose operation.
  */
@js.native
trait ChooseContextConfig extends js.Object {
  /**
    * The set of filters to apply to the context suggestions: 'NEW_CONTEXT_ONLY', 'INCLUDE_EXISTING_CHALLENGES' or 'NEW_PLAYERS_ONLY'.
    */
  var filters: js.UndefOr[js.Array[ContextFilter]] = js.native
  /**
    * The maximum number of participants that a suggested context should ideally have.
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * The minimum number of participants that a suggested context should ideally have.
    */
  var minSize: js.UndefOr[Double] = js.native
}

object ChooseContextConfig {
  @scala.inline
  def apply(): ChooseContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseContextConfig]
  }
  @scala.inline
  implicit class ChooseContextConfigOps[Self <: ChooseContextConfig] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: ContextFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[ContextFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
  
}

