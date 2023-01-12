package typings.mochaSugarFree

import org.scalablytyped.runtime.StringDictionary
import typings.mochaSugarFree.mod.HookFunc
import typings.mochaSugarFree.mod.SuiteFunc
import typings.mochaSugarFree.mod.TestCase
import typings.mochaSugarFree.mod.TestCaseWithDone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  async :false | undefined,   fn :mocha-sugar-free.mocha-sugar-free.TestCase | undefined} */
  trait Optionsasyncfalseundefine
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Optionsasyncfalseundefine {
    
    inline def apply(): Optionsasyncfalseundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsasyncfalseundefine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsasyncfalseundefine] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  async :true,   fn :mocha-sugar-free.mocha-sugar-free.TestCaseWithDone | undefined} */
  trait OptionsasynctruefnTestCas
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object OptionsasynctruefnTestCas {
    
    inline def apply(): OptionsasynctruefnTestCas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsasynctruefnTestCas]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsasynctruefnTestCas] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  fn :mocha-sugar-free.mocha-sugar-free.HookFunc | undefined} */
  trait OptionsfnHookFuncundefine
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object OptionsfnHookFuncundefine {
    
    inline def apply(): OptionsfnHookFuncundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsfnHookFuncundefine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsfnHookFuncundefine] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  fn :mocha-sugar-free.mocha-sugar-free.SuiteFunc | undefined} */
  trait OptionsfnSuiteFuncundefin
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object OptionsfnSuiteFuncundefin {
    
    inline def apply(): OptionsfnSuiteFuncundefin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsfnSuiteFuncundefin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsfnSuiteFuncundefin] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  title :string,   fn :mocha-sugar-free.mocha-sugar-free.SuiteFunc | undefined} */
  trait OptionstitlestringfnSuite
    extends StObject
       with /* option */ StringDictionary[Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The test function.
      */
    var fn: js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc] = js.undefined
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object OptionstitlestringfnSuite {
    
    inline def apply(): OptionstitlestringfnSuite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionstitlestringfnSuite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionstitlestringfnSuite] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      inline def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      inline def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      inline def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      inline def setFn(value: TestCase | TestCaseWithDone | SuiteFunc | HookFunc): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      inline def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      inline def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      inline def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      inline def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
