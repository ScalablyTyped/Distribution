package typings.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alternative way to define root hooks that works with parallel runs.
  *
  * Root hooks work with any interface, but the property names do not change.
  * In other words, if you are using the tdd interface, suiteSetup maps to beforeAll, and setup maps to beforeEach.
  *
  * As with other hooks, `this` refers to to the current context object.
  *
  * @see https://mochajs.org/#root-hook-plugins
  */
@js.native
trait RootHookObject extends js.Object {
  
  /**
    * In serial mode, run after all tests end, once only.
    * In parallel mode, run after all tests end, for each file.
    */
  var afterAll: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.native
  
  /**
    * In both modes, run after every test.
    */
  var afterEach: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.native
  
  /**
    * In serial mode (Mocha's default), before all tests begin, once only.
    * In parallel mode, run before all tests begin, for each file.
    */
  var beforeAll: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.native
  
  /**
    * In both modes, run before each test.
    */
  var beforeEach: js.UndefOr[Func | AsyncFunc | (js.Array[AsyncFunc | Func])] = js.native
}
object RootHookObject {
  
  @scala.inline
  def apply(): RootHookObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootHookObject]
  }
  
  @scala.inline
  implicit class RootHookObjectOps[Self <: RootHookObject] (val x: Self) extends AnyVal {
    
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
    def setAfterAllVarargs(value: (AsyncFunc | Func)*): Self = this.set("afterAll", js.Array(value :_*))
    
    @scala.inline
    def setAfterAll(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = this.set("afterAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterAll: Self = this.set("afterAll", js.undefined)
    
    @scala.inline
    def setAfterEachVarargs(value: (AsyncFunc | Func)*): Self = this.set("afterEach", js.Array(value :_*))
    
    @scala.inline
    def setAfterEach(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = this.set("afterEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    
    @scala.inline
    def setBeforeAllVarargs(value: (AsyncFunc | Func)*): Self = this.set("beforeAll", js.Array(value :_*))
    
    @scala.inline
    def setBeforeAll(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = this.set("beforeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeAll: Self = this.set("beforeAll", js.undefined)
    
    @scala.inline
    def setBeforeEachVarargs(value: (AsyncFunc | Func)*): Self = this.set("beforeEach", js.Array(value :_*))
    
    @scala.inline
    def setBeforeEach(value: Func | AsyncFunc | (js.Array[AsyncFunc | Func])): Self = this.set("beforeEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
  }
}
