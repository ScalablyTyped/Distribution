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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object oslogin {
      
      // tslint:disable-next-line:no-empty-interface
      @js.native
      trait Empty extends StObject
      
      @js.native
      trait ImportSshPublicKeyResponse extends StObject {
        
        /** Detailed information about import results. */
        var details: js.UndefOr[String] = js.native
        
        /** The login profile information for the user. */
        var loginProfile: js.UndefOr[LoginProfile] = js.native
      }
      object ImportSshPublicKeyResponse {
        
        @scala.inline
        def apply(): ImportSshPublicKeyResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ImportSshPublicKeyResponse]
        }
        
        @scala.inline
        implicit class ImportSshPublicKeyResponseMutableBuilder[Self <: ImportSshPublicKeyResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          @scala.inline
          def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "loginProfile", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoginProfileUndefined: Self = StObject.set(x, "loginProfile", js.undefined)
        }
      }
      
      @js.native
      trait LoginProfile extends StObject {
        
        /** Required. A unique user ID. */
        var name: js.UndefOr[String] = js.native
        
        /** The list of POSIX accounts associated with the user. */
        var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.native
        
        /** A map from SSH public key fingerprint to the associated key object. */
        var sshPublicKeys: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
          */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile with TopLevel[js.Any]
              ] = js.native
      }
      object LoginProfile {
        
        @scala.inline
        def apply(): LoginProfile = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LoginProfile]
        }
        
        @scala.inline
        implicit class LoginProfileMutableBuilder[Self <: LoginProfile] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setPosixAccounts(value: js.Array[PosixAccount]): Self = StObject.set(x, "posixAccounts", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPosixAccountsUndefined: Self = StObject.set(x, "posixAccounts", js.undefined)
          
          @scala.inline
          def setPosixAccountsVarargs(value: PosixAccount*): Self = StObject.set(x, "posixAccounts", js.Array(value :_*))
          
          @scala.inline
          def setSshPublicKeys(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.oslogin.gapi.client.oslogin.SshPublicKey}
            */ typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.LoginProfile with TopLevel[js.Any]
          ): Self = StObject.set(x, "sshPublicKeys", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSshPublicKeysUndefined: Self = StObject.set(x, "sshPublicKeys", js.undefined)
        }
      }
      
      @js.native
      trait PosixAccount extends StObject {
        
        /** Output only. A POSIX account identifier. */
        var accountId: js.UndefOr[String] = js.native
        
        /** The GECOS (user information) entry for this account. */
        var gecos: js.UndefOr[String] = js.native
        
        /** The default group ID. */
        var gid: js.UndefOr[String] = js.native
        
        /** The path to the home directory for this account. */
        var homeDirectory: js.UndefOr[String] = js.native
        
        /** Output only. The canonical resource name. */
        var name: js.UndefOr[String] = js.native
        
        /** The operating system type where this account applies. */
        var operatingSystemType: js.UndefOr[String] = js.native
        
        /** Only one POSIX account can be marked as primary. */
        var primary: js.UndefOr[Boolean] = js.native
        
        /** The path to the logic shell for this account. */
        var shell: js.UndefOr[String] = js.native
        
        /** System identifier for which account the username or uid applies to. By default, the empty value is used. */
        var systemId: js.UndefOr[String] = js.native
        
        /** The user ID. */
        var uid: js.UndefOr[String] = js.native
        
        /** The username of the POSIX account. */
        var username: js.UndefOr[String] = js.native
      }
      object PosixAccount {
        
        @scala.inline
        def apply(): PosixAccount = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[PosixAccount]
        }
        
        @scala.inline
        implicit class PosixAccountMutableBuilder[Self <: PosixAccount] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
          
          @scala.inline
          def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGecosUndefined: Self = StObject.set(x, "gecos", js.undefined)
          
          @scala.inline
          def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
          
          @scala.inline
          def setHomeDirectory(value: String): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHomeDirectoryUndefined: Self = StObject.set(x, "homeDirectory", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
          
          @scala.inline
          def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
          
          @scala.inline
          def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
          
          @scala.inline
          def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
          
          @scala.inline
          def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
          
          @scala.inline
          def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
        }
      }
      
      @js.native
      trait ProjectsResource extends StObject {
        
        /** Deletes a POSIX account. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
      }
      
      @js.native
      trait SshPublicKey extends StObject {
        
        /** An expiration time in microseconds since epoch. */
        var expirationTimeUsec: js.UndefOr[String] = js.native
        
        /** Output only. The SHA-256 fingerprint of the SSH public key. */
        var fingerprint: js.UndefOr[String] = js.native
        
        /** Public key text in SSH format, defined by RFC4253 section 6.6. */
        var key: js.UndefOr[String] = js.native
        
        /** Output only. The canonical resource name. */
        var name: js.UndefOr[String] = js.native
      }
      object SshPublicKey {
        
        @scala.inline
        def apply(): SshPublicKey = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[SshPublicKey]
        }
        
        @scala.inline
        implicit class SshPublicKeyMutableBuilder[Self <: SshPublicKey] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setExpirationTimeUsec(value: String): Self = StObject.set(x, "expirationTimeUsec", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpirationTimeUsecUndefined: Self = StObject.set(x, "expirationTimeUsec", js.undefined)
          
          @scala.inline
          def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
          
          @scala.inline
          def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
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
