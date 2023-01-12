package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefGridLocateEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/classdef/GridLocateEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GridLocateEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var found: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var foundWasInformed_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var locateResult_ : Any = js.native
    
    /* CompleteClass */
    var locatedField: GridField = js.native
    
    /* CompleteClass */
    var options: js.Array[Double] = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  @JSImport("@nginstack/web-framework/lib/classdef/GridLocateEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GridField = typings.nginstackWebFramework.libGridGridFieldMod.^
  
  trait GridLocateEvent extends StObject {
    
    var found: Boolean
    
    /* private */ var foundWasInformed_ : Any
    
    /* private */ var locateResult_ : Any
    
    var locatedField: GridField
    
    var options: js.Array[Double]
    
    var value: String
  }
  object GridLocateEvent {
    
    inline def apply(
      found: Boolean,
      foundWasInformed_ : Any,
      locateResult_ : Any,
      locatedField: GridField,
      options: js.Array[Double],
      value: String
    ): GridLocateEvent = {
      val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], foundWasInformed_ = foundWasInformed_.asInstanceOf[js.Any], locateResult_ = locateResult_.asInstanceOf[js.Any], locatedField = locatedField.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridLocateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridLocateEvent] (val x: Self) extends AnyVal {
      
      inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setFoundWasInformed_(value: Any): Self = StObject.set(x, "foundWasInformed_", value.asInstanceOf[js.Any])
      
      inline def setLocateResult_(value: Any): Self = StObject.set(x, "locateResult_", value.asInstanceOf[js.Any])
      
      inline def setLocatedField(value: GridField): Self = StObject.set(x, "locatedField", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
