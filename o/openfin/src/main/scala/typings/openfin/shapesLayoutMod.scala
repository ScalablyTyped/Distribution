package typings.openfin

import typings.openfin.anon.ConstrainDragToContainer
import typings.openfin.anon.Title
import typings.openfin.openfinStrings.column
import typings.openfin.openfinStrings.component
import typings.openfin.openfinStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesLayoutMod {
  
  trait Layout extends StObject {
    
    var content: LayoutContent
    
    var settings: ConstrainDragToContainer
  }
  object Layout {
    
    inline def apply(content: LayoutContent, settings: ConstrainDragToContainer): Layout = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    extension [Self <: Layout](x: Self) {
      
      inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setSettings(value: ConstrainDragToContainer): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutColumn extends StObject {
    
    var content: LayoutContent
    
    var `type`: column
  }
  object LayoutColumn {
    
    inline def apply(content: LayoutContent): LayoutColumn = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("column")
      __obj.asInstanceOf[LayoutColumn]
    }
    
    extension [Self <: LayoutColumn](x: Self) {
      
      inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setType(value: column): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutComponent extends StObject {
    
    var componentName: String
    
    var componentState: Title
    
    var `type`: component
  }
  object LayoutComponent {
    
    inline def apply(componentName: String, componentState: Title): LayoutComponent = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentState = componentState.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("component")
      __obj.asInstanceOf[LayoutComponent]
    }
    
    extension [Self <: LayoutComponent](x: Self) {
      
      inline def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentState(value: Title): Self = StObject.set(x, "componentState", value.asInstanceOf[js.Any])
      
      inline def setType(value: component): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutContent = js.Array[LayoutRow | LayoutColumn | LayoutComponent]
  
  trait LayoutRow extends StObject {
    
    var content: LayoutContent
    
    var `type`: row
  }
  object LayoutRow {
    
    inline def apply(content: LayoutContent): LayoutRow = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("row")
      __obj.asInstanceOf[LayoutRow]
    }
    
    extension [Self <: LayoutRow](x: Self) {
      
      inline def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setType(value: row): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
