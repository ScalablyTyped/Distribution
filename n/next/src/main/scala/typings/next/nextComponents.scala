package typings.next

import typings.next.appMod.AppProps
import typings.next.appMod.DefaultAppIProps
import typings.next.documentMod.DefaultDocumentIProps
import typings.next.documentMod.DocumentProps
import typings.next.errorMod.DefaultErrorIProps
import typings.nextDashServer.routerMod.DefaultQuery
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nextComponents extends nextProps {
  @scala.inline
  def App[P, S]: ComponentType[P with DefaultAppIProps with (AppProps[DefaultQuery, js.Object])] = js.constructorOf[typings.next.appMod.default[P, S]].asInstanceOf[typings.react.reactMod.ComponentType[
  P with typings.next.appMod.DefaultAppIProps with (typings.next.appMod.AppProps[typings.nextDashServer.routerMod.DefaultQuery, js.Object])]]
  @scala.inline
  def Container: ComponentType[js.Object] = js.constructorOf[typings.next.appMod.Container].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Document[P]: ComponentType[P with DefaultDocumentIProps with DocumentProps[DefaultQuery]] = js.constructorOf[typings.next.documentMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[
  P with typings.next.documentMod.DefaultDocumentIProps with typings.next.documentMod.DocumentProps[typings.nextDashServer.routerMod.DefaultQuery]]]
  @scala.inline
  def Error[P]: ComponentType[P with DefaultErrorIProps] = js.constructorOf[typings.next.errorMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[P with typings.next.errorMod.DefaultErrorIProps]]
  @scala.inline
  def Head: ComponentType[typings.next.documentMod.HeadProps] = js.constructorOf[typings.next.documentMod.Head].asInstanceOf[typings.react.reactMod.ComponentType[typings.next.documentMod.HeadProps]]
  @scala.inline
  def Html: ComponentType[HTMLProps[HTMLHtmlElement]] = js.constructorOf[typings.next.documentMod.Html].asInstanceOf[typings.react.reactMod.ComponentType[typings.react.reactMod.HTMLProps[typings.std.HTMLHtmlElement]]]
  @scala.inline
  def Link: ComponentType[typings.nextDashServer.linkMod.LinkProps] = js.constructorOf[typings.next.linkMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.nextDashServer.linkMod.LinkProps]]
  @scala.inline
  def Main: ComponentType[js.Object] = js.constructorOf[typings.next.documentMod.Main].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def NextScript: ComponentType[typings.next.documentMod.NextScriptProps] = js.constructorOf[typings.next.documentMod.NextScript].asInstanceOf[typings.react.reactMod.ComponentType[typings.next.documentMod.NextScriptProps]]
}

