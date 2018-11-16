package typings
package microsoftDashAjaxLib.SysNs.SerializationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Serializes JavaScript types into JSON-formatted data and deserializes JSON-formatted data into JavaScript types
        * The JavaScriptSerializer class contains only static methods.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb310857(v=vs.100).aspx}
        */
@JSGlobal("Sys.Serialization.JavaScriptSerializer")
@js.native
class JavaScriptSerializer () extends js.Object

/**
        * Serializes JavaScript types into JSON-formatted data and deserializes JSON-formatted data into JavaScript types
        * The JavaScriptSerializer class contains only static methods.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb310857(v=vs.100).aspx}
        */
@JSGlobal("Sys.Serialization.JavaScriptSerializer")
@js.native
object JavaScriptSerializer extends js.Object {
  /**
              * Converts a JSON string into an ECMAScript (JavaScript) object graph. This member is static and can be invoked without creating an instance of the class.
              * @static
              * @param value
              *           The JSON string to deserialize.
              */
  def deserialize(value: java.lang.String): js.Any = js.native
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
  def serialize(value: js.Any): java.lang.String = js.native
}

