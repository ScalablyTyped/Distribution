package typings.photonui.global.photonui

import typings.photonui.anon.X
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base
object Helpers {
  
  @JSGlobal("photonui.Helpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def escapeHtml(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAbsolutePosition(element: String): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsolutePosition")(element.asInstanceOf[js.Any]).asInstanceOf[X]
  inline def getAbsolutePosition(element: HTMLElement): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsolutePosition")(element.asInstanceOf[js.Any]).asInstanceOf[X]
  
  inline def numberToCssSize(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToCssSize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def numberToCssSize(value: Double, defaultValue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToCssSize")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def numberToCssSize(value: Double, defaultValue: Double, nullValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToCssSize")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def numberToCssSize(value: Double, defaultValue: Unit, nullValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberToCssSize")(value.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
}
