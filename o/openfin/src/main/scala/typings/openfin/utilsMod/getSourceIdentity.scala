package typings.openfin.utilsMod

import typings.jquery.JQuery.DragEventBase
import typings.openfin.anon.Uuid
import typings.openfin.identityMod.Identity
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/platform/utils", "getSourceIdentity")
@js.native
object getSourceIdentity extends js.Object {
  
  def apply(e: DragEventBase[HTMLElement, Identity, HTMLElement, HTMLElement]): Uuid = js.native
}
