package typings.nodeDashVagrant.nodeDashVagrantMod

import typings.nodeDashVagrant.Anon_CurrentVersion
import typings.nodeDashVagrant.Anon_CwdEnv
import typings.nodeDashVagrant.Anon_Id
import typings.nodeDashVagrant.Anon_Major
import typings.nodeDashVagrant.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-vagrant", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def boxAdd(box: String): ProgressEmitter = js.native
  def boxAdd(box: String, args: String): ProgressEmitter = js.native
  def boxAdd(box: String, args: String, cb: Callback): ProgressEmitter = js.native
  def boxAdd(box: String, args: js.Array[String]): ProgressEmitter = js.native
  def boxAdd(box: String, args: js.Array[String], cb: Callback): ProgressEmitter = js.native
  def boxAdd(box: String, cb: Callback): ProgressEmitter = js.native
  def boxList(
    args: String,
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Name]], Unit]
  ): Unit = js.native
  def boxList(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Name]], Unit]
  ): Unit = js.native
  def boxList(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Name]], Unit]): Unit = js.native
  def boxOutdated(
    args: String,
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_CurrentVersion]], Unit]
  ): Unit = js.native
  def boxOutdated(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_CurrentVersion]], Unit]
  ): Unit = js.native
  def boxOutdated(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_CurrentVersion]], Unit]): Unit = js.native
  def boxPrune(): Unit = js.native
  def boxPrune(args: String): Unit = js.native
  def boxPrune(args: String, cb: Callback): Unit = js.native
  def boxPrune(args: js.Array[String]): Unit = js.native
  def boxPrune(args: js.Array[String], cb: Callback): Unit = js.native
  def boxPrune(cb: Callback): Unit = js.native
  def boxRemove(name: String): Unit = js.native
  def boxRemove(name: String, args: String): Unit = js.native
  def boxRemove(name: String, args: String, cb: Callback): Unit = js.native
  def boxRemove(name: String, args: js.Array[String]): Unit = js.native
  def boxRemove(name: String, args: js.Array[String], cb: Callback): Unit = js.native
  def boxRemove(name: String, cb: Callback): Unit = js.native
  def boxUpdate(box: String): ProgressEmitter = js.native
  def boxUpdate(box: String, provider: String): ProgressEmitter = js.native
  def boxUpdate(box: String, provider: String, cb: Callback): ProgressEmitter = js.native
  def boxUpdate(box: String, provider: Null, cb: Callback): ProgressEmitter = js.native
  def create(): Machine = js.native
  def create(opts: Anon_CwdEnv): Machine = js.native
  def globalStatus(args: String, cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Id]], Unit]): Unit = js.native
  def globalStatus(
    args: js.Array[String],
    cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Id]], Unit]
  ): Unit = js.native
  def globalStatus(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Id]], Unit]): Unit = js.native
  def promisify(): Unit = js.native
  def version(): Unit = js.native
  def version(cb: Callback): Unit = js.native
  def versionStatus(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[Anon_Major], Unit]): Unit = js.native
}

