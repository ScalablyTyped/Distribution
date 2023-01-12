package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvVisualizationFilterDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilterDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationFilterDef {
    
    /* CompleteClass */
    var canonicalName: String | Null = js.native
    
    /* CompleteClass */
    var classKey: Double | Null = js.native
    
    /* CompleteClass */
    var column: Double | Null = js.native
    
    /* CompleteClass */
    var defaultValue: Any = js.native
    
    /* CompleteClass */
    var group: String | Null = js.native
    
    /* CompleteClass */
    var groupName: String | Null = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var label: String = js.native
    
    /* CompleteClass */
    var lookupType: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: js.Array[js.Array[Any]] = js.native
    
    /* CompleteClass */
    var order: Double = js.native
    
    /* CompleteClass */
    var readOnly: Boolean = js.native
    
    /* CompleteClass */
    var required: Boolean = js.native
    
    /* CompleteClass */
    var size: Double | Null = js.native
    
    /* CompleteClass */
    var targets: js.Array[String] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilterDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VisualizationFilterDef extends StObject {
    
    var canonicalName: String | Null
    
    var classKey: Double | Null
    
    var column: Double | Null
    
    var defaultValue: Any
    
    var group: String | Null
    
    var groupName: String | Null
    
    var help: String
    
    var label: String
    
    var lookupType: Double
    
    var name: String
    
    var options: js.Array[js.Array[Any]]
    
    var order: Double
    
    var readOnly: Boolean
    
    var required: Boolean
    
    var size: Double | Null
    
    var targets: js.Array[String]
    
    var `type`: String
  }
  object VisualizationFilterDef {
    
    inline def apply(
      defaultValue: Any,
      help: String,
      label: String,
      lookupType: Double,
      name: String,
      options: js.Array[js.Array[Any]],
      order: Double,
      readOnly: Boolean,
      required: Boolean,
      targets: js.Array[String],
      `type`: String
    ): VisualizationFilterDef = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], lookupType = lookupType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], canonicalName = null, classKey = null, column = null, group = null, groupName = null, size = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisualizationFilterDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisualizationFilterDef] (val x: Self) extends AnyVal {
      
      inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
      
      inline def setCanonicalNameNull: Self = StObject.set(x, "canonicalName", null)
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKeyNull: Self = StObject.set(x, "classKey", null)
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnNull: Self = StObject.set(x, "column", null)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameNull: Self = StObject.set(x, "groupName", null)
      
      inline def setGroupNull: Self = StObject.set(x, "group", null)
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLookupType(value: Double): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
