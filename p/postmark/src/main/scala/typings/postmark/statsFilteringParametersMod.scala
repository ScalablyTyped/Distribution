package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/stats/StatsFilteringParameters", "StatisticsFilteringParameters")
  @js.native
  open class StatisticsFilteringParameters () extends StObject {
    def this(tag: String) = this()
    def this(tag: String, fromDate: String) = this()
    def this(tag: Unit, fromDate: String) = this()
    def this(tag: String, fromDate: String, toDate: String) = this()
    def this(tag: String, fromDate: Unit, toDate: String) = this()
    def this(tag: Unit, fromDate: String, toDate: String) = this()
    def this(tag: Unit, fromDate: Unit, toDate: String) = this()
    def this(tag: String, fromDate: String, toDate: String, messageStream: String) = this()
    def this(tag: String, fromDate: String, toDate: Unit, messageStream: String) = this()
    def this(tag: String, fromDate: Unit, toDate: String, messageStream: String) = this()
    def this(tag: String, fromDate: Unit, toDate: Unit, messageStream: String) = this()
    def this(tag: Unit, fromDate: String, toDate: String, messageStream: String) = this()
    def this(tag: Unit, fromDate: String, toDate: Unit, messageStream: String) = this()
    def this(tag: Unit, fromDate: Unit, toDate: String, messageStream: String) = this()
    def this(tag: Unit, fromDate: Unit, toDate: Unit, messageStream: String) = this()
    
    var fromDate: js.UndefOr[String] = js.native
    
    var messageStream: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var toDate: js.UndefOr[String] = js.native
  }
}
