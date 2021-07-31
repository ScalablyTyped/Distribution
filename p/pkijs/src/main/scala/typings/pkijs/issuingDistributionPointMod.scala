package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuingDistributionPointMod {
  
  @JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with IssuingDistributionPoint {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var indirectCRL: Boolean = js.native
    
    /* CompleteClass */
    var onlyContainsAttributeCerts: Boolean = js.native
    
    /* CompleteClass */
    var onlyContainsUserCerts: Boolean = js.native
    
    /* CompleteClass */
    var onlySomeReasons: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/IssuingDistributionPoint", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait IssuingDistributionPoint extends StObject {
    
    var distributionPoint: js.UndefOr[
        js.Array[typings.pkijs.generalNameMod.default] | typings.pkijs.relativeDistinguishedNamesMod.default
      ] = js.undefined
    
    def fromSchema(schema: js.Any): Unit
    
    var indirectCRL: Boolean
    
    var onlyContainsAttributeCerts: Boolean
    
    var onlyContainsUserCerts: Boolean
    
    var onlySomeReasons: Double
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
