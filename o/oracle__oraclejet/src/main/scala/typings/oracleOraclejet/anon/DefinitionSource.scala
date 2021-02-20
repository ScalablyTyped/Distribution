package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionSource extends StObject {
  
  var definition: js.UndefOr[String | Null] = js.native
  
  var source: js.UndefOr[String | Null] = js.native
}
object DefinitionSource {
  
  @scala.inline
  def apply(): DefinitionSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinitionSource]
  }
  
  @scala.inline
  implicit class DefinitionSourceMutableBuilder[Self <: DefinitionSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionNull: Self = StObject.set(x, "definition", null)
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
