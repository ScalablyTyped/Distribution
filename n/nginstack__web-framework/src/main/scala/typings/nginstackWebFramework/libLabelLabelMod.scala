package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabelLabelMod {
  
  inline def apply(process: Process): Unit = ^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/label/Label", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Label {
    def this(process: Process) = this()
    
    /* private */ /* CompleteClass */
    var _changed: Any = js.native
    
    /* private */ /* CompleteClass */
    var _changedProperties: Any = js.native
    
    /* private */ /* CompleteClass */
    var _clearChangedProperties: Any = js.native
    
    /* CompleteClass */
    var align: String = js.native
    
    /* CompleteClass */
    var autoSanitize: Boolean = js.native
    
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /* CompleteClass */
    var border: String = js.native
    
    /* CompleteClass */
    var color: String = js.native
    
    /* CompleteClass */
    var css: String = js.native
    
    /* CompleteClass */
    var fontSize: String = js.native
    
    /* private */ /* CompleteClass */
    var getChanges: Any = js.native
    
    /* CompleteClass */
    var height: String = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var process: typings.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var resetProperties: Any = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* private */ /* CompleteClass */
    @JSName("toString")
    var toString_FLabel: Any = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /* CompleteClass */
    var width: String = js.native
    
    /* CompleteClass */
    override def write(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var written_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/label/Label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Label extends StObject {
    
    /* private */ var _changed: Any
    
    /* private */ var _changedProperties: Any
    
    /* private */ var _clearChangedProperties: Any
    
    var align: String
    
    var autoSanitize: Boolean
    
    var backgroundColor: String
    
    var border: String
    
    var color: String
    
    var css: String
    
    var fontSize: String
    
    /* private */ var getChanges: Any
    
    var height: String
    
    /* private */ var logger_ : Any
    
    var name: String
    
    var process: typings.nginstackWebFramework.libProcessProcessMod.^
    
    /* private */ var resetProperties: Any
    
    var text: String
    
    /* private */ @JSName("toString")
    var toString_FLabel: Any
    
    var visible: Boolean
    
    var width: String
    
    def write(): Unit
    
    /* private */ var written_ : Any
  }
  object Label {
    
    inline def apply(
      _changed: Any,
      _changedProperties: Any,
      _clearChangedProperties: Any,
      align: String,
      autoSanitize: Boolean,
      backgroundColor: String,
      border: String,
      color: String,
      css: String,
      fontSize: String,
      getChanges: Any,
      height: String,
      logger_ : Any,
      name: String,
      process: typings.nginstackWebFramework.libProcessProcessMod.^,
      resetProperties: Any,
      text: String,
      toString_ : Any,
      visible: Boolean,
      width: String,
      write: () => Unit,
      written_ : Any
    ): Label = {
      val __obj = js.Dynamic.literal(_changed = _changed.asInstanceOf[js.Any], _changedProperties = _changedProperties.asInstanceOf[js.Any], _clearChangedProperties = _clearChangedProperties.asInstanceOf[js.Any], align = align.asInstanceOf[js.Any], autoSanitize = autoSanitize.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], getChanges = getChanges.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], resetProperties = resetProperties.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction0(write), written_ = written_.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(toString_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAutoSanitize(value: Boolean): Self = StObject.set(x, "autoSanitize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setGetChanges(value: Any): Self = StObject.set(x, "getChanges", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: typings.nginstackWebFramework.libProcessProcessMod.^): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setResetProperties(value: Any): Self = StObject.set(x, "resetProperties", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setToString_(value: Any): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: () => Unit): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      
      inline def setWritten_(value: Any): Self = StObject.set(x, "written_", value.asInstanceOf[js.Any])
      
      inline def set_changed(value: Any): Self = StObject.set(x, "_changed", value.asInstanceOf[js.Any])
      
      inline def set_changedProperties(value: Any): Self = StObject.set(x, "_changedProperties", value.asInstanceOf[js.Any])
      
      inline def set_clearChangedProperties(value: Any): Self = StObject.set(x, "_clearChangedProperties", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typings.nginstackWebFramework.libProcessProcessMod.^
}
