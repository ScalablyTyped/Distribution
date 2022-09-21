package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldListErrorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldListError {
    def this(args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "DOUBLE_ADD")
  @js.native
  val DOUBLE_ADD: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_ARGUMENTS_LENGTH")
  @js.native
  val INVALID_ARGUMENTS_LENGTH: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_ARGUMENT_TYPE")
  @js.native
  val INVALID_ARGUMENT_TYPE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_ARGUMENT_VALUE")
  @js.native
  val INVALID_ARGUMENT_VALUE: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_FIELD_INDEX")
  @js.native
  val INVALID_FIELD_INDEX: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_FIELD_NAME")
  @js.native
  val INVALID_FIELD_NAME: Double = js.native
  
  @JSImport("@nginstack/engine/lib/classdef/FieldListError", "INVALID_PROPERTY_NAME")
  @js.native
  val INVALID_PROPERTY_NAME: Double = js.native
  
  trait FieldListError extends StObject {
    
    /* private */ var _name: Any
  }
  object FieldListError {
    
    inline def apply(_name: Any): FieldListError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldListError]
    }
    
    extension [Self <: FieldListError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
