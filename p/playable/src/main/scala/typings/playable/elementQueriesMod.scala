package typings.playable

import typings.playable.anon.Prefix
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/element-queries", JSImport.Namespace)
@js.native
object elementQueriesMod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.playable.elementQueriesElementQueriesMod.default {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, hasPrefix: Prefix) = this()
  }
}
