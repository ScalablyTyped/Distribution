package typings.mochaEach

import typings.mocha.Mocha.SuiteFunction
import typings.mocha.Mocha.TestFunction
import typings.mocha.mod.Context
import typings.mocha.mod.Suite_
import typings.mocha.mod.Test_
import typings.mochaEach.anon.Describe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` or `describe` notation common to
    * Mocha.
    */
  @scala.inline
  def apply(parameters: js.Array[js.Any]): Describe = ^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any]).asInstanceOf[Describe]
  @scala.inline
  def apply(parameters: js.Array[js.Any], dIt: Unit, dDescribe: SuiteFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any], dDescribe.asInstanceOf[js.Any])).asInstanceOf[Describe]
  @scala.inline
  def apply(parameters: js.Array[js.Any], dIt: TestFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any])).asInstanceOf[Describe]
  @scala.inline
  def apply(parameters: js.Array[js.Any], dIt: TestFunction, dDescribe: SuiteFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any], dDescribe.asInstanceOf[js.Any])).asInstanceOf[Describe]
  
  @JSImport("mocha-each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This interface describes the kind of `describe` available from a `forEach` call.
    * The result is almost identical to Mocha's `SuiteFunction` interface.
    */
  @js.native
  trait ForEachDescribeDefinition extends StObject {
    
    def apply(expectation: String): Suite_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Suite_ = js.native
    
    def only(expectation: String): Suite_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Suite_ = js.native
    
    def skip(expectation: String): Suite_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Suite_ = js.native
  }
  
  /**
    * This interface describes the kind of `it` available from a `forEach` call.
    * The result is very similar to Mocha's `TestFunction` interface.
    */
  @js.native
  trait ForEachTestFunction extends StObject {
    
    def apply(expectation: String): Test_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Test_ = js.native
    
    def only(expectation: String): Test_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Test_ = js.native
    
    def skip(expectation: String): Test_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, js.Any]): Test_ = js.native
  }
}
