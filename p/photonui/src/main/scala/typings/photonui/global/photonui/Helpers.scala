package typings.photonui.global.photonui

import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base
object Helpers {
  
  @JSGlobal("photonui.Helpers.cleanNode")
  @js.native
  def cleanNode(node: HTMLElement): Unit = js.native
  
  @JSGlobal("photonui.Helpers.escapeHtml")
  @js.native
  def escapeHtml(string: String): Unit = js.native
  
  @JSGlobal("photonui.Helpers.getAbsolutePosition")
  @js.native
  def getAbsolutePosition(element: String): X = js.native
  @JSGlobal("photonui.Helpers.getAbsolutePosition")
  @js.native
  def getAbsolutePosition(element: HTMLElement): X = js.native
  
  @JSGlobal("photonui.Helpers.numberToCssSize")
  @js.native
  def numberToCssSize(value: Double): String = js.native
  @JSGlobal("photonui.Helpers.numberToCssSize")
  @js.native
  def numberToCssSize(value: Double, defaultValue: js.UndefOr[scala.Nothing], nullValue: String): String = js.native
  @JSGlobal("photonui.Helpers.numberToCssSize")
  @js.native
  def numberToCssSize(value: Double, defaultValue: Double): String = js.native
  @JSGlobal("photonui.Helpers.numberToCssSize")
  @js.native
  def numberToCssSize(value: Double, defaultValue: Double, nullValue: String): String = js.native
  
  @JSGlobal("photonui.Helpers.uuid4")
  @js.native
  def uuid4(): String = js.native
}
