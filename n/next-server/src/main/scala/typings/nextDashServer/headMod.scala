package typings.nextDashServer

import typings.nextDashServer.headMod.Head
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/head", JSImport.Namespace)
@js.native
object headMod extends js.Object {
  @js.native
  class default () extends Head
  
  def defaultHead(): js.Array[Element] = js.native
  def defaultHead(className: String): js.Array[Element] = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var canUseDOM: Boolean = js.native
    def peek(): js.Array[ReactElement] = js.native
    def rewind(): js.Array[ReactElement] = js.native
  }
  
  type Head = Component[js.Object, js.Object, js.Any]
}

