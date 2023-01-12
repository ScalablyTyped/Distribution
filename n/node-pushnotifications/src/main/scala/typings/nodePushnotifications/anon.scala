package typings.nodePushnotifications

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var notificationMethod: js.UndefOr[String] = js.undefined
  }
  object AccessToken {
    
    inline def apply(): AccessToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setNotificationMethod(value: String): Self = StObject.set(x, "notificationMethod", value.asInstanceOf[js.Any])
      
      inline def setNotificationMethodUndefined: Self = StObject.set(x, "notificationMethod", js.undefined)
    }
  }
  
  trait Address extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var autoAdjustCache: js.UndefOr[Boolean] = js.undefined
    
    var buffersNotifications: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of trusted certificates. Each element should contain either a filename to load, or a
      * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
      * will be used. - You may need to use this as some environments don't include the CA used by
      * Apple (entrust_2048).
      */
    var ca: js.UndefOr[js.Array[Buffer | String]] = js.undefined
    
    var cacheLength: js.UndefOr[Double] = js.undefined
    
    /**
      * The filename of the connection certificate to load from disk, or a Buffer/String containing the
      * certificate data.
      */
    var cert: js.UndefOr[String] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var connectionRetryLimit: js.UndefOr[Double] = js.undefined
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var disableEPIPEFix: js.UndefOr[Boolean] = js.undefined
    
    var disableNagle: js.UndefOr[Boolean] = js.undefined
    
    var fastMode: js.UndefOr[Boolean] = js.undefined
    
    /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
    var key: js.UndefOr[String] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var minConnections: js.UndefOr[Double] = js.undefined
    
    /** The passphrase for the connection key, if required */
    var passphrase: js.UndefOr[String] = js.undefined
    
    /**
      * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
      * the PFX data. If supplied will always be used instead of certificate and key above.
      */
    var pfx: js.UndefOr[Buffer | String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /** APN Token */
    var token: js.UndefOr[Key] = js.undefined
    
    var voip: js.UndefOr[Boolean] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setAutoAdjustCache(value: Boolean): Self = StObject.set(x, "autoAdjustCache", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustCacheUndefined: Self = StObject.set(x, "autoAdjustCache", js.undefined)
      
      inline def setBuffersNotifications(value: Boolean): Self = StObject.set(x, "buffersNotifications", value.asInstanceOf[js.Any])
      
      inline def setBuffersNotificationsUndefined: Self = StObject.set(x, "buffersNotifications", js.undefined)
      
      inline def setCa(value: js.Array[Buffer | String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCacheLength(value: Double): Self = StObject.set(x, "cacheLength", value.asInstanceOf[js.Any])
      
      inline def setCacheLengthUndefined: Self = StObject.set(x, "cacheLength", js.undefined)
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setConnectionRetryLimit(value: Double): Self = StObject.set(x, "connectionRetryLimit", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryLimitUndefined: Self = StObject.set(x, "connectionRetryLimit", js.undefined)
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setDisableEPIPEFix(value: Boolean): Self = StObject.set(x, "disableEPIPEFix", value.asInstanceOf[js.Any])
      
      inline def setDisableEPIPEFixUndefined: Self = StObject.set(x, "disableEPIPEFix", js.undefined)
      
      inline def setDisableNagle(value: Boolean): Self = StObject.set(x, "disableNagle", value.asInstanceOf[js.Any])
      
      inline def setDisableNagleUndefined: Self = StObject.set(x, "disableNagle", js.undefined)
      
      inline def setFastMode(value: Boolean): Self = StObject.set(x, "fastMode", value.asInstanceOf[js.Any])
      
      inline def setFastModeUndefined: Self = StObject.set(x, "fastMode", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      inline def setMinConnectionsUndefined: Self = StObject.set(x, "minConnections", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: Buffer | String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      inline def setToken(value: Key): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setVoip(value: Boolean): Self = StObject.set(x, "voip", value.asInstanceOf[js.Any])
      
      inline def setVoipUndefined: Self = StObject.set(x, "voip", js.undefined)
    }
  }
  
  trait Clientid extends StObject {
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
  }
  object Clientid {
    
    inline def apply(): Clientid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clientid] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    /** GCM or FCM token */
    var id: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /**
      * The filename of the provider token key (as supplied by Apple) to load from disk, or a
      * Buffer/String containing the key data.
      */
    var key: js.UndefOr[Buffer | String] = js.undefined
    
    /** The ID of the key issued by Apple */
    var keyId: js.UndefOr[String] = js.undefined
    
    /** ID of the team associated with the provider token key */
    var teamId: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var options: js.UndefOr[Clientid] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Clientid): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
