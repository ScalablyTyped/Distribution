package typings.morrisJs

import typings.morrisJs.morris.IAreaOptions
import typings.morrisJs.morris.IBarOptions
import typings.morrisJs.morris.IDonutOptions
import typings.morrisJs.morris.ILineOptions
import typings.morrisJs.morris.MorrisStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Morris")
  @js.native
  def Morris_ : MorrisStatic = js.native
  
  @scala.inline
  def Morris__=(x: MorrisStatic): Unit = js.Dynamic.global.updateDynamic("Morris")(x.asInstanceOf[js.Any])
  
  object morris {
    
    @JSGlobal("morris.DonutChart")
    @js.native
    class DonutChart ()
      extends StObject
         with typings.morrisJs.morris.DonutChart
    
    @JSGlobal("morris.GridChart")
    @js.native
    class GridChart ()
      extends StObject
         with typings.morrisJs.morris.GridChart
    
    @JSGlobal("morris.MorrisStatic")
    @js.native
    class MorrisStatic ()
      extends StObject
         with typings.morrisJs.morris.MorrisStatic {
      
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
