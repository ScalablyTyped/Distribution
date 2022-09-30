package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.onfidoSdkUi.anon.Query
  - typings.onfidoSdkUi.anon.Type
*/
trait ChallengePayload extends StObject
object ChallengePayload {
  
  inline def Query(query: js.Array[Double], `type`: /* "recite" */ String): typings.onfidoSdkUi.anon.Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.onfidoSdkUi.anon.Query]
  }
  
  inline def Type(query: String, `type`: /* "movement" */ String): typings.onfidoSdkUi.anon.Type = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.onfidoSdkUi.anon.Type]
  }
}
