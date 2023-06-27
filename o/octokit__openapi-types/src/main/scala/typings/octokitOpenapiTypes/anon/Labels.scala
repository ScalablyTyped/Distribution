package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  /** @description The names of the custom labels to add to the runner. **Minimum items**: 1. **Maximum items**: 100. */
  var labels: js.Array[String]
  
  /** @description The name of the new runner. */
  var name: String
  
  /** @description The ID of the runner group to register the runner to. */
  var runner_group_id: Double
  
  /**
    * @description The working directory to be used for job execution, relative to the runner install directory.
    * @default _work
    */
  var work_folder: js.UndefOr[String] = js.undefined
}
object Labels {
  
  inline def apply(labels: js.Array[String], name: String, runner_group_id: Double): Labels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    inline def setWork_folder(value: String): Self = StObject.set(x, "work_folder", value.asInstanceOf[js.Any])
    
    inline def setWork_folderUndefined: Self = StObject.set(x, "work_folder", js.undefined)
  }
}
