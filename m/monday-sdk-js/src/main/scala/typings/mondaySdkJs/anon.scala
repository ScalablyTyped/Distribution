package typings.mondaySdkJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<{  clientId :string,   apiToken :string}> */
  trait PartialclientIdstringapiT extends StObject {
    
    var apiToken: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
  }
  object PartialclientIdstringapiT {
    
    inline def apply(): PartialclientIdstringapiT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialclientIdstringapiT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialclientIdstringapiT] (val x: Self) extends AnyVal {
      
      inline def setApiToken(value: String): Self = StObject.set(x, "apiToken", value.asInstanceOf[js.Any])
      
      inline def setApiTokenUndefined: Self = StObject.set(x, "apiToken", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  token :string}> */
  trait Partialtokenstring extends StObject {
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Partialtokenstring {
    
    inline def apply(): Partialtokenstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialtokenstring]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Partialtokenstring] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  token :string,   variables :object}> */
  trait Partialtokenstringvariabl extends StObject {
    
    var token: js.UndefOr[String] = js.undefined
    
    var variables: js.UndefOr[js.Object] = js.undefined
  }
  object Partialtokenstringvariabl {
    
    inline def apply(): Partialtokenstringvariabl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialtokenstringvariabl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Partialtokenstringvariabl] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setVariables(value: js.Object): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
}
