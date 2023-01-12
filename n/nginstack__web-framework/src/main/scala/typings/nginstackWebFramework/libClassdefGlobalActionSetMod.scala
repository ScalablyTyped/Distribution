package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGlobalActionSetMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalActionSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GlobalActionSet {
    
    /* CompleteClass */
    override def add(action: Any): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(name: String): Boolean = js.native
    
    /* CompleteClass */
    override def get(name: String): typings.nginstackWebFramework.libClassdefGlobalActionMod.^ = js.native
    
    /* CompleteClass */
    override def getAll(): js.Array[typings.nginstackWebFramework.libClassdefGlobalActionMod.^] = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var items_ : Any = js.native
    
    /* CompleteClass */
    var onShow: typings.nginstackEngine.libEventLegacyEventMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GlobalActionSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GlobalActionSet extends StObject {
    
    def add(action: Any): Unit
    
    def clear(): Unit
    
    def delete(name: String): Boolean
    
    def get(name: String): typings.nginstackWebFramework.libClassdefGlobalActionMod.^
    
    def getAll(): js.Array[typings.nginstackWebFramework.libClassdefGlobalActionMod.^]
    
    def isEmpty(): Boolean
    
    /* private */ var items_ : Any
    
    var onShow: typings.nginstackEngine.libEventLegacyEventMod.^
  }
  object GlobalActionSet {
    
    inline def apply(
      add: Any => Unit,
      clear: () => Unit,
      delete: String => Boolean,
      get: String => typings.nginstackWebFramework.libClassdefGlobalActionMod.^,
      getAll: () => js.Array[typings.nginstackWebFramework.libClassdefGlobalActionMod.^],
      isEmpty: () => Boolean,
      items_ : Any,
      onShow: typings.nginstackEngine.libEventLegacyEventMod.^
    ): GlobalActionSet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), isEmpty = js.Any.fromFunction0(isEmpty), items_ = items_.asInstanceOf[js.Any], onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalActionSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalActionSet] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Any => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: String => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => typings.nginstackWebFramework.libClassdefGlobalActionMod.^): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: () => js.Array[typings.nginstackWebFramework.libClassdefGlobalActionMod.^]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setItems_(value: Any): Self = StObject.set(x, "items_", value.asInstanceOf[js.Any])
      
      inline def setOnShow(value: typings.nginstackEngine.libEventLegacyEventMod.^): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    }
  }
}
