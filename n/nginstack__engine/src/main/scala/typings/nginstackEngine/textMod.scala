package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Text", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Text {
    
    /* CompleteClass */
    override def splitText(): Text = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Text extends StObject {
    
    def splitText(): Text
  }
  object Text {
    
    inline def apply(splitText: () => Text): Text = {
      val __obj = js.Dynamic.literal(splitText = js.Any.fromFunction0(splitText))
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setSplitText(value: () => Text): Self = StObject.set(x, "splitText", js.Any.fromFunction0(value))
    }
  }
}
