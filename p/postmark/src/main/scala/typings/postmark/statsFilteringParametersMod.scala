package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/stats/StatsFilteringParameters", JSImport.Namespace)
@js.native
object statsFilteringParametersMod extends js.Object {
  @js.native
  class StatisticsFilteringParameters () extends js.Object {
    def this(tag: String) = this()
    def this(tag: String, fromDate: String) = this()
    def this(tag: String, fromDate: String, toDate: String) = this()
    var fromDate: js.UndefOr[String] = js.native
    var tag: js.UndefOr[String] = js.native
    var toDate: js.UndefOr[String] = js.native
  }
  
}

