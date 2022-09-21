package typings.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sys.Serialization Namespace
/**
  * Contains classes related to data serialization for AJAX client functionality in ASP.NET. For more information, see Using Web Services in ASP.NET AJAX.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310840(v=vs.100).aspx}
  */
object Serialization {
  
  /**
    * Serializes JavaScript types into JSON-formatted data and deserializes JSON-formatted data into JavaScript types
    * The JavaScriptSerializer class contains only static methods.
    * @see {@link http://msdn.microsoft.com/en-us/library/bb310857(v=vs.100).aspx}
    */
  @JSGlobal("Sys.Serialization.JavaScriptSerializer")
  @js.native
  //#region Constructors
  /**
    * Initializes a new instance of the Sys.Serialization.JavaScriptSerializer class.
    */
  open class JavaScriptSerializer ()
    extends StObject
       with typings.microsoftAjax.Sys.Serialization.JavaScriptSerializer
  object JavaScriptSerializer {
    
    @JSGlobal("Sys.Serialization.JavaScriptSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a JSON string into an ECMAScript (JavaScript) object graph. This member is static and can be invoked without creating an instance of the class.
      * @param value
      *           The JSON string to deserialize.
      */
    /* static member */
    inline def deserialize(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    //#endregion
    //#region Methods
    /**
      * Converts an ECMAScript (JavaScript) object graph into a JSON string. This member is static and can be invoked without creating an instance of the class.
      * @param value
      *           The JavaScript object graph to serialize.
      * @exception Sys.ArgumentException
      *           value contains a value that cannot be serialized.
      */
    /* static member */
    inline def serialize(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
