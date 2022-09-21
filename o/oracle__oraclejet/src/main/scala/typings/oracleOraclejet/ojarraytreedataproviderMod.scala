package typings.oracleOraclejet

import typings.oracleOraclejet.anon.ChildrenAttribute
import typings.oracleOraclejet.ojtreedataproviderMod.TreeDataProvider
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojarraytreedataproviderMod {
  
  @JSImport("@oracle/oraclejet/ojarraytreedataprovider", JSImport.Namespace)
  @js.native
  open class ^[K, D] protected ()
    extends StObject
       with ArrayTreeDataProvider[K, D] {
    def this(data: js.Array[Any]) = this()
    def this(data: js.Function0[js.Array[Any]]) = this()
    def this(data: js.Array[Any], options: ChildrenAttribute[D]) = this()
    def this(data: js.Function0[js.Array[Any]], options: ChildrenAttribute[D]) = this()
  }
  
  @js.native
  trait ArrayTreeDataProvider[K, D]
    extends StObject
       with TreeDataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    def getCapability(): Any = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
  }
}
