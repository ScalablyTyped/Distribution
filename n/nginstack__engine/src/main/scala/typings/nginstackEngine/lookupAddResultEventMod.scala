package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupAddResultEventMod {
  
  inline def apply(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/LookupAddResultEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LookupAddResultEvent {
    def this(`type`: String) = this()
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* CompleteClass */
    var complement: String = js.native
    
    /* private */ /* CompleteClass */
    var findResult_ : Any = js.native
    
    /* CompleteClass */
    var key: Double = js.native
    
    /* CompleteClass */
    var mustAdd: Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/LookupAddResultEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LookupAddResultEvent extends StObject {
    
    var classKey: Double
    
    var complement: String
    
    /* private */ var findResult_ : Any
    
    var key: Double
    
    var mustAdd: Boolean
  }
  object LookupAddResultEvent {
    
    inline def apply(classKey: Double, complement: String, findResult_ : Any, key: Double, mustAdd: Boolean): LookupAddResultEvent = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], complement = complement.asInstanceOf[js.Any], findResult_ = findResult_.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mustAdd = mustAdd.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupAddResultEvent]
    }
    
    extension [Self <: LookupAddResultEvent](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setComplement(value: String): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      inline def setFindResult_(value: Any): Self = StObject.set(x, "findResult_", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMustAdd(value: Boolean): Self = StObject.set(x, "mustAdd", value.asInstanceOf[js.Any])
    }
  }
}
