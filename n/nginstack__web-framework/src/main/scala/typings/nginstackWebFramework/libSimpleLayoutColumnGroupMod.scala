package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutColumnGroupMod {
  
  inline def apply(name: String): Unit = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/ColumnGroup", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ColumnGroup {
    def this(name: String) = this()
    
    /* CompleteClass */
    var align: String = js.native
    
    /* CompleteClass */
    var bold: Boolean = js.native
    
    /* CompleteClass */
    var color: String = js.native
    
    /* private */ /* CompleteClass */
    var getColumnGroupDiv: Any = js.native
    
    /* CompleteClass */
    var italic: Boolean = js.native
    
    /* CompleteClass */
    var lineHeight: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var style: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/ColumnGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ColumnGroup extends StObject {
    
    var align: String
    
    var bold: Boolean
    
    var color: String
    
    /* private */ var getColumnGroupDiv: Any
    
    var italic: Boolean
    
    var lineHeight: Double
    
    var name: String
    
    var style: String
  }
  object ColumnGroup {
    
    inline def apply(
      align: String,
      bold: Boolean,
      color: String,
      getColumnGroupDiv: Any,
      italic: Boolean,
      lineHeight: Double,
      name: String,
      style: String
    ): ColumnGroup = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], getColumnGroupDiv = getColumnGroupDiv.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroup]
    }
    
    extension [Self <: ColumnGroup](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setGetColumnGroupDiv(value: Any): Self = StObject.set(x, "getColumnGroupDiv", value.asInstanceOf[js.Any])
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
