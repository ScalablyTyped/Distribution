package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationMenuButtonMod {
  
  inline def apply(key: Any, label: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MenuButton {
    def this(key: Any, label: Any) = this()
    
    /* CompleteClass */
    var clickAction: Any = js.native
    
    /* CompleteClass */
    var cssActiveClassName: String = js.native
    
    /* CompleteClass */
    var cssClassName: String = js.native
    
    /* CompleteClass */
    var cssHoverClassName: String = js.native
    
    /* CompleteClass */
    var cssLabelClassName: String = js.native
    
    /* CompleteClass */
    var icon: Any = js.native
    
    /* CompleteClass */
    var label: Any = js.native
    
    /* CompleteClass */
    var nodeId: String = js.native
    
    /* CompleteClass */
    var order: Double = js.native
    
    /* CompleteClass */
    var processKey: Any = js.native
    
    /* CompleteClass */
    override def toHtml(): String = js.native
    
    /* CompleteClass */
    var treeRoot: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "CALL_PROCESS")
  @js.native
  val CALL_PROCESS: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "HELP")
  @js.native
  val HELP: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "LOGOUT")
  @js.native
  val LOGOUT: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "NONE_ACTION")
  @js.native
  val NONE_ACTION: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "PRINT")
  @js.native
  val PRINT: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "SEARCH")
  @js.native
  val SEARCH: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "SHOW_TREE")
  @js.native
  val SHOW_TREE: Double = js.native
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuButton", "TASK")
  @js.native
  val TASK: Double = js.native
  
  trait MenuButton extends StObject {
    
    var clickAction: Any
    
    var cssActiveClassName: String
    
    var cssClassName: String
    
    var cssHoverClassName: String
    
    var cssLabelClassName: String
    
    var icon: Any
    
    var label: Any
    
    var nodeId: String
    
    var order: Double
    
    var processKey: Any
    
    def toHtml(): String
    
    var treeRoot: Any
  }
  object MenuButton {
    
    inline def apply(
      clickAction: Any,
      cssActiveClassName: String,
      cssClassName: String,
      cssHoverClassName: String,
      cssLabelClassName: String,
      icon: Any,
      label: Any,
      nodeId: String,
      order: Double,
      processKey: Any,
      toHtml: () => String,
      treeRoot: Any
    ): MenuButton = {
      val __obj = js.Dynamic.literal(clickAction = clickAction.asInstanceOf[js.Any], cssActiveClassName = cssActiveClassName.asInstanceOf[js.Any], cssClassName = cssClassName.asInstanceOf[js.Any], cssHoverClassName = cssHoverClassName.asInstanceOf[js.Any], cssLabelClassName = cssLabelClassName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any], toHtml = js.Any.fromFunction0(toHtml), treeRoot = treeRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuButton]
    }
    
    extension [Self <: MenuButton](x: Self) {
      
      inline def setClickAction(value: Any): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
      
      inline def setCssActiveClassName(value: String): Self = StObject.set(x, "cssActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setCssClassName(value: String): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
      
      inline def setCssHoverClassName(value: String): Self = StObject.set(x, "cssHoverClassName", value.asInstanceOf[js.Any])
      
      inline def setCssLabelClassName(value: String): Self = StObject.set(x, "cssLabelClassName", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setProcessKey(value: Any): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
      
      inline def setToHtml(value: () => String): Self = StObject.set(x, "toHtml", js.Any.fromFunction0(value))
      
      inline def setTreeRoot(value: Any): Self = StObject.set(x, "treeRoot", value.asInstanceOf[js.Any])
    }
  }
}
