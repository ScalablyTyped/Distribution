package typings.pkijs

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macDataMod {
  
  @JSImport("pkijs/src/MacData", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MacData {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var mac: typings.pkijs.digestInfoMod.default = js.native
    
    /* CompleteClass */
    var macSalt: OctetString = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/MacData", JSImport.Default)
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
  
  trait MacData extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var mac: typings.pkijs.digestInfoMod.default
    
    var macSalt: OctetString
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object MacData {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      mac: typings.pkijs.digestInfoMod.default,
      macSalt: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): MacData = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), mac = mac.asInstanceOf[js.Any], macSalt = macSalt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[MacData]
    }
    
    @scala.inline
    implicit class MacDataMutableBuilder[Self <: MacData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setMac(value: typings.pkijs.digestInfoMod.default): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacSalt(value: OctetString): Self = StObject.set(x, "macSalt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
