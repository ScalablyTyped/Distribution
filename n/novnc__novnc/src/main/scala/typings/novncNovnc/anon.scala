package typings.novncNovnc

import typings.novncNovnc.novncNovncStrings.password
import typings.novncNovnc.novncNovncStrings.target
import typings.novncNovnc.novncNovncStrings.username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Capabilities extends StObject {
    
    var capabilities: Power
  }
  object Capabilities {
    
    inline def apply(capabilities: Power): Capabilities = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: Power): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    }
  }
  
  trait Clean extends StObject {
    
    var clean: Boolean
  }
  object Clean {
    
    inline def apply(clean: Boolean): Clean = {
      val __obj = js.Dynamic.literal(clean = clean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clean] (val x: Self) extends AnyVal {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Power extends StObject {
    
    /** Machine power control is available */
    var power: Boolean
  }
  object Power {
    
    inline def apply(power: Boolean): Power = {
      val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any])
      __obj.asInstanceOf[Power]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Power] (val x: Self) extends AnyVal {
      
      inline def setPower(value: Boolean): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    var reason: js.UndefOr[String] = js.undefined
    
    var status: Double
  }
  object Reason {
    
    inline def apply(status: Double): Reason = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types extends StObject {
    
    var types: js.Array[username | password | target]
  }
  object Types {
    
    inline def apply(types: js.Array[username | password | target]): Types = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      inline def setTypes(value: js.Array[username | password | target]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: (username | password | target)*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
