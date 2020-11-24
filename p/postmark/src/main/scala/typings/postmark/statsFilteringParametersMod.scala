package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/stats/StatsFilteringParameters", JSImport.Namespace)
@js.native
object statsFilteringParametersMod extends js.Object {
  
  @js.native
  class StatisticsFilteringParameters () extends js.Object {
    def this(tag: String) = this()
    def this(tag: js.UndefOr[scala.Nothing], fromDate: String) = this()
    def this(tag: String, fromDate: String) = this()
    def this(tag: js.UndefOr[scala.Nothing], fromDate: js.UndefOr[scala.Nothing], toDate: String) = this()
    def this(tag: js.UndefOr[scala.Nothing], fromDate: String, toDate: String) = this()
    def this(tag: String, fromDate: js.UndefOr[scala.Nothing], toDate: String) = this()
    def this(tag: String, fromDate: String, toDate: String) = this()
    
    var fromDate: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var toDate: js.UndefOr[String] = js.native
  }
}
