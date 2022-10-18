package typings.nginstackOrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntityKeyMod {
  
  inline def apply(classKey: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(classKey: Double, opt_value: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], opt_value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntityKey", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EntityKey {
    def this(classKey: Double) = this()
    def this(classKey: Double, opt_value: Double) = this()
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* private */ /* CompleteClass */
    var classKey_ : Any = js.native
    
    /* CompleteClass */
    override def toJSONSchema(): Any = js.native
    
    /* CompleteClass */
    override def toJSONString(): String = js.native
    
    /* CompleteClass */
    var value: Double | Null = js.native
    
    /* private */ /* CompleteClass */
    var value_ : Any = js.native
  }
  @JSImport("@nginstack/orm/lib/EntityKey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EntityKey extends StObject {
    
    var classKey: Double
    
    /* private */ var classKey_ : Any
    
    def toJSONSchema(): Any
    
    def toJSONString(): String
    
    var value: Double | Null
    
    /* private */ var value_ : Any
  }
  object EntityKey {
    
    inline def apply(
      classKey: Double,
      classKey_ : Any,
      toJSONSchema: () => Any,
      toJSONString: () => String,
      value_ : Any
    ): EntityKey = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], classKey_ = classKey_.asInstanceOf[js.Any], toJSONSchema = js.Any.fromFunction0(toJSONSchema), toJSONString = js.Any.fromFunction0(toJSONString), value_ = value_.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[EntityKey]
    }
    
    extension [Self <: EntityKey](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKey_(value: Any): Self = StObject.set(x, "classKey_", value.asInstanceOf[js.Any])
      
      inline def setToJSONSchema(value: () => Any): Self = StObject.set(x, "toJSONSchema", js.Any.fromFunction0(value))
      
      inline def setToJSONString(value: () => String): Self = StObject.set(x, "toJSONString", js.Any.fromFunction0(value))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValue_(value: Any): Self = StObject.set(x, "value_", value.asInstanceOf[js.Any])
    }
  }
}
