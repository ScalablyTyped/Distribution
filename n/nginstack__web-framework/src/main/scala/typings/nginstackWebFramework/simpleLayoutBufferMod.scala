package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleLayoutBufferMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SimpleLayoutBuffer
  @JSImport("@nginstack/web-framework/lib/simple-layout/SimpleLayoutBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait SimpleLayoutBuffer extends StObject {
    
    def clear(): Unit = js.native
    
    /* private */ var data_ : Any = js.native
    
    def forEach(callback: js.Function1[/* arg0 */ Any, Any]): Unit = js.native
    def forEach(callback: js.Function1[/* arg0 */ Any, Any], thisArg: Any): Unit = js.native
    
    var length: Double = js.native
    
    def push(value: String): Unit = js.native
    def push(value: js.Array[Any]): Unit = js.native
    
    def replace(substr: String, newSubStr: String, fromIndex: Double): Unit = js.native
    
    /* private */ var structuredData_ : Any = js.native
  }
}
