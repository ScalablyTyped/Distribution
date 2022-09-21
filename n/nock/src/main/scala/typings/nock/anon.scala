package typings.nock

import typings.nock.mod.BackContext
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Double] = js.undefined
    
    var head: js.UndefOr[Double] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Double): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: BackContext
    
    def nockDone(): Unit
  }
  object Context {
    
    inline def apply(context: BackContext, nockDone: () => Unit): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], nockDone = js.Any.fromFunction0(nockDone))
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: BackContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setNockDone(value: () => Unit): Self = StObject.set(x, "nockDone", js.Any.fromFunction0(value))
    }
  }
  
  trait Headers extends StObject {
    
    var headers: Record[String, String]
  }
  object Headers {
    
    inline def apply(headers: Record[String, String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pass extends StObject {
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object Pass {
    
    inline def apply(user: String): Pass = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pass]
    }
    
    extension [Self <: Pass](x: Self) {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
