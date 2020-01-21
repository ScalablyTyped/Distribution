package typings.navigo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigo", JSImport.Namespace)
@js.native
/**
  * Constructs the router
  * @param root The main URL of your application.
  * @param useHash If useHash set to true then the router uses an old routing approach with hash in the URL. Navigo anyways falls back to this mode if there is no History API supported.
  */
class ^ () extends Navigo {
  def this(root: String) = this()
  def this(root: String, useHash: Boolean) = this()
  def this(root: Null, useHash: Boolean) = this()
  def this(root: String, useHash: Boolean, hash: String) = this()
  def this(root: Null, useHash: Boolean, hash: String) = this()
}

