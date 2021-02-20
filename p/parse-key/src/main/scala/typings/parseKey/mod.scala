package typings.parseKey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-key", JSImport.Namespace)
  @js.native
  def apply(s: String): KeyObject = js.native
  
  @js.native
  trait KeyObject extends StObject {
    
    var alt: Boolean = js.native
    
    var ctrl: Boolean = js.native
    
    var meta: Boolean = js.native
    
    var name: String = js.native
    
    var sequence: String = js.native
    
    var shift: Boolean = js.native
  }
  object KeyObject {
    
    @scala.inline
    def apply(alt: Boolean, ctrl: Boolean, meta: Boolean, name: String, sequence: String, shift: Boolean): KeyObject = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    @scala.inline
    implicit class KeyObjectMutableBuilder[Self <: KeyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
}
