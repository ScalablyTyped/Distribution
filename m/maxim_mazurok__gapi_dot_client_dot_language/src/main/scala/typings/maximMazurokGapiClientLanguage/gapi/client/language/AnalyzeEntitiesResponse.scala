package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeEntitiesResponse extends StObject {
  
  /** The recognized entities in the input document. */
  var entities: js.UndefOr[js.Array[Entity]] = js.native
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for
    * more details.
    */
  var language: js.UndefOr[String] = js.native
}
object AnalyzeEntitiesResponse {
  
  @scala.inline
  def apply(): AnalyzeEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitiesResponse]
  }
  
  @scala.inline
  implicit class AnalyzeEntitiesResponseMutableBuilder[Self <: AnalyzeEntitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
