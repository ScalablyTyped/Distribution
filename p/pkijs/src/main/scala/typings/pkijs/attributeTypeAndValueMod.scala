package typings.pkijs

import typings.asn1js.mod.ObjectIdentifier
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeTypeAndValueMod {
  
  @JSImport("pkijs/src/AttributeTypeAndValue", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AttributeTypeAndValue {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AttributeTypeAndValue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @js.native
  trait AttributeTypeAndValue extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Compare two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
      *
      * @param {(AttributeTypeAndValue|ArrayBuffer)} compareTo The value compare to current
      * @returns {boolean}
      *
      * @memberOf AttributeTypeAndValue
      */
    def isEqual(compareTo: AttributeTypeAndValue): Boolean = js.native
    def isEqual(compareTo: ArrayBuffer): Boolean = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    /**
      *
      *
      * @type {ObjectIdentifier}
      * @memberOf AttributeTypeAndValue
      */
    var `type`: ObjectIdentifier = js.native
    
    /**
      *
      *
      * @type {*}
      * @memberOf AttributeTypeAndValue
      */
    var value: js.Any = js.native
  }
}
