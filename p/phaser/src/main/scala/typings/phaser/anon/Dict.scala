package typings.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dict
  extends StObject
     with /* _ */ StringDictionary[js.Any] {
  
  var name: js.UndefOr[String] = js.undefined
}
object Dict {
  
  inline def apply(): Dict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dict]
  }
  
  extension [Self <: Dict](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
