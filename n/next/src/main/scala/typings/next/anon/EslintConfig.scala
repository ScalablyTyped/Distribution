package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EslintConfig extends StObject {
  
  var eslintConfig: Any
}
object EslintConfig {
  
  inline def apply(eslintConfig: Any): EslintConfig = {
    val __obj = js.Dynamic.literal(eslintConfig = eslintConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[EslintConfig]
  }
  
  extension [Self <: EslintConfig](x: Self) {
    
    inline def setEslintConfig(value: Any): Self = StObject.set(x, "eslintConfig", value.asInstanceOf[js.Any])
  }
}
