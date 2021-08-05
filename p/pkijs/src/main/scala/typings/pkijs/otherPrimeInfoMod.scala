package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherPrimeInfoMod {
  
  @JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with OtherPrimeInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var coefficient: Integer = js.native
    
    /* CompleteClass */
    var exponent: Integer = js.native
    
    /**
      * Convert JSON value into current object
      * @param {JsonOtherPrimeInfo} json
      */
    /* CompleteClass */
    override def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var prime: Integer = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait OtherPrimeInfo extends StObject {
    
    var coefficient: Integer
    
    var exponent: Integer
    
    /**
      * Convert JSON value into current object
      * @param {JsonOtherPrimeInfo} json
      */
    def fromJSON(json: JsonOtherPrimeInfo): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    var prime: Integer
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object OtherPrimeInfo {
    
    inline def apply(
      coefficient: Integer,
      exponent: Integer,
      fromJSON: JsonOtherPrimeInfo => Unit,
      fromSchema: js.Any => Unit,
      prime: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): OtherPrimeInfo = {
      val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), prime = prime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[OtherPrimeInfo]
    }
    
    extension [Self <: OtherPrimeInfo](x: Self) {
      
      inline def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      inline def setExponent(value: Integer): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setFromJSON(value: JsonOtherPrimeInfo => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setPrime(value: Integer): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
