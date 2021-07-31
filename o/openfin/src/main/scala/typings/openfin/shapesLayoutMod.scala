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
    
    @scala.inline
    def apply(content: LayoutContent, settings: ConstrainDragToContainer): Layout = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setSettings(value: ConstrainDragToContainer): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutColumn extends StObject {
    
    var content: LayoutContent
    
    var `type`: column
  }
  object LayoutColumn {
    
    @scala.inline
    def apply(content: LayoutContent): LayoutColumn = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("column")
      __obj.asInstanceOf[LayoutColumn]
    }
    
    @scala.inline
    implicit class LayoutColumnMutableBuilder[Self <: LayoutColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setType(value: column): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutComponent extends StObject {
    
    var componentName: String
    
    var componentState: Title
    
    var `type`: component
  }
  object LayoutComponent {
    
    @scala.inline
    def apply(componentName: String, componentState: Title): LayoutComponent = {
      val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentState = componentState.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("component")
      __obj.asInstanceOf[LayoutComponent]
    }
    
    @scala.inline
    implicit class LayoutComponentMutableBuilder[Self <: LayoutComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentState(value: Title): Self = StObject.set(x, "componentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: component): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutContent = js.Array[LayoutRow | LayoutColumn | LayoutComponent]
  
  trait LayoutRow extends StObject {
    
    var content: LayoutContent
    
    var `type`: row
  }
  object LayoutRow {
    
    @scala.inline
    def apply(content: LayoutContent): LayoutRow = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("row")
      __obj.asInstanceOf[LayoutRow]
    }
    
    @scala.inline
    implicit class LayoutRowMutableBuilder[Self <: LayoutRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: LayoutContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: (LayoutRow | LayoutColumn | LayoutComponent)*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setType(value: row): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
