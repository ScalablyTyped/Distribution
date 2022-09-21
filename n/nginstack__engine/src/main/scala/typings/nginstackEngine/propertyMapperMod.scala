package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyMapperMod {
  
  inline def apply(translateFunction: js.Function1[/* arg0 */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].apply(translateFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/object/PropertyMapper", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PropertyMapper {
    def this(translateFunction: js.Function1[/* arg0 */ String, String]) = this()
    
    /* CompleteClass */
    override def get(obj: Any, propertyName: String): Any = js.native
    
    /* CompleteClass */
    override def getTranslatedPropertyName(propertyName: String): String = js.native
    
    /* private */ /* CompleteClass */
    var hash_ : Any = js.native
    
    /* CompleteClass */
    override def translateFunction_(arg0: String): String = js.native
  }
  @JSImport("@nginstack/engine/lib/object/PropertyMapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PropertyMapper extends StObject {
    
    def get(obj: Any, propertyName: String): Any
    
    def getTranslatedPropertyName(propertyName: String): String
    
    /* private */ var hash_ : Any
    
    def translateFunction_(arg0: String): String
  }
  object PropertyMapper {
    
    inline def apply(
      get: (Any, String) => Any,
      getTranslatedPropertyName: String => String,
      hash_ : Any,
      translateFunction_ : String => String
    ): PropertyMapper = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), getTranslatedPropertyName = js.Any.fromFunction1(getTranslatedPropertyName), hash_ = hash_.asInstanceOf[js.Any], translateFunction_ = js.Any.fromFunction1(translateFunction_))
      __obj.asInstanceOf[PropertyMapper]
    }
    
    extension [Self <: PropertyMapper](x: Self) {
      
      inline def setGet(value: (Any, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetTranslatedPropertyName(value: String => String): Self = StObject.set(x, "getTranslatedPropertyName", js.Any.fromFunction1(value))
      
      inline def setHash_(value: Any): Self = StObject.set(x, "hash_", value.asInstanceOf[js.Any])
      
      inline def setTranslateFunction_(value: String => String): Self = StObject.set(x, "translateFunction_", js.Any.fromFunction1(value))
    }
  }
}
