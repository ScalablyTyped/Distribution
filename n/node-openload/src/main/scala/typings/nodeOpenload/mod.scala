package typings.nodeOpenload

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.nodeOpenload.anon.Added
import typings.nodeOpenload.anon.Contenttype
import typings.nodeOpenload.anon.Cstatus
import typings.nodeOpenload.anon.Id
import typings.nodeOpenload.anon.Left
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Exports a Singleton of the Openload class by default
    * @param config The base config containing the user credentials
    * @returns An Openload singleton
    */
  @scala.inline
  def apply(config: OpenloadConfig): Openload = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Openload]
  
  @JSImport("node-openload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The account info response
    */
  trait AccountInfo extends StObject {
    
    var balance: Double
    
    var email: String
    
    var extid: String
    
    var signup_at: String
    
    var storage_left: Double
    
    var storage_used: String
    
    var traffic: Left
  }
  object AccountInfo {
    
    @scala.inline
    def apply(
      balance: Double,
      email: String,
      extid: String,
      signup_at: String,
      storage_left: Double,
      storage_used: String,
      traffic: Left
    ): AccountInfo = {
      val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], signup_at = signup_at.asInstanceOf[js.Any], storage_left = storage_left.asInstanceOf[js.Any], storage_used = storage_used.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBalance(value: Double): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtid(value: String): Self = StObject.set(x, "extid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignup_at(value: String): Self = StObject.set(x, "signup_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_left(value: Double): Self = StObject.set(x, "storage_left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage_used(value: String): Self = StObject.set(x, "storage_used", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraffic(value: Left): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadLink extends StObject {
    
    var content_type: String
    
    var name: String
    
    var sha1: String
    
    var size: Double
    
    var token: String
    
    var upload_at: String
    
    var url: String
  }
  object DownloadLink {
    
    @scala.inline
    def apply(
      content_type: String,
      name: String,
      sha1: String,
      size: Double,
      token: String,
      upload_at: String,
      url: String
    ): DownloadLink = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadLink]
    }
    
    @scala.inline
    implicit class DownloadLinkMutableBuilder[Self <: DownloadLink] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_at(value: String): Self = StObject.set(x, "upload_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadLinkParam extends StObject {
    
    var captcha_response: String
    
    var file: String
    
    var ticket: String
  }
  object DownloadLinkParam {
    
    @scala.inline
    def apply(captcha_response: String, file: String, ticket: String): DownloadLinkParam = {
      val __obj = js.Dynamic.literal(captcha_response = captcha_response.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadLinkParam]
    }
    
    @scala.inline
    implicit class DownloadLinkParamMutableBuilder[Self <: DownloadLinkParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptcha_response(value: String): Self = StObject.set(x, "captcha_response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadTicket extends StObject {
    
    var captcha_h: Double
    
    var captcha_url: String
    
    var captcha_w: Double
    
    var ticket: String
    
    var valid_until: String
    
    var wait_time: Double
  }
  object DownloadTicket {
    
    @scala.inline
    def apply(
      captcha_h: Double,
      captcha_url: String,
      captcha_w: Double,
      ticket: String,
      valid_until: String,
      wait_time: Double
    ): DownloadTicket = {
      val __obj = js.Dynamic.literal(captcha_h = captcha_h.asInstanceOf[js.Any], captcha_url = captcha_url.asInstanceOf[js.Any], captcha_w = captcha_w.asInstanceOf[js.Any], ticket = ticket.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any], wait_time = wait_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTicket]
    }
    
    @scala.inline
    implicit class DownloadTicketMutableBuilder[Self <: DownloadTicket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptcha_h(value: Double): Self = StObject.set(x, "captcha_h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptcha_url(value: String): Self = StObject.set(x, "captcha_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptcha_w(value: Double): Self = StObject.set(x, "captcha_w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicket(value: String): Self = StObject.set(x, "ticket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid_until(value: String): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_time(value: Double): Self = StObject.set(x, "wait_time", value.asInstanceOf[js.Any])
    }
  }
  
  type FileInfo = StringDictionary[Contenttype]
  
  trait ListFolder extends StObject {
    
    var files: js.Array[Cstatus]
    
    var folders: js.Array[Id]
  }
  object ListFolder {
    
    @scala.inline
    def apply(files: js.Array[Cstatus], folders: js.Array[Id]): ListFolder = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListFolder]
    }
    
    @scala.inline
    implicit class ListFolderMutableBuilder[Self <: ListFolder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[Cstatus]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: Cstatus*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFolders(value: js.Array[Id]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldersVarargs(value: Id*): Self = StObject.set(x, "folders", js.Array(value :_*))
    }
  }
  
  /**
    * The Openload base class, contains all the supported endpoints as member functions
    */
  @js.native
  trait Openload extends StObject {
    
    var _config: OpenloadConfig = js.native
    
    var _locationPrefix: String = js.native
    
    var _version: Double = js.native
    
    // TypeScript Version: 3.6
    def config: OpenloadConfig = js.native
    // TypeScript Version: 3.6
    def config_=(`object`: OpenloadConfig): Unit = js.native
    
    def deleteFile(file: String): js.Promise[js.Array[Boolean]] = js.native
    def deleteFile(file: js.Array[String]): js.Promise[js.Array[Boolean]] = js.native
    
    def getAccountInfo(): js.Promise[AccountInfo] = js.native
    
    def getDownload(file: String): js.Promise[DownloadLink] = js.native
    
    def getDownloadLink(obj: DownloadLinkParam): js.Promise[DownloadLink] = js.native
    
    def getDownloadTicket(file: String): js.Promise[DownloadTicket] = js.native
    
    def getFileInfo(file: String): js.Promise[FileInfo] = js.native
    
    def getFolder(folder: String): js.Promise[ListFolder] = js.native
    
    def getSplashImage(file: String): js.Promise[String] = js.native
    
    def listFolder(folder: String): js.Promise[ListFolder] = js.native
    
    // TypeScript Version: 3.6
    def locationPrefix: String = js.native
    
    def remoteUpload(obj: RemoteUploadParam): js.Promise[RemoteUpload] = js.native
    
    def remoteUploadStatus(obj: RemoteUploadStatusParam): js.Promise[RemoteUploadStatus] = js.native
    
    def upload(obj: UploadParam, cb: js.Function1[/* progress */ UploadProgress, Unit]): js.Promise[Upload] = js.native
  }
  
  trait OpenloadConfig extends StObject {
    
    /* the api_key, available directly from the WebUI after successful login */
    var api_key: String
    
    /* the api_login, a string available from the WebUI, NOT the user's e-mail */
    var api_login: String
    
    /* the api_version to target, needed for forming the URL, by default 1 */
    var api_version: js.UndefOr[Double] = js.undefined
  }
  object OpenloadConfig {
    
    @scala.inline
    def apply(api_key: String, api_login: String): OpenloadConfig = {
      val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], api_login = api_login.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenloadConfig]
    }
    
    @scala.inline
    implicit class OpenloadConfigMutableBuilder[Self <: OpenloadConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_login(value: String): Self = StObject.set(x, "api_login", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_version(value: Double): Self = StObject.set(x, "api_version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_versionUndefined: Self = StObject.set(x, "api_version", js.undefined)
    }
  }
  
  trait RemoteUpload extends StObject {
    
    var folderid: String
    
    var id: String
  }
  object RemoteUpload {
    
    @scala.inline
    def apply(folderid: String, id: String): RemoteUpload = {
      val __obj = js.Dynamic.literal(folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteUpload]
    }
    
    @scala.inline
    implicit class RemoteUploadMutableBuilder[Self <: RemoteUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolderid(value: String): Self = StObject.set(x, "folderid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoteUploadParam extends StObject {
    
    var folder: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object RemoteUploadParam {
    
    @scala.inline
    def apply(url: String): RemoteUploadParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoteUploadParam]
    }
    
    @scala.inline
    implicit class RemoteUploadParamMutableBuilder[Self <: RemoteUploadParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type RemoteUploadStatus = NumberDictionary[Added]
  
  trait RemoteUploadStatusParam extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object RemoteUploadStatusParam {
    
    @scala.inline
    def apply(): RemoteUploadStatusParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteUploadStatusParam]
    }
    
    @scala.inline
    implicit class RemoteUploadStatusParamMutableBuilder[Self <: RemoteUploadStatusParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait RunningFileConverts extends StObject {
    
    var id: String
    
    var last_update: String
    
    var link: String
    
    var linkextid: String
    
    var name: String
    
    var progress: Double
    
    var retries: String
    
    var status: String
  }
  object RunningFileConverts {
    
    @scala.inline
    def apply(
      id: String,
      last_update: String,
      link: String,
      linkextid: String,
      name: String,
      progress: Double,
      retries: String,
      status: String
    ): RunningFileConverts = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunningFileConverts]
    }
    
    @scala.inline
    implicit class RunningFileConvertsMutableBuilder[Self <: RunningFileConverts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_update(value: String): Self = StObject.set(x, "last_update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkextid(value: String): Self = StObject.set(x, "linkextid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetries(value: String): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Upload extends StObject {
    
    var url: String
    
    var valid_until: String
  }
  object Upload {
    
    @scala.inline
    def apply(url: String, valid_until: String): Upload = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
      __obj.asInstanceOf[Upload]
    }
    
    @scala.inline
    implicit class UploadMutableBuilder[Self <: Upload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid_until(value: String): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadParam extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var file: String | ArrayBuffer
    
    var filename: js.UndefOr[String] = js.undefined
    
    var folder: js.UndefOr[String] = js.undefined
  }
  object UploadParam {
    
    @scala.inline
    def apply(file: String | ArrayBuffer): UploadParam = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadParam]
    }
    
    @scala.inline
    implicit class UploadParamMutableBuilder[Self <: UploadParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFile(value: String | ArrayBuffer): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    }
  }
  
  trait UploadProgress extends StObject {
    
    var percent: Double
    
    var total: Double
    
    var transferred: Double
  }
  object UploadProgress {
    
    @scala.inline
    def apply(percent: Double, total: Double, transferred: Double): UploadProgress = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadProgress]
    }
    
    @scala.inline
    implicit class UploadProgressMutableBuilder[Self <: UploadProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferred(value: Double): Self = StObject.set(x, "transferred", value.asInstanceOf[js.Any])
    }
  }
}
