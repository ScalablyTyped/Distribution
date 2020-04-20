package typings.mirrorx

import typings.mirrorx.mod.RouteProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mirrorxComponents extends mirrorxProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.mirrorx.mod.Link].asInstanceOf[ComponentType[LinkProps]]
  @scala.inline
  def NavLink: ComponentType[NavLinkProps] = js.constructorOf[typings.mirrorx.mod.NavLink].asInstanceOf[ComponentType[NavLinkProps]]
  @scala.inline
  def Prompt: ComponentType[PromptProps] = js.constructorOf[typings.mirrorx.mod.Prompt].asInstanceOf[ComponentType[PromptProps]]
  @scala.inline
  def Redirect: ComponentType[RedirectProps] = js.constructorOf[typings.mirrorx.mod.Redirect].asInstanceOf[ComponentType[RedirectProps]]
  @scala.inline
  def Route[T /* <: RouteProps */]: ComponentType[T] = js.constructorOf[typings.mirrorx.mod.Route[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def Router[State]: ComponentType[RouterProps[State]] = js.constructorOf[typings.mirrorx.mod.Router[State]].asInstanceOf[ComponentType[RouterProps[State]]]
}

