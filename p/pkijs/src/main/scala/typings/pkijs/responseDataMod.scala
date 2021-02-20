package typings.pkijs

import typings.std.ArrayBuffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseDataMod {
  
  @JSImport("pkijs/src/ResponseData", JSImport.Default)
  @js.native
  class default () extends ResponseData {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/ResponseData", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/ResponseData", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ResponseData", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ResponseData", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ResponseData extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var producedAt: Date = js.native
    
    var responderID: js.Any = js.native
    
    var responseExtensions: js.Array[typings.pkijs.extensionMod.default] = js.native
    
    var responses: js.Array[typings.pkijs.singleResponseMod.default] = js.native
    
    var tds: ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
  }
}
