package typings.nodeXmppClient.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stanza
  extends Element
     with // This has to be used for the static class initializer new Client.Stanza(..). If there is a better way feel free to
// contribute.
// tslint:disable-next-line:no-misused-new
Instantiable2[/* name */ String, /* attr */ js.Any, Stanza] {
  
  var from: String = js.native
  
  var id: String = js.native
  
  var to: String = js.native
  
  var `type`: String = js.native
}
