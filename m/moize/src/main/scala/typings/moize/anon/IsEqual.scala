package typings.moize.anon

import typings.moize.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEqual[CombinedOptions /* <: Options */] extends StObject {
  
  var isEqual: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesArg'] */ js.Any
  
  var isMatchingKey: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesKey'] */ js.Any
  
  var transformKey: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['transformArgs'] */ js.Any
}
object IsEqual {
  
  inline def apply[CombinedOptions /* <: Options */](
    isEqual: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesArg'] */ js.Any,
    isMatchingKey: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesKey'] */ js.Any,
    transformKey: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['transformArgs'] */ js.Any
  ): IsEqual[CombinedOptions] = {
    val __obj = js.Dynamic.literal(isEqual = isEqual.asInstanceOf[js.Any], isMatchingKey = isMatchingKey.asInstanceOf[js.Any], transformKey = transformKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEqual[CombinedOptions]]
  }
  
  extension [Self <: IsEqual[?], CombinedOptions /* <: Options */](x: Self & IsEqual[CombinedOptions]) {
    
    inline def setIsEqual(
      value: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesArg'] */ js.Any
    ): Self = StObject.set(x, "isEqual", value.asInstanceOf[js.Any])
    
    inline def setIsMatchingKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['matchesKey'] */ js.Any
    ): Self = StObject.set(x, "isMatchingKey", value.asInstanceOf[js.Any])
    
    inline def setTransformKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: CombinedOptions['transformArgs'] */ js.Any
    ): Self = StObject.set(x, "transformKey", value.asInstanceOf[js.Any])
  }
}
