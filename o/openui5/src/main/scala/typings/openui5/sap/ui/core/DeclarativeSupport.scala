package typings.openui5.sap.ui.core

import typings.openui5.sap.ui.core.mvc.HTMLView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclarativeSupport extends StObject {
  
  /**
    * Enhances the given DOM element by parsing the Control and Elements info and creatingthe SAPUI5
    * controls for them.
    * @param oElement the DOM element to compile
    * @param oView The view instance to use
    * @param isRecursive Whether the call of the function is recursive.
    */
  def compile(oElement: Element): Unit = js.native
  def compile(oElement: Element, oView: Unit, isRecursive: Boolean): Unit = js.native
  def compile(oElement: Element, oView: HTMLView): Unit = js.native
  def compile(oElement: Element, oView: HTMLView, isRecursive: Boolean): Unit = js.native
}
