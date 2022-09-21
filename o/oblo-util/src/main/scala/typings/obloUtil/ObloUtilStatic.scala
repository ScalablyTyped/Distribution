package typings.obloUtil

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObloUtilStatic extends StObject {
  
  def addslashes(str: String): String = js.native
  
  def clip(min: Double, max: Double, x: Double): Double = js.native
  
  var debug: Boolean = js.native
  
  def error(args: Any*): Unit = js.native
  
  def log(args: Any*): Unit = js.native
  
  def pad(c: String, l: Double, str: Any): String = js.native
  
  def padZero(l: Double, n: Double): String = js.native
  
  def readDate(dateStr: String): js.Date = js.native
  
  def replicate[X](n: Double, x: X): js.Array[X] = js.native
  
  def setAttr($elt: JQuery[HTMLElement], attrName: String, isSet: Boolean): Unit = js.native
  
  def showDate(date: js.Date): String = js.native
  
  def showJSON(json: Any): String = js.native
  def showJSON(json: Any, indentStr: String): String = js.native
  def showJSON(json: Any, indentStr: String, maxDepth: Double): String = js.native
  def showJSON(json: Any, indentStr: Unit, maxDepth: Double): String = js.native
  
  def showTime(date: js.Date): String = js.native
  
  def square(x: Double): Double = js.native
}
