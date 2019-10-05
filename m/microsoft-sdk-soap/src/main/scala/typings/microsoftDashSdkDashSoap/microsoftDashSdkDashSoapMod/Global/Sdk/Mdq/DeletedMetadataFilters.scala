package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeletedMetadataFilters extends js.Object

@JSGlobal("Sdk.Mdq.DeletedMetadataFilters")
@js.native
object DeletedMetadataFilters extends js.Object {
   // All deleted metadata
  @js.native
  sealed trait All extends DeletedMetadataFilters
  
   // Deleted Attribute metadata
  @js.native
  sealed trait Attribute extends DeletedMetadataFilters
  
   // The value used if not set. Equals Entity
  @js.native
  sealed trait Default extends DeletedMetadataFilters
  
   //Deleted Entity metadata
  @js.native
  sealed trait Entity extends DeletedMetadataFilters
  
   //Deleted Label metadata
  @js.native
  sealed trait Label extends DeletedMetadataFilters
  
   // Deleted OptionSet metadata
  @js.native
  sealed trait OptionSet extends DeletedMetadataFilters
  
   //Deleted Relationship metadata
  @js.native
  sealed trait Relationship extends DeletedMetadataFilters
  
  /* 0 */ val All: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.All with scala.Double = js.native
  /* 1 */ val Attribute: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.Attribute with scala.Double = js.native
  /* 2 */ val Default: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.Default with scala.Double = js.native
  /* 3 */ val Entity: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.Entity with scala.Double = js.native
  /* 4 */ val Label: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.Label with scala.Double = js.native
  /* 5 */ val OptionSet: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.OptionSet with scala.Double = js.native
  /* 6 */ val Relationship: typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq.DeletedMetadataFilters.Relationship with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[DeletedMetadataFilters with scala.Double] = js.native
}

