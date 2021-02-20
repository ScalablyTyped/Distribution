package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataConditionOperator extends StObject
@JSGlobal("Sdk.Mdq.MetadataConditionOperator")
@js.native
object MetadataConditionOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MetadataConditionOperator with Double] = js.native
  
  @js.native
  sealed trait Equals extends MetadataConditionOperator
  /* 0 */ val Equals: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.Equals with Double = js.native
  
  @js.native
  sealed trait GreaterThan extends MetadataConditionOperator
  /* 4 */ val GreaterThan: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.GreaterThan with Double = js.native
  
  @js.native
  sealed trait In extends MetadataConditionOperator
  /* 2 */ val In: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.In with Double = js.native
  
  @js.native
  sealed trait LessThan extends MetadataConditionOperator
  /* 5 */ val LessThan: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.LessThan with Double = js.native
  
  @js.native
  sealed trait NotEquals extends MetadataConditionOperator
  /* 1 */ val NotEquals: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.NotEquals with Double = js.native
  
  @js.native
  sealed trait NotIn extends MetadataConditionOperator
  /* 3 */ val NotIn: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.MetadataConditionOperator.NotIn with Double = js.native
}
