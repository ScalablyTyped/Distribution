package typings.nginstackEngine

import typings.nginstackEngine.anon.AllowNonClassFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityFieldPermissionsMod {
  
  inline def apply(classKey: Double, userKey: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(classKey: Double, userKey: Double, opt_options: AllowNonClassFields): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/FieldPermissions", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldPermissions {
    def this(classKey: Double, userKey: Double) = this()
    def this(classKey: Double, userKey: Double, opt_options: AllowNonClassFields) = this()
    
    /* private */ /* CompleteClass */
    var allowNonClassFields_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var buildPermissionsMap_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var changeabilityPermissions_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var classKey_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getFieldPermission_ : Any = js.native
    
    /* protected */ /* CompleteClass */
    override def getPermission_(fieldName: String): String = js.native
    
    /* CompleteClass */
    override def isChangeable(fieldName: String): Boolean = js.native
    
    /* CompleteClass */
    override def isVisible(fieldName: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var load_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var userKey_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var visibilityPermissions_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/security/FieldPermissions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldPermissions extends StObject {
    
    /* private */ var allowNonClassFields_ : Any
    
    /* private */ var buildPermissionsMap_ : Any
    
    /* private */ var changeabilityPermissions_ : Any
    
    /* private */ var classKey_ : Any
    
    /* private */ var getFieldPermission_ : Any
    
    /* protected */ def getPermission_(fieldName: String): String
    
    def isChangeable(fieldName: String): Boolean
    
    def isVisible(fieldName: String): Boolean
    
    /* private */ var load_ : Any
    
    /* private */ var userKey_ : Any
    
    /* private */ var visibilityPermissions_ : Any
  }
  object FieldPermissions {
    
    inline def apply(
      allowNonClassFields_ : Any,
      buildPermissionsMap_ : Any,
      changeabilityPermissions_ : Any,
      classKey_ : Any,
      getFieldPermission_ : Any,
      getPermission_ : String => String,
      isChangeable: String => Boolean,
      isVisible: String => Boolean,
      load_ : Any,
      userKey_ : Any,
      visibilityPermissions_ : Any
    ): FieldPermissions = {
      val __obj = js.Dynamic.literal(allowNonClassFields_ = allowNonClassFields_.asInstanceOf[js.Any], buildPermissionsMap_ = buildPermissionsMap_.asInstanceOf[js.Any], changeabilityPermissions_ = changeabilityPermissions_.asInstanceOf[js.Any], classKey_ = classKey_.asInstanceOf[js.Any], getFieldPermission_ = getFieldPermission_.asInstanceOf[js.Any], getPermission_ = js.Any.fromFunction1(getPermission_), isChangeable = js.Any.fromFunction1(isChangeable), isVisible = js.Any.fromFunction1(isVisible), load_ = load_.asInstanceOf[js.Any], userKey_ = userKey_.asInstanceOf[js.Any], visibilityPermissions_ = visibilityPermissions_.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPermissions]
    }
    
    extension [Self <: FieldPermissions](x: Self) {
      
      inline def setAllowNonClassFields_(value: Any): Self = StObject.set(x, "allowNonClassFields_", value.asInstanceOf[js.Any])
      
      inline def setBuildPermissionsMap_(value: Any): Self = StObject.set(x, "buildPermissionsMap_", value.asInstanceOf[js.Any])
      
      inline def setChangeabilityPermissions_(value: Any): Self = StObject.set(x, "changeabilityPermissions_", value.asInstanceOf[js.Any])
      
      inline def setClassKey_(value: Any): Self = StObject.set(x, "classKey_", value.asInstanceOf[js.Any])
      
      inline def setGetFieldPermission_(value: Any): Self = StObject.set(x, "getFieldPermission_", value.asInstanceOf[js.Any])
      
      inline def setGetPermission_(value: String => String): Self = StObject.set(x, "getPermission_", js.Any.fromFunction1(value))
      
      inline def setIsChangeable(value: String => Boolean): Self = StObject.set(x, "isChangeable", js.Any.fromFunction1(value))
      
      inline def setIsVisible(value: String => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction1(value))
      
      inline def setLoad_(value: Any): Self = StObject.set(x, "load_", value.asInstanceOf[js.Any])
      
      inline def setUserKey_(value: Any): Self = StObject.set(x, "userKey_", value.asInstanceOf[js.Any])
      
      inline def setVisibilityPermissions_(value: Any): Self = StObject.set(x, "visibilityPermissions_", value.asInstanceOf[js.Any])
    }
  }
}
