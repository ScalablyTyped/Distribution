package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.AutoClose
import typings.nodeRedEditorClient.anon.ContainerHide
import typings.nodeRedEditorClient.anon.DisposeOnClose
import typings.nodeRedEditorClient.anon.Show
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover extends StObject {
  
  def create(options: AutoClose): PopoverInstance = js.native
  
  def menu(options: DisposeOnClose): Show = js.native
  
  def panel(content: JQuery[HTMLElement]): ContainerHide = js.native
  
  def tooltip(target: JQuery[HTMLElement], content: String): PopoverInstance = js.native
  def tooltip(target: JQuery[HTMLElement], content: String, action: String): PopoverInstance = js.native
}
