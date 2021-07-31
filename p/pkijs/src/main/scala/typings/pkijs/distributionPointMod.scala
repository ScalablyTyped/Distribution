package typings.pkijs

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionPointMod {
  
  @JSImport("pkijs/src/DistributionPoint", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with DistributionPoint {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/DistributionPoint", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait DistributionPoint extends StObject {
    
    var cRLIssuer: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.undefined
    
    var distributionPoint: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var reasons: js.UndefOr[BitString] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object DistributionPoint {
    
    @scala.inline
    def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): DistributionPoint = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[DistributionPoint]
    }
    
    @scala.inline
    implicit class DistributionPointMutableBuilder[Self <: DistributionPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCRLIssuer(value: js.Array[typings.pkijs.generalNameMod.default]): Self = StObject.set(x, "cRLIssuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCRLIssuerUndefined: Self = StObject.set(x, "cRLIssuer", js.undefined)
      
      @scala.inline
      def setCRLIssuerVarargs(value: typings.pkijs.generalNameMod.default*): Self = StObject.set(x, "cRLIssuer", js.Array(value :_*))
      
      @scala.inline
      def setDistributionPoint(value: js.Array[typings.pkijs.generalNameMod.default]): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
      
      @scala.inline
      def setDistributionPointVarargs(value: typings.pkijs.generalNameMod.default*): Self = StObject.set(x, "distributionPoint", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReasons(value: BitString): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
