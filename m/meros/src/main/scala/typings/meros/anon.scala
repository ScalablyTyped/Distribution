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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body[?], Fallback] (val x: Self & Body[Fallback]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers[?], Body] (val x: Self & Headers[Body]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Multiple] (val x: Self) extends AnyVal {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
}
