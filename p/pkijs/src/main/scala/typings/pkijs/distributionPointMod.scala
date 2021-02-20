package typings.pkijs

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionPointMod {
  
  @JSImport("pkijs/src/DistributionPoint", JSImport.Default)
  @js.native
  class default () extends DistributionPoint {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/DistributionPoint", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/DistributionPoint", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/DistributionPoint", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait DistributionPoint extends StObject {
    
    var cRLIssuer: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.native
    
    var distributionPoint: js.UndefOr[js.Array[typings.pkijs.generalNameMod.default]] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var reasons: js.UndefOr[BitString] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
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
