package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@js.native
trait Base_ extends js.Object {
  
  var done: js.UndefOr[
    js.Function2[
      /* failures */ Double, 
      /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  def epilogue(): Unit = js.native
  
  /**
    * Test failures
    */
  var failures: js.Array[Test] = js.native
  
  /**
    * The configured runner
    */
  var runner: Runner = js.native
  
  /**
    * Test run statistics
    */
  var stats: Stats = js.native
}
object Base_ {
  
  @scala.inline
  def apply(epilogue: () => Unit, failures: js.Array[Test], runner: Runner, stats: Stats): Base_ = {
    val __obj = js.Dynamic.literal(epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base_]
  }
  
  @scala.inline
  implicit class Base_Ops[Self <: Base_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEpilogue(value: () => Unit): Self = this.set("epilogue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailuresVarargs(value: Test*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[Test]): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner(value: Runner): Self = this.set("runner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(
      value: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit
    ): Self = this.set("done", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
  }
}
