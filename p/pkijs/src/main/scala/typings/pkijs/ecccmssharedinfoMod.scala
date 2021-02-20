package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecccmssharedinfoMod {
  
  @JSImport("pkijs/src/ECCCMSSharedInfo", JSImport.Default)
  @js.native
  class default () extends ECCCMSSharedInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/ECCCMSSharedInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/ECCCMSSharedInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ECCCMSSharedInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ECCCMSSharedInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ECCCMSSharedInfo extends StObject {
    
    var entityUInfo: js.UndefOr[OctetString] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var keyInfo: AlgorithmIdentifier = js.native
    
    var suppPubInfo: OctetString = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object ECCCMSSharedInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      keyInfo: AlgorithmIdentifier,
      suppPubInfo: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): ECCCMSSharedInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[ECCCMSSharedInfo]
    }
    
    @scala.inline
    implicit class ECCCMSSharedInfoMutableBuilder[Self <: ECCCMSSharedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityUInfo(value: OctetString): Self = StObject.set(x, "entityUInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityUInfoUndefined: Self = StObject.set(x, "entityUInfo", js.undefined)
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyInfo(value: AlgorithmIdentifier): Self = StObject.set(x, "keyInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppPubInfo(value: OctetString): Self = StObject.set(x, "suppPubInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
