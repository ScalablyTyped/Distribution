package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202409` extends StObject {
  
  /** Response */
  var `202`: Content60
  
  var `409`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any
}
object `202409` {
  
  inline def apply(
    `202`: Content60,
    `409`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any
  ): `202409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202409`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202409`] (val x: Self) extends AnyVal {
    
    inline def set202(value: Content60): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['conflict'] */ js.Any
    ): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
  }
}
