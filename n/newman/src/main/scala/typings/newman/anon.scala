package typings.newman

import typings.newman.mod.NewmanRunStat
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Assertions extends StObject {
    
    var assertions: NewmanRunStat = js.native
    
    var items: NewmanRunStat = js.native
    
    var iterations: NewmanRunStat = js.native
    
    var prerequestScripts: NewmanRunStat = js.native
    
    var prerequests: NewmanRunStat = js.native
    
    var requests: NewmanRunStat = js.native
    
    var scripts: NewmanRunStat = js.native
    
    var testScripts: NewmanRunStat = js.native
    
    var tests: NewmanRunStat = js.native
  }
  object Assertions {
    
    @scala.inline
    def apply(
      assertions: NewmanRunStat,
      items: NewmanRunStat,
      iterations: NewmanRunStat,
      prerequestScripts: NewmanRunStat,
      prerequests: NewmanRunStat,
      requests: NewmanRunStat,
      scripts: NewmanRunStat,
      testScripts: NewmanRunStat,
      tests: NewmanRunStat
    ): Assertions = {
      val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prerequestScripts = prerequestScripts.asInstanceOf[js.Any], prerequests = prerequests.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], testScripts = testScripts.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assertions]
    }
    
    @scala.inline
    implicit class AssertionsMutableBuilder[Self <: Assertions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertions(value: NewmanRunStat): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: NewmanRunStat): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: NewmanRunStat): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerequestScripts(value: NewmanRunStat): Self = StObject.set(x, "prerequestScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerequests(value: NewmanRunStat): Self = StObject.set(x, "prerequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequests(value: NewmanRunStat): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScripts(value: NewmanRunStat): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestScripts(value: NewmanRunStat): Self = StObject.set(x, "testScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTests(value: NewmanRunStat): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Http extends StObject {
    
    var http: js.UndefOr[Agent] = js.native
    
    var https: js.UndefOr[Agent] = js.native
  }
  object Http {
    
    @scala.inline
    def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    @scala.inline
    implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setHttps(value: Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  @js.native
  trait Ref extends StObject {
    
    var ref: String = js.native
  }
  object Ref {
    
    @scala.inline
    def apply(ref: String): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
