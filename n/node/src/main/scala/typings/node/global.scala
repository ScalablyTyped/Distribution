package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.WritableStream
import typings.node.anon.Transfer
import typings.node.nodeColonconsoleMod.global.Console_
import typings.node.nodeColonconsoleMod.global.console.ConsoleConstructorOptions
import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AbortController")
  @js.native
  def AbortController: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   AbortController :infer T} ? T : {new (): node.AbortController} */ js.Any = js.native
  inline def AbortController_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   AbortController :infer T} ? T : {new (): node.AbortController} */ js.Any
  ): Unit = js.Dynamic.global.updateDynamic("AbortController")(x.asInstanceOf[js.Any])
  
  @JSGlobal("AbortSignal")
  @js.native
  def AbortSignal: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   AbortSignal :infer T} ? T : {new (): node.AbortSignal, abort (): node.AbortSignal, abort (reason : any): node.AbortSignal, timeout (milliseconds : number): node.AbortSignal} */ js.Any = js.native
  inline def AbortSignal_=(
    x: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   AbortSignal :infer T} ? T : {new (): node.AbortSignal, abort (): node.AbortSignal, abort (reason : any): node.AbortSignal, timeout (milliseconds : number): node.AbortSignal} */ js.Any
  ): Unit = js.Dynamic.global.updateDynamic("AbortSignal")(x.asInstanceOf[js.Any])
  
  object console extends Shortcut {
    
    @JSGlobal("console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("console.Console")
    @js.native
    open class Console protected ()
      extends StObject
         with Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream) = this()
      def this(stdout: WritableStream, stderr: WritableStream) = this()
      def this(stdout: WritableStream, stderr: Unit, ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: String = js.native
  
  inline def dirname_=(x: String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: Any = js.native
  inline def exports_=(x: Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: String = js.native
  
  inline def filename_=(x: String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  /**
    * Only available if `--expose-gc` is passed to the process.
    */
  @JSGlobal("gc")
  @js.native
  def gc: js.UndefOr[js.Function0[Unit]] = js.native
  inline def gc_=(x: js.UndefOr[js.Function0[Unit]]): Unit = js.Dynamic.global.updateDynamic("gc")(x.asInstanceOf[js.Any])
  
  @JSGlobal("global")
  @js.native
  def global: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any = js.native
  inline def global_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any
  ): Unit = js.Dynamic.global.updateDynamic("global")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  inline def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  //#endregion ArrayLike.at() end
  /**
    * @since v17.0.0
    *
    * Creates a deep clone of an object.
    */
  inline def structuredClone[T](value: T): T = js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def structuredClone[T](value: T, transfer: Transfer): T = (js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any], transfer.asInstanceOf[js.Any])).asInstanceOf[T]
}
