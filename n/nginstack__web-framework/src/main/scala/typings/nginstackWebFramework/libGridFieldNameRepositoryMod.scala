package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridFieldNameRepositoryMod {
  
  inline def apply(fieldList: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(fieldList.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/FieldNameRepository", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldNameRepository {
    def this(fieldList: Any) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def getArrayFromList(list: Any): Any = js.native
    
    /* CompleteClass */
    override def hasFieldName(fieldName: Any): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var list_ : Any = js.native
    
    /* CompleteClass */
    override def setFieldNameList(list: Any): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/FieldNameRepository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldNameRepository extends StObject {
    
    def clear(): Unit
    
    def getArrayFromList(list: Any): Any
    
    def hasFieldName(fieldName: Any): Boolean
    
    /* private */ var list_ : Any
    
    def setFieldNameList(list: Any): Unit
  }
  object FieldNameRepository {
    
    inline def apply(
      clear: () => Unit,
      getArrayFromList: Any => Any,
      hasFieldName: Any => Boolean,
      list_ : Any,
      setFieldNameList: Any => Unit
    ): FieldNameRepository = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getArrayFromList = js.Any.fromFunction1(getArrayFromList), hasFieldName = js.Any.fromFunction1(hasFieldName), list_ = list_.asInstanceOf[js.Any], setFieldNameList = js.Any.fromFunction1(setFieldNameList))
      __obj.asInstanceOf[FieldNameRepository]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldNameRepository] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGetArrayFromList(value: Any => Any): Self = StObject.set(x, "getArrayFromList", js.Any.fromFunction1(value))
      
      inline def setHasFieldName(value: Any => Boolean): Self = StObject.set(x, "hasFieldName", js.Any.fromFunction1(value))
      
      inline def setList_(value: Any): Self = StObject.set(x, "list_", value.asInstanceOf[js.Any])
      
      inline def setSetFieldNameList(value: Any => Unit): Self = StObject.set(x, "setFieldNameList", js.Any.fromFunction1(value))
    }
  }
}
