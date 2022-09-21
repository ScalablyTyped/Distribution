package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processHelpFormatterMod {
  
  inline def apply(process: Process): Unit = ^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/ProcessHelpFormatter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ProcessHelpFormatter {
    def this(process: Process) = this()
    
    /* private */ /* CompleteClass */
    var formatConfigurePermissionsAnchor_ : Any = js.native
    
    /* CompleteClass */
    override def formatFieldHelp(gridName: String, fieldName: String): String = js.native
    
    /* CompleteClass */
    override def formatGridHelp(gridName: String): String = js.native
    
    /* CompleteClass */
    override def formatProcessHelp(): String = js.native
    
    /* private */ /* CompleteClass */
    var getCurrentInteractionProcessHelp_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var process_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/ProcessHelpFormatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Process = typings.nginstackWebFramework.processMod.^
  
  trait ProcessHelpFormatter extends StObject {
    
    /* private */ var formatConfigurePermissionsAnchor_ : Any
    
    def formatFieldHelp(gridName: String, fieldName: String): String
    
    def formatGridHelp(gridName: String): String
    
    def formatProcessHelp(): String
    
    /* private */ var getCurrentInteractionProcessHelp_ : Any
    
    /* private */ var process_ : Any
  }
  object ProcessHelpFormatter {
    
    inline def apply(
      formatConfigurePermissionsAnchor_ : Any,
      formatFieldHelp: (String, String) => String,
      formatGridHelp: String => String,
      formatProcessHelp: () => String,
      getCurrentInteractionProcessHelp_ : Any,
      process_ : Any
    ): ProcessHelpFormatter = {
      val __obj = js.Dynamic.literal(formatConfigurePermissionsAnchor_ = formatConfigurePermissionsAnchor_.asInstanceOf[js.Any], formatFieldHelp = js.Any.fromFunction2(formatFieldHelp), formatGridHelp = js.Any.fromFunction1(formatGridHelp), formatProcessHelp = js.Any.fromFunction0(formatProcessHelp), getCurrentInteractionProcessHelp_ = getCurrentInteractionProcessHelp_.asInstanceOf[js.Any], process_ = process_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessHelpFormatter]
    }
    
    extension [Self <: ProcessHelpFormatter](x: Self) {
      
      inline def setFormatConfigurePermissionsAnchor_(value: Any): Self = StObject.set(x, "formatConfigurePermissionsAnchor_", value.asInstanceOf[js.Any])
      
      inline def setFormatFieldHelp(value: (String, String) => String): Self = StObject.set(x, "formatFieldHelp", js.Any.fromFunction2(value))
      
      inline def setFormatGridHelp(value: String => String): Self = StObject.set(x, "formatGridHelp", js.Any.fromFunction1(value))
      
      inline def setFormatProcessHelp(value: () => String): Self = StObject.set(x, "formatProcessHelp", js.Any.fromFunction0(value))
      
      inline def setGetCurrentInteractionProcessHelp_(value: Any): Self = StObject.set(x, "getCurrentInteractionProcessHelp_", value.asInstanceOf[js.Any])
      
      inline def setProcess_(value: Any): Self = StObject.set(x, "process_", value.asInstanceOf[js.Any])
    }
  }
}
