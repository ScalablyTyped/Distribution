package typings.mimetext

import typings.mimetext.mod.MIMEHeader
import typings.mimetext.mod.RecipientType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<mimetext.mimetext.EnvironmentContext> */
  trait PartialEnvironmentContext extends StObject {
    
    var store: js.UndefOr[js.Array[MIMEHeader]] = js.undefined
    
    var toBase64: js.UndefOr[js.Function1[/* input */ Any, String]] = js.undefined
  }
  object PartialEnvironmentContext {
    
    inline def apply(): PartialEnvironmentContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEnvironmentContext]
    }
    
    extension [Self <: PartialEnvironmentContext](x: Self) {
      
      inline def setStore(value: js.Array[MIMEHeader]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStoreVarargs(value: MIMEHeader*): Self = StObject.set(x, "store", js.Array(value*))
      
      inline def setToBase64(value: /* input */ Any => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction1(value))
      
      inline def setToBase64Undefined: Self = StObject.set(x, "toBase64", js.undefined)
    }
  }
  
  /* Inlined std.Required<mimetext.mimetext.MailboxInput> */
  trait RequiredMailboxInput extends StObject {
    
    var addr: String
    
    var name: String
    
    var `type`: RecipientType
  }
  object RequiredMailboxInput {
    
    inline def apply(addr: String, name: String, `type`: RecipientType): RequiredMailboxInput = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredMailboxInput]
    }
    
    extension [Self <: RequiredMailboxInput](x: Self) {
      
      inline def setAddr(value: String): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: RecipientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
