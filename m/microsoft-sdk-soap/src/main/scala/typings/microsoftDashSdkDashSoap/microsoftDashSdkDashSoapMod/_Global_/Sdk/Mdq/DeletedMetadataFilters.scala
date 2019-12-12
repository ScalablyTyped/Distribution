package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.All
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.Attribute
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.Default
import typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.Relationship
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[DeletedMetadataFilters with scala.Double] = js.native
  /* 0 */ @js.native
  object All
    extends TopLevel[All with scala.Double]
  
  /* 1 */ @js.native
  object Attribute
    extends TopLevel[Attribute with scala.Double]
  
  /* 2 */ @js.native
  object Default
    extends TopLevel[Default with scala.Double]
  
  /* 3 */ @js.native
  object Entity
    extends TopLevel[
          typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.Entity with scala.Double
        ]
  
  /* 4 */ @js.native
  object Label
    extends TopLevel[
          typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.Label with scala.Double
        ]
  
  /* 5 */ @js.native
  object OptionSet
    extends TopLevel[
          typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk.Mdq.DeletedMetadataFilters.OptionSet with scala.Double
        ]
  
  /* 6 */ @js.native
  object Relationship
    extends TopLevel[Relationship with scala.Double]
  
}

