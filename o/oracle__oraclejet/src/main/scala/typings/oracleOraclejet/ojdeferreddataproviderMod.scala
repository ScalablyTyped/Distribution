package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdeferreddataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojdeferreddataprovider", JSImport.Namespace)
  @js.native
  open class ^[K, D] protected ()
    extends StObject
       with DeferredDataProvider[K, D] {
    def this(
      dataProvider: js.Promise[DataProvider[K, D]],
      capabilityFunc: js.Function1[/* capabilityName */ String, Any]
    ) = this()
  }
  
  @js.native
  trait DeferredDataProvider[K, D]
    extends StObject
       with DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Any = js.native
  }
}
