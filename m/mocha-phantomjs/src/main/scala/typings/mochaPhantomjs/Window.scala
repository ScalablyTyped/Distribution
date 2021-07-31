package typings.mochaPhantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def mochaPhantomJS(): MochaPhantomJsWindowOptions
}
object Window {
  
  @scala.inline
  def apply(mochaPhantomJS: () => MochaPhantomJsWindowOptions): Window = {
    val __obj = js.Dynamic.literal(mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS))
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMochaPhantomJS(value: () => MochaPhantomJsWindowOptions): Self = StObject.set(x, "mochaPhantomJS", js.Any.fromFunction0(value))
  }
}
