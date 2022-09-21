package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowInterfaceMod {
  
  type ArrayType = js.Array[Boolean | js.Date | Double | String]
  
  trait RowInterface
    extends StObject
       with /* key */ StringDictionary[ScalarType | ArrayType | RowInterface | js.Array[RowInterface]]
  object RowInterface {
    
    inline def apply(): RowInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowInterface]
    }
  }
  
  type ScalarType = Boolean | Double | String | js.Date
}
