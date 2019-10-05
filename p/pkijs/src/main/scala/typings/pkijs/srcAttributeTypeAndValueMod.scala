package typings.pkijs

import typings.asn1js.asn1jsMod.ObjectIdentifier
import typings.pkijs.srcAttributeTypeAndValueMod.AttributeTypeAndValue
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/AttributeTypeAndValue", JSImport.Namespace)
@js.native
object srcAttributeTypeAndValueMod extends js.Object {
  @js.native
  trait AttributeTypeAndValue extends js.Object {
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
  }
  
  @js.native
  class default () extends AttributeTypeAndValue {
    def this(params: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def defaultValues(memberName: String): js.Any = js.native
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
}

