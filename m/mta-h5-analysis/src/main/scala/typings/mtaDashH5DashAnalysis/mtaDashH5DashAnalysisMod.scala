package typings.mtaDashH5DashAnalysis

import org.scalablytyped.runtime.StringDictionary
import typings.mtaDashH5DashAnalysis.mtaDashH5DashAnalysisNumbers.`0`
import typings.mtaDashH5DashAnalysis.mtaDashH5DashAnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mta-h5-analysis", JSImport.Namespace)
@js.native
object mtaDashH5DashAnalysisMod extends js.Object {
  val version: String = js.native
  def clickShare(channelId: String): Unit = js.native
  def clickStat(`type`: String): Unit = js.native
  def clickStat(`type`: String, params: StringDictionary[js.Any]): Unit = js.native
  def init(params: Anon_0): Unit = js.native
  def pgv(): Unit = js.native
  @js.native
  object conf extends js.Object {
    var autoReport: `0` | `1` = js.native
    var cid: String = js.native
    var ignoreParams: js.Array[String] = js.native
    var performanceMonitor: `0` | `1` = js.native
    var senseHash: `0` | `1` = js.native
    var senseQuery: `0` | `1` = js.native
    var sid: String = js.native
    var userReport: `0` | `1` = js.native
  }
  
}

