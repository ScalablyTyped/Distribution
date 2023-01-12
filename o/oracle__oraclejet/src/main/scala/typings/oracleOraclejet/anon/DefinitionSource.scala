package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionSource extends StObject {
  
  var definition: js.UndefOr[String | Null] = js.undefined
  
  var source: js.UndefOr[String | Null] = js.undefined
}
object DefinitionSource {
  
  inline def apply(): DefinitionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefinitionSource] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNull: Self = StObject.set(x, "definition", null)
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
