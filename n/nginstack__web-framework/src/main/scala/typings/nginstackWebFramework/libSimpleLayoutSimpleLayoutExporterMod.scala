package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutSimpleLayoutExporterMod {
  
  inline def apply(simpleLayout: SimpleLayout): Unit = ^.asInstanceOf[js.Dynamic].apply(simpleLayout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SimpleLayoutExporter {
    def this(simpleLayout: SimpleLayout) = this()
    
    /* CompleteClass */
    override def formatFieldGroupName(index: Double): String = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type SimpleLayout = typings.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^
  
  trait SimpleLayoutExporter extends StObject {
    
    def formatFieldGroupName(index: Double): String
    
    var title: String
  }
  object SimpleLayoutExporter {
    
    inline def apply(formatFieldGroupName: Double => String, title: String): SimpleLayoutExporter = {
      val __obj = js.Dynamic.literal(formatFieldGroupName = js.Any.fromFunction1(formatFieldGroupName), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleLayoutExporter]
    }
    
    extension [Self <: SimpleLayoutExporter](x: Self) {
      
      inline def setFormatFieldGroupName(value: Double => String): Self = StObject.set(x, "formatFieldGroupName", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
