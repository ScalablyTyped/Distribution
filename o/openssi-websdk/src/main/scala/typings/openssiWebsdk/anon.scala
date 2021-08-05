package typings.openssiWebsdk

import org.scalablytyped.runtime.StringDictionary
import typings.openssiWebsdk.mod.AgentName
import typings.openssiWebsdk.mod.AgentURL
import typings.openssiWebsdk.mod.DID
import typings.openssiWebsdk.mod.Verkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: StringDictionary[String]
    
    var data: String
  }
  object Attributes {
    
    inline def apply(attributes: StringDictionary[String], data: String): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait Did extends StObject {
    
    var did: DID
    
    var verkey: Verkey
  }
  object Did {
    
    inline def apply(did: DID, verkey: Verkey): Did = {
      val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Did]
    }
    
    extension [Self <: Did](x: Self) {
      
      inline def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      inline def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[AgentName] = js.undefined
    
    var url: js.UndefOr[AgentURL] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
