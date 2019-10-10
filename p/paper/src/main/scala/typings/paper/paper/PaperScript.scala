package typings.paper.paper

import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.PaperScript")
@js.native
class PaperScript () extends js.Object

/* static members */
@JSGlobal("paper.PaperScript")
@js.native
object PaperScript extends js.Object {
  /** 
    * Compiles PaperScript code into JavaScript code.
    * 
    * @option options.url {String} the url of the source, for source-map
    *     generation
    * @option options.source {String} the source to be used for the source-
    *     mapping, in case the code that's passed in has already been mingled.
    * 
    * @param code - the PaperScript code
    * @param options - the compilation options
    * 
    * @return an object holding the compiled PaperScript translated
    *     into JavaScript code along with source-maps and other information.
    */
  def compile(code: String): js.Object = js.native
  def compile(code: String, options: js.Object): js.Object = js.native
  /** 
    * Compiles the PaperScript code into a compiled function and executes it.
    * The compiled function receives all properties of the passed {@link
    * PaperScope} as arguments, to emulate a global scope with unaffected
    * performance. It also installs global view and tool handlers automatically
    * on the respective objects.
    * 
    * @option options.url {String} the url of the source, for source-map
    *     generation
    * @option options.source {String} the source to be used for the source-
    *     mapping, in case the code that's passed in has already been mingled.
    * 
    * @param code - the PaperScript code
    * @param scope - the scope for which the code is executed
    * @param options - the compilation options
    * 
    * @return the exports defined in the executed code
    */
  def execute(code: String, scope: PaperScope): js.Object = js.native
  def execute(code: String, scope: PaperScope, options: js.Object): js.Object = js.native
  /** 
    * Loads, compiles and executes PaperScript code in the HTML document. Note
    * that this method is executed automatically for all scripts in the
    * document through a window load event. You can optionally call it earlier
    * (e.g. from a DOM ready event), or you can mark scripts to be ignored by
    * setting the attribute `ignore="true"` or `data-paper-ignore="true"`, and
    * call the `PaperScript.load(script)` method for each script separately
    * when needed.
    * 
    * @param script - the script to load. If none is
    *     provided, all scripts of the HTML document are iterated over and
    *     loaded
    * 
    * @return the scope produced for the passed `script`, or
    *     `undefined` of multiple scripts area loaded
    */
  def load(): PaperScope = js.native
  def load(script: HTMLScriptElement): PaperScope = js.native
}

