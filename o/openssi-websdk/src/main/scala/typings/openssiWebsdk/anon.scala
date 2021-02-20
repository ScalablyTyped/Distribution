package typings.openssiWebsdk

import org.scalablytyped.runtime.StringDictionary
import typings.openssiWebsdk.mod.AgentName
import typings.openssiWebsdk.mod.AgentURL
import typings.openssiWebsdk.mod.DID
import typings.openssiWebsdk.mod.Verkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: StringDictionary[String] = js.native
    
    var data: String = js.native
  }
  object Attributes {
    
    @scala.inline
    def apply(attributes: StringDictionary[String], data: String): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Did extends StObject {
    
    var did: DID = js.native
    
    var verkey: Verkey = js.native
  }
  object Did {
    
    @scala.inline
    def apply(did: DID, verkey: Verkey): Did = {
      val __obj = js.Dynamic.literal(did = did.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Did]
    }
    
    @scala.inline
    implicit class DidMutableBuilder[Self <: Did] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDid(value: DID): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerkey(value: Verkey): Self = StObject.set(x, "verkey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[AgentName] = js.native
    
    var url: js.UndefOr[AgentURL] = js.native
  }
  object Name {
    
    @scala.inline
    def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
