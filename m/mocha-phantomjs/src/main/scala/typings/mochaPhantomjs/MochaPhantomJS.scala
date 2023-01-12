package typings.mochaPhantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaPhantomJS extends StObject {
  
  var columns: Double
  
  def customizeMocha(options: MochaPhantomJSOptions): Unit
  
  var mochaStartWait: Double
  
  var output: Any
  
  def run(): Unit
  
  var startTime: js.Date
  
  var url: String
}
object MochaPhantomJS {
  
  inline def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Unit,
    mochaStartWait: Double,
    output: Any,
    run: () => Unit,
    startTime: js.Date,
    url: String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MochaPhantomJS] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setCustomizeMocha(value: MochaPhantomJSOptions => Unit): Self = StObject.set(x, "customizeMocha", js.Any.fromFunction1(value))
    
    inline def setMochaStartWait(value: Double): Self = StObject.set(x, "mochaStartWait", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
