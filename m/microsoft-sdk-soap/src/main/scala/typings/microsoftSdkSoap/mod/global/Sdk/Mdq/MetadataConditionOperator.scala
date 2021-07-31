package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataConditionOperator extends StObject
@JSGlobal("Sdk.Mdq.MetadataConditionOperator")
@js.native
object MetadataConditionOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataConditionOperator & Double] = js.native
  
  @js.native
  sealed trait Equals
    extends StObject
       with MetadataConditionOperator
  /* 0 */ val Equals: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.Equals & Double = js.native
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with MetadataConditionOperator
  /* 4 */ val GreaterThan: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.GreaterThan & Double = js.native
  
  @js.native
  sealed trait In
    extends StObject
       with MetadataConditionOperator
  /* 2 */ val In: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.In & Double = js.native
  
  @js.native
  sealed trait LessThan
    extends StObject
       with MetadataConditionOperator
  /* 5 */ val LessThan: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.LessThan & Double = js.native
  
  @js.native
  sealed trait NotEquals
    extends StObject
       with MetadataConditionOperator
  /* 1 */ val NotEquals: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.NotEquals & Double = js.native
  
  @js.native
  sealed trait NotIn
    extends StObject
       with MetadataConditionOperator
  /* 3 */ val NotIn: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.NotIn & Double = js.native
}
