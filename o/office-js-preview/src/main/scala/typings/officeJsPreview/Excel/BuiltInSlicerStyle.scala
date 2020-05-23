package typings.officeJsPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuiltInSlicerStyle extends js.Object

/**
  *
  * Represents a built-in slicer style.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.BuiltInSlicerStyle")
@js.native
object BuiltInSlicerStyle extends js.Object {
  /**
    * "Accent 1" (blue in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark1 extends BuiltInSlicerStyle
  
  /**
    * "Accent 2" (orange in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark2 extends BuiltInSlicerStyle
  
  /**
    * "Accent 3" (gray in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark3 extends BuiltInSlicerStyle
  
  /**
    * "Accent 4" (yellow in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark4 extends BuiltInSlicerStyle
  
  /**
    * "Accent 5" (light blue in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark5 extends BuiltInSlicerStyle
  
  /**
    * "Accent 6" (green in the default "Office" theme) with dark shading.
    *
    */
  @js.native
  sealed trait dark6 extends BuiltInSlicerStyle
  
  /**
    * "Accent 1" (blue in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light1 extends BuiltInSlicerStyle
  
  /**
    * "Accent 2" (orange in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light2 extends BuiltInSlicerStyle
  
  /**
    * "Accent 3" (gray in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light3 extends BuiltInSlicerStyle
  
  /**
    * "Accent 4" (yellow in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light4 extends BuiltInSlicerStyle
  
  /**
    * "Accent 5" (light blue in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light5 extends BuiltInSlicerStyle
  
  /**
    * "Accent 6" (green in the default "Office" theme) with light shading.
    *
    */
  @js.native
  sealed trait light6 extends BuiltInSlicerStyle
  
  /**
    * Dark gray with light shading.
    *
    */
  @js.native
  sealed trait other1 extends BuiltInSlicerStyle
  
  /**
    * Medium blue with light shading.
    *
    */
  @js.native
  sealed trait other2 extends BuiltInSlicerStyle
  
}

