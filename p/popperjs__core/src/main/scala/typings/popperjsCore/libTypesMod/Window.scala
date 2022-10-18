package typings.popperjsCore.libTypesMod

import typings.popperjsCore.anon.FnCall
import typings.std.CSSStyleDeclaration
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var Element: typings.std.Element = js.native
  
  var HTMLElement: typings.std.HTMLElement = js.native
  
  var Node: typings.std.Node = js.native
  
  var ShadowRoot: typings.std.ShadowRoot = js.native
  
  def addEventListener(`type`: Any, listener: Any): Unit = js.native
  def addEventListener(`type`: Any, listener: Any, optionsOrUseCapture: Any): Unit = js.native
  
  var devicePixelRatio: Double = js.native
  
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: String): CSSStyleDeclaration = js.native
  @JSName("getComputedStyle")
  var getComputedStyle_Original: FnCall = js.native
  
  var innerHeight: Double = js.native
  
  var innerWidth: Double = js.native
  
  var offsetHeight: Double = js.native
  
  var offsetWidth: Double = js.native
  
  var pageXOffset: Double = js.native
  
  var pageYOffset: Double = js.native
  
  def removeEventListener(`type`: Any, listener: Any): Unit = js.native
  def removeEventListener(`type`: Any, listener: Any, optionsOrUseCapture: Any): Unit = js.native
  
  var visualViewport: js.UndefOr[VisualViewport] = js.native
}
