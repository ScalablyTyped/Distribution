package typings.pkijs.mod

import typings.pkijs.anon.BuiltInStandardAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralNameSchema extends StObject {
  
  var names: js.UndefOr[BuiltInStandardAttributes] = js.undefined
}
object GeneralNameSchema {
  
  inline def apply(): GeneralNameSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralNameSchema]
  }
  
  extension [Self <: GeneralNameSchema](x: Self) {
    
    inline def setNames(value: BuiltInStandardAttributes): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
  }
}
