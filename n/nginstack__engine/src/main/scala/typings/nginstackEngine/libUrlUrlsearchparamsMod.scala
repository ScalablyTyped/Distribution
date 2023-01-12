package typings.nginstackEngine

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlUrlsearchparamsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(query: String): Unit = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(query: js.Array[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(query: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/url/URLSearchParams", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with URLSearchParams {
    def this(query: String) = this()
    def this(query: js.Array[js.Array[String]]) = this()
    def this(query: Record[String, String]) = this()
    
    /* CompleteClass */
    override def append(name: String, value: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var appendTo_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var decode_ : Any = js.native
    
    /* CompleteClass */
    override def delete(name: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    var encode_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var findRegex_ : Any = js.native
    
    /* CompleteClass */
    override def forEach(callback: js.Function1[/* repeated */ Any, Any], thisArg: Any): Unit = js.native
    
    /* CompleteClass */
    override def get(name: String): Any = js.native
    
    /* CompleteClass */
    override def getAll(name: String): js.Array[Any] = js.native
    
    /* private */ /* CompleteClass */
    var getFindRegex_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getPercentSignRegex_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getPlusSignRegex_ : Any = js.native
    
    /* CompleteClass */
    override def has(name: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var paramsList_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var paramsMap_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var percentSignRegex_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var plusSignRegex_ : Any = js.native
    
    /* CompleteClass */
    override def set(name: String, value: Any): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/url/URLSearchParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait URLSearchParams extends StObject {
    
    def append(name: String, value: Any): Unit
    
    /* private */ var appendTo_ : Any
    
    /* private */ var decode_ : Any
    
    def delete(name: String): Unit
    
    /* private */ var encode_ : Any
    
    /* private */ var findRegex_ : Any
    
    def forEach(callback: js.Function1[/* repeated */ Any, Any], thisArg: Any): Unit
    
    def get(name: String): Any
    
    def getAll(name: String): js.Array[Any]
    
    /* private */ var getFindRegex_ : Any
    
    /* private */ var getPercentSignRegex_ : Any
    
    /* private */ var getPlusSignRegex_ : Any
    
    def has(name: String): Boolean
    
    /* private */ var paramsList_ : Any
    
    /* private */ var paramsMap_ : Any
    
    /* private */ var percentSignRegex_ : Any
    
    /* private */ var plusSignRegex_ : Any
    
    def set(name: String, value: Any): Unit
  }
  object URLSearchParams {
    
    inline def apply(
      append: (String, Any) => Unit,
      appendTo_ : Any,
      decode_ : Any,
      delete: String => Unit,
      encode_ : Any,
      findRegex_ : Any,
      forEach: (js.Function1[/* repeated */ Any, Any], Any) => Unit,
      get: String => Any,
      getAll: String => js.Array[Any],
      getFindRegex_ : Any,
      getPercentSignRegex_ : Any,
      getPlusSignRegex_ : Any,
      has: String => Boolean,
      paramsList_ : Any,
      paramsMap_ : Any,
      percentSignRegex_ : Any,
      plusSignRegex_ : Any,
      set: (String, Any) => Unit
    ): URLSearchParams = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), appendTo_ = appendTo_.asInstanceOf[js.Any], decode_ = decode_.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), encode_ = encode_.asInstanceOf[js.Any], findRegex_ = findRegex_.asInstanceOf[js.Any], forEach = js.Any.fromFunction2(forEach), get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), getFindRegex_ = getFindRegex_.asInstanceOf[js.Any], getPercentSignRegex_ = getPercentSignRegex_.asInstanceOf[js.Any], getPlusSignRegex_ = getPlusSignRegex_.asInstanceOf[js.Any], has = js.Any.fromFunction1(has), paramsList_ = paramsList_.asInstanceOf[js.Any], paramsMap_ = paramsMap_.asInstanceOf[js.Any], percentSignRegex_ = percentSignRegex_.asInstanceOf[js.Any], plusSignRegex_ = plusSignRegex_.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[URLSearchParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLSearchParams] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: (String, Any) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      inline def setAppendTo_(value: Any): Self = StObject.set(x, "appendTo_", value.asInstanceOf[js.Any])
      
      inline def setDecode_(value: Any): Self = StObject.set(x, "decode_", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setEncode_(value: Any): Self = StObject.set(x, "encode_", value.asInstanceOf[js.Any])
      
      inline def setFindRegex_(value: Any): Self = StObject.set(x, "findRegex_", value.asInstanceOf[js.Any])
      
      inline def setForEach(value: (js.Function1[/* repeated */ Any, Any], Any) => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction2(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: String => js.Array[Any]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
      
      inline def setGetFindRegex_(value: Any): Self = StObject.set(x, "getFindRegex_", value.asInstanceOf[js.Any])
      
      inline def setGetPercentSignRegex_(value: Any): Self = StObject.set(x, "getPercentSignRegex_", value.asInstanceOf[js.Any])
      
      inline def setGetPlusSignRegex_(value: Any): Self = StObject.set(x, "getPlusSignRegex_", value.asInstanceOf[js.Any])
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setParamsList_(value: Any): Self = StObject.set(x, "paramsList_", value.asInstanceOf[js.Any])
      
      inline def setParamsMap_(value: Any): Self = StObject.set(x, "paramsMap_", value.asInstanceOf[js.Any])
      
      inline def setPercentSignRegex_(value: Any): Self = StObject.set(x, "percentSignRegex_", value.asInstanceOf[js.Any])
      
      inline def setPlusSignRegex_(value: Any): Self = StObject.set(x, "plusSignRegex_", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
