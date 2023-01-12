package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvCompositeVisualizationDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualizationDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CompositeVisualizationDef {
    
    /* CompleteClass */
    var adjustItemHeaders: Boolean = js.native
    
    /* CompleteClass */
    var autoCreateFilters: Boolean = js.native
    
    /* CompleteClass */
    var items: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    var layout: js.Array[String] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/CompositeVisualizationDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompositeVisualizationDef extends StObject {
    
    var adjustItemHeaders: Boolean
    
    var autoCreateFilters: Boolean
    
    var items: StringDictionary[Any]
    
    var layout: js.Array[String]
    
    var `type`: String
  }
  object CompositeVisualizationDef {
    
    inline def apply(
      adjustItemHeaders: Boolean,
      autoCreateFilters: Boolean,
      items: StringDictionary[Any],
      layout: js.Array[String],
      `type`: String
    ): CompositeVisualizationDef = {
      val __obj = js.Dynamic.literal(adjustItemHeaders = adjustItemHeaders.asInstanceOf[js.Any], autoCreateFilters = autoCreateFilters.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeVisualizationDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompositeVisualizationDef] (val x: Self) extends AnyVal {
      
      inline def setAdjustItemHeaders(value: Boolean): Self = StObject.set(x, "adjustItemHeaders", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateFilters(value: Boolean): Self = StObject.set(x, "autoCreateFilters", value.asInstanceOf[js.Any])
      
      inline def setItems(value: StringDictionary[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: js.Array[String]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutVarargs(value: String*): Self = StObject.set(x, "layout", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
