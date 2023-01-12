package typings.netKeepalive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fd extends StObject {
    
    var _fd: Double
  }
  object Fd {
    
    inline def apply(_fd: Double): Fd = {
      val __obj = js.Dynamic.literal(_fd = _fd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
      
      inline def set_fd(value: Double): Self = StObject.set(x, "_fd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handle extends StObject {
    
    var _handle: Fd
  }
  object Handle {
    
    inline def apply(_handle: Fd): Handle = {
      val __obj = js.Dynamic.literal(_handle = _handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
      
      inline def set_handle(value: Fd): Self = StObject.set(x, "_handle", value.asInstanceOf[js.Any])
    }
  }
}
