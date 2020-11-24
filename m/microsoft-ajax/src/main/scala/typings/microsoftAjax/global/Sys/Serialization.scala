package typings.microsoftAjax.global.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.Serialization Namespace
/**
  * Contains classes related to data serialization for AJAX client functionality in ASP.NET. For more information, see Using Web Services in ASP.NET AJAX.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310840(v=vs.100).aspx}
  */
@JSGlobal("Sys.Serialization")
@js.native
object Serialization extends js.Object {
  
  /**
    * Serializes JavaScript types into JSON-formatted data and deserializes JSON-formatted data into JavaScript types
    * The JavaScriptSerializer class contains only static methods.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310857(v=vs.100).aspx}
    */
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Serialization.JavaScriptSerializer class.
    */
  class JavaScriptSerializer ()
    extends typings.microsoftAjax.Sys.Serialization.JavaScriptSerializer
  /* static members */
  @js.native
  object JavaScriptSerializer extends js.Object {
    
    /**
      * Converts a JSON string into an ECMAScript (JavaScript) object graph. This member is static and can be invoked without creating an instance of the class.
      * @static
      * @param value
      *           The JSON string to deserialize.
      */
    def deserialize(value: String): js.Any = js.native
    
    //#endregion
    //#region Methods
    /**
      * Converts an ECMAScript (JavaScript) object graph into a JSON string. This member is static and can be invoked without creating an instance of the class.
      * @static
      * @param value
      *           The JavaScript object graph to serialize.
      * @exception Sys.ArgumentException
      *           value contains a value that cannot be serialized.
      */
    def serialize(value: js.Any): String = js.native
  }
}
