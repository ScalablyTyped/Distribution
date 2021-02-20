package typings.pkijs

import typings.std.ArrayBuffer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecpublickeyMod {
  
  @JSImport("pkijs/src/ECPublicKey", JSImport.Default)
  @js.native
  class default () extends ECPublicKey {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/ECPublicKey", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/ECPublicKey", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ECPublicKey", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ECPublicKey", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ECPublicKey extends StObject {
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var namedCurve: String = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var x: ArrayBuffer = js.native
    
    var y: ArrayBuffer = js.native
  }
  object ECPublicKey {
    
    @scala.inline
    def apply(
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      namedCurve: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      x: ArrayBuffer,
      y: ArrayBuffer
    ): ECPublicKey = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), namedCurve = namedCurve.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECPublicKey]
    }
    
    @scala.inline
    implicit class ECPublicKeyMutableBuilder[Self <: ECPublicKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setX(value: ArrayBuffer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: ArrayBuffer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
