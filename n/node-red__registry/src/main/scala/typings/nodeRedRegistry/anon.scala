package typings.nodeRedRegistry

import typings.nodeRedRegistry.mod.NodeCredentials
import typings.nodeRedRegistry.mod.NodeSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Credentials[TCreds, TSets] extends StObject {
    
    var credentials: js.UndefOr[NodeCredentials[TCreds]] = js.native
    
    var settings: js.UndefOr[NodeSettings[TSets]] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply[TCreds, TSets](): Credentials[TCreds, TSets] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials[TCreds, TSets]]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials[_, _], TCreds, TSets] (val x: Self with (Credentials[TCreds, TSets])) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: NodeCredentials[TCreds]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setSettings(value: NodeSettings[TSets]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
