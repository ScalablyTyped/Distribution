package typings.microsoftSdkSoap.mod.global.Sdk.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JoinOperator extends StObject
@JSGlobal("Sdk.Query.JoinOperator")
@js.native
object JoinOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoinOperator & Double] = js.native
  
  @js.native
  sealed trait Inner
    extends StObject
       with JoinOperator
  /* 0 */ val Inner: typings.microsoftSdkSoap.mod.global.Sdk.Query.JoinOperator.Inner & Double = js.native
  
  @js.native
  sealed trait LeftOuter
    extends StObject
       with JoinOperator
  /* 1 */ val LeftOuter: typings.microsoftSdkSoap.mod.global.Sdk.Query.JoinOperator.LeftOuter & Double = js.native
  
  @js.native
  sealed trait Natural
    extends StObject
       with JoinOperator
  /* 2 */ val Natural: typings.microsoftSdkSoap.mod.global.Sdk.Query.JoinOperator.Natural & Double = js.native
}
