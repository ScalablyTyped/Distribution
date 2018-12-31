package typings
package navigoLib.navigoMod

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
class namespaced () extends Navigo {
  def this(root: java.lang.String) = this()
  def this(root: java.lang.String, useHash: scala.Boolean) = this()
  def this(root: scala.Null, useHash: scala.Boolean) = this()
  def this(root: java.lang.String, useHash: scala.Boolean, hash: java.lang.String) = this()
  def this(root: scala.Null, useHash: scala.Boolean, hash: java.lang.String) = this()
}

