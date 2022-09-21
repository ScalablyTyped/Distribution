package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleDialogMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(process: typings.nginstackWebFramework.processMod.^): Unit = ^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dialogs/SimpleDialog", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SimpleDialog {
    def this(process: typings.nginstackWebFramework.processMod.^) = this()
    
    /* private */ /* CompleteClass */
    var _process: Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dialogs/SimpleDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SimpleDialog extends StObject {
    
    /* private */ var _process: Any
    
    var message: String
    
    def show(): Unit
    
    var title: String
  }
  object SimpleDialog {
    
    inline def apply(_process: Any, message: String, show: () => Unit, title: String): SimpleDialog = {
      val __obj = js.Dynamic.literal(_process = _process.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleDialog]
    }
    
    extension [Self <: SimpleDialog](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def set_process(value: Any): Self = StObject.set(x, "_process", value.asInstanceOf[js.Any])
    }
  }
}
