package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldNameListMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldNameList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldNameList {
    
    /* private */ /* CompleteClass */
    var _items: Any = js.native
    
    /* private */ /* CompleteClass */
    var _nameToFieldId: Any = js.native
    
    /* CompleteClass */
    override def add(fieldName: String): Unit = js.native
    
    /* CompleteClass */
    override def assign(fieldNameList: FieldNameList): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def getCount(): Any = js.native
    
    /* private */ /* CompleteClass */
    var init_ : Any = js.native
    
    /* CompleteClass */
    override def map(func: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def remove(fieldName: String): Unit = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldNameList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldNameList extends StObject {
    
    /* private */ var _items: Any
    
    /* private */ var _nameToFieldId: Any
    
    def add(fieldName: String): Unit
    
    def assign(fieldNameList: FieldNameList): Unit
    
    def clear(): Unit
    
    def getCount(): Any
    
    /* private */ var init_ : Any
    
    def map(func: js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], args: Any*): Unit
    
    def remove(fieldName: String): Unit
    
    def toArray(): js.Array[Any]
  }
  object FieldNameList {
    
    inline def apply(
      _items: Any,
      _nameToFieldId: Any,
      add: String => Unit,
      assign: FieldNameList => Unit,
      clear: () => Unit,
      getCount: () => Any,
      init_ : Any,
      map: (js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], /* repeated */ Any) => Unit,
      remove: String => Unit,
      toArray: () => js.Array[Any]
    ): FieldNameList = {
      val __obj = js.Dynamic.literal(_items = _items.asInstanceOf[js.Any], _nameToFieldId = _nameToFieldId.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), assign = js.Any.fromFunction1(assign), clear = js.Any.fromFunction0(clear), getCount = js.Any.fromFunction0(getCount), init_ = init_.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), remove = js.Any.fromFunction1(remove), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[FieldNameList]
    }
    
    extension [Self <: FieldNameList](x: Self) {
      
      inline def setAdd(value: String => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAssign(value: FieldNameList => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetCount(value: () => Any): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setInit_(value: Any): Self = StObject.set(x, "init_", value.asInstanceOf[js.Any])
      
      inline def setMap(value: (js.Function2[/* arg0 */ String, /* repeated */ Any, Unit], /* repeated */ Any) => Unit): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setToArray(value: () => js.Array[Any]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def set_items(value: Any): Self = StObject.set(x, "_items", value.asInstanceOf[js.Any])
      
      inline def set_nameToFieldId(value: Any): Self = StObject.set(x, "_nameToFieldId", value.asInstanceOf[js.Any])
    }
  }
}
