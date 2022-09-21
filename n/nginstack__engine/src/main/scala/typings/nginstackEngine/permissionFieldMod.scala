package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissionFieldMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/PermissionField", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PermissionField {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var readMode: String = js.native
    
    /* CompleteClass */
    var scope: typings.nginstackEngine.permissionFieldScopeMod.^ = js.native
    
    /* CompleteClass */
    var useAsExtraFilter: Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/PermissionField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PermissionField extends StObject {
    
    var readMode: String
    
    var scope: typings.nginstackEngine.permissionFieldScopeMod.^
    
    var useAsExtraFilter: Boolean
  }
  object PermissionField {
    
    inline def apply(
      readMode: String,
      scope: typings.nginstackEngine.permissionFieldScopeMod.^,
      useAsExtraFilter: Boolean
    ): PermissionField = {
      val __obj = js.Dynamic.literal(readMode = readMode.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], useAsExtraFilter = useAsExtraFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionField]
    }
    
    extension [Self <: PermissionField](x: Self) {
      
      inline def setReadMode(value: String): Self = StObject.set(x, "readMode", value.asInstanceOf[js.Any])
      
      inline def setScope(value: typings.nginstackEngine.permissionFieldScopeMod.^): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setUseAsExtraFilter(value: Boolean): Self = StObject.set(x, "useAsExtraFilter", value.asInstanceOf[js.Any])
    }
  }
}
