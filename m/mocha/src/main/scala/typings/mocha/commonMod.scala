package typings.mocha

import typings.mocha.Mocha.AsyncFunc
import typings.mocha.Mocha.Func
import typings.mocha.Mocha.MochaGlobals
import typings.mocha.Mocha.Suite
import typings.mocha.Mocha.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("mocha/lib/interfaces/common", JSImport.Namespace)
  @js.native
  def apply(suites: js.Array[Suite], context: MochaGlobals, mocha: Mocha): CommonFunctions = js.native
  
  @js.native
  trait CommonFunctions extends StObject {
    
    /**
      * Execute after running tests.
      */
    def after(): Unit = js.native
    def after(fn: AsyncFunc): Unit = js.native
    def after(fn: Func): Unit = js.native
    /**
      * Execute after running tests.
      */
    def after(name: String): Unit = js.native
    def after(name: String, fn: AsyncFunc): Unit = js.native
    def after(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute after each test case.
      */
    def afterEach(): Unit = js.native
    def afterEach(fn: AsyncFunc): Unit = js.native
    def afterEach(fn: Func): Unit = js.native
    /**
      * Execute after each test case.
      */
    def afterEach(name: String): Unit = js.native
    def afterEach(name: String, fn: AsyncFunc): Unit = js.native
    def afterEach(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute before running tests.
      */
    def before(): Unit = js.native
    def before(fn: AsyncFunc): Unit = js.native
    def before(fn: Func): Unit = js.native
    /**
      * Execute before running tests.
      */
    def before(name: String): Unit = js.native
    def before(name: String, fn: AsyncFunc): Unit = js.native
    def before(name: String, fn: Func): Unit = js.native
    
    /**
      * Execute before each test case.
      */
    def beforeEach(): Unit = js.native
    def beforeEach(fn: AsyncFunc): Unit = js.native
    def beforeEach(fn: Func): Unit = js.native
    /**
      * Execute before each test case.
      */
    def beforeEach(name: String): Unit = js.native
    def beforeEach(name: String, fn: AsyncFunc): Unit = js.native
    def beforeEach(name: String, fn: Func): Unit = js.native
    
    /**
      * This is only present if flag --delay is passed into Mocha. It triggers
      * root suite execution.
      */
    def runWithSuite(suite: Suite): js.Function0[Unit] = js.native
    
    var suite: SuiteFunctions = js.native
    
    var test: TestFunctions = js.native
  }
  
  @js.native
  trait CreateOptions extends StObject {
    
    /** Filepath where this Suite resides */
    var file: js.UndefOr[String] = js.native
    
    /** Suite function */
    var fn: js.UndefOr[js.ThisFunction0[/* this */ Suite, Unit]] = js.native
    
    /** Is suite exclusive? */
    var isOnly: js.UndefOr[Boolean] = js.native
    
    /** Is suite pending? */
    var pending: js.UndefOr[Boolean] = js.native
    
    /** Title of suite */
    var title: String = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(title: String): CreateOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFn(value: js.ThisFunction0[/* this */ Suite, Unit]): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      @scala.inline
      def setIsOnly(value: Boolean): Self = StObject.set(x, "isOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOnlyUndefined: Self = StObject.set(x, "isOnly", js.undefined)
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SuiteFunctions extends StObject {
    
    /**
      * Creates a suite.
      */
    def create(opts: CreateOptions): Suite = js.native
    
    /**
      * Create an exclusive Suite; convenience function
      */
    def only(opts: CreateOptions): Suite = js.native
    
    /**
      * Create a Suite, but skip it; convenience function
      */
    def skip(opts: CreateOptions): Suite = js.native
  }
  object SuiteFunctions {
    
    @scala.inline
    def apply(create: CreateOptions => Suite, only: CreateOptions => Suite, skip: CreateOptions => Suite): SuiteFunctions = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), only = js.Any.fromFunction1(only), skip = js.Any.fromFunction1(skip))
      __obj.asInstanceOf[SuiteFunctions]
    }
    
    @scala.inline
    implicit class SuiteFunctionsMutableBuilder[Self <: SuiteFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateOptions => Suite): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnly(value: CreateOptions => Suite): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: CreateOptions => Suite): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TestFunctions extends StObject {
    
    /**
      * Exclusive test-case.
      */
    def only(mocha: Mocha, test: Test): Test = js.native
    
    /**
      * Number of retry attempts
      */
    def retries(n: Double): Unit = js.native
    
    /**
      * Pending test case.
      */
    def skip(title: String): Unit = js.native
  }
  object TestFunctions {
    
    @scala.inline
    def apply(only: (Mocha, Test) => Test, retries: Double => Unit, skip: String => Unit): TestFunctions = {
      val __obj = js.Dynamic.literal(only = js.Any.fromFunction2(only), retries = js.Any.fromFunction1(retries), skip = js.Any.fromFunction1(skip))
      __obj.asInstanceOf[TestFunctions]
    }
    
    @scala.inline
    implicit class TestFunctionsMutableBuilder[Self <: TestFunctions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnly(value: (Mocha, Test) => Test): Self = StObject.set(x, "only", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRetries(value: Double => Unit): Self = StObject.set(x, "retries", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkip(value: String => Unit): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    }
  }
}
