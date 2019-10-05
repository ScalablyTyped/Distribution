package typings.muicss

import typings.muicss.libReactPanelMod.Panel
import typings.muicss.reactMod.PanelProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/panel", JSImport.Namespace)
@js.native
object libReactPanelMod extends js.Object {
  @js.native
  class default () extends Panel
  
  type Panel = Component[PanelProps, js.Object, js.Any]
}

