package typings.mochaSteps

import typings.mocha.Mocha.Func
import typings.mocha.Mocha.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mocha-steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    @scala.inline
    def step(title: String): Test = js.Dynamic.global.applyDynamic("step")(title.asInstanceOf[js.Any]).asInstanceOf[Test]
    @scala.inline
    def step(title: String, fn: Func): Test = (js.Dynamic.global.applyDynamic("step")(title.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Test]
    
    @scala.inline
    def xstep(title: String): Test = js.Dynamic.global.applyDynamic("xstep")(title.asInstanceOf[js.Any]).asInstanceOf[Test]
    @scala.inline
    def xstep(title: String, fn: Func): Test = (js.Dynamic.global.applyDynamic("xstep")(title.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Test]
  }
  
  @scala.inline
  def step(title: String): Test = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(title.asInstanceOf[js.Any]).asInstanceOf[Test]
  @scala.inline
  def step(title: String, fn: Func): Test = (^.asInstanceOf[js.Dynamic].applyDynamic("step")(title.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Test]
  
  @scala.inline
  def xstep(title: String): Test = ^.asInstanceOf[js.Dynamic].applyDynamic("xstep")(title.asInstanceOf[js.Any]).asInstanceOf[Test]
  @scala.inline
  def xstep(title: String, fn: Func): Test = (^.asInstanceOf[js.Dynamic].applyDynamic("xstep")(title.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Test]
}
