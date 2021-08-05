package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecccmssharedinfoMod {
  
  @JSImport("pkijs/src/ECCCMSSharedInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ECCCMSSharedInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var keyInfo: AlgorithmIdentifier = js.native
    
    /* CompleteClass */
    var suppPubInfo: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/ECCCMSSharedInfo", JSImport.Default)
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
  
  trait ECCCMSSharedInfo extends StObject {
    
    var entityUInfo: js.UndefOr[OctetString] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var keyInfo: AlgorithmIdentifier
    
    var suppPubInfo: OctetString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object ECCCMSSharedInfo {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      keyInfo: AlgorithmIdentifier,
      suppPubInfo: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): ECCCMSSharedInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[ECCCMSSharedInfo]
    }
    
    extension [Self <: ECCCMSSharedInfo](x: Self) {
      
      inline def setEntityUInfo(value: OctetString): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
      
      inline def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setKeyInfo(value: AlgorithmIdentifier): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
      
      inline def setSuppPubInfo(value: OctetString): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
