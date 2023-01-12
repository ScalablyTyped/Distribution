package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRepositoryRepositoryMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/repository/Repository", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Repository {
    
    /* CompleteClass */
    override def delete(name: String): Unit = js.native
    
    /* CompleteClass */
    override def get(name: String): Any = js.native
    
    /* CompleteClass */
    override def has(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def set(name: String, value: Any): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/repository/Repository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Repository extends StObject {
    
    def delete(name: String): Unit
    
    def get(name: String): Any
    
    def has(name: String): Boolean
    
    def set(name: String, value: Any): Unit
  }
  object Repository {
    
    inline def apply(delete: String => Unit, get: String => Any, has: String => Boolean, set: (String, Any) => Unit): Repository = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Repository]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Repository] (val x: Self) extends AnyVal {
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
