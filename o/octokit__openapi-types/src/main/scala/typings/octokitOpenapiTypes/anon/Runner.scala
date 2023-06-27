package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runner extends StObject {
  
  /** @description The base64 encoded runner configuration. */
  var encoded_jit_config: String
  
  var runner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any
}
object Runner {
  
  inline def apply(
    encoded_jit_config: String,
    runner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any
  ): Runner = {
    val __obj = js.Dynamic.literal(encoded_jit_config = encoded_jit_config.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Runner] (val x: Self) extends AnyVal {
    
    inline def setEncoded_jit_config(value: String): Self = StObject.set(x, "encoded_jit_config", value.asInstanceOf[js.Any])
    
    inline def setRunner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner'] */ js.Any
    ): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
  }
}
