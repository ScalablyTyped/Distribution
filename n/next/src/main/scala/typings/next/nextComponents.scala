package typings.next

import typings.next.distNextDashServerLibUtilsMod.DocumentProps
import typings.next.distPagesUnderscoreAppMod.AppProps
import typings.next.distPagesUnderscoreDocumentMod.OriginProps
import typings.next.distPagesUnderscoreErrorMod.ErrorProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.HtmlHTMLAttributes
import typings.std.HTMLHeadElement
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nextComponents extends nextProps {
  @scala.inline
  def App[P, CP, S]: ComponentType[P with AppProps[CP]] = js.constructorOf[typings.next.appMod.default[P, CP, S]].asInstanceOf[typings.react.reactMod.ComponentType[P with typings.next.distPagesUnderscoreAppMod.AppProps[CP]]]
  @scala.inline
  def Document[P]: ComponentType[DocumentProps with P] = js.constructorOf[typings.next.documentMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[typings.next.distNextDashServerLibUtilsMod.DocumentProps with P]]
  @scala.inline
  def Error[P]: ComponentType[P with ErrorProps] = js.constructorOf[typings.next.errorMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[P with typings.next.distPagesUnderscoreErrorMod.ErrorProps]]
  @scala.inline
  def Head: ComponentType[
    OriginProps with (DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement])
  ] = js.constructorOf[typings.next.documentMod.Head].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.next.distPagesUnderscoreDocumentMod.OriginProps with (typings.react.reactMod.DetailedHTMLProps[
    typings.react.reactMod.HTMLAttributes[typings.std.HTMLHeadElement], 
    typings.std.HTMLHeadElement
  ])]]
  @scala.inline
  def Html: ComponentType[HtmlProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]] = js.constructorOf[typings.next.documentMod.Html].asInstanceOf[typings.react.reactMod.ComponentType[
  HtmlProps[
    typings.react.reactMod.HtmlHTMLAttributes[typings.std.HTMLHtmlElement], 
    typings.std.HTMLHtmlElement
  ]]]
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.next.linkMod.default].asInstanceOf[typings.react.reactMod.ComponentType[LinkProps]]
  @scala.inline
  def Main: ComponentType[js.Object] = js.constructorOf[typings.next.documentMod.Main].asInstanceOf[typings.react.reactMod.ComponentType[js.Object]]
  @scala.inline
  def NextScript: ComponentType[NextScriptProps] = js.constructorOf[typings.next.documentMod.NextScript].asInstanceOf[typings.react.reactMod.ComponentType[NextScriptProps]]
  @scala.inline
  def UnderscoreApp[P, CP, S]: ComponentType[P with AppProps[CP]] = js.constructorOf[typings.next.distPagesUnderscoreAppMod.default[P, CP, S]].asInstanceOf[typings.react.reactMod.ComponentType[P with typings.next.distPagesUnderscoreAppMod.AppProps[CP]]]
  @scala.inline
  def UnderscoreDocument[P]: ComponentType[DocumentProps with P] = js.constructorOf[typings.next.distPagesUnderscoreDocumentMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[typings.next.distNextDashServerLibUtilsMod.DocumentProps with P]]
  @scala.inline
  def UnderscoreError[P]: ComponentType[P with ErrorProps] = js.constructorOf[typings.next.distPagesUnderscoreErrorMod.default[P]].asInstanceOf[typings.react.reactMod.ComponentType[P with typings.next.distPagesUnderscoreErrorMod.ErrorProps]]
}

