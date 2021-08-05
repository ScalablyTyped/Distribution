package typings.octokitGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.octokitGraphql.typesMod.GraphQlQueryResponse
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data[ResponseData] extends StObject {
    
    var data: Required[GraphQlQueryResponse[ResponseData]]
    
    var headers: ResponseHeaders
  }
  object Data {
    
    inline def apply[ResponseData](data: Required[GraphQlQueryResponse[ResponseData]], headers: ResponseHeaders): Data[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[ResponseData]]
    }
    
    extension [Self <: Data[?], ResponseData](x: Self & Data[ResponseData]) {
      
      inline def setData(value: Required[GraphQlQueryResponse[ResponseData]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extensions extends StObject {
    
    var extensions: StringDictionary[js.Any]
    
    var locations: js.Array[Column]
    
    var message: String
    
    var path: js.Array[String]
  }
  object Extensions {
    
    inline def apply(
      extensions: StringDictionary[js.Any],
      locations: js.Array[Column],
      message: String,
      path: js.Array[String]
    ): Extensions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extensions]
    }
    
    extension [Self <: Extensions](x: Self) {
      
      inline def setExtensions(value: StringDictionary[js.Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
