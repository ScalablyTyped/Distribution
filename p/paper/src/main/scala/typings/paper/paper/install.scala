package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.install")
@js.native
object install extends js.Object {
  /** 
    * Injects the paper scope into any other given scope. Can be used for
    * example to inject the currently active PaperScope into the window's
    * global scope, to emulate PaperScript-style globally accessible Paper
    * classes and objects.
    * 
    * <b>Please note:</b> Using this method may override native constructors
    * (e.g. Path). This may cause problems when using Paper.js in conjunction
    * with other libraries that rely on these constructors. Keep the library
    * scoped if you encounter issues caused by this.
    */
  def apply(scope: js.Any): Unit = js.native
}

