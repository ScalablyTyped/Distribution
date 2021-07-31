package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeletedMetadataFilters extends StObject
@JSGlobal("Sdk.Mdq.DeletedMetadataFilters")
@js.native
object DeletedMetadataFilters extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeletedMetadataFilters & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with DeletedMetadataFilters
  /* 0 */ val All: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.All & Double = js.native
  
  // All deleted metadata
  @js.native
  sealed trait Attribute
    extends StObject
       with DeletedMetadataFilters
  /* 1 */ val Attribute: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Attribute & Double = js.native
  
  // Deleted Attribute metadata
  @js.native
  sealed trait Default
    extends StObject
       with DeletedMetadataFilters
  /* 2 */ val Default: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Default & Double = js.native
  
  // The value used if not set. Equals Entity
  @js.native
  sealed trait Entity
    extends StObject
       with DeletedMetadataFilters
  /* 3 */ val Entity: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Entity & Double = js.native
  
  //Deleted Entity metadata
  @js.native
  sealed trait Label
    extends StObject
       with DeletedMetadataFilters
  /* 4 */ val Label: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Label & Double = js.native
  
  //Deleted Label metadata
  @js.native
  sealed trait OptionSet
    extends StObject
       with DeletedMetadataFilters
  /* 5 */ val OptionSet: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.OptionSet & Double = js.native
  
  // Deleted OptionSet metadata
  @js.native
  sealed trait Relationship
    extends StObject
       with DeletedMetadataFilters
  /* 6 */ val Relationship: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Relationship & Double = js.native
}
