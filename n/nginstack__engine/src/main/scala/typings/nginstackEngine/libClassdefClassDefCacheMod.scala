package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefClassDefCacheMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/ClassDefCache", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ClassDefCache
  @JSImport("@nginstack/engine/lib/classdef/ClassDefCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ClassDefCache extends StObject {
    
    /* private */ var data_ : Any = js.native
    
    def get(id: String): Any = js.native
    
    def getOrElse(id: String, func: js.Function0[Any]): Any = js.native
    def getOrElse(id: String, func: js.Function0[Any], opt_obj: Any): Any = js.native
    
    def has(id: String): Boolean = js.native
    
    def set(id: String, value: Any): Unit = js.native
  }
}
