package typings.maximMazurokGapiClientOslogin

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOslogin.anon.Accesstoken
import typings.maximMazurokGapiClientOslogin.anon.Alt
import typings.maximMazurokGapiClientOslogin.anon.Callback
import typings.maximMazurokGapiClientOslogin.anon.Fields
import typings.maximMazurokGapiClientOslogin.anon.Key
import typings.maximMazurokGapiClientOslogin.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object oslogin {
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait ImportSshPublicKeyResponse extends StObject {
        
        /** Detailed information about import results. */
        var details: js.UndefOr[String] = js.undefined
        
        /** The login profile information for the user. */
        var loginProfile: js.UndefOr[LoginProfile] = js.undefined
      }
      object ImportSshPublicKeyResponse {
        
        inline def apply(): ImportSshPublicKeyResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ImportSshPublicKeyResponse]
        }
        
        extension [Self <: ImportSshPublicKeyResponse](x: Self) {
          
          inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          inline def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "loginProfile", value.asInstanceOf[js.Any])
          
          inline def setLoginProfileUndefined: Self = StObject.set(x, "loginProfile", js.undefined)
        }
      }
      
      trait LoginProfile extends StObject {
        
        /** Required. A unique user ID. */
        var name: js.UndefOr[String] = js.undefined
        
        /** The list of POSIX accounts associated with the user. */
        var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.undefined
        
        /** A map from SSH public key fingerprint to the associated key object. */
        var sshPublicKeys: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
          */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile & TopLevel[js.Any]
              ] = js.undefined
      }
      object LoginProfile {
        
        inline def apply(): LoginProfile = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LoginProfile]
        }
        
        extension [Self <: LoginProfile](x: Self) {
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setPosixAccounts(value: js.Array[PosixAccount]): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
          
          inline def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
          
          inline def setPosixAccountsVarargs(value: PosixAccount*): Self = StObject.set(x, "posixAccounts", js.Array(value :_*))
          
          inline def setSshPublicKeys(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
            */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile & TopLevel[js.Any]
          ): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
          
          inline def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
        }
      }
      
      trait PosixAccount extends StObject {
        
        /** Output only. A POSIX account identifier. */
        var accountId: js.UndefOr[String] = js.undefined
        
        /** The GECOS (user information) entry for this account. */
        var gecos: js.UndefOr[String] = js.undefined
        
        /** The default group ID. */
        var gid: js.UndefOr[String] = js.undefined
        
        /** The path to the home directory for this account. */
        var homeDirectory: js.UndefOr[String] = js.undefined
        
        /** Output only. The canonical resource name. */
        var name: js.UndefOr[String] = js.undefined
        
        /** The operating system type where this account applies. */
        var operatingSystemType: js.UndefOr[String] = js.undefined
        
        /** Only one POSIX account can be marked as primary. */
        var primary: js.UndefOr[Boolean] = js.undefined
        
        /** The path to the logic shell for this account. */
        var shell: js.UndefOr[String] = js.undefined
        
        /** System identifier for which account the username or uid applies to. By default, the empty value is used. */
        var systemId: js.UndefOr[String] = js.undefined
        
        /** The user ID. */
        var uid: js.UndefOr[String] = js.undefined
        
        /** The username of the POSIX account. */
        var username: js.UndefOr[String] = js.undefined
      }
      object PosixAccount {
        
        inline def apply(): PosixAccount = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PosixAccount]
        }
        
        extension [Self <: PosixAccount](x: Self) {
          
          inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          inline def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
          
          inline def setGecosUndefined: Self = StObject.set(x, "gecos", js.undefined)
          
          inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
          
          inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
          
          inline def setHomeDirectory(value: String): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
          
          inline def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
          
          inline def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
          
          inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
          
          inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
          
          inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
          
          inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
          
          inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
          
          inline def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
          
          inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
          
          inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
          
          inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
          
          inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
        }
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
        /** Deletes a POSIX account. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
      }
      
      trait SshPublicKey extends StObject {
        
        /** An expiration time in microseconds since epoch. */
        var expirationTimeUsec: js.UndefOr[String] = js.undefined
        
        /** Output only. The SHA-256 fingerprint of the SSH public key. */
        var fingerprint: js.UndefOr[String] = js.undefined
        
        /** Public key text in SSH format, defined by RFC4253 section 6.6. */
        var key: js.UndefOr[String] = js.undefined
        
        /** Output only. The canonical resource name. */
        var name: js.UndefOr[String] = js.undefined
      }
      object SshPublicKey {
        
        inline def apply(): SshPublicKey = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SshPublicKey]
        }
        
        extension [Self <: SshPublicKey](x: Self) {
          
          inline def setExpirationTimeUsec(value: String): Self = StObject.set(x, "expirationTimeUsec", value.asInstanceOf[js.Any])
          
          inline def setExpirationTimeUsecUndefined: Self = StObject.set(x, "expirationTimeUsec", js.undefined)
          
          inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
          
          inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
          
          inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      @js.native
      trait SshPublicKeysResource extends StObject {
        
        /** Deletes an SSH public key. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
        
        /** Retrieves an SSH public key. */
        def get(): Request[SshPublicKey] = js.native
        def get(request: Accesstoken): Request[SshPublicKey] = js.native
        
        /** Updates an SSH public key and returns the profile information. This method supports patch semantics. */
        def patch(request: Alt): Request[SshPublicKey] = js.native
        def patch(request: Callback, body: SshPublicKey): Request[SshPublicKey] = js.native
      }
      
      @js.native
      trait UsersResource extends StObject {
        
        /** Retrieves the profile information used for logging in to a virtual machine on Google Compute Engine. */
        def getLoginProfile(): Request[LoginProfile] = js.native
        def getLoginProfile(request: Fields): Request[LoginProfile] = js.native
        
        /** Adds an SSH public key and returns the profile information. Default POSIX account information is set when no username and UID exist as part of the login profile. */
        def importSshPublicKey(request: Key): Request[ImportSshPublicKeyResponse] = js.native
        def importSshPublicKey(request: Oauthtoken, body: SshPublicKey): Request[ImportSshPublicKeyResponse] = js.native
        
        var projects: ProjectsResource = js.native
        
        var sshPublicKeys: SshPublicKeysResource = js.native
      }
    }
  }
}
