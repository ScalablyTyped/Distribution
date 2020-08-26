package typings.morrisJs

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
      extends typings.morrisJs.morris.MorrisStatic
    
  }
  
}

