package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeletedMetadataFilters extends StObject
@JSGlobal("Sdk.Mdq.DeletedMetadataFilters")
@js.native
object DeletedMetadataFilters extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeletedMetadataFilters with Double] = js.native
  
  @js.native
  sealed trait All extends DeletedMetadataFilters
  /* 0 */ val All: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.All with Double = js.native
  
  // All deleted metadata
  @js.native
  sealed trait Attribute extends DeletedMetadataFilters
  /* 1 */ val Attribute: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Attribute with Double = js.native
  
  // Deleted Attribute metadata
  @js.native
  sealed trait Default extends DeletedMetadataFilters
  /* 2 */ val Default: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Default with Double = js.native
  
  // The value used if not set. Equals Entity
  @js.native
  sealed trait Entity extends DeletedMetadataFilters
  /* 3 */ val Entity: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Entity with Double = js.native
  
  //Deleted Entity metadata
  @js.native
  sealed trait Label extends DeletedMetadataFilters
  /* 4 */ val Label: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Label with Double = js.native
  
  //Deleted Label metadata
  @js.native
  sealed trait OptionSet extends DeletedMetadataFilters
  /* 5 */ val OptionSet: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.OptionSet with Double = js.native
  
  // Deleted OptionSet metadata
  @js.native
  sealed trait Relationship extends DeletedMetadataFilters
  /* 6 */ val Relationship: typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Relationship with Double = js.native
}
