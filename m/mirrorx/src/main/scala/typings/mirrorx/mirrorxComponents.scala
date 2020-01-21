package typings.mirrorx

import typings.mirrorx.mod.RouteProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mirrorxComponents extends mirrorxProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.mirrorx.mod.Link].asInstanceOf[typings.react.mod.ComponentType[LinkProps]]
  @scala.inline
  def NavLink: ComponentType[NavLinkProps] = js.constructorOf[typings.mirrorx.mod.NavLink].asInstanceOf[typings.react.mod.ComponentType[NavLinkProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.mirrorx.mod.Prompt].asInstanceOf[typings.react.mod.ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.mirrorx.mod.Redirect].asInstanceOf[typings.react.mod.ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.mirrorx.mod.Route[T]].asInstanceOf[typings.react.mod.ComponentType[T]]
  @scala.inline
  def Router[State]: ComponentType[RouterProps[State]] = js.constructorOf[typings.mirrorx.mod.Router[State]].asInstanceOf[typings.react.mod.ComponentType[RouterProps[State]]]
}

