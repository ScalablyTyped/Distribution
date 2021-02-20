package typings.nodePushnotifications

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var client_id: js.UndefOr[String] = js.native
    
    var client_secret: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[String] = js.native
    
    var notificationMethod: js.UndefOr[String] = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(): AccessToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setNotificationMethod(value: String): Self = StObject.set(x, "notificationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationMethodUndefined: Self = StObject.set(x, "notificationMethod", js.undefined)
    }
  }
  
  @js.native
  trait Address extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var autoAdjustCache: js.UndefOr[Boolean] = js.native
    
    var buffersNotifications: js.UndefOr[Boolean] = js.native
    
    /**
      * An array of trusted certificates. Each element should contain either a filename to load, or a
      * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
      * will be used. - You may need to use this as some environments don't include the CA used by
      * Apple (entrust_2048).
      */
    var ca: js.UndefOr[js.Array[Buffer | String]] = js.native
    
    var cacheLength: js.UndefOr[Double] = js.native
    
    /**
      * The filename of the connection certificate to load from disk, or a Buffer/String containing the
      * certificate data.
      */
    var cert: js.UndefOr[String] = js.native
    
    var connectTimeout: js.UndefOr[Double] = js.native
    
    var connectionRetryLimit: js.UndefOr[Double] = js.native
    
    var connectionTimeout: js.UndefOr[Double] = js.native
    
    var disableEPIPEFix: js.UndefOr[Boolean] = js.native
    
    var disableNagle: js.UndefOr[Boolean] = js.native
    
    var fastMode: js.UndefOr[Boolean] = js.native
    
    /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
    var key: js.UndefOr[String] = js.native
    
    var maxConnections: js.UndefOr[Double] = js.native
    
    var minConnections: js.UndefOr[Double] = js.native
    
    /** The passphrase for the connection key, if required */
    var passphrase: js.UndefOr[String] = js.native
    
    /**
      * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
      * the PFX data. If supplied will always be used instead of certificate and key above.
      */
    var pfx: js.UndefOr[Buffer | String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var production: js.UndefOr[Boolean] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /** APN Token */
    var token: js.UndefOr[Key] = js.native
    
    var voip: js.UndefOr[Boolean] = js.native
  }
  object Address {
    
    @scala.inline
    def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setAutoAdjustCache(value: Boolean): Self = StObject.set(x, "autoAdjustCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustCacheUndefined: Self = StObject.set(x, "autoAdjustCache", js.undefined)
      
      @scala.inline
      def setBuffersNotifications(value: Boolean): Self = StObject.set(x, "buffersNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffersNotificationsUndefined: Self = StObject.set(x, "buffersNotifications", js.undefined)
      
      @scala.inline
      def setCa(value: js.Array[Buffer | String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCacheLength(value: Double): Self = StObject.set(x, "cacheLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheLengthUndefined: Self = StObject.set(x, "cacheLength", js.undefined)
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      @scala.inline
      def setConnectionRetryLimit(value: Double): Self = StObject.set(x, "connectionRetryLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRetryLimitUndefined: Self = StObject.set(x, "connectionRetryLimit", js.undefined)
      
      @scala.inline
      def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      @scala.inline
      def setDisableEPIPEFix(value: Boolean): Self = StObject.set(x, "disableEPIPEFix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEPIPEFixUndefined: Self = StObject.set(x, "disableEPIPEFix", js.undefined)
      
      @scala.inline
      def setDisableNagle(value: Boolean): Self = StObject.set(x, "disableNagle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNagleUndefined: Self = StObject.set(x, "disableNagle", js.undefined)
      
      @scala.inline
      def setFastMode(value: Boolean): Self = StObject.set(x, "fastMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastModeUndefined: Self = StObject.set(x, "fastMode", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinConnectionsUndefined: Self = StObject.set(x, "minConnections", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPfx(value: Buffer | String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setToken(value: Key): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      @scala.inline
      def setVoip(value: Boolean): Self = StObject.set(x, "voip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoipUndefined: Self = StObject.set(x, "voip", js.undefined)
    }
  }
  
  @js.native
  trait Clientid extends StObject {
    
    var client_id: js.UndefOr[String] = js.native
    
    var client_secret: js.UndefOr[String] = js.native
  }
  object Clientid {
    
    @scala.inline
    def apply(): Clientid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientid]
    }
    
    @scala.inline
    implicit class ClientidMutableBuilder[Self <: Clientid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    /** GCM or FCM token */
    var id: js.UndefOr[String] = js.native
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    /**
      * The filename of the provider token key (as supplied by Apple) to load from disk, or a
      * Buffer/String containing the key data.
      */
    var key: js.UndefOr[Buffer | String] = js.native
    
    /** The ID of the key issued by Apple */
    var keyId: js.UndefOr[String] = js.native
    
    /** ID of the team associated with the provider token key */
    var teamId: js.UndefOr[String] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: js.UndefOr[Clientid] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Clientid): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
