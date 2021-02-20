package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crldistributionpointsMod {
  
  @JSImport("pkijs/src/CRLDistributionPoints", JSImport.Default)
  @js.native
  class default () extends CRLDistributionPoints {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/CRLDistributionPoints", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/CRLDistributionPoints", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/CRLDistributionPoints", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait CRLDistributionPoints extends StObject {
    
    var distributionPoints: js.Array[typings.pkijs.distributionPointMod.default] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object CRLDistributionPoints {
    
    @scala.inline
    def apply(
      distributionPoints: js.Array[typings.pkijs.distributionPointMod.default],
      fromSchema: js.Any => Unit,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): CRLDistributionPoints = {
      val __obj = js.Dynamic.literal(distributionPoints = distributionPoints.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[CRLDistributionPoints]
    }
    
    @scala.inline
    implicit class CRLDistributionPointsMutableBuilder[Self <: CRLDistributionPoints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistributionPoints(value: js.Array[typings.pkijs.distributionPointMod.default]): Self = StObject.set(x, "distributionPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionPointsVarargs(value: typings.pkijs.distributionPointMod.default*): Self = StObject.set(x, "distributionPoints", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
