package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeletedMetadataFilters extends js.Object
@JSGlobal("Sdk.Mdq.DeletedMetadataFilters")
@js.native
object DeletedMetadataFilters extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeletedMetadataFilters with Double] = js.native
  
   // All deleted metadata
  @js.native
  sealed trait All extends DeletedMetadataFilters
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
   // Deleted Attribute metadata
  @js.native
  sealed trait Attribute extends DeletedMetadataFilters
  /* 1 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
   // The value used if not set. Equals Entity
  @js.native
  sealed trait Default extends DeletedMetadataFilters
  /* 2 */ @js.native
  object Default extends TopLevel[Default with Double]
  
   //Deleted Entity metadata
  @js.native
  sealed trait Entity extends DeletedMetadataFilters
  /* 3 */ @js.native
  object Entity extends TopLevel[Entity with Double]
  
   //Deleted Label metadata
  @js.native
  sealed trait Label extends DeletedMetadataFilters
  /* 4 */ @js.native
  object Label
    extends TopLevel[
          typings.microsoftSdkSoap.mod.global.Sdk.Mdq.DeletedMetadataFilters.Label with Double
        ]
  
   // Deleted OptionSet metadata
  @js.native
  sealed trait OptionSet extends DeletedMetadataFilters
  /* 5 */ @js.native
  object OptionSet extends TopLevel[OptionSet with Double]
  
   //Deleted Relationship metadata
  @js.native
  sealed trait Relationship extends DeletedMetadataFilters
  /* 6 */ @js.native
  object Relationship extends TopLevel[Relationship with Double]
}
