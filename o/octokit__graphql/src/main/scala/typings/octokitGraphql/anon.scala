package typings.octokitGraphql

import org.scalablytyped.runtime.StringDictionary
import typings.octokitGraphql.typesMod.GraphQlQueryResponse
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Column extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data[ResponseData] extends StObject {
    
    var data: Required[GraphQlQueryResponse[ResponseData]] = js.native
    
    var headers: ResponseHeaders = js.native
  }
  object Data {
    
    @scala.inline
    def apply[ResponseData](data: Required[GraphQlQueryResponse[ResponseData]], headers: ResponseHeaders): Data[ResponseData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[ResponseData]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[_], ResponseData] (val x: Self with Data[ResponseData]) extends AnyVal {
      
      @scala.inline
      def setData(value: Required[GraphQlQueryResponse[ResponseData]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Extensions extends StObject {
    
    var extensions: StringDictionary[js.Any] = js.native
    
    var locations: js.Array[Column] = js.native
    
    var message: String = js.native
    
    var path: js.Array[String] = js.native
  }
  object Extensions {
    
    @scala.inline
    def apply(
      extensions: StringDictionary[js.Any],
      locations: js.Array[Column],
      message: String,
      path: js.Array[String]
    ): Extensions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: StringDictionary[js.Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[Column]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: Column*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
