package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Navigation ***/
@js.native
trait PhononNavigator extends StObject {
  
  def changePage(pageName: String): Unit = js.native
  def changePage(pageName: String, parameter: String): Unit = js.native
  
  var currentPage: String = js.native
  
  def on(page: PhononPageObject): Unit = js.native
  def on(page: PhononPageObject, callback: js.Function1[/* activity */ PhononActivity, Unit]): Unit = js.native
  
  def onPage(page: String): PhononPageEventObject = js.native
  
  var previousPage: String = js.native
  
  def start(): Unit = js.native
}
