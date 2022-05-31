package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmodelMod.Collection
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcollectiondataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojcollectiondataprovider", JSImport.Namespace)
  @js.native
  class ^[K, D] protected ()
    extends StObject
       with CollectionDataProvider[K, D] {
    def this(collection: Collection) = this()
  }
  
  @js.native
  trait CollectionDataProvider[K, D]
    extends StObject
       with DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    def getCapability(): js.Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
  }
}
