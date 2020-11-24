package typings.mtaH5Analysis

import org.scalablytyped.runtime.StringDictionary
import typings.mtaH5Analysis.anon.AutoReport
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mta-h5-analysis", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clickShare(channelId: String): Unit = js.native
  
  def clickStat(`type`: String): Unit = js.native
  def clickStat(`type`: String, params: StringDictionary[js.Any]): Unit = js.native
  
  def init(params: AutoReport): Unit = js.native
  
  def pgv(): Unit = js.native
  
  val version: String = js.native
  
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
