package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spoolMod {
  
  inline def apply(printerName: String): Unit = ^.asInstanceOf[js.Dynamic].apply(printerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/print/Spool", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Spool {
    def this(printerName: String) = this()
  }
  @JSImport("@nginstack/engine/lib/print/Spool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrinters(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrinters")().asInstanceOf[js.Array[String]]
  
  @js.native
  trait Spool extends StObject {
    
    def close(): Unit = js.native
    def close(waitPrint: Boolean): Unit = js.native
    def close(waitPrint: Boolean, timeout: Double): Unit = js.native
    def close(waitPrint: Unit, timeout: Double): Unit = js.native
    
    def open(jobName: String): Unit = js.native
    
    def write(data: String): Unit = js.native
    
    def writeByte(data: Double): Unit = js.native
    
    def writeln(data: String): Unit = js.native
  }
}
