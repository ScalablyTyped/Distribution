package typings.pkijs

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relativeDistinguishedNamesMod {
  
  @JSImport("pkijs/src/RelativeDistinguishedNames", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RelativeDistinguishedNames {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RelativeDistinguishedNames", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    inline def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
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
