package typings.nodeInsights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-insights", JSImport.Namespace)
@js.native
class ^ protected () extends Insights {
  /**
    * Insights
    */
  def this(config: Config) = this()
}

@JSImport("node-insights", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var collectorBaseURL: String = js.native
  var collectorHost: String = js.native
  var queryBaseURL: String = js.native
}

