package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutSimpleLayoutBufferMod {
  
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
    
    /* private */ var file_ : Any = js.native
    
    /* private */ var flushPendingStrings_ : Any = js.native
    
    def forEach(callback: js.Function1[/* arg0 */ Any, Any]): Unit = js.native
    def forEach(callback: js.Function1[/* arg0 */ Any, Any], thisArg: Any): Unit = js.native
    
    def getEffectiveLength(): Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var items_ : Any = js.native
    
    /* private */ var pendingStringsLength_ : Any = js.native
    
    /* private */ var pendingStrings_ : Any = js.native
    
    def push(value: String): Unit = js.native
    def push(value: js.Array[Any]): Unit = js.native
    
    def replace(substr: String, newSubStr: String, fromIndex: Double): Unit = js.native
  }
}
