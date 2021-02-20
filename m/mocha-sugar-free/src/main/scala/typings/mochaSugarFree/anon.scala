package typings.mochaSugarFree

import org.scalablytyped.runtime.StringDictionary
import typings.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typings.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typings.mochaSugarFree.mod.HookFunc
import typings.mochaSugarFree.mod.SuiteFunc
import typings.mochaSugarFree.mod.TestCase
import typings.mochaSugarFree.mod.TestCaseWithDone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  async :false | undefined,   fn :mocha-sugar-free.mocha-sugar-free.TestCase | undefined} */
  @js.native
  trait Optionsasyncfalseundefine
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCase] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.native
  }
  object Optionsasyncfalseundefine {
    
    @scala.inline
    def apply(
      async: js.UndefOr[Boolean] with js.UndefOr[`false`],
      fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCase]
    ): Optionsasyncfalseundefine = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsasyncfalseundefine]
    }
    
    @scala.inline
    implicit class OptionsasyncfalseundefineMutableBuilder[Self <: Optionsasyncfalseundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(value: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCase]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  async :true,   fn :mocha-sugar-free.mocha-sugar-free.TestCaseWithDone | undefined} */
  @js.native
  trait OptionsasynctruefnTestCas
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] with `true` = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCaseWithDone] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.native
  }
  object OptionsasynctruefnTestCas {
    
    @scala.inline
    def apply(
      async: js.UndefOr[Boolean] with `true`,
      fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCaseWithDone]
    ): OptionsasynctruefnTestCas = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsasynctruefnTestCas]
    }
    
    @scala.inline
    implicit class OptionsasynctruefnTestCasMutableBuilder[Self <: OptionsasynctruefnTestCas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(
        value: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[TestCaseWithDone]
      ): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  fn :mocha-sugar-free.mocha-sugar-free.HookFunc | undefined} */
  @js.native
  trait OptionsfnHookFuncundefine
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[HookFunc] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.native
  }
  object OptionsfnHookFuncundefine {
    
    @scala.inline
    def apply(fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[HookFunc]): OptionsfnHookFuncundefine = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsfnHookFuncundefine]
    }
    
    @scala.inline
    implicit class OptionsfnHookFuncundefineMutableBuilder[Self <: OptionsfnHookFuncundefine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(value: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[HookFunc]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  fn :mocha-sugar-free.mocha-sugar-free.SuiteFunc | undefined} */
  @js.native
  trait OptionsfnSuiteFuncundefin
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] = js.native
  }
  object OptionsfnSuiteFuncundefin {
    
    @scala.inline
    def apply(fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc]): OptionsfnSuiteFuncundefin = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsfnSuiteFuncundefin]
    }
    
    @scala.inline
    implicit class OptionsfnSuiteFuncundefinMutableBuilder[Self <: OptionsfnSuiteFuncundefin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(value: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined mocha-sugar-free.mocha-sugar-free.Options & {  title :string,   fn :mocha-sugar-free.mocha-sugar-free.SuiteFunc | undefined} */
  @js.native
  trait OptionstitlestringfnSuite
    extends /* option */ StringDictionary[js.Any] {
    
    /**
      * Whether the context should contain a `done` callback.
      */
    var async: js.UndefOr[Boolean] = js.native
    
    /**
      * Set whether timeouts are enabled.
      */
    var enableTimeouts: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether failing to return a PromiseLike should fail the test.
      */
    var expectPromise: js.UndefOr[Boolean] = js.native
    
    /**
      * The test function.
      */
    var fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc] = js.native
    
    /**
      * Whether the test should be skipped unconditionally.
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a browser environment.
      */
    var skipIfBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped in a WebWorker.
      */
    var skipIfWebWorker: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the test should be skipped outside a browser environment.
      */
    var skipUnlessBrowser: js.UndefOr[Boolean] = js.native
    
    /**
      * Set test slowness threshold.
      */
    var slow: js.UndefOr[String | Double] = js.native
    
    /**
      * Set test timeout.
      */
    var timeout: js.UndefOr[String | Double] = js.native
    
    /**
      * The test title. Replaced by the title parameter if present.
      */
    var title: js.UndefOr[String] with String = js.native
  }
  object OptionstitlestringfnSuite {
    
    @scala.inline
    def apply(
      fn: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc],
      title: js.UndefOr[String] with String
    ): OptionstitlestringfnSuite = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionstitlestringfnSuite]
    }
    
    @scala.inline
    implicit class OptionstitlestringfnSuiteMutableBuilder[Self <: OptionstitlestringfnSuite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setEnableTimeouts(value: Boolean): Self = StObject.set(x, "enableTimeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTimeoutsUndefined: Self = StObject.set(x, "enableTimeouts", js.undefined)
      
      @scala.inline
      def setExpectPromise(value: Boolean): Self = StObject.set(x, "expectPromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectPromiseUndefined: Self = StObject.set(x, "expectPromise", js.undefined)
      
      @scala.inline
      def setFn(value: (js.UndefOr[TestCase | TestCaseWithDone | SuiteFunc | HookFunc]) with js.UndefOr[SuiteFunc]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowser(value: Boolean): Self = StObject.set(x, "skipIfBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfBrowserUndefined: Self = StObject.set(x, "skipIfBrowser", js.undefined)
      
      @scala.inline
      def setSkipIfWebWorker(value: Boolean): Self = StObject.set(x, "skipIfWebWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipIfWebWorkerUndefined: Self = StObject.set(x, "skipIfWebWorker", js.undefined)
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipUnlessBrowser(value: Boolean): Self = StObject.set(x, "skipUnlessBrowser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUnlessBrowserUndefined: Self = StObject.set(x, "skipUnlessBrowser", js.undefined)
      
      @scala.inline
      def setSlow(value: String | Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
      
      @scala.inline
      def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTitle(value: js.UndefOr[String] with String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
