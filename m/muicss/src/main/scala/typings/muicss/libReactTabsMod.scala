package typings.muicss

import typings.muicss.libReactTabsMod.Tabs
import typings.muicss.reactMod.TabsProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/tabs", JSImport.Namespace)
@js.native
object libReactTabsMod extends js.Object {
  @js.native
  class default () extends Tabs
  
  type Tabs = Component[TabsProps, js.Object, js.Any]
}

