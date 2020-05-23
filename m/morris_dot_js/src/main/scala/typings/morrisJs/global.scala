package typings.morrisJs

import typings.morrisJs.morris.IAreaOptions
import typings.morrisJs.morris.IBarOptions
import typings.morrisJs.morris.IDonutOptions
import typings.morrisJs.morris.ILineOptions
import typings.morrisJs.morris.MorrisStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @JSName("Morris")
  var Morris_ : MorrisStatic = js.native
  @js.native
  object morris extends js.Object {
    @js.native
    class DonutChart ()
      extends typings.morrisJs.morris.DonutChart
    
    @js.native
    class GridChart ()
      extends typings.morrisJs.morris.GridChart
    
    @js.native
    class MorrisStatic ()
      extends typings.morrisJs.morris.MorrisStatic {
      /** Create an area chart. */
      /* CompleteClass */
      override def Area(options: IAreaOptions): typings.morrisJs.morris.GridChart = js.native
      /** Create a bar chart. */
      /* CompleteClass */
      override def Bar(options: IBarOptions): typings.morrisJs.morris.GridChart = js.native
      /** Create a Donut chart. */
      /* CompleteClass */
      override def Donut(options: IDonutOptions): typings.morrisJs.morris.DonutChart = js.native
      /** Create a line chart. */
      /* CompleteClass */
      override def Line(options: ILineOptions): typings.morrisJs.morris.GridChart = js.native
    }
    
  }
  
}

