package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuingDistributionPointMod {
  
  @JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
  @js.native
  class default () extends IssuingDistributionPoint {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/IssuingDistributionPoint", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/IssuingDistributionPoint", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/IssuingDistributionPoint", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait IssuingDistributionPoint extends StObject {
    
    var distributionPoint: js.UndefOr[
        js.Array[typings.pkijs.generalNameMod.default] | typings.pkijs.relativeDistinguishedNamesMod.default
      ] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var indirectCRL: Boolean = js.native
    
    var onlyContainsAttributeCerts: Boolean = js.native
    
    var onlyContainsUserCerts: Boolean = js.native
    
    var onlySomeReasons: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object IssuingDistributionPoint {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      indirectCRL: Boolean,
      onlyContainsAttributeCerts: Boolean,
      onlyContainsUserCerts: Boolean,
      onlySomeReasons: Double,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): IssuingDistributionPoint = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any], onlySomeReasons = onlySomeReasons.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[IssuingDistributionPoint]
    }
    
    @scala.inline
    implicit class IssuingDistributionPointMutableBuilder[Self <: IssuingDistributionPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistributionPoint(
        value: js.Array[typings.pkijs.generalNameMod.default] | typings.pkijs.relativeDistinguishedNamesMod.default
      ): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
      
      @scala.inline
      def setDistributionPointVarargs(value: typings.pkijs.generalNameMod.default*): Self = StObject.set(x, "distributionPoint", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndirectCRL(value: Boolean): Self = StObject.set(x, "indirectCRL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyContainsAttributeCerts(value: Boolean): Self = StObject.set(x, "onlyContainsAttributeCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyContainsUserCerts(value: Boolean): Self = StObject.set(x, "onlyContainsUserCerts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlySomeReasons(value: Double): Self = StObject.set(x, "onlySomeReasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
