package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formDialogMod {
  
  inline def apply(process: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dialogs/FormDialog", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FormDialog {
    def this(process: Any) = this()
  }
  @JSImport("@nginstack/web-framework/lib/dialogs/FormDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FormDialog extends StObject {
    
    /* private */ var _fields: Any = js.native
    
    /* private */ var _getProperties: Any = js.native
    
    /* private */ var _nameToId: Any = js.native
    
    def addField(name: String, `type`: String): typings.nginstackWebFramework.formDialogFieldMod.^ = js.native
    def addField(name: String, `type`: String, size: Double): typings.nginstackWebFramework.formDialogFieldMod.^ = js.native
    
    def field(name: Any): typings.nginstackWebFramework.formDialogFieldMod.^ = js.native
    
    /* private */ var getUserProfileName_ : Any = js.native
    
    /* private */ var process_ : Any = js.native
    
    def show(): Boolean = js.native
    
    var title: String = js.native
  }
}
