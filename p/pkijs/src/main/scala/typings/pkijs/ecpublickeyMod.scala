package typings.pkijs

import typings.std.ArrayBuffer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecpublickeyMod {
  
  @JSImport("pkijs/src/ECPublicKey", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ECPublicKey {
    def this(params: js.Any) = this()
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    /* CompleteClass */
    override def fromJSON(json: JsonWebKey): Unit = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var namedCurve: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var x: ArrayBuffer = js.native
    
    /* CompleteClass */
    var y: ArrayBuffer = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/ECPublicKey", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait ECPublicKey extends StObject {
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    var namedCurve: String
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var x: ArrayBuffer
    
    var y: ArrayBuffer
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
