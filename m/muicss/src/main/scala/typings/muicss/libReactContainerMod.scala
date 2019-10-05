package typings.muicss

import typings.muicss.libReactContainerMod.Container
import typings.muicss.reactMod.ContainerProps
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("muicss/lib/react/container", JSImport.Namespace)
@js.native
object libReactContainerMod extends js.Object {
  @js.native
  class default () extends Container
  
  type Container = Component[ContainerProps, js.Object, js.Any]
}

