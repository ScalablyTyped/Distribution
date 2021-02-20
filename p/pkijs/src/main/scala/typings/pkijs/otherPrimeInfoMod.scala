package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherPrimeInfoMod {
  
  @JSImport("pkijs/src/OtherPrimeInfo", JSImport.Default)
  @js.native
  class default () extends OtherPrimeInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/OtherPrimeInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OtherPrimeInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OtherPrimeInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OtherPrimeInfo extends StObject {
    
    var coefficient: Integer = js.native
    
    var exponent: Integer = js.native
    
    /**
      * Convert JSON value into current object
      * @param {JsonOtherPrimeInfo} json
      */
    def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var prime: Integer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object OtherPrimeInfo {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OtherPrimeInfoMutableBuilder[Self <: OtherPrimeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponent(value: Integer): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromJSON(value: JsonOtherPrimeInfo => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrime(value: Integer): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
