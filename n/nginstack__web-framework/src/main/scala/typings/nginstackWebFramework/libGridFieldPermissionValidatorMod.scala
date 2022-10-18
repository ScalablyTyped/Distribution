package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridFieldPermissionValidatorMod {
  
  inline def apply(
    manager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPermissionValidatorManager */ Any,
    permField: String,
    classKey: Double,
    userKey: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(manager.asInstanceOf[js.Any], permField.asInstanceOf[js.Any], classKey.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/FieldPermissionValidator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldPermissionValidator {
    def this(
      manager: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldPermissionValidatorManager */ Any,
      permField: String,
      classKey: Double,
      userKey: Double
    ) = this()
    
    /* private */ /* CompleteClass */
    var handlerFunc_ : Any = js.native
    
    /* CompleteClass */
    override def hasPermission(fieldName: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var makeDeprecatedHandler_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/FieldPermissionValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldPermissionValidator extends StObject {
    
    /* private */ var handlerFunc_ : Any
    
    def hasPermission(fieldName: String): Boolean
    
    /* private */ var makeDeprecatedHandler_ : Any
  }
  object FieldPermissionValidator {
    
    inline def apply(handlerFunc_ : Any, hasPermission: String => Boolean, makeDeprecatedHandler_ : Any): FieldPermissionValidator = {
      val __obj = js.Dynamic.literal(handlerFunc_ = handlerFunc_.asInstanceOf[js.Any], hasPermission = js.Any.fromFunction1(hasPermission), makeDeprecatedHandler_ = makeDeprecatedHandler_.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPermissionValidator]
    }
    
    extension [Self <: FieldPermissionValidator](x: Self) {
      
      inline def setHandlerFunc_(value: Any): Self = StObject.set(x, "handlerFunc_", value.asInstanceOf[js.Any])
      
      inline def setHasPermission(value: String => Boolean): Self = StObject.set(x, "hasPermission", js.Any.fromFunction1(value))
      
      inline def setMakeDeprecatedHandler_(value: Any): Self = StObject.set(x, "makeDeprecatedHandler_", value.asInstanceOf[js.Any])
    }
  }
}
