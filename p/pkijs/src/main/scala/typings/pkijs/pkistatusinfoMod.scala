package typings.pkijs

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkistatusinfoMod {
  
  @JSImport("pkijs/src/PKIStatusInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PKIStatusInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var status: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PKIStatusInfo", JSImport.Default)
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
  
  trait PKIStatusInfo extends StObject {
    
    var failInfo: js.UndefOr[BitString] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var status: Double
    
    var statusStrings: js.UndefOr[Utf8String] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PKIStatusInfo {
    
    inline def apply(fromSchema: js.Any => Unit, status: Double, toJSON: () => js.Any, toSchema: () => js.Any): PKIStatusInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), status = status.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PKIStatusInfo]
    }
    
    extension [Self <: PKIStatusInfo](x: Self) {
      
      inline def setFailInfo(value: BitString): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
      
      inline def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusStrings(value: Utf8String): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
      
      inline def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
