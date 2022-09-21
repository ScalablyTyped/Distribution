package typings.officeJsPreview.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InsertSlideFormatting extends StObject
/**
  * Specifies the formatting options for when slides are inserted.
  *
  * @remarks
  * [Api set: PowerPointApi 1.2]
  */
@JSGlobal("PowerPoint.InsertSlideFormatting")
@js.native
object InsertSlideFormatting extends StObject {
  
  /**
    * Copy the source theme into the target presentation and use that theme.
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @js.native
  sealed trait keepSourceFormatting
    extends StObject
       with InsertSlideFormatting
  
  /**
    * Use the existing theme in the target presentation.
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  @js.native
  sealed trait useDestinationTheme
    extends StObject
       with InsertSlideFormatting
}
