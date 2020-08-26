package typings.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBarOptions extends IGridChartOptions {
  /** Array containing colors for the series bars. */
  var barColors: js.UndefOr[js.Array[String]] = js.native
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ this.type, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.native
  /** Set to true to draw bars stacked vertically. */
  var stacked: js.UndefOr[Boolean] = js.native
}

object IBarOptions {
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): IBarOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarOptions]
  }
  @scala.inline
  implicit class IBarOptionsOps[Self <: IBarOptions] (val x: Self) extends AnyVal {
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
    def setBarColorsVarargs(value: String*): Self = this.set("barColors", js.Array(value :_*))
    @scala.inline
    def setBarColors(value: js.Array[String]): Self = this.set("barColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarColors: Self = this.set("barColors", js.undefined)
    @scala.inline
    def setHoverCallback(value: (/* index */ Double, IBarOptions, /* content */ String, /* row */ js.Any) => String): Self = this.set("hoverCallback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteHoverCallback: Self = this.set("hoverCallback", js.undefined)
    @scala.inline
    def setStacked(value: Boolean): Self = this.set("stacked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStacked: Self = this.set("stacked", js.undefined)
  }
  
}

