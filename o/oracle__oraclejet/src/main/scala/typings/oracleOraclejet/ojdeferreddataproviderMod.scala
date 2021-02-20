package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdeferreddataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojdeferreddataprovider", JSImport.Namespace)
  @js.native
  class ^[K, D] protected () extends DeferredDataProvider[K, D] {
    def this(
      dataProvider: js.Promise[DataProvider[K, D]],
      capabilityFunc: js.Function1[/* capabilityName */ String, _]
    ) = this()
  }
  
  @js.native
  trait DeferredDataProvider[K, D] extends DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): js.Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): js.Any = js.native
  }
}
