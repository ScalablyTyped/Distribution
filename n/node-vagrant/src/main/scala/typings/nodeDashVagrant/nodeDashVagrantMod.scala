package typings.nodeDashVagrant

import typings.node.eventsMod.EventEmitter
import typings.nodeDashVagrant.nodeDashVagrantStrings.`up-progress`
import typings.nodeDashVagrant.nodeDashVagrantStrings.progress
import typings.nodeDashVagrant.nodeDashVagrantStrings.stderr
import typings.nodeDashVagrant.nodeDashVagrantStrings.stdout
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-vagrant", JSImport.Namespace)
@js.native
object nodeDashVagrantMod extends js.Object {
  @js.native
  trait Machine extends MachineEmitter {
    var batch: js.Array[Anon_Cb] = js.native
    var opts: Anon_Cwd = js.native
    def boxRepackage(name: String, provider: String, version: String): Unit = js.native
    def boxRepackage(name: String, provider: String, version: String, cb: Callback): Unit = js.native
    def destroy(): Unit = js.native
    def destroy(args: String): Unit = js.native
    def destroy(args: String, cb: Callback): Unit = js.native
    def destroy(args: js.Array[String]): Unit = js.native
    def destroy(args: js.Array[String], cb: Callback): Unit = js.native
    def destroy(cb: Callback): Unit = js.native
    def halt(): Unit = js.native
    def halt(args: String): Unit = js.native
    def halt(args: String, cb: Callback): Unit = js.native
    def halt(args: js.Array[String]): Unit = js.native
    def halt(args: js.Array[String], cb: Callback): Unit = js.native
    def halt(cb: Callback): Unit = js.native
    def init(args: String, cb: Callback): Unit = js.native
    def init(args: String, config: js.Any, cb: Callback): Unit = js.native
    def init(args: js.Array[String], cb: Callback): Unit = js.native
    def init(args: js.Array[String], config: js.Any, cb: Callback): Unit = js.native
    def plugin(): Plugin = js.native
    def pluginRepair(): Unit = js.native
    def pluginRepair(cb: Callback): Unit = js.native
    def pluginUpdate(): Unit = js.native
    def pluginUpdate(cb: Callback): Unit = js.native
    def provision(): Unit = js.native
    def provision(cb: Callback): Unit = js.native
    def reload(): Unit = js.native
    def reload(args: String): Unit = js.native
    def reload(args: String, cb: Callback): Unit = js.native
    def reload(args: js.Array[String]): Unit = js.native
    def reload(args: js.Array[String], cb: Callback): Unit = js.native
    def reload(cb: Callback): Unit = js.native
    def resume(): Unit = js.native
    def resume(cb: Callback): Unit = js.native
    def snapshots(): Snapshots = js.native
    def sshConfig(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[Anon_Host], Unit]): Unit = js.native
    def status(cb: js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[js.Array[Anon_Provider]], Unit]): Unit = js.native
    def suspend(): Unit = js.native
    def suspend(cb: Callback): Unit = js.native
    def up(): Unit = js.native
    def up(args: String): Unit = js.native
    def up(args: String, cb: Callback): Unit = js.native
    def up(args: js.Array[String]): Unit = js.native
    def up(args: js.Array[String], cb: Callback): Unit = js.native
    def up(cb: Callback): Unit = js.native
  }
  
  @js.native
  trait MachineEmitter extends EventEmitter {
    @JSName("on")
    def on_progress(
      event: progress,
      listener: js.Function4[
          /* machine */ String, 
          /* progress */ String, 
          /* rate */ String, 
          /* remaining */ String, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_stderr(event: stderr, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_stdout(event: stdout, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_upprogress(event: `up-progress`, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
  }
  
  @js.native
  trait Plugin extends js.Object {
    def expunge(): Unit = js.native
    def expunge(args: String): Unit = js.native
    def expunge(args: String, cb: Callback): Unit = js.native
    def expunge(args: js.Array[String]): Unit = js.native
    def expunge(args: js.Array[String], cb: Callback): Unit = js.native
    def install(): Unit = js.native
    def install(args: String): Unit = js.native
    def install(args: String, cb: Callback): Unit = js.native
    def install(args: js.Array[String]): Unit = js.native
    def install(args: js.Array[String], cb: Callback): Unit = js.native
    def list(): Unit = js.native
    def list(args: String): Unit = js.native
    def list(args: String, cb: Callback): Unit = js.native
    def list(args: js.Array[String]): Unit = js.native
    def list(args: js.Array[String], cb: Callback): Unit = js.native
    def repair(): Unit = js.native
    def repair(args: String): Unit = js.native
    def repair(args: String, cb: Callback): Unit = js.native
    def repair(args: js.Array[String]): Unit = js.native
    def repair(args: js.Array[String], cb: Callback): Unit = js.native
    def uninstall(): Unit = js.native
    def uninstall(args: String): Unit = js.native
    def uninstall(args: String, cb: Callback): Unit = js.native
    def uninstall(args: js.Array[String]): Unit = js.native
    def uninstall(args: js.Array[String], cb: Callback): Unit = js.native
    def update(): Unit = js.native
    def update(args: String): Unit = js.native
    def update(args: String, cb: Callback): Unit = js.native
    def update(args: js.Array[String]): Unit = js.native
    def update(args: js.Array[String], cb: Callback): Unit = js.native
  }
  
  @js.native
  trait ProgressEmitter extends EventEmitter {
    @JSName("on")
    def on_progress(
      event: progress,
      listener: js.Function4[
          /* machine */ String, 
          /* progress */ String, 
          /* rate */ String, 
          /* remaining */ String, 
          Unit
        ]
    ): this.type = js.native
  }
  
  @js.native
  trait Snapshots extends js.Object {
    def delete(args: String): Unit = js.native
    def delete(args: String, cb: Callback): Unit = js.native
    def delete(args: js.Array[String]): Unit = js.native
    def delete(args: js.Array[String], cb: Callback): Unit = js.native
    def list(): Unit = js.native
    def list(cb: Callback): Unit = js.native
    def pop(): Unit = js.native
    def pop(cb: Callback): Unit = js.native
    def push(): Unit = js.native
    def push(cb: Callback): Unit = js.native
    def restore(): Unit = js.native
    def restore(args: String): Unit = js.native
    def restore(args: String, cb: Callback): Unit = js.native
    def restore(args: js.Array[String]): Unit = js.native
    def restore(args: js.Array[String], cb: Callback): Unit = js.native
    def save(): Unit = js.native
    def save(args: String): Unit = js.native
    def save(args: String, cb: Callback): Unit = js.native
    def save(args: js.Array[String]): Unit = js.native
    def save(args: js.Array[String], cb: Callback): Unit = js.native
  }
  
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
  type Callback = js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[String], Unit]
  type ErrorArg = Error | String | Null
}

