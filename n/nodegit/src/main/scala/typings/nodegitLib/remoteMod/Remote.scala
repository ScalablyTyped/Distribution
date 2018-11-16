package typings
package nodegitLib.remoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/remote", "Remote")
@js.native
class Remote () extends js.Object {
  def autotag(): scala.Double = js.native
  def connect(
    direction: nodegitLib.enumsMod.EnumsNs.DIRECTION,
    callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks
  ): stdLib.Promise[scala.Double] = js.native
  def connect(
    direction: nodegitLib.enumsMod.EnumsNs.DIRECTION,
    callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks,
    callback: js.Function
  ): stdLib.Promise[scala.Double] = js.native
  def connected(): scala.Double = js.native
  def defaultBranch(): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
  def disconnect(): stdLib.Promise[scala.Unit] = js.native
  def download(refSpecs: js.Array[_]): stdLib.Promise[scala.Double] = js.native
  def download(refSpecs: js.Array[_], opts: nodegitLib.fetchDashOptionsMod.FetchOptions): stdLib.Promise[scala.Double] = js.native
  def download(refSpecs: js.Array[_], opts: nodegitLib.fetchDashOptionsMod.FetchOptions, callback: js.Function): stdLib.Promise[scala.Double] = js.native
  def dup(): stdLib.Promise[Remote] = js.native
  def fetch(
    refSpecs: js.Array[_],
    opts: nodegitLib.fetchDashOptionsMod.FetchOptions,
    message: java.lang.String
  ): stdLib.Promise[scala.Double] = js.native
  def fetch(
    refSpecs: js.Array[_],
    opts: nodegitLib.fetchDashOptionsMod.FetchOptions,
    message: java.lang.String,
    callback: js.Function
  ): stdLib.Promise[scala.Double] = js.native
  def free(): scala.Unit = js.native
  def getFetchRefspecs(): stdLib.Promise[js.Array[_]] = js.native
  def getPushRefspecs(): stdLib.Promise[js.Array[_]] = js.native
  def getRefspec(n: scala.Double): nodegitLib.refDashSpecMod.Refspec = js.native
  def name(): java.lang.String = js.native
  def owner(): nodegitLib.repositoryMod.Repository = js.native
  def prune(callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks): scala.Double = js.native
  def pruneRefs(): scala.Double = js.native
  def push(refSpecs: js.Array[_]): stdLib.Promise[scala.Double] = js.native
  def push(refSpecs: js.Array[_], options: nodegitLib.pushDashOptionsMod.PushOptions): stdLib.Promise[scala.Double] = js.native
  def push(refSpecs: js.Array[_], options: nodegitLib.pushDashOptionsMod.PushOptions, callback: js.Function): stdLib.Promise[scala.Double] = js.native
  def pushurl(): java.lang.String = js.native
  /**
       * Lists advertised references from a remote. You must connect to the remote before using referenceList.
       */
  def referenceList(): stdLib.Promise[js.Array[_]] = js.native
  def refspecCount(): scala.Double = js.native
  def stats(): nodegitLib.transferDashProgressMod.TransferProgress = js.native
  def stop(): scala.Unit = js.native
  def updateTips(
    callbacks: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks,
    updateFetchhead: scala.Double,
    downloadTags: scala.Double,
    reflogMessage: java.lang.String
  ): scala.Double = js.native
  def upload(refspecs: java.lang.String): scala.Double = js.native
  def upload(refspecs: java.lang.String, opts: nodegitLib.pushDashOptionsMod.PushOptions): scala.Double = js.native
  def upload(refspecs: js.Array[java.lang.String]): scala.Double = js.native
  def upload(refspecs: js.Array[java.lang.String], opts: nodegitLib.pushDashOptionsMod.PushOptions): scala.Double = js.native
  def upload(refspecs: nodegitLib.strDashArrayMod.Strarray): scala.Double = js.native
  def upload(refspecs: nodegitLib.strDashArrayMod.Strarray, opts: nodegitLib.pushDashOptionsMod.PushOptions): scala.Double = js.native
  def url(): java.lang.String = js.native
}

@JSImport("nodegit/remote", "Remote")
@js.native
object Remote extends js.Object {
  def addFetch(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, refspec: java.lang.String): scala.Double = js.native
  def addPush(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, refspec: java.lang.String): scala.Double = js.native
  def create(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, url: java.lang.String): nodegitLib.remoteMod.Remote = js.native
  def createAnonymous(repo: nodegitLib.repositoryMod.Repository, url: java.lang.String): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def createWithFetchspec(
    repo: nodegitLib.repositoryMod.Repository,
    name: java.lang.String,
    url: java.lang.String,
    fetch: java.lang.String
  ): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def delete(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def initCallbacks(opts: nodegitLib.remoteDashCallbacksMod.RemoteCallbacks, version: scala.Double): scala.Double = js.native
  def isValidName(remoteName: java.lang.String): scala.Boolean = js.native
  def list(repo: nodegitLib.repositoryMod.Repository): stdLib.Promise[js.Array[_]] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: java.lang.String, callback: js.Function): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(repo: nodegitLib.repositoryMod.Repository, name: nodegitLib.remoteMod.Remote): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def lookup(
    repo: nodegitLib.repositoryMod.Repository,
    name: nodegitLib.remoteMod.Remote,
    callback: js.Function
  ): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  def setAutotag(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, value: scala.Double): scala.Double = js.native
  def setPushurl(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, url: java.lang.String): scala.Double = js.native
  def setUrl(repo: nodegitLib.repositoryMod.Repository, remote: java.lang.String, url: java.lang.String): scala.Double = js.native
}

