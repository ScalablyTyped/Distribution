package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: (Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-limit-response'] */ js.Any
  ]) & Partial[StringDictionary[Any]]
}
object `78` {
  
  inline def apply(
    applicationSlashjson: (Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-limit-response'] */ js.Any
    ]) & Partial[StringDictionary[Any]]
  ): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`78`]
  }
  
  extension [Self <: `78`](x: Self) {
    
    inline def setApplicationSlashjson(
      value: (Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-limit-response'] */ js.Any
        ]) & Partial[StringDictionary[Any]]
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
