package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Computes duration tables for the given locations. Allows for both symmetric and asymmetric tables.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#table
  */
@js.native
trait TableOptions extends Options {
  /**
    * to use location with given index as destination. Default is to use all.
    */
  var destinations: js.UndefOr[js.Array[Double]] = js.native
  /**
    * to use location with given index as source. Default is to use all.
    */
  var sources: js.UndefOr[js.Array[Double]] = js.native
}

object TableOptions {
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
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
    def setDestinationsVarargs(value: Double*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[Double]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Double*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Double]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

