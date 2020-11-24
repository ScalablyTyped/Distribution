package typings.morrisJs.morris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDonutOptions extends IChartOptions {
  
  /** An array of strings containing HTML-style hex colors for each of the donut segments. */
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  /** The data to plot. */
  var data: js.Array[IDonutData] = js.native
  
  /** A function that will translate a y-value into a label for the centre of the donut. */
  var formatter: js.UndefOr[js.Function2[/* y */ Double, /* data */ IDonutData, String]] = js.native
}
object IDonutOptions {
  
  @scala.inline
  def apply(data: js.Array[IDonutData], element: js.Any): IDonutOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDonutOptions]
  }
  
  @scala.inline
  implicit class IDonutOptionsOps[Self <: IDonutOptions] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: IDonutData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[IDonutData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* y */ Double, /* data */ IDonutData) => String): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
}
