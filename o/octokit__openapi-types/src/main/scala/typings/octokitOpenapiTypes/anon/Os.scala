package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Os extends StObject {
  
  var busy: Boolean
  
  /**
    * @description The id of the runner.
    * @example 5
    */
  var id: Double
  
  var labels: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
  ]
  
  /**
    * @description The name of the runner.
    * @example iMac
    */
  var name: String
  
  /**
    * @description The Operating System of the runner.
    * @example macos
    */
  var os: String
  
  /**
    * @description The id of the runner group.
    * @example 1
    */
  var runner_group_id: js.UndefOr[Double] = js.undefined
  
  /**
    * @description The status of the runner.
    * @example online
    */
  var status: String
}
object Os {
  
  inline def apply(
    busy: Boolean,
    id: Double,
    labels: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
    ],
    name: String,
    os: String,
    status: String
  ): Os = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Os] (val x: Self) extends AnyVal {
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
        ]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any)*
    ): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_idUndefined: Self = StObject.set(x, "runner_group_id", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
