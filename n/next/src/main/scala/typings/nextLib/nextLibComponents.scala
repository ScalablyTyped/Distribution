package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nextLibComponents extends nextLibProps {
  @scala.inline
  def App[P, S]: reactLib.reactMod.ComponentType[
    P with nextLib.appMod.DefaultAppIProps with (nextLib.appMod.AppProps[nextDashServerLib.routerMod.DefaultQuery, js.Object])
  ] = js.constructorOf[nextLib.appMod.default[P, S]].asInstanceOf[reactLib.reactMod.ComponentType[
  P with nextLib.appMod.DefaultAppIProps with (nextLib.appMod.AppProps[nextDashServerLib.routerMod.DefaultQuery, js.Object])]]
  @scala.inline
  def Container: reactLib.reactMod.ComponentType[js.Object] = js.constructorOf[nextLib.appMod.Container].asInstanceOf[reactLib.reactMod.ComponentType[js.Object]]
  @scala.inline
  def Document[P]: reactLib.reactMod.ComponentType[
    P with nextLib.documentMod.DefaultDocumentIProps with nextLib.documentMod.DocumentProps[nextDashServerLib.routerMod.DefaultQuery]
  ] = js.constructorOf[nextLib.documentMod.default[P]].asInstanceOf[reactLib.reactMod.ComponentType[
  P with nextLib.documentMod.DefaultDocumentIProps with nextLib.documentMod.DocumentProps[nextDashServerLib.routerMod.DefaultQuery]]]
  @scala.inline
  def Error[P]: reactLib.reactMod.ComponentType[P with nextLib.errorMod.DefaultErrorIProps] = js.constructorOf[nextLib.errorMod.default[P]].asInstanceOf[reactLib.reactMod.ComponentType[P with nextLib.errorMod.DefaultErrorIProps]]
  @scala.inline
  def Head: reactLib.reactMod.ComponentType[nextLib.documentMod.HeadProps] = js.constructorOf[nextLib.documentMod.Head].asInstanceOf[reactLib.reactMod.ComponentType[nextLib.documentMod.HeadProps]]
  @scala.inline
  def Html: reactLib.reactMod.ComponentType[reactLib.reactMod.HTMLProps[stdLib.HTMLHtmlElement]] = js.constructorOf[nextLib.documentMod.Html].asInstanceOf[reactLib.reactMod.ComponentType[reactLib.reactMod.HTMLProps[stdLib.HTMLHtmlElement]]]
  @scala.inline
  def Link: reactLib.reactMod.ComponentType[nextDashServerLib.linkMod.LinkProps] = js.constructorOf[nextLib.linkMod.default].asInstanceOf[reactLib.reactMod.ComponentType[nextDashServerLib.linkMod.LinkProps]]
  @scala.inline
  def Main: reactLib.reactMod.ComponentType[js.Object] = js.constructorOf[nextLib.documentMod.Main].asInstanceOf[reactLib.reactMod.ComponentType[js.Object]]
  @scala.inline
  def NextScript: reactLib.reactMod.ComponentType[nextLib.documentMod.NextScriptProps] = js.constructorOf[nextLib.documentMod.NextScript].asInstanceOf[reactLib.reactMod.ComponentType[nextLib.documentMod.NextScriptProps]]
}

