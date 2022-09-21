package typings.phonon.Phonon

import typings.phonon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Internationalization ***/
@js.native
trait PhononI18n extends StObject {
  
  def bind(): Unit = js.native
  def bind(callback: js.Function0[Unit]): Unit = js.native
  def bind(element: Unit, callback: js.Function0[Unit]): Unit = js.native
  def bind(element: Element): Unit = js.native
  def bind(element: Element, callback: js.Function0[Unit]): Unit = js.native
  
  def get(key: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
  def get(key: js.Array[String], callback: js.Function1[/* values */ Any, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* json */ Any, Unit]): Unit = js.native
  
  def getLocale(): String = js.native
  
  def getPreference(): String = js.native
  
  def setPreference(newLanguage: String): Unit = js.native
}
