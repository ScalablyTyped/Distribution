package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsArray extends StObject {
  
  var labels: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
  ]
  
  var total_count: Double
}
object LabelsArray {
  
  inline def apply(
    labels: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
    ],
    total_count: Double
  ): LabelsArray = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelsArray] (val x: Self) extends AnyVal {
    
    inline def setLabels(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any
        ]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-label'] */ js.Any)*
    ): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
