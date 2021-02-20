package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tbsrequestMod {
  
  @JSImport("pkijs/src/TBSRequest", JSImport.Default)
  @js.native
  class default () extends TBSRequest {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/TBSRequest", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/TBSRequest", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/TBSRequest", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/TBSRequest", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TBSRequest extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var requestExtensions: js.UndefOr[typings.pkijs.extensionMod.default] = js.native
    
    var requestList: js.Array[typings.pkijs.requestMod.default] = js.native
    
    var requestorName: js.UndefOr[typings.pkijs.generalNameMod.default] = js.native
    
    var tbs: ArrayBuffer = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
