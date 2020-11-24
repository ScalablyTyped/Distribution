package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plotly.js", "prependTraces")
@js.native
object prependTraces extends js.Object {
  
  def apply(root: Root, update: js.Array[Data], indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: js.Array[Data], indices: Double): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: Data, indices: js.Array[Double]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, update: Data, indices: Double): js.Promise[PlotlyHTMLElement] = js.native
}
