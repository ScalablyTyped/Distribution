package typings.mochaPhantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MochaPhantomJsWindowOptions
  extends StObject
     with Window {
  
  var ended: Boolean
  
  var env: js.Any
  
  var failures: Double
  
  def run(): Unit
  
  var started: Boolean
}
object MochaPhantomJsWindowOptions {
  
  @scala.inline
  def apply(
    ended: Boolean,
    env: js.Any,
    failures: Double,
    mochaPhantomJS: () => MochaPhantomJsWindowOptions,
    run: () => Unit,
    started: Boolean
  ): MochaPhantomJsWindowOptions = {
    val __obj = js.Dynamic.literal(ended = ended.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], mochaPhantomJS = js.Any.fromFunction0(mochaPhantomJS), run = js.Any.fromFunction0(run), started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaPhantomJsWindowOptions]
  }
  
  @scala.inline
  implicit class MochaPhantomJsWindowOptionsMutableBuilder[Self <: MochaPhantomJsWindowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnded(value: Boolean): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: () => Unit): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
