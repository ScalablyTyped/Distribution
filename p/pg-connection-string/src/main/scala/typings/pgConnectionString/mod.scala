package typings.pgConnectionString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-connection-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(connectionString: String): ConnectionOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(connectionString.asInstanceOf[js.Any]).asInstanceOf[ConnectionOptions]
  
  trait ConnectionOptions extends StObject {
    
    var application_name: js.UndefOr[String] = js.undefined
    
    var client_encoding: js.UndefOr[String] = js.undefined
    
    var database: js.UndefOr[String | Null] = js.undefined
    
    var fallback_application_name: js.UndefOr[String] = js.undefined
    
    var host: String | Null
    
    var options: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String | Null] = js.undefined
    
    var ssl: js.UndefOr[Boolean | String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal(host = null)
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication_name(value: String): Self = StObject.set(x, "application_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplication_nameUndefined: Self = StObject.set(x, "application_name", js.undefined)
      
      @scala.inline
      def setClient_encoding(value: String): Self = StObject.set(x, "client_encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_encodingUndefined: Self = StObject.set(x, "client_encoding", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseNull: Self = StObject.set(x, "database", null)
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setFallback_application_name(value: String): Self = StObject.set(x, "fallback_application_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallback_application_nameUndefined: Self = StObject.set(x, "fallback_application_name", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSsl(value: Boolean | String): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
