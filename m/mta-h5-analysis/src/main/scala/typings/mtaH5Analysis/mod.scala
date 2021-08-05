package typings.mtaH5Analysis

import org.scalablytyped.runtime.StringDictionary
import typings.mtaH5Analysis.anon.AutoReport
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mta-h5-analysis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clickShare(channelId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickShare")(channelId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clickStat(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickStat")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clickStat(`type`: String, params: StringDictionary[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clickStat")(`type`.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object conf {
    
    @JSImport("mta-h5-analysis", "conf")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mta-h5-analysis", "conf.autoReport")
    @js.native
    def autoReport: `0` | `1` = js.native
    inline def autoReport_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoReport")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.cid")
    @js.native
    def cid: String = js.native
    inline def cid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.ignoreParams")
    @js.native
    def ignoreParams: js.Array[String] = js.native
    inline def ignoreParams_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreParams")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.performanceMonitor")
    @js.native
    def performanceMonitor: `0` | `1` = js.native
    inline def performanceMonitor_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("performanceMonitor")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.senseHash")
    @js.native
    def senseHash: `0` | `1` = js.native
    inline def senseHash_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("senseHash")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.senseQuery")
    @js.native
    def senseQuery: `0` | `1` = js.native
    inline def senseQuery_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("senseQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.sid")
    @js.native
    def sid: String = js.native
    inline def sid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sid")(x.asInstanceOf[js.Any])
    
    @JSImport("mta-h5-analysis", "conf.userReport")
    @js.native
    def userReport: `0` | `1` = js.native
    inline def userReport_=(x: `0` | `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userReport")(x.asInstanceOf[js.Any])
  }
  
  inline def init(params: AutoReport): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def pgv(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pgv")().asInstanceOf[Unit]
  
  @JSImport("mta-h5-analysis", "version")
  @js.native
  val version: String = js.native
}
