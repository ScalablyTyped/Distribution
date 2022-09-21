package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleLayoutExporterMod {
  
  inline def apply(simpleLayout: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(simpleLayout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SimpleLayoutExporter {
    def this(simpleLayout: Any) = this()
    
    /* CompleteClass */
    override def formatFieldGroupName(index: Double): String = js.native
    
    /* CompleteClass */
    var title: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SimpleLayoutExporter extends StObject {
    
    def formatFieldGroupName(index: Double): String
    
    var title: Any
  }
  object SimpleLayoutExporter {
    
    inline def apply(formatFieldGroupName: Double => String, title: Any): SimpleLayoutExporter = {
      val __obj = js.Dynamic.literal(formatFieldGroupName = js.Any.fromFunction1(formatFieldGroupName), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleLayoutExporter]
    }
    
    extension [Self <: SimpleLayoutExporter](x: Self) {
      
      inline def setFormatFieldGroupName(value: Double => String): Self = StObject.set(x, "formatFieldGroupName", js.Any.fromFunction1(value))
      
      inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
