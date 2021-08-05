package typings.pkijs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleResponseMod {
  
  @JSImport("pkijs/src/SingleResponse", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SingleResponse {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var certID: typings.pkijs.certIDMod.default = js.native
    
    /* CompleteClass */
    var certStatus: js.Any = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var singleExtensions: js.Array[typings.pkijs.extensionMod.default] = js.native
    
    /* CompleteClass */
    var thisUpdate: Date = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/SingleResponse", JSImport.Default)
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
  
  trait SingleResponse extends StObject {
    
    var certID: typings.pkijs.certIDMod.default
    
    var certStatus: js.Any
    
    def fromSchema(schema: js.Any): Unit
    
    var nextUpdate: js.UndefOr[Date] = js.undefined
    
    var singleExtensions: js.Array[typings.pkijs.extensionMod.default]
    
    var thisUpdate: Date
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object SingleResponse {
    
    inline def apply(
      certID: typings.pkijs.certIDMod.default,
      certStatus: js.Any,
      fromSchema: js.Any => Unit,
      singleExtensions: js.Array[typings.pkijs.extensionMod.default],
      thisUpdate: Date,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): SingleResponse = {
      val __obj = js.Dynamic.literal(certID = certID.asInstanceOf[js.Any], certStatus = certStatus.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), singleExtensions = singleExtensions.asInstanceOf[js.Any], thisUpdate = thisUpdate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[SingleResponse]
    }
    
    extension [Self <: SingleResponse](x: Self) {
      
      inline def setCertID(value: typings.pkijs.certIDMod.default): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
      
      inline def setCertStatus(value: js.Any): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setNextUpdate(value: Date): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
      
      inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
      
      inline def setSingleExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
      
      inline def setSingleExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = StObject.set(x, "singleExtensions", js.Array(value :_*))
      
      inline def setThisUpdate(value: Date): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
