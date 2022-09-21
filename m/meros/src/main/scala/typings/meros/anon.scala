package typings.meros

import typings.meros.browserMod.Part
import typings.meros.merosBooleans.`false`
import typings.meros.merosBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var multiple: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  trait Body[Fallback]
    extends StObject
       with Part[Any, Fallback]
       with typings.meros.mod.Part[Any, Fallback]
       with typings.meros.nodeMod.Part[Any, Fallback] {
    
    var body: Fallback
    
    var headers: Record[String, String]
    
    var json: `false`
  }
  object Body {
    
    inline def apply[Fallback](body: Fallback, headers: Record[String, String]): Body[Fallback] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = false)
      __obj.asInstanceOf[Body[Fallback]]
    }
    
    extension [Self <: Body[?], Fallback](x: Self & Body[Fallback]) {
      
      inline def setBody(value: Fallback): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers[Body]
    extends StObject
       with Part[Body, Any]
       with typings.meros.mod.Part[Body, Any]
       with typings.meros.nodeMod.Part[Body, Any] {
    
    var body: Body
    
    var headers: Record[String, String]
    
    var json: `true`
  }
  object Headers {
    
    inline def apply[Body](body: Body, headers: Record[String, String]): Headers[Body] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = true)
      __obj.asInstanceOf[Headers[Body]]
    }
    
    extension [Self <: Headers[?], Body](x: Self & Headers[Body]) {
      
      inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Multiple extends StObject {
    
    var multiple: `false`
  }
  object Multiple {
    
    inline def apply(): Multiple = {
      val __obj = js.Dynamic.literal(multiple = false)
      __obj.asInstanceOf[Multiple]
    }
    
    extension [Self <: Multiple](x: Self) {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
}
