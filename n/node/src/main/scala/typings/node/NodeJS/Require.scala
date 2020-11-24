package typings.node.NodeJS

import typings.node.NodeModule
import typings.node.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Require extends js.Object {
  
  def apply(id: String): js.Any = js.native
  
  var cache: Dict[NodeModule] = js.native
  
  /**
    * @deprecated
    */
  var extensions: RequireExtensions = js.native
  
  var main: js.UndefOr[Module] = js.native
  
  def resolve(id: String): String = js.native
  def resolve(id: String, options: Paths): String = js.native
  @JSName("resolve")
  var resolve_Original: RequireResolve = js.native
}
