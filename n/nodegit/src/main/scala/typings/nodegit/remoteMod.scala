package typings.nodegit

import typings.nodegit.bufMod.Buf
import typings.nodegit.enumsMod.Enums.DIRECTION
import typings.nodegit.fetchOptionsMod.FetchOptions
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import typings.nodegit.pushOptionsMod.PushOptions
import typings.nodegit.refSpecMod.Refspec
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.transferProgressMod.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteMod {
  
  @JSImport("nodegit/remote", "Remote")
  @js.native
  class Remote () extends StObject {
    
    def autotag(): Double = js.native
    
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks): js.Promise[Double] = js.native
    def connect(direction: DIRECTION, callbacks: RemoteCallbacks, callback: js.Function): js.Promise[Double] = js.native
    
    def connected(): Double = js.native
    
    def defaultBranch(): js.Promise[Buf] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def download(refSpecs: js.Array[js.Any]): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[js.Any], opts: Unit, callback: js.Function): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[js.Any], opts: FetchOptions): js.Promise[Double] = js.native
    def download(refSpecs: js.Array[js.Any], opts: FetchOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def dup(): js.Promise[Remote] = js.native
    
    def fetch(refSpecs: js.Array[js.Any], opts: FetchOptions, message: String): js.Promise[Double] = js.native
    def fetch(refSpecs: js.Array[js.Any], opts: FetchOptions, message: String, callback: js.Function): js.Promise[Double] = js.native
    
    def free(): Unit = js.native
    
    def getFetchRefspecs(): js.Promise[js.Array[js.Any]] = js.native
    
    def getPushRefspecs(): js.Promise[js.Array[js.Any]] = js.native
    
    def getRefspec(n: Double): Refspec = js.native
    
    def name(): String = js.native
    
    def owner(): Repository = js.native
    
    def prune(callbacks: RemoteCallbacks): Double = js.native
    
    def pruneRefs(): Double = js.native
    
    def push(refSpecs: js.Array[js.Any]): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[js.Any], options: Unit, callback: js.Function): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[js.Any], options: PushOptions): js.Promise[Double] = js.native
    def push(refSpecs: js.Array[js.Any], options: PushOptions, callback: js.Function): js.Promise[Double] = js.native
    
    def pushurl(): String = js.native
    
    /**
      * Lists advertised references from a remote. You must connect to the remote before using referenceList.
      */
    def referenceList(): js.Promise[js.Array[js.Any]] = js.native
    
    def refspecCount(): Double = js.native
    
    def stats(): TransferProgress = js.native
    
    def stop(): Unit = js.native
    
    def updateTips(callbacks: RemoteCallbacks, updateFetchhead: Double, downloadTags: Double, reflogMessage: String): Double = js.native
    
    def upload(refspecs: String): Double = js.native
    def upload(refspecs: String, opts: PushOptions): Double = js.native
    def upload(refspecs: js.Array[String]): Double = js.native
    def upload(refspecs: js.Array[String], opts: PushOptions): Double = js.native
    def upload(refspecs: Strarray): Double = js.native
    def upload(refspecs: Strarray, opts: PushOptions): Double = js.native
    
    def url(): String = js.native
  }
  /* static members */
  object Remote {
    
    @JSImport("nodegit/remote", "Remote")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def addFetch(repo: Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addFetch")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def addPush(repo: Repository, remote: String, refspec: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addPush")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], refspec.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def create(repo: Repository, name: String, url: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    @scala.inline
    def createAnonymous(repo: Repository, url: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnonymous")(repo.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    @scala.inline
    def createDetached(url: String): js.Promise[Remote] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetached")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Remote]]
    
    @scala.inline
    def createWithFetchspec(repo: Repository, name: String, url: String, fetch: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithFetchspec")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    @scala.inline
    def delete(repo: Repository, name: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
    
    @scala.inline
    def initCallbacks(opts: RemoteCallbacks, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initCallbacks")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def isValidName(remoteName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidName")(remoteName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def list(repo: Repository): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
    
    @scala.inline
    def lookup(repo: Repository, name: String): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    @scala.inline
    def lookup(repo: Repository, name: String, callback: js.Function): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    @scala.inline
    def lookup(repo: Repository, name: Remote): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    @scala.inline
    def lookup(repo: Repository, name: Remote, callback: js.Function): js.Promise[Remote] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Remote]]
    
    @scala.inline
    def setAutotag(repo: Repository, remote: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setAutotag")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def setPushurl(repo: Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setPushurl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def setUrl(repo: Repository, remote: String, url: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrl")(repo.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait AUTOTAG_OPTION extends StObject
    object AUTOTAG_OPTION {
      
      @scala.inline
      def DOWNLOAD_TAGS_ALL: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def DOWNLOAD_TAGS_AUTO: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def DOWNLOAD_TAGS_NONE: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def DOWNLOAD_TAGS_UNSPECIFIED: `0` = 0.asInstanceOf[`0`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait COMPLETION_TYPE extends StObject
    object COMPLETION_TYPE {
      
      @scala.inline
      def COMPLETION_DOWNLOAD: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def COMPLETION_ERROR: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def COMPLETION_INDEXING: `1` = 1.asInstanceOf[`1`]
    }
  }
}
