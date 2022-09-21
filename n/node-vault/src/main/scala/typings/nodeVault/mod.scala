package typings.nodeVault

import org.scalablytyped.runtime.StringDictionary
import typings.nodeVault.anon.Body
import typings.nodeVault.anon.Method
import typings.nodeVault.anon.Query
import typings.request.mod.CoreOptions
import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): client = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[client]
  inline def apply(options: VaultOptions): client = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[client]
  
  @JSImport("node-vault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Option = StringDictionary[Any]
  
  trait RequestOption
    extends StObject
       with Option {
    
    var method: String
    
    var path: String
  }
  object RequestOption {
    
    inline def apply(method: String, path: String): RequestOption = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOption]
    }
    
    extension [Self <: RequestOption](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait VaultOptions extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var commands: js.UndefOr[js.Array[Method]] = js.undefined
    
    var debug: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var endpoint: js.UndefOr[String] = js.undefined
    
    var mustache: js.UndefOr[Any] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var noCustomHTTPVerbs: js.UndefOr[Boolean] = js.undefined
    
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    var `request-promise`: js.UndefOr[Any] = js.undefined
    
    var requestOptions: js.UndefOr[CoreOptions] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var tv4: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object VaultOptions {
    
    inline def apply(): VaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VaultOptions]
    }
    
    extension [Self <: VaultOptions](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setCommands(value: js.Array[Method]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: Method*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setDebug(value: /* repeated */ Any => Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setMustache(value: Any): Self = StObject.set(x, "mustache", value.asInstanceOf[js.Any])
      
      inline def setMustacheUndefined: Self = StObject.set(x, "mustache", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNoCustomHTTPVerbs(value: Boolean): Self = StObject.set(x, "noCustomHTTPVerbs", value.asInstanceOf[js.Any])
      
      inline def setNoCustomHTTPVerbsUndefined: Self = StObject.set(x, "noCustomHTTPVerbs", js.undefined)
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def `setRequest-promise`(value: Any): Self = StObject.set(x, "request-promise", value.asInstanceOf[js.Any])
      
      inline def `setRequest-promiseUndefined`: Self = StObject.set(x, "request-promise", js.undefined)
      
      inline def setRequestOptions(value: CoreOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setTv4(value: /* repeated */ Any => Any): Self = StObject.set(x, "tv4", js.Any.fromFunction1(value))
      
      inline def setTv4Undefined: Self = StObject.set(x, "tv4", js.undefined)
    }
  }
  
  @js.native
  trait client extends StObject {
    
    def addApproleRole(): js.Promise[Any] = js.native
    def addApproleRole(options: Option): js.Promise[Any] = js.native
    
    def addPolicy(): js.Promise[Any] = js.native
    def addPolicy(options: Option): js.Promise[Any] = js.native
    
    def addTokenRole(): js.Promise[Any] = js.native
    def addTokenRole(options: Option): js.Promise[Any] = js.native
    
    var apiVersion: String = js.native
    
    def approleLogin(): js.Promise[Any] = js.native
    def approleLogin(options: Option): js.Promise[Any] = js.native
    
    def approleRoles(): js.Promise[Any] = js.native
    def approleRoles(options: Option): js.Promise[Any] = js.native
    
    def approleSecretAccessorDestroy(): js.Promise[Any] = js.native
    def approleSecretAccessorDestroy(options: Option): js.Promise[Any] = js.native
    
    def approleSecretAccessorLookup(): js.Promise[Any] = js.native
    def approleSecretAccessorLookup(options: Option): js.Promise[Any] = js.native
    
    def approleSecretAccessors(): js.Promise[Any] = js.native
    def approleSecretAccessors(options: Option): js.Promise[Any] = js.native
    
    def approleSecretDestroy(): js.Promise[Any] = js.native
    def approleSecretDestroy(options: Option): js.Promise[Any] = js.native
    
    def approleSecretLookup(): js.Promise[Any] = js.native
    def approleSecretLookup(options: Option): js.Promise[Any] = js.native
    
    def audits(): js.Promise[Any] = js.native
    def audits(options: Option): js.Promise[Any] = js.native
    
    def auths(): js.Promise[Any] = js.native
    def auths(options: Option): js.Promise[Any] = js.native
    
    def awsIamLogin(): js.Promise[Any] = js.native
    def awsIamLogin(options: Option): js.Promise[Any] = js.native
    
    def decryptData(): js.Promise[Any] = js.native
    def decryptData(options: Option): js.Promise[Any] = js.native
    
    def delete(path: String): js.Promise[Any] = js.native
    def delete(path: String, requestOptions: Option): js.Promise[Any] = js.native
    
    def deleteApproleRole(): js.Promise[Any] = js.native
    def deleteApproleRole(options: Option): js.Promise[Any] = js.native
    
    def disableAudit(): js.Promise[Any] = js.native
    def disableAudit(options: Option): js.Promise[Any] = js.native
    
    def disableAuth(): js.Promise[Any] = js.native
    def disableAuth(options: Option): js.Promise[Any] = js.native
    
    def enableAudit(): js.Promise[Any] = js.native
    def enableAudit(options: Option): js.Promise[Any] = js.native
    
    def enableAuth(): js.Promise[Any] = js.native
    def enableAuth(options: Option): js.Promise[Any] = js.native
    
    def encryptData(): js.Promise[Any] = js.native
    def encryptData(options: Option): js.Promise[Any] = js.native
    
    var endpoint: String = js.native
    
    def gcpLogin(): js.Promise[Any] = js.native
    def gcpLogin(options: Option): js.Promise[Any] = js.native
    
    def generateDatabaseCredentials(): js.Promise[Any] = js.native
    def generateDatabaseCredentials(options: Option): js.Promise[Any] = js.native
    
    def generateFunction(name: String, conf: functionConf): Unit = js.native
    
    def generateRootCancel(): js.Promise[Any] = js.native
    def generateRootCancel(options: Option): js.Promise[Any] = js.native
    
    def generateRootInit(): js.Promise[Any] = js.native
    def generateRootInit(options: Option): js.Promise[Any] = js.native
    
    def generateRootStatus(): js.Promise[Any] = js.native
    def generateRootStatus(options: Option): js.Promise[Any] = js.native
    
    def generateRootUpdate(): js.Promise[Any] = js.native
    def generateRootUpdate(options: Option): js.Promise[Any] = js.native
    
    def getApproleRole(): js.Promise[Any] = js.native
    def getApproleRole(options: Option): js.Promise[Any] = js.native
    
    def getApproleRoleId(): js.Promise[Any] = js.native
    def getApproleRoleId(options: Option): js.Promise[Any] = js.native
    
    def getApproleRoleSecret(): js.Promise[Any] = js.native
    def getApproleRoleSecret(options: Option): js.Promise[Any] = js.native
    
    def getPolicy(): js.Promise[Any] = js.native
    def getPolicy(options: Option): js.Promise[Any] = js.native
    
    def getTokenRole(): js.Promise[Any] = js.native
    def getTokenRole(options: Option): js.Promise[Any] = js.native
    
    def githubLogin(): js.Promise[Any] = js.native
    def githubLogin(options: Option): js.Promise[Any] = js.native
    
    def handleVaultResponse(): js.Promise[Any] = js.native
    def handleVaultResponse(res: Body): js.Promise[Any] = js.native
    
    def health(): js.Promise[Any] = js.native
    def health(options: Option): js.Promise[Any] = js.native
    
    def help(path: String): js.Promise[Any] = js.native
    def help(path: String, requestOptions: Option): js.Promise[Any] = js.native
    
    def init(): js.Promise[Any] = js.native
    def init(options: Option): js.Promise[Any] = js.native
    
    def initialized(): js.Promise[Any] = js.native
    def initialized(options: Option): js.Promise[Any] = js.native
    
    def kubernetesLogin(): js.Promise[Any] = js.native
    def kubernetesLogin(options: Option): js.Promise[Any] = js.native
    
    def leader(): js.Promise[Any] = js.native
    def leader(options: Option): js.Promise[Any] = js.native
    
    def list(path: String): js.Promise[Any] = js.native
    def list(path: String, requestOptions: Option): js.Promise[Any] = js.native
    
    def mount(): js.Promise[Any] = js.native
    def mount(options: Option): js.Promise[Any] = js.native
    
    def mounts(): js.Promise[Any] = js.native
    def mounts(options: Option): js.Promise[Any] = js.native
    
    def policies(): js.Promise[Any] = js.native
    def policies(options: Option): js.Promise[Any] = js.native
    
    def read(path: String): js.Promise[Any] = js.native
    def read(path: String, requestOptions: Option): js.Promise[Any] = js.native
    
    def remount(): js.Promise[Any] = js.native
    def remount(options: Option): js.Promise[Any] = js.native
    
    def removePolicy(): js.Promise[Any] = js.native
    def removePolicy(options: Option): js.Promise[Any] = js.native
    
    def removeTokenRole(): js.Promise[Any] = js.native
    def removeTokenRole(options: Option): js.Promise[Any] = js.native
    
    def renew(): js.Promise[Any] = js.native
    def renew(options: Option): js.Promise[Any] = js.native
    
    def request(requestOptions: RequestOption): js.Promise[Any] = js.native
    
    def revoke(): js.Promise[Any] = js.native
    def revoke(options: Option): js.Promise[Any] = js.native
    
    def revokePrefix(): js.Promise[Any] = js.native
    def revokePrefix(options: Option): js.Promise[Any] = js.native
    
    def rotate(): js.Promise[Any] = js.native
    def rotate(options: Option): js.Promise[Any] = js.native
    
    def seal(): js.Promise[Any] = js.native
    def seal(options: Option): js.Promise[Any] = js.native
    
    def status(): js.Promise[Any] = js.native
    def status(options: Option): js.Promise[Any] = js.native
    
    def stepDown(): js.Promise[Any] = js.native
    def stepDown(options: Option): js.Promise[Any] = js.native
    
    var token: String = js.native
    
    def tokenAccessors(): js.Promise[Any] = js.native
    def tokenAccessors(options: Option): js.Promise[Any] = js.native
    
    def tokenCreate(): js.Promise[Any] = js.native
    def tokenCreate(options: Option): js.Promise[Any] = js.native
    
    def tokenCreateOrphan(): js.Promise[Any] = js.native
    def tokenCreateOrphan(options: Option): js.Promise[Any] = js.native
    
    def tokenCreateRole(): js.Promise[Any] = js.native
    def tokenCreateRole(options: Option): js.Promise[Any] = js.native
    
    def tokenLookup(): js.Promise[Any] = js.native
    def tokenLookup(options: Option): js.Promise[Any] = js.native
    
    def tokenLookupAccessor(): js.Promise[Any] = js.native
    def tokenLookupAccessor(options: Option): js.Promise[Any] = js.native
    
    def tokenLookupSelf(): js.Promise[Any] = js.native
    def tokenLookupSelf(options: Option): js.Promise[Any] = js.native
    
    def tokenRenew(): js.Promise[Any] = js.native
    def tokenRenew(options: Option): js.Promise[Any] = js.native
    
    def tokenRenewSelf(): js.Promise[Any] = js.native
    def tokenRenewSelf(options: Option): js.Promise[Any] = js.native
    
    def tokenRevoke(): js.Promise[Any] = js.native
    def tokenRevoke(options: Option): js.Promise[Any] = js.native
    
    def tokenRevokeAccessor(): js.Promise[Any] = js.native
    def tokenRevokeAccessor(options: Option): js.Promise[Any] = js.native
    
    def tokenRevokeOrphan(): js.Promise[Any] = js.native
    def tokenRevokeOrphan(options: Option): js.Promise[Any] = js.native
    
    def tokenRevokeSelf(): js.Promise[Any] = js.native
    def tokenRevokeSelf(options: Option): js.Promise[Any] = js.native
    
    def tokenRoles(): js.Promise[Any] = js.native
    def tokenRoles(options: Option): js.Promise[Any] = js.native
    
    def unmount(): js.Promise[Any] = js.native
    def unmount(options: Option): js.Promise[Any] = js.native
    
    def unseal(): js.Promise[Any] = js.native
    def unseal(options: Option): js.Promise[Any] = js.native
    
    def updateApproleRoleId(): js.Promise[Any] = js.native
    def updateApproleRoleId(options: Option): js.Promise[Any] = js.native
    
    def userpassLogin(): js.Promise[Any] = js.native
    def userpassLogin(options: Option): js.Promise[Any] = js.native
    
    def write(path: String, data: Any): js.Promise[Any] = js.native
    def write(path: String, data: Any, requestOptions: Option): js.Promise[Any] = js.native
  }
  
  trait functionConf extends StObject {
    
    var method: String
    
    var path: String
    
    var schema: js.UndefOr[Query] = js.undefined
  }
  object functionConf {
    
    inline def apply(method: String, path: String): functionConf = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[functionConf]
    }
    
    extension [Self <: functionConf](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Query): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
}
