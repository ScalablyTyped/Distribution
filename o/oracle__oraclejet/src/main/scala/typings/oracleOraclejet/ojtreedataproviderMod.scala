package typings.oracleOraclejet

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojtreedataproviderMod {
  
  @js.native
  trait TreeDataProvider[K, D]
    extends StObject
       with DataProvider[K, D] {
    
    def getChildDataProvider(parentKey: Any): TreeDataProvider[K, D] = js.native
  }
}
