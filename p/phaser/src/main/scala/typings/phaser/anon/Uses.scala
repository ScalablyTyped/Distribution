package typings.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.MatterJS.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uses
  extends StObject
     with /* _ */ StringDictionary[js.Any] {
  
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.undefined
}
object Uses {
  
  inline def apply(): Uses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uses]
  }
  
  extension [Self <: Uses](x: Self) {
    
    inline def setUses(value: js.Array[Plugin | String]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
    
    inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
    
    inline def setUsesVarargs(value: (Plugin | String)*): Self = StObject.set(x, "uses", js.Array(value :_*))
  }
}
