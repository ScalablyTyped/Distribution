package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tbsrequestMod {
  
  @JSImport("pkijs/src/TBSRequest", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with TBSRequest {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/TBSRequest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
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
