package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeDistinguishedNamesMod {
  
  @JSImport("pkijs/src/RelativeDistinguishedNames", JSImport.Default)
  @js.native
  class default () extends RelativeDistinguishedNames {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/RelativeDistinguishedNames", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/RelativeDistinguishedNames", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RelativeDistinguishedNames", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RelativeDistinguishedNames", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RelativeDistinguishedNames extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Compare two RDN values, or RDN with ArrayBuffer value
      * @param {(RelativeDistinguishedNames|ArrayBuffer)} compareTo The value compare to current
      * @returns {boolean}
      */
    def isEqual(compareTo: RelativeDistinguishedNames): Boolean = js.native
    def isEqual(compareTo: ArrayBuffer): Boolean = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var typesAndValues: js.Array[typings.pkijs.attributeTypeAndValueMod.default] = js.native
    
    var valueBeforeDecode: ArrayBuffer = js.native
  }
}
