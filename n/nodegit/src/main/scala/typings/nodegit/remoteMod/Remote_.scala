package typings.nodegit.remoteMod

import typings.nodegit.bufMod.Buf
import typings.nodegit.enumsMod.Enums.DIRECTION
import typings.nodegit.fetchOptionsMod.FetchOptions
import typings.nodegit.pushOptionsMod.PushOptions
import typings.nodegit.refSpecMod.Refspec
import typings.nodegit.remoteCallbacksMod.RemoteCallbacks
import typings.nodegit.repositoryMod.Repository
import typings.nodegit.strArrayMod.Strarray
import typings.nodegit.transferProgressMod.TransferProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/remote", "Remote")
@js.native
class Remote_ () extends js.Object {
  def autotag(): Double = js.native
  def connect(direction: DIRECTION, callbacks: RemoteCallbacks): js.Promise[Double] = js.native
  def connect(direction: DIRECTION, callbacks: RemoteCallbacks, callback: js.Function): js.Promise[Double] = js.native
  def connected(): Double = js.native
  def defaultBranch(): js.Promise[Buf] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def download(refSpecs: js.Array[_]): js.Promise[Double] = js.native
  def download(refSpecs: js.Array[_], opts: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
  def download(refSpecs: js.Array[_], opts: FetchOptions): js.Promise[Double] = js.native
  def download(refSpecs: js.Array[_], opts: FetchOptions, callback: js.Function): js.Promise[Double] = js.native
  def dup(): js.Promise[Remote] = js.native
  def fetch(refSpecs: js.Array[_], opts: FetchOptions, message: String): js.Promise[Double] = js.native
  def fetch(refSpecs: js.Array[_], opts: FetchOptions, message: String, callback: js.Function): js.Promise[Double] = js.native
  def free(): Unit = js.native
  def getFetchRefspecs(): js.Promise[js.Array[_]] = js.native
  def getPushRefspecs(): js.Promise[js.Array[_]] = js.native
  def getRefspec(n: Double): Refspec = js.native
  def name(): String = js.native
  def owner(): Repository = js.native
  def prune(callbacks: RemoteCallbacks): Double = js.native
  def pruneRefs(): Double = js.native
  def push(refSpecs: js.Array[_]): js.Promise[Double] = js.native
  def push(refSpecs: js.Array[_], options: js.UndefOr[scala.Nothing], callback: js.Function): js.Promise[Double] = js.native
  def push(refSpecs: js.Array[_], options: PushOptions): js.Promise[Double] = js.native
  def push(refSpecs: js.Array[_], options: PushOptions, callback: js.Function): js.Promise[Double] = js.native
  def pushurl(): String = js.native
  /**
    * Lists advertised references from a remote. You must connect to the remote before using referenceList.
    */
  def referenceList(): js.Promise[js.Array[_]] = js.native
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

