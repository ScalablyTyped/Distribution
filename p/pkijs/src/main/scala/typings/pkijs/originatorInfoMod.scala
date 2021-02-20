package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originatorInfoMod {
  
  @JSImport("pkijs/src/OriginatorInfo", JSImport.Default)
  @js.native
  class default () extends OriginatorInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/OriginatorInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/OriginatorInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OriginatorInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OriginatorInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OriginatorInfo extends StObject {
    
    var certs: typings.pkijs.certificateSetMod.default = js.native
    
    var crls: typings.pkijs.revocationInfoChoicesMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OriginatorInfo {
    
    @scala.inline
    def apply(
      certs: typings.pkijs.certificateSetMod.default,
      crls: typings.pkijs.revocationInfoChoicesMod.default,
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OriginatorInfo = {
      val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], crls = crls.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OriginatorInfo]
    }
    
    @scala.inline
    implicit class OriginatorInfoMutableBuilder[Self <: OriginatorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCerts(value: typings.pkijs.certificateSetMod.default): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrls(value: typings.pkijs.revocationInfoChoicesMod.default): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
