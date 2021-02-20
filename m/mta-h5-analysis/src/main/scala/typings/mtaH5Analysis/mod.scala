package typings.mtaH5Analysis

import org.scalablytyped.runtime.StringDictionary
import typings.mtaH5Analysis.anon.AutoReport
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mta-h5-analysis", "clickShare")
  @js.native
  def clickShare(channelId: String): Unit = js.native
  
  @JSImport("mta-h5-analysis", "clickStat")
  @js.native
  def clickStat(`type`: String): Unit = js.native
  @JSImport("mta-h5-analysis", "clickStat")
  @js.native
  def clickStat(`type`: String, params: StringDictionary[js.Any]): Unit = js.native
  
  object conf {
    
    @JSImport("mta-h5-analysis", "conf")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mta-h5-analysis", "conf.autoReport")
    @js.native
    def autoReport: `0` | `1` = js.native
    @scala.inline
    def autoReport_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoReport")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.cid")
    @js.native
    def cid: String = js.native
    @scala.inline
    def cid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.ignoreParams")
    @js.native
    def ignoreParams: js.Array[String] = js.native
    @scala.inline
    def ignoreParams_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreParams")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.performanceMonitor")
    @js.native
    def performanceMonitor: `0` | `1` = js.native
    @scala.inline
    def performanceMonitor_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("performanceMonitor")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.senseHash")
    @js.native
    def senseHash: `0` | `1` = js.native
    @scala.inline
    def senseHash_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("senseHash")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.senseQuery")
    @js.native
    def senseQuery: `0` | `1` = js.native
    @scala.inline
    def senseQuery_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("senseQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.sid")
    @js.native
    def sid: String = js.native
    @scala.inline
    def sid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sid")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.userReport")
    @js.native
    def userReport: `0` | `1` = js.native
    @scala.inline
    def userReport_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userReport")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mta-h5-analysis", "init")
  @js.native
  def init(params: AutoReport): Unit = js.native
  
  @JSImport("mta-h5-analysis", "pgv")
  @js.native
  def pgv(): Unit = js.native
  
  @JSImport("mta-h5-analysis", "version")
  @js.native
  val version: String = js.native
}
