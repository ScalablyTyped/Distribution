package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.powerbiVisualsTools.mod.data.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualObjectRepetition extends StObject {
  
  /** Used to group differernt repetitions into containers. That will be used as the container displayName in the PropertyPane */
  var containerName: js.UndefOr[String] = js.undefined
  
  /** The set of repetition descriptors for this object. */
  var objects: StringDictionary[DataViewRepetitionObjectDescriptor]
  
  /** The selector that identifies the objects. */
  var selector: Selector
}
object VisualObjectRepetition {
  
  inline def apply(objects: StringDictionary[DataViewRepetitionObjectDescriptor], selector: Selector): VisualObjectRepetition = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualObjectRepetition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualObjectRepetition] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setObjects(value: StringDictionary[DataViewRepetitionObjectDescriptor]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
