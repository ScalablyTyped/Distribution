package typings.mfiles

import org.scalablytyped.runtime.StringDictionary
import typings.mfiles.mfilesInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITheme
  extends StObject
     with /* key */ StringDictionary[String | Boolean | Double] {
  
  var last: `0`
}
object ITheme {
  
  inline def apply(): ITheme = {
    val __obj = js.Dynamic.literal(last = 0)
    __obj.asInstanceOf[ITheme]
  }
  
  extension [Self <: ITheme](x: Self) {
    
    inline def setLast(value: `0`): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
  }
}
