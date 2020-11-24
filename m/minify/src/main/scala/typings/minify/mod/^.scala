package typings.minify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * A minifier of js, css, html and img files.
    * @async
    */
  def apply(name: String): js.Promise[String] = js.native
  def apply(name: String, options: Options): js.Promise[String] = js.native
}
