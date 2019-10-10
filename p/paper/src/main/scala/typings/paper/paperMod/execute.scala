package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "execute")
@js.native
object execute extends js.Object {
  /** 
    * Compiles the PaperScript code into a compiled function and executes it.
    * The compiled function receives all properties of this {@link PaperScope}
    * as arguments, to emulate a global scope with unaffected performance. It
    * also installs global view and tool handlers automatically on the
    * respective objects.
    * 
    * @option options.url {String} the url of the source, for source-map
    *     debugging
    * @option options.source {String} the source to be used for the source-
    *     mapping, in case the code that's passed in has already been mingled.
    * 
    * @param code - the PaperScript code
    * @param options - the compilation options
    */
  def apply(code: String): Unit = js.native
  def apply(code: String, options: js.Object): Unit = js.native
}

