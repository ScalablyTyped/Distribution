package typings.mochaPhantomjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MochaPhantomJS extends StObject {
  
  var columns: Double = js.native
  
  def customizeMocha(options: MochaPhantomJSOptions): Unit = js.native
  
  var mochaStartWait: Double = js.native
  
  var output: js.Any = js.native
  
  def run(): Unit = js.native
  
  var startTime: Date = js.native
  
  var url: String = js.native
}
object MochaPhantomJS {
  
  @scala.inline
  def apply(
    columns: Double,
    customizeMocha: MochaPhantomJSOptions => Unit,
    mochaStartWait: Double,
    output: js.Any,
    run: () => Unit,
    startTime: Date,
    url: String
  ): MochaPhantomJS = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], customizeMocha = js.Any.fromFunction1(customizeMocha), mochaStartWait = mochaStartWait.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), startTime = startTime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJS]
  }
  
  @scala.inline
  implicit class MochaPhantomJSMutableBuilder[Self <: MochaPhantomJS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomizeMocha(value: MochaPhantomJSOptions => Unit): Self = StObject.set(x, "customizeMocha", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMochaStartWait(value: Double): Self = StObject.set(x, "mochaStartWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
