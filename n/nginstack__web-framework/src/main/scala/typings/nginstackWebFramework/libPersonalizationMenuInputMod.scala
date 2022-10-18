package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationMenuInputMod {
  
  inline def apply(name: Any, `type`: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/MenuInput", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MenuInput {
    def this(name: Any, `type`: Any) = this()
    
    /* CompleteClass */
    var cssClassName: String = js.native
    
    /* CompleteClass */
    var name: Any = js.native
    
    /* CompleteClass */
    var nodeId: Any = js.native
    
    /* CompleteClass */
    var order: Double = js.native
    
    /* CompleteClass */
    var placeholder: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def toHtml(): String = js.native
    
    /* CompleteClass */
    var `type`: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/MenuInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MenuInput extends StObject {
    
    var cssClassName: String
    
    var name: Any
    
    var nodeId: Any
    
    var order: Double
    
    var placeholder: String
    
    var size: Double
    
    def toHtml(): String
    
    var `type`: Any
  }
  object MenuInput {
    
    inline def apply(
      cssClassName: String,
      name: Any,
      nodeId: Any,
      order: Double,
      placeholder: String,
      size: Double,
      toHtml: () => String,
      `type`: Any
    ): MenuInput = {
      val __obj = js.Dynamic.literal(cssClassName = cssClassName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toHtml = js.Any.fromFunction0(toHtml))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInput]
    }
    
    extension [Self <: MenuInput](x: Self) {
      
      inline def setCssClassName(value: String): Self = StObject.set(x, "cssClassName", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeId(value: Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToHtml(value: () => String): Self = StObject.set(x, "toHtml", js.Any.fromFunction0(value))
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
